
package MetasrvClient;

import com.google.gson.Gson;
import com.google.protobuf.ByteString;
import com.metasrv.grpc.proto.Auth;
import com.metasrv.grpc.proto.HandshakeRequest;
import com.metasrv.grpc.proto.HandshakeResponse;
import com.metasrv.grpc.proto.MetaServiceGrpc;
import com.metasrv.grpc.proto.RaftReply;
import com.metasrv.grpc.proto.RaftRequest;
import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.ForwardingClientCall;
import io.grpc.ManagedChannel;
import io.grpc.ConnectivityState;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import java.io.*;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MetasrvClient {
  private static final Logger logger = Logger.getLogger(MetasrvClient.class.getName());

  private static final int PORT = 9191;

  static final CallOptions.Key<ByteString> TOKEN = CallOptions.Key.create("auth-token-bin");
  private ManagedChannel mChannel;
  private MetaServiceGrpc.MetaServiceBlockingStub mBlockingStub;
  private MetaServiceGrpc.MetaServiceStub mAsyncStub;
  private ByteString mToken = null;
  static private byte[] mTokenBytes = null;
  private Metadata mMetadata = null;
  private String mUsername = null;
  private String mPassword = null;
  private long mVersion = 0;
  private int mRetryCount = 0;
  private String mHost = null;
  private int mPort = 0;

  static class MetasrvClientInterceptor implements ClientInterceptor {
    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> method,
        CallOptions callOptions,
        Channel next) {
      return new ForwardingClientCall.SimpleForwardingClientCall<ReqT, RespT>(
          next.newCall(method, callOptions)) {
        @Override
        public void start(Listener<RespT> responseListener, Metadata headers) {
          logger.info("Added metadata");
          if (mTokenBytes != null) {
            headers.put(Metadata.Key.of("auth-token-bin",
                Metadata.BINARY_BYTE_MARSHALLER),
                mTokenBytes);
          }
          super.start(responseListener, headers);
        }
      };
    }
  }

  private class UpdateValue {
    UpdateValue(String value) {
      this.Update = value.getBytes();
    }

    public byte[] Update = null;
  };

  private class UpdateReq {
    public String key = null;
    public String seq = "Any";
    public UpdateValue value = null;
  }

  private class writeMsgReq {
    public UpdateReq UpsertKV = null;
  }

  private class GetKVReq {
    public String key = null;
  };

  private class readMsgReq {
    public GetKVReq GetKV = null;
  }

  private class readMsgResp {
    public long seq = 0;
    public byte[] data = null;
  }

  public MetasrvClient(String host, int port) {
    this(ManagedChannelBuilder.forAddress(host, port)
        .usePlaintext()
        .intercept(new MetasrvClientInterceptor())
        .build(), host, port);
  }

  MetasrvClient(ManagedChannel channel, String host, int port) {
    this.mChannel = channel;
    mBlockingStub = MetaServiceGrpc.newBlockingStub(channel);
    mAsyncStub = MetaServiceGrpc.newStub(channel);
    this.mHost = host;
    this.mPort = port;
    this.mRetryCount = 0;
  }

  public boolean isAuthed() {
    try {
      long sleeped = 0;
      while (mToken == null && sleeped < 1000) {
        Thread.sleep(200);
        sleeped += 200;
      }
    } catch (InterruptedException e) {
      logger.log(Level.WARNING, "isAuthed failed: " + e.toString());
    }

    if (mToken != null) {
      mMetadata = new Metadata();
      mTokenBytes = new byte[mToken.size()];
      mToken.copyTo(mTokenBytes, 0, 0, mToken.size());
    }
    return mToken != null;
  }

  private boolean reconnect() {
    if (mRetryCount > 1) {
      logger.info("Re-connnect to " + mHost + " failed");
      return false;
    }
    logger.info("Try to re-connnect to " + mHost + "...");
    try {
      int cnt = 3;
      while (cnt >= 0) {
        if (mChannel.getState(true) == ConnectivityState.READY) {
          break;
        }
        Thread.sleep(100);
        cnt -= 1;
      }
    } catch (InterruptedException e) {
      logger.log(Level.WARNING, "isAuthed failed: " + e.toString());
    }
    if (mChannel.getState(true) != ConnectivityState.READY) {
      logger.log(Level.INFO, "re-connect to " + mHost + " failed: " + mChannel.getState(true).toString());
      return false;
    }

    mRetryCount += 1;
    mChannel = ManagedChannelBuilder.forAddress(mHost, mPort)
        .usePlaintext()
        .intercept(new MetasrvClientInterceptor())
        .build();
    mBlockingStub = MetaServiceGrpc.newBlockingStub(mChannel);
    mAsyncStub = MetaServiceGrpc.newStub(mChannel);
    boolean ret = handshake(mUsername, mPassword, mVersion);

    if (ret) {
      mRetryCount = 0;
    }
    return ret;
  }

  public boolean handshake(String username, String password, long version) {
    Auth auth = Auth.newBuilder().setUsername(username).setPassword(password).build();
    logger.info("handshake json:" + auth.toString());
    mUsername = username;
    mPassword = password;
    mVersion = version;

    StreamObserver<HandshakeResponse> responseObserver = new StreamObserver<HandshakeResponse>() {
      @Override
      public void onNext(HandshakeResponse value) {
        logger.info("Client response onNext:" + value.toString());
        mToken = value.getPayload();
      }

      @Override
      public void onError(Throwable t) {
        logger.info("Client response onError:" + t.toString());
      }

      @Override
      public void onCompleted() {
        logger.info("Client response onCompleted");
      }
    };

    try {
      HandshakeRequest request = HandshakeRequest.newBuilder()
          .setProtocolVersion(version)
          .setPayload(auth.toByteString())
          .build();

      StreamObserver<HandshakeRequest> requestObserver = mAsyncStub.handshake(responseObserver);
      requestObserver.onNext(request);
    } catch (RuntimeException re) {
      logger.log(Level.WARNING, "handshake RuntimeException");
      // requestObserver.onError(re);
      // throw re;
    }

    return isAuthed();
  }

  public void writeMsg(String key, String value) {
    logger.info("WriteMsg " + key + ":" + value);
    Gson gson = new Gson();
    UpdateReq update = new UpdateReq();
    update.key = key;
    update.value = new UpdateValue(value);
    writeMsgReq req = new writeMsgReq();
    req.UpsertKV = update;

    String jsonStr = gson.toJson(req);
    logger.info("WriteMsg json:" + jsonStr);

    RaftRequest request = RaftRequest.newBuilder().setData(jsonStr).build();
    RaftReply response;
    try {
      response = mBlockingStub.writeMsg(request);
      // response = mBlockingStub.withOption(TOKEN, mToken).writeMsg(request);
    } catch (StatusRuntimeException e) {
      if (!reconnect()) {
        logger.log(Level.WARNING, "writeMsg RPC failed: {0}", e.getStatus());
        mRetryCount = 0;
        return;
      }
      writeMsg(key, value);
      return;
    }
  }

  public String readMsg(String key) {
    logger.info("readMsg " + key);

    Gson gson = new Gson();
    GetKVReq get = new GetKVReq();
    get.key = key;
    readMsgReq req = new readMsgReq();
    req.GetKV = get;

    String jsonStr = gson.toJson(req);
    logger.info("readMsg json:" + jsonStr);

    RaftRequest request = RaftRequest.newBuilder().setData(jsonStr).build();
    RaftReply response;
    try {
      response = mBlockingStub.readMsg(request);
      // response = mBlockingStub.withOption(TOKEN, mToken).readMsg(request);
      String data = response.getData();
      readMsgResp resp = gson.fromJson(data, readMsgResp.class);
      if (resp == null) {
        return "-1";
      }
      return new String(resp.data);
    } catch (StatusRuntimeException e) {
      if (!reconnect()) {
        logger.log(Level.WARNING, "readMsg RPC failed: {0}", e.getStatus());
        mRetryCount = 0;
        return "-1";
      }
      return readMsg(key);
    }
  }

  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World1!");
    MetasrvClient client = new MetasrvClient("localhost", PORT);

    boolean success = client.handshake("root", "root", 10000);

    if (success) {
      client.writeMsg("hello", "world");

      String ret_msg = client.readMsg("hello");
      System.out.println("read response: " + ret_msg);
    } else {
      System.out.println("fail grpc test");
    }
  }
}
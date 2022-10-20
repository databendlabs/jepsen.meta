package com.metasrv.grpc.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.48.0)",
    comments = "Source: meta.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MetaServiceGrpc {

  private MetaServiceGrpc() {}

  public static final String SERVICE_NAME = "meta.MetaService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.metasrv.grpc.proto.HandshakeRequest,
      com.metasrv.grpc.proto.HandshakeResponse> getHandshakeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Handshake",
      requestType = com.metasrv.grpc.proto.HandshakeRequest.class,
      responseType = com.metasrv.grpc.proto.HandshakeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.metasrv.grpc.proto.HandshakeRequest,
      com.metasrv.grpc.proto.HandshakeResponse> getHandshakeMethod() {
    io.grpc.MethodDescriptor<com.metasrv.grpc.proto.HandshakeRequest, com.metasrv.grpc.proto.HandshakeResponse> getHandshakeMethod;
    if ((getHandshakeMethod = MetaServiceGrpc.getHandshakeMethod) == null) {
      synchronized (MetaServiceGrpc.class) {
        if ((getHandshakeMethod = MetaServiceGrpc.getHandshakeMethod) == null) {
          MetaServiceGrpc.getHandshakeMethod = getHandshakeMethod =
              io.grpc.MethodDescriptor.<com.metasrv.grpc.proto.HandshakeRequest, com.metasrv.grpc.proto.HandshakeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Handshake"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.metasrv.grpc.proto.HandshakeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.metasrv.grpc.proto.HandshakeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MetaServiceMethodDescriptorSupplier("Handshake"))
              .build();
        }
      }
    }
    return getHandshakeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.metasrv.grpc.proto.RaftRequest,
      com.metasrv.grpc.proto.RaftReply> getWriteMsgMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WriteMsg",
      requestType = com.metasrv.grpc.proto.RaftRequest.class,
      responseType = com.metasrv.grpc.proto.RaftReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.metasrv.grpc.proto.RaftRequest,
      com.metasrv.grpc.proto.RaftReply> getWriteMsgMethod() {
    io.grpc.MethodDescriptor<com.metasrv.grpc.proto.RaftRequest, com.metasrv.grpc.proto.RaftReply> getWriteMsgMethod;
    if ((getWriteMsgMethod = MetaServiceGrpc.getWriteMsgMethod) == null) {
      synchronized (MetaServiceGrpc.class) {
        if ((getWriteMsgMethod = MetaServiceGrpc.getWriteMsgMethod) == null) {
          MetaServiceGrpc.getWriteMsgMethod = getWriteMsgMethod =
              io.grpc.MethodDescriptor.<com.metasrv.grpc.proto.RaftRequest, com.metasrv.grpc.proto.RaftReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WriteMsg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.metasrv.grpc.proto.RaftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.metasrv.grpc.proto.RaftReply.getDefaultInstance()))
              .setSchemaDescriptor(new MetaServiceMethodDescriptorSupplier("WriteMsg"))
              .build();
        }
      }
    }
    return getWriteMsgMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.metasrv.grpc.proto.RaftRequest,
      com.metasrv.grpc.proto.RaftReply> getReadMsgMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadMsg",
      requestType = com.metasrv.grpc.proto.RaftRequest.class,
      responseType = com.metasrv.grpc.proto.RaftReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.metasrv.grpc.proto.RaftRequest,
      com.metasrv.grpc.proto.RaftReply> getReadMsgMethod() {
    io.grpc.MethodDescriptor<com.metasrv.grpc.proto.RaftRequest, com.metasrv.grpc.proto.RaftReply> getReadMsgMethod;
    if ((getReadMsgMethod = MetaServiceGrpc.getReadMsgMethod) == null) {
      synchronized (MetaServiceGrpc.class) {
        if ((getReadMsgMethod = MetaServiceGrpc.getReadMsgMethod) == null) {
          MetaServiceGrpc.getReadMsgMethod = getReadMsgMethod =
              io.grpc.MethodDescriptor.<com.metasrv.grpc.proto.RaftRequest, com.metasrv.grpc.proto.RaftReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadMsg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.metasrv.grpc.proto.RaftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.metasrv.grpc.proto.RaftReply.getDefaultInstance()))
              .setSchemaDescriptor(new MetaServiceMethodDescriptorSupplier("ReadMsg"))
              .build();
        }
      }
    }
    return getReadMsgMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.metasrv.grpc.proto.Empty,
      com.metasrv.grpc.proto.ExportedChunk> getExportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Export",
      requestType = com.metasrv.grpc.proto.Empty.class,
      responseType = com.metasrv.grpc.proto.ExportedChunk.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.metasrv.grpc.proto.Empty,
      com.metasrv.grpc.proto.ExportedChunk> getExportMethod() {
    io.grpc.MethodDescriptor<com.metasrv.grpc.proto.Empty, com.metasrv.grpc.proto.ExportedChunk> getExportMethod;
    if ((getExportMethod = MetaServiceGrpc.getExportMethod) == null) {
      synchronized (MetaServiceGrpc.class) {
        if ((getExportMethod = MetaServiceGrpc.getExportMethod) == null) {
          MetaServiceGrpc.getExportMethod = getExportMethod =
              io.grpc.MethodDescriptor.<com.metasrv.grpc.proto.Empty, com.metasrv.grpc.proto.ExportedChunk>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Export"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.metasrv.grpc.proto.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.metasrv.grpc.proto.ExportedChunk.getDefaultInstance()))
              .setSchemaDescriptor(new MetaServiceMethodDescriptorSupplier("Export"))
              .build();
        }
      }
    }
    return getExportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.metasrv.grpc.proto.WatchRequest,
      com.metasrv.grpc.proto.WatchResponse> getWatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Watch",
      requestType = com.metasrv.grpc.proto.WatchRequest.class,
      responseType = com.metasrv.grpc.proto.WatchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.metasrv.grpc.proto.WatchRequest,
      com.metasrv.grpc.proto.WatchResponse> getWatchMethod() {
    io.grpc.MethodDescriptor<com.metasrv.grpc.proto.WatchRequest, com.metasrv.grpc.proto.WatchResponse> getWatchMethod;
    if ((getWatchMethod = MetaServiceGrpc.getWatchMethod) == null) {
      synchronized (MetaServiceGrpc.class) {
        if ((getWatchMethod = MetaServiceGrpc.getWatchMethod) == null) {
          MetaServiceGrpc.getWatchMethod = getWatchMethod =
              io.grpc.MethodDescriptor.<com.metasrv.grpc.proto.WatchRequest, com.metasrv.grpc.proto.WatchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Watch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.metasrv.grpc.proto.WatchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.metasrv.grpc.proto.WatchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MetaServiceMethodDescriptorSupplier("Watch"))
              .build();
        }
      }
    }
    return getWatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.metasrv.grpc.proto.TxnRequest,
      com.metasrv.grpc.proto.TxnReply> getTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Transaction",
      requestType = com.metasrv.grpc.proto.TxnRequest.class,
      responseType = com.metasrv.grpc.proto.TxnReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.metasrv.grpc.proto.TxnRequest,
      com.metasrv.grpc.proto.TxnReply> getTransactionMethod() {
    io.grpc.MethodDescriptor<com.metasrv.grpc.proto.TxnRequest, com.metasrv.grpc.proto.TxnReply> getTransactionMethod;
    if ((getTransactionMethod = MetaServiceGrpc.getTransactionMethod) == null) {
      synchronized (MetaServiceGrpc.class) {
        if ((getTransactionMethod = MetaServiceGrpc.getTransactionMethod) == null) {
          MetaServiceGrpc.getTransactionMethod = getTransactionMethod =
              io.grpc.MethodDescriptor.<com.metasrv.grpc.proto.TxnRequest, com.metasrv.grpc.proto.TxnReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Transaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.metasrv.grpc.proto.TxnRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.metasrv.grpc.proto.TxnReply.getDefaultInstance()))
              .setSchemaDescriptor(new MetaServiceMethodDescriptorSupplier("Transaction"))
              .build();
        }
      }
    }
    return getTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.metasrv.grpc.proto.MemberListRequest,
      com.metasrv.grpc.proto.MemberListReply> getMemberListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MemberList",
      requestType = com.metasrv.grpc.proto.MemberListRequest.class,
      responseType = com.metasrv.grpc.proto.MemberListReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.metasrv.grpc.proto.MemberListRequest,
      com.metasrv.grpc.proto.MemberListReply> getMemberListMethod() {
    io.grpc.MethodDescriptor<com.metasrv.grpc.proto.MemberListRequest, com.metasrv.grpc.proto.MemberListReply> getMemberListMethod;
    if ((getMemberListMethod = MetaServiceGrpc.getMemberListMethod) == null) {
      synchronized (MetaServiceGrpc.class) {
        if ((getMemberListMethod = MetaServiceGrpc.getMemberListMethod) == null) {
          MetaServiceGrpc.getMemberListMethod = getMemberListMethod =
              io.grpc.MethodDescriptor.<com.metasrv.grpc.proto.MemberListRequest, com.metasrv.grpc.proto.MemberListReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MemberList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.metasrv.grpc.proto.MemberListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.metasrv.grpc.proto.MemberListReply.getDefaultInstance()))
              .setSchemaDescriptor(new MetaServiceMethodDescriptorSupplier("MemberList"))
              .build();
        }
      }
    }
    return getMemberListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MetaServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MetaServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MetaServiceStub>() {
        @java.lang.Override
        public MetaServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MetaServiceStub(channel, callOptions);
        }
      };
    return MetaServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MetaServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MetaServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MetaServiceBlockingStub>() {
        @java.lang.Override
        public MetaServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MetaServiceBlockingStub(channel, callOptions);
        }
      };
    return MetaServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MetaServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MetaServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MetaServiceFutureStub>() {
        @java.lang.Override
        public MetaServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MetaServiceFutureStub(channel, callOptions);
        }
      };
    return MetaServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MetaServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * handshake
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.HandshakeRequest> handshake(
        io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.HandshakeResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getHandshakeMethod(), responseObserver);
    }

    /**
     * <pre>
     * message
     * </pre>
     */
    public void writeMsg(com.metasrv.grpc.proto.RaftRequest request,
        io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.RaftReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWriteMsgMethod(), responseObserver);
    }

    /**
     */
    public void readMsg(com.metasrv.grpc.proto.RaftRequest request,
        io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.RaftReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadMsgMethod(), responseObserver);
    }

    /**
     * <pre>
     * Export all meta data.
     * Including raft hard state, logs and state machine.
     * The exported data is a list of json strings in form of `(tree_name,
     * sub_tree_prefix, key, value)`.
     * </pre>
     */
    public void export(com.metasrv.grpc.proto.Empty request,
        io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.ExportedChunk> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExportMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add watch key stream.
     * Whenever the watch key data updated, client will be notified accross the
     * stream.
     * </pre>
     */
    public void watch(com.metasrv.grpc.proto.WatchRequest request,
        io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.WatchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWatchMethod(), responseObserver);
    }

    /**
     */
    public void transaction(com.metasrv.grpc.proto.TxnRequest request,
        io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.TxnReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get MetaSrv member list endpoints
     * </pre>
     */
    public void memberList(com.metasrv.grpc.proto.MemberListRequest request,
        io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.MemberListReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMemberListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHandshakeMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.metasrv.grpc.proto.HandshakeRequest,
                com.metasrv.grpc.proto.HandshakeResponse>(
                  this, METHODID_HANDSHAKE)))
          .addMethod(
            getWriteMsgMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.metasrv.grpc.proto.RaftRequest,
                com.metasrv.grpc.proto.RaftReply>(
                  this, METHODID_WRITE_MSG)))
          .addMethod(
            getReadMsgMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.metasrv.grpc.proto.RaftRequest,
                com.metasrv.grpc.proto.RaftReply>(
                  this, METHODID_READ_MSG)))
          .addMethod(
            getExportMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.metasrv.grpc.proto.Empty,
                com.metasrv.grpc.proto.ExportedChunk>(
                  this, METHODID_EXPORT)))
          .addMethod(
            getWatchMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.metasrv.grpc.proto.WatchRequest,
                com.metasrv.grpc.proto.WatchResponse>(
                  this, METHODID_WATCH)))
          .addMethod(
            getTransactionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.metasrv.grpc.proto.TxnRequest,
                com.metasrv.grpc.proto.TxnReply>(
                  this, METHODID_TRANSACTION)))
          .addMethod(
            getMemberListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.metasrv.grpc.proto.MemberListRequest,
                com.metasrv.grpc.proto.MemberListReply>(
                  this, METHODID_MEMBER_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class MetaServiceStub extends io.grpc.stub.AbstractAsyncStub<MetaServiceStub> {
    private MetaServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetaServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MetaServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * handshake
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.HandshakeRequest> handshake(
        io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.HandshakeResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getHandshakeMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * message
     * </pre>
     */
    public void writeMsg(com.metasrv.grpc.proto.RaftRequest request,
        io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.RaftReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWriteMsgMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readMsg(com.metasrv.grpc.proto.RaftRequest request,
        io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.RaftReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadMsgMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Export all meta data.
     * Including raft hard state, logs and state machine.
     * The exported data is a list of json strings in form of `(tree_name,
     * sub_tree_prefix, key, value)`.
     * </pre>
     */
    public void export(com.metasrv.grpc.proto.Empty request,
        io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.ExportedChunk> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getExportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add watch key stream.
     * Whenever the watch key data updated, client will be notified accross the
     * stream.
     * </pre>
     */
    public void watch(com.metasrv.grpc.proto.WatchRequest request,
        io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.WatchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getWatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transaction(com.metasrv.grpc.proto.TxnRequest request,
        io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.TxnReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get MetaSrv member list endpoints
     * </pre>
     */
    public void memberList(com.metasrv.grpc.proto.MemberListRequest request,
        io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.MemberListReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMemberListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MetaServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MetaServiceBlockingStub> {
    private MetaServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetaServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MetaServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * message
     * </pre>
     */
    public com.metasrv.grpc.proto.RaftReply writeMsg(com.metasrv.grpc.proto.RaftRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWriteMsgMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.metasrv.grpc.proto.RaftReply readMsg(com.metasrv.grpc.proto.RaftRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadMsgMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Export all meta data.
     * Including raft hard state, logs and state machine.
     * The exported data is a list of json strings in form of `(tree_name,
     * sub_tree_prefix, key, value)`.
     * </pre>
     */
    public java.util.Iterator<com.metasrv.grpc.proto.ExportedChunk> export(
        com.metasrv.grpc.proto.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getExportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add watch key stream.
     * Whenever the watch key data updated, client will be notified accross the
     * stream.
     * </pre>
     */
    public java.util.Iterator<com.metasrv.grpc.proto.WatchResponse> watch(
        com.metasrv.grpc.proto.WatchRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getWatchMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.metasrv.grpc.proto.TxnReply transaction(com.metasrv.grpc.proto.TxnRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get MetaSrv member list endpoints
     * </pre>
     */
    public com.metasrv.grpc.proto.MemberListReply memberList(com.metasrv.grpc.proto.MemberListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMemberListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MetaServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MetaServiceFutureStub> {
    private MetaServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetaServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MetaServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * message
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.metasrv.grpc.proto.RaftReply> writeMsg(
        com.metasrv.grpc.proto.RaftRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWriteMsgMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.metasrv.grpc.proto.RaftReply> readMsg(
        com.metasrv.grpc.proto.RaftRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadMsgMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.metasrv.grpc.proto.TxnReply> transaction(
        com.metasrv.grpc.proto.TxnRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get MetaSrv member list endpoints
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.metasrv.grpc.proto.MemberListReply> memberList(
        com.metasrv.grpc.proto.MemberListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMemberListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_WRITE_MSG = 0;
  private static final int METHODID_READ_MSG = 1;
  private static final int METHODID_EXPORT = 2;
  private static final int METHODID_WATCH = 3;
  private static final int METHODID_TRANSACTION = 4;
  private static final int METHODID_MEMBER_LIST = 5;
  private static final int METHODID_HANDSHAKE = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MetaServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MetaServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_WRITE_MSG:
          serviceImpl.writeMsg((com.metasrv.grpc.proto.RaftRequest) request,
              (io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.RaftReply>) responseObserver);
          break;
        case METHODID_READ_MSG:
          serviceImpl.readMsg((com.metasrv.grpc.proto.RaftRequest) request,
              (io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.RaftReply>) responseObserver);
          break;
        case METHODID_EXPORT:
          serviceImpl.export((com.metasrv.grpc.proto.Empty) request,
              (io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.ExportedChunk>) responseObserver);
          break;
        case METHODID_WATCH:
          serviceImpl.watch((com.metasrv.grpc.proto.WatchRequest) request,
              (io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.WatchResponse>) responseObserver);
          break;
        case METHODID_TRANSACTION:
          serviceImpl.transaction((com.metasrv.grpc.proto.TxnRequest) request,
              (io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.TxnReply>) responseObserver);
          break;
        case METHODID_MEMBER_LIST:
          serviceImpl.memberList((com.metasrv.grpc.proto.MemberListRequest) request,
              (io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.MemberListReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HANDSHAKE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.handshake(
              (io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.HandshakeResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MetaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MetaServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.metasrv.grpc.proto.MetaProtobuf.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MetaService");
    }
  }

  private static final class MetaServiceFileDescriptorSupplier
      extends MetaServiceBaseDescriptorSupplier {
    MetaServiceFileDescriptorSupplier() {}
  }

  private static final class MetaServiceMethodDescriptorSupplier
      extends MetaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MetaServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MetaServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MetaServiceFileDescriptorSupplier())
              .addMethod(getHandshakeMethod())
              .addMethod(getWriteMsgMethod())
              .addMethod(getReadMsgMethod())
              .addMethod(getExportMethod())
              .addMethod(getWatchMethod())
              .addMethod(getTransactionMethod())
              .addMethod(getMemberListMethod())
              .build();
        }
      }
    }
    return result;
  }
}

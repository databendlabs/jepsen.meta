package com.metasrv.grpc.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.48.0)",
    comments = "Source: meta.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RaftServiceGrpc {

  private RaftServiceGrpc() {}

  public static final String SERVICE_NAME = "meta.RaftService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.metasrv.grpc.proto.RaftRequest,
      com.metasrv.grpc.proto.RaftReply> getWriteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Write",
      requestType = com.metasrv.grpc.proto.RaftRequest.class,
      responseType = com.metasrv.grpc.proto.RaftReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.metasrv.grpc.proto.RaftRequest,
      com.metasrv.grpc.proto.RaftReply> getWriteMethod() {
    io.grpc.MethodDescriptor<com.metasrv.grpc.proto.RaftRequest, com.metasrv.grpc.proto.RaftReply> getWriteMethod;
    if ((getWriteMethod = RaftServiceGrpc.getWriteMethod) == null) {
      synchronized (RaftServiceGrpc.class) {
        if ((getWriteMethod = RaftServiceGrpc.getWriteMethod) == null) {
          RaftServiceGrpc.getWriteMethod = getWriteMethod =
              io.grpc.MethodDescriptor.<com.metasrv.grpc.proto.RaftRequest, com.metasrv.grpc.proto.RaftReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Write"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.metasrv.grpc.proto.RaftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.metasrv.grpc.proto.RaftReply.getDefaultInstance()))
              .setSchemaDescriptor(new RaftServiceMethodDescriptorSupplier("Write"))
              .build();
        }
      }
    }
    return getWriteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.metasrv.grpc.proto.RaftRequest,
      com.metasrv.grpc.proto.RaftReply> getForwardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Forward",
      requestType = com.metasrv.grpc.proto.RaftRequest.class,
      responseType = com.metasrv.grpc.proto.RaftReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.metasrv.grpc.proto.RaftRequest,
      com.metasrv.grpc.proto.RaftReply> getForwardMethod() {
    io.grpc.MethodDescriptor<com.metasrv.grpc.proto.RaftRequest, com.metasrv.grpc.proto.RaftReply> getForwardMethod;
    if ((getForwardMethod = RaftServiceGrpc.getForwardMethod) == null) {
      synchronized (RaftServiceGrpc.class) {
        if ((getForwardMethod = RaftServiceGrpc.getForwardMethod) == null) {
          RaftServiceGrpc.getForwardMethod = getForwardMethod =
              io.grpc.MethodDescriptor.<com.metasrv.grpc.proto.RaftRequest, com.metasrv.grpc.proto.RaftReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Forward"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.metasrv.grpc.proto.RaftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.metasrv.grpc.proto.RaftReply.getDefaultInstance()))
              .setSchemaDescriptor(new RaftServiceMethodDescriptorSupplier("Forward"))
              .build();
        }
      }
    }
    return getForwardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.metasrv.grpc.proto.RaftRequest,
      com.metasrv.grpc.proto.RaftReply> getAppendEntriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AppendEntries",
      requestType = com.metasrv.grpc.proto.RaftRequest.class,
      responseType = com.metasrv.grpc.proto.RaftReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.metasrv.grpc.proto.RaftRequest,
      com.metasrv.grpc.proto.RaftReply> getAppendEntriesMethod() {
    io.grpc.MethodDescriptor<com.metasrv.grpc.proto.RaftRequest, com.metasrv.grpc.proto.RaftReply> getAppendEntriesMethod;
    if ((getAppendEntriesMethod = RaftServiceGrpc.getAppendEntriesMethod) == null) {
      synchronized (RaftServiceGrpc.class) {
        if ((getAppendEntriesMethod = RaftServiceGrpc.getAppendEntriesMethod) == null) {
          RaftServiceGrpc.getAppendEntriesMethod = getAppendEntriesMethod =
              io.grpc.MethodDescriptor.<com.metasrv.grpc.proto.RaftRequest, com.metasrv.grpc.proto.RaftReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AppendEntries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.metasrv.grpc.proto.RaftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.metasrv.grpc.proto.RaftReply.getDefaultInstance()))
              .setSchemaDescriptor(new RaftServiceMethodDescriptorSupplier("AppendEntries"))
              .build();
        }
      }
    }
    return getAppendEntriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.metasrv.grpc.proto.RaftRequest,
      com.metasrv.grpc.proto.RaftReply> getInstallSnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InstallSnapshot",
      requestType = com.metasrv.grpc.proto.RaftRequest.class,
      responseType = com.metasrv.grpc.proto.RaftReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.metasrv.grpc.proto.RaftRequest,
      com.metasrv.grpc.proto.RaftReply> getInstallSnapshotMethod() {
    io.grpc.MethodDescriptor<com.metasrv.grpc.proto.RaftRequest, com.metasrv.grpc.proto.RaftReply> getInstallSnapshotMethod;
    if ((getInstallSnapshotMethod = RaftServiceGrpc.getInstallSnapshotMethod) == null) {
      synchronized (RaftServiceGrpc.class) {
        if ((getInstallSnapshotMethod = RaftServiceGrpc.getInstallSnapshotMethod) == null) {
          RaftServiceGrpc.getInstallSnapshotMethod = getInstallSnapshotMethod =
              io.grpc.MethodDescriptor.<com.metasrv.grpc.proto.RaftRequest, com.metasrv.grpc.proto.RaftReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InstallSnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.metasrv.grpc.proto.RaftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.metasrv.grpc.proto.RaftReply.getDefaultInstance()))
              .setSchemaDescriptor(new RaftServiceMethodDescriptorSupplier("InstallSnapshot"))
              .build();
        }
      }
    }
    return getInstallSnapshotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.metasrv.grpc.proto.RaftRequest,
      com.metasrv.grpc.proto.RaftReply> getVoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Vote",
      requestType = com.metasrv.grpc.proto.RaftRequest.class,
      responseType = com.metasrv.grpc.proto.RaftReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.metasrv.grpc.proto.RaftRequest,
      com.metasrv.grpc.proto.RaftReply> getVoteMethod() {
    io.grpc.MethodDescriptor<com.metasrv.grpc.proto.RaftRequest, com.metasrv.grpc.proto.RaftReply> getVoteMethod;
    if ((getVoteMethod = RaftServiceGrpc.getVoteMethod) == null) {
      synchronized (RaftServiceGrpc.class) {
        if ((getVoteMethod = RaftServiceGrpc.getVoteMethod) == null) {
          RaftServiceGrpc.getVoteMethod = getVoteMethod =
              io.grpc.MethodDescriptor.<com.metasrv.grpc.proto.RaftRequest, com.metasrv.grpc.proto.RaftReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Vote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.metasrv.grpc.proto.RaftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.metasrv.grpc.proto.RaftReply.getDefaultInstance()))
              .setSchemaDescriptor(new RaftServiceMethodDescriptorSupplier("Vote"))
              .build();
        }
      }
    }
    return getVoteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RaftServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RaftServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RaftServiceStub>() {
        @java.lang.Override
        public RaftServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RaftServiceStub(channel, callOptions);
        }
      };
    return RaftServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RaftServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RaftServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RaftServiceBlockingStub>() {
        @java.lang.Override
        public RaftServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RaftServiceBlockingStub(channel, callOptions);
        }
      };
    return RaftServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RaftServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RaftServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RaftServiceFutureStub>() {
        @java.lang.Override
        public RaftServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RaftServiceFutureStub(channel, callOptions);
        }
      };
    return RaftServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RaftServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void write(com.metasrv.grpc.proto.RaftRequest request,
        io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.RaftReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWriteMethod(), responseObserver);
    }

    /**
     * <pre>
     *&#47; Forward a request to other
     * </pre>
     */
    public void forward(com.metasrv.grpc.proto.RaftRequest request,
        io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.RaftReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getForwardMethod(), responseObserver);
    }

    /**
     */
    public void appendEntries(com.metasrv.grpc.proto.RaftRequest request,
        io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.RaftReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAppendEntriesMethod(), responseObserver);
    }

    /**
     */
    public void installSnapshot(com.metasrv.grpc.proto.RaftRequest request,
        io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.RaftReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInstallSnapshotMethod(), responseObserver);
    }

    /**
     */
    public void vote(com.metasrv.grpc.proto.RaftRequest request,
        io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.RaftReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVoteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getWriteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.metasrv.grpc.proto.RaftRequest,
                com.metasrv.grpc.proto.RaftReply>(
                  this, METHODID_WRITE)))
          .addMethod(
            getForwardMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.metasrv.grpc.proto.RaftRequest,
                com.metasrv.grpc.proto.RaftReply>(
                  this, METHODID_FORWARD)))
          .addMethod(
            getAppendEntriesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.metasrv.grpc.proto.RaftRequest,
                com.metasrv.grpc.proto.RaftReply>(
                  this, METHODID_APPEND_ENTRIES)))
          .addMethod(
            getInstallSnapshotMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.metasrv.grpc.proto.RaftRequest,
                com.metasrv.grpc.proto.RaftReply>(
                  this, METHODID_INSTALL_SNAPSHOT)))
          .addMethod(
            getVoteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.metasrv.grpc.proto.RaftRequest,
                com.metasrv.grpc.proto.RaftReply>(
                  this, METHODID_VOTE)))
          .build();
    }
  }

  /**
   */
  public static final class RaftServiceStub extends io.grpc.stub.AbstractAsyncStub<RaftServiceStub> {
    private RaftServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RaftServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RaftServiceStub(channel, callOptions);
    }

    /**
     */
    public void write(com.metasrv.grpc.proto.RaftRequest request,
        io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.RaftReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#47; Forward a request to other
     * </pre>
     */
    public void forward(com.metasrv.grpc.proto.RaftRequest request,
        io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.RaftReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getForwardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void appendEntries(com.metasrv.grpc.proto.RaftRequest request,
        io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.RaftReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAppendEntriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void installSnapshot(com.metasrv.grpc.proto.RaftRequest request,
        io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.RaftReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInstallSnapshotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void vote(com.metasrv.grpc.proto.RaftRequest request,
        io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.RaftReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVoteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RaftServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RaftServiceBlockingStub> {
    private RaftServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RaftServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RaftServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.metasrv.grpc.proto.RaftReply write(com.metasrv.grpc.proto.RaftRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWriteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#47; Forward a request to other
     * </pre>
     */
    public com.metasrv.grpc.proto.RaftReply forward(com.metasrv.grpc.proto.RaftRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getForwardMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.metasrv.grpc.proto.RaftReply appendEntries(com.metasrv.grpc.proto.RaftRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAppendEntriesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.metasrv.grpc.proto.RaftReply installSnapshot(com.metasrv.grpc.proto.RaftRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInstallSnapshotMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.metasrv.grpc.proto.RaftReply vote(com.metasrv.grpc.proto.RaftRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVoteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RaftServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RaftServiceFutureStub> {
    private RaftServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RaftServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RaftServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.metasrv.grpc.proto.RaftReply> write(
        com.metasrv.grpc.proto.RaftRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *&#47; Forward a request to other
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.metasrv.grpc.proto.RaftReply> forward(
        com.metasrv.grpc.proto.RaftRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getForwardMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.metasrv.grpc.proto.RaftReply> appendEntries(
        com.metasrv.grpc.proto.RaftRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAppendEntriesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.metasrv.grpc.proto.RaftReply> installSnapshot(
        com.metasrv.grpc.proto.RaftRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInstallSnapshotMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.metasrv.grpc.proto.RaftReply> vote(
        com.metasrv.grpc.proto.RaftRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVoteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_WRITE = 0;
  private static final int METHODID_FORWARD = 1;
  private static final int METHODID_APPEND_ENTRIES = 2;
  private static final int METHODID_INSTALL_SNAPSHOT = 3;
  private static final int METHODID_VOTE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RaftServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RaftServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_WRITE:
          serviceImpl.write((com.metasrv.grpc.proto.RaftRequest) request,
              (io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.RaftReply>) responseObserver);
          break;
        case METHODID_FORWARD:
          serviceImpl.forward((com.metasrv.grpc.proto.RaftRequest) request,
              (io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.RaftReply>) responseObserver);
          break;
        case METHODID_APPEND_ENTRIES:
          serviceImpl.appendEntries((com.metasrv.grpc.proto.RaftRequest) request,
              (io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.RaftReply>) responseObserver);
          break;
        case METHODID_INSTALL_SNAPSHOT:
          serviceImpl.installSnapshot((com.metasrv.grpc.proto.RaftRequest) request,
              (io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.RaftReply>) responseObserver);
          break;
        case METHODID_VOTE:
          serviceImpl.vote((com.metasrv.grpc.proto.RaftRequest) request,
              (io.grpc.stub.StreamObserver<com.metasrv.grpc.proto.RaftReply>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RaftServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RaftServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.metasrv.grpc.proto.MetaProtobuf.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RaftService");
    }
  }

  private static final class RaftServiceFileDescriptorSupplier
      extends RaftServiceBaseDescriptorSupplier {
    RaftServiceFileDescriptorSupplier() {}
  }

  private static final class RaftServiceMethodDescriptorSupplier
      extends RaftServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RaftServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RaftServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RaftServiceFileDescriptorSupplier())
              .addMethod(getWriteMethod())
              .addMethod(getForwardMethod())
              .addMethod(getAppendEntriesMethod())
              .addMethod(getInstallSnapshotMethod())
              .addMethod(getVoteMethod())
              .build();
        }
      }
    }
    return result;
  }
}

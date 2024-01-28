package middleware.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.0)",
    comments = "Source: Hospital.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HospitalServiceGrpc {

  private HospitalServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "middleware.proto.HospitalService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<middleware.proto.HospitalOuterClass.Empty,
      middleware.proto.HospitalOuterClass.AvailableBedsReply> getGetAvailableBedsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAvailableBeds",
      requestType = middleware.proto.HospitalOuterClass.Empty.class,
      responseType = middleware.proto.HospitalOuterClass.AvailableBedsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<middleware.proto.HospitalOuterClass.Empty,
      middleware.proto.HospitalOuterClass.AvailableBedsReply> getGetAvailableBedsMethod() {
    io.grpc.MethodDescriptor<middleware.proto.HospitalOuterClass.Empty, middleware.proto.HospitalOuterClass.AvailableBedsReply> getGetAvailableBedsMethod;
    if ((getGetAvailableBedsMethod = HospitalServiceGrpc.getGetAvailableBedsMethod) == null) {
      synchronized (HospitalServiceGrpc.class) {
        if ((getGetAvailableBedsMethod = HospitalServiceGrpc.getGetAvailableBedsMethod) == null) {
          HospitalServiceGrpc.getGetAvailableBedsMethod = getGetAvailableBedsMethod =
              io.grpc.MethodDescriptor.<middleware.proto.HospitalOuterClass.Empty, middleware.proto.HospitalOuterClass.AvailableBedsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAvailableBeds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  middleware.proto.HospitalOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  middleware.proto.HospitalOuterClass.AvailableBedsReply.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalServiceMethodDescriptorSupplier("getAvailableBeds"))
              .build();
        }
      }
    }
    return getGetAvailableBedsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<middleware.proto.HospitalOuterClass.Hospital,
      middleware.proto.HospitalOuterClass.HospitalsForRegionReply> getGetHospitalsForRegionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getHospitalsForRegion",
      requestType = middleware.proto.HospitalOuterClass.Hospital.class,
      responseType = middleware.proto.HospitalOuterClass.HospitalsForRegionReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<middleware.proto.HospitalOuterClass.Hospital,
      middleware.proto.HospitalOuterClass.HospitalsForRegionReply> getGetHospitalsForRegionMethod() {
    io.grpc.MethodDescriptor<middleware.proto.HospitalOuterClass.Hospital, middleware.proto.HospitalOuterClass.HospitalsForRegionReply> getGetHospitalsForRegionMethod;
    if ((getGetHospitalsForRegionMethod = HospitalServiceGrpc.getGetHospitalsForRegionMethod) == null) {
      synchronized (HospitalServiceGrpc.class) {
        if ((getGetHospitalsForRegionMethod = HospitalServiceGrpc.getGetHospitalsForRegionMethod) == null) {
          HospitalServiceGrpc.getGetHospitalsForRegionMethod = getGetHospitalsForRegionMethod =
              io.grpc.MethodDescriptor.<middleware.proto.HospitalOuterClass.Hospital, middleware.proto.HospitalOuterClass.HospitalsForRegionReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getHospitalsForRegion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  middleware.proto.HospitalOuterClass.Hospital.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  middleware.proto.HospitalOuterClass.HospitalsForRegionReply.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalServiceMethodDescriptorSupplier("getHospitalsForRegion"))
              .build();
        }
      }
    }
    return getGetHospitalsForRegionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HospitalServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HospitalServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HospitalServiceStub>() {
        @java.lang.Override
        public HospitalServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HospitalServiceStub(channel, callOptions);
        }
      };
    return HospitalServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HospitalServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HospitalServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HospitalServiceBlockingStub>() {
        @java.lang.Override
        public HospitalServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HospitalServiceBlockingStub(channel, callOptions);
        }
      };
    return HospitalServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HospitalServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HospitalServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HospitalServiceFutureStub>() {
        @java.lang.Override
        public HospitalServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HospitalServiceFutureStub(channel, callOptions);
        }
      };
    return HospitalServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getAvailableBeds(middleware.proto.HospitalOuterClass.Empty request,
        io.grpc.stub.StreamObserver<middleware.proto.HospitalOuterClass.AvailableBedsReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAvailableBedsMethod(), responseObserver);
    }

    /**
     */
    default void getHospitalsForRegion(middleware.proto.HospitalOuterClass.Hospital request,
        io.grpc.stub.StreamObserver<middleware.proto.HospitalOuterClass.HospitalsForRegionReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHospitalsForRegionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service HospitalService.
   */
  public static abstract class HospitalServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return HospitalServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service HospitalService.
   */
  public static final class HospitalServiceStub
      extends io.grpc.stub.AbstractAsyncStub<HospitalServiceStub> {
    private HospitalServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HospitalServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HospitalServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAvailableBeds(middleware.proto.HospitalOuterClass.Empty request,
        io.grpc.stub.StreamObserver<middleware.proto.HospitalOuterClass.AvailableBedsReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAvailableBedsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHospitalsForRegion(middleware.proto.HospitalOuterClass.Hospital request,
        io.grpc.stub.StreamObserver<middleware.proto.HospitalOuterClass.HospitalsForRegionReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHospitalsForRegionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service HospitalService.
   */
  public static final class HospitalServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<HospitalServiceBlockingStub> {
    private HospitalServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HospitalServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HospitalServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public middleware.proto.HospitalOuterClass.AvailableBedsReply getAvailableBeds(middleware.proto.HospitalOuterClass.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAvailableBedsMethod(), getCallOptions(), request);
    }

    /**
     */
    public middleware.proto.HospitalOuterClass.HospitalsForRegionReply getHospitalsForRegion(middleware.proto.HospitalOuterClass.Hospital request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHospitalsForRegionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service HospitalService.
   */
  public static final class HospitalServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<HospitalServiceFutureStub> {
    private HospitalServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HospitalServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HospitalServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<middleware.proto.HospitalOuterClass.AvailableBedsReply> getAvailableBeds(
        middleware.proto.HospitalOuterClass.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAvailableBedsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<middleware.proto.HospitalOuterClass.HospitalsForRegionReply> getHospitalsForRegion(
        middleware.proto.HospitalOuterClass.Hospital request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHospitalsForRegionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AVAILABLE_BEDS = 0;
  private static final int METHODID_GET_HOSPITALS_FOR_REGION = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AVAILABLE_BEDS:
          serviceImpl.getAvailableBeds((middleware.proto.HospitalOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<middleware.proto.HospitalOuterClass.AvailableBedsReply>) responseObserver);
          break;
        case METHODID_GET_HOSPITALS_FOR_REGION:
          serviceImpl.getHospitalsForRegion((middleware.proto.HospitalOuterClass.Hospital) request,
              (io.grpc.stub.StreamObserver<middleware.proto.HospitalOuterClass.HospitalsForRegionReply>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetAvailableBedsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              middleware.proto.HospitalOuterClass.Empty,
              middleware.proto.HospitalOuterClass.AvailableBedsReply>(
                service, METHODID_GET_AVAILABLE_BEDS)))
        .addMethod(
          getGetHospitalsForRegionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              middleware.proto.HospitalOuterClass.Hospital,
              middleware.proto.HospitalOuterClass.HospitalsForRegionReply>(
                service, METHODID_GET_HOSPITALS_FOR_REGION)))
        .build();
  }

  private static abstract class HospitalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HospitalServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return middleware.proto.HospitalOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HospitalService");
    }
  }

  private static final class HospitalServiceFileDescriptorSupplier
      extends HospitalServiceBaseDescriptorSupplier {
    HospitalServiceFileDescriptorSupplier() {}
  }

  private static final class HospitalServiceMethodDescriptorSupplier
      extends HospitalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    HospitalServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (HospitalServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HospitalServiceFileDescriptorSupplier())
              .addMethod(getGetAvailableBedsMethod())
              .addMethod(getGetHospitalsForRegionMethod())
              .build();
        }
      }
    }
    return result;
  }
}

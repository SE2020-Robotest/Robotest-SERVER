package msg.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: msg.proto")
public final class MsgServicesGrpc {

  private MsgServicesGrpc() {}

  public static final String SERVICE_NAME = "msg.MsgServices";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<msg.grpc.Map,
      msg.grpc.Response> getConfigMapMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfigMap",
      requestType = msg.grpc.Map.class,
      responseType = msg.grpc.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<msg.grpc.Map,
      msg.grpc.Response> getConfigMapMethod() {
    io.grpc.MethodDescriptor<msg.grpc.Map, msg.grpc.Response> getConfigMapMethod;
    if ((getConfigMapMethod = MsgServicesGrpc.getConfigMapMethod) == null) {
      synchronized (MsgServicesGrpc.class) {
        if ((getConfigMapMethod = MsgServicesGrpc.getConfigMapMethod) == null) {
          MsgServicesGrpc.getConfigMapMethod = getConfigMapMethod =
              io.grpc.MethodDescriptor.<msg.grpc.Map, msg.grpc.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfigMap"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  msg.grpc.Map.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  msg.grpc.Response.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServicesMethodDescriptorSupplier("ConfigMap"))
              .build();
        }
      }
    }
    return getConfigMapMethod;
  }

  private static volatile io.grpc.MethodDescriptor<msg.grpc.RBPosition,
      msg.grpc.Response> getRobotPositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RobotPosition",
      requestType = msg.grpc.RBPosition.class,
      responseType = msg.grpc.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<msg.grpc.RBPosition,
      msg.grpc.Response> getRobotPositionMethod() {
    io.grpc.MethodDescriptor<msg.grpc.RBPosition, msg.grpc.Response> getRobotPositionMethod;
    if ((getRobotPositionMethod = MsgServicesGrpc.getRobotPositionMethod) == null) {
      synchronized (MsgServicesGrpc.class) {
        if ((getRobotPositionMethod = MsgServicesGrpc.getRobotPositionMethod) == null) {
          MsgServicesGrpc.getRobotPositionMethod = getRobotPositionMethod =
              io.grpc.MethodDescriptor.<msg.grpc.RBPosition, msg.grpc.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RobotPosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  msg.grpc.RBPosition.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  msg.grpc.Response.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServicesMethodDescriptorSupplier("RobotPosition"))
              .build();
        }
      }
    }
    return getRobotPositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<msg.grpc.RBPath,
      msg.grpc.Response> getRobotPathMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RobotPath",
      requestType = msg.grpc.RBPath.class,
      responseType = msg.grpc.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<msg.grpc.RBPath,
      msg.grpc.Response> getRobotPathMethod() {
    io.grpc.MethodDescriptor<msg.grpc.RBPath, msg.grpc.Response> getRobotPathMethod;
    if ((getRobotPathMethod = MsgServicesGrpc.getRobotPathMethod) == null) {
      synchronized (MsgServicesGrpc.class) {
        if ((getRobotPathMethod = MsgServicesGrpc.getRobotPathMethod) == null) {
          MsgServicesGrpc.getRobotPathMethod = getRobotPathMethod =
              io.grpc.MethodDescriptor.<msg.grpc.RBPath, msg.grpc.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RobotPath"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  msg.grpc.RBPath.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  msg.grpc.Response.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServicesMethodDescriptorSupplier("RobotPath"))
              .build();
        }
      }
    }
    return getRobotPathMethod;
  }

  private static volatile io.grpc.MethodDescriptor<msg.grpc.VoiceData,
      msg.grpc.Response> getSendVoiceFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendVoiceFile",
      requestType = msg.grpc.VoiceData.class,
      responseType = msg.grpc.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<msg.grpc.VoiceData,
      msg.grpc.Response> getSendVoiceFileMethod() {
    io.grpc.MethodDescriptor<msg.grpc.VoiceData, msg.grpc.Response> getSendVoiceFileMethod;
    if ((getSendVoiceFileMethod = MsgServicesGrpc.getSendVoiceFileMethod) == null) {
      synchronized (MsgServicesGrpc.class) {
        if ((getSendVoiceFileMethod = MsgServicesGrpc.getSendVoiceFileMethod) == null) {
          MsgServicesGrpc.getSendVoiceFileMethod = getSendVoiceFileMethod =
              io.grpc.MethodDescriptor.<msg.grpc.VoiceData, msg.grpc.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendVoiceFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  msg.grpc.VoiceData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  msg.grpc.Response.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServicesMethodDescriptorSupplier("SendVoiceFile"))
              .build();
        }
      }
    }
    return getSendVoiceFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<msg.grpc.VoiceStr,
      msg.grpc.Response> getVoiceResultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VoiceResult",
      requestType = msg.grpc.VoiceStr.class,
      responseType = msg.grpc.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<msg.grpc.VoiceStr,
      msg.grpc.Response> getVoiceResultMethod() {
    io.grpc.MethodDescriptor<msg.grpc.VoiceStr, msg.grpc.Response> getVoiceResultMethod;
    if ((getVoiceResultMethod = MsgServicesGrpc.getVoiceResultMethod) == null) {
      synchronized (MsgServicesGrpc.class) {
        if ((getVoiceResultMethod = MsgServicesGrpc.getVoiceResultMethod) == null) {
          MsgServicesGrpc.getVoiceResultMethod = getVoiceResultMethod =
              io.grpc.MethodDescriptor.<msg.grpc.VoiceStr, msg.grpc.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VoiceResult"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  msg.grpc.VoiceStr.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  msg.grpc.Response.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServicesMethodDescriptorSupplier("VoiceResult"))
              .build();
        }
      }
    }
    return getVoiceResultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<msg.grpc.ControlCmd,
      msg.grpc.Response> getControlCommandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ControlCommand",
      requestType = msg.grpc.ControlCmd.class,
      responseType = msg.grpc.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<msg.grpc.ControlCmd,
      msg.grpc.Response> getControlCommandMethod() {
    io.grpc.MethodDescriptor<msg.grpc.ControlCmd, msg.grpc.Response> getControlCommandMethod;
    if ((getControlCommandMethod = MsgServicesGrpc.getControlCommandMethod) == null) {
      synchronized (MsgServicesGrpc.class) {
        if ((getControlCommandMethod = MsgServicesGrpc.getControlCommandMethod) == null) {
          MsgServicesGrpc.getControlCommandMethod = getControlCommandMethod =
              io.grpc.MethodDescriptor.<msg.grpc.ControlCmd, msg.grpc.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ControlCommand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  msg.grpc.ControlCmd.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  msg.grpc.Response.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServicesMethodDescriptorSupplier("ControlCommand"))
              .build();
        }
      }
    }
    return getControlCommandMethod;
  }

  private static volatile io.grpc.MethodDescriptor<msg.grpc.Response,
      msg.grpc.Response> getRobotFinishedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RobotFinished",
      requestType = msg.grpc.Response.class,
      responseType = msg.grpc.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<msg.grpc.Response,
      msg.grpc.Response> getRobotFinishedMethod() {
    io.grpc.MethodDescriptor<msg.grpc.Response, msg.grpc.Response> getRobotFinishedMethod;
    if ((getRobotFinishedMethod = MsgServicesGrpc.getRobotFinishedMethod) == null) {
      synchronized (MsgServicesGrpc.class) {
        if ((getRobotFinishedMethod = MsgServicesGrpc.getRobotFinishedMethod) == null) {
          MsgServicesGrpc.getRobotFinishedMethod = getRobotFinishedMethod =
              io.grpc.MethodDescriptor.<msg.grpc.Response, msg.grpc.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RobotFinished"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  msg.grpc.Response.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  msg.grpc.Response.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServicesMethodDescriptorSupplier("RobotFinished"))
              .build();
        }
      }
    }
    return getRobotFinishedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<msg.grpc.Drive,
      msg.grpc.Response> getDriveRobotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DriveRobot",
      requestType = msg.grpc.Drive.class,
      responseType = msg.grpc.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<msg.grpc.Drive,
      msg.grpc.Response> getDriveRobotMethod() {
    io.grpc.MethodDescriptor<msg.grpc.Drive, msg.grpc.Response> getDriveRobotMethod;
    if ((getDriveRobotMethod = MsgServicesGrpc.getDriveRobotMethod) == null) {
      synchronized (MsgServicesGrpc.class) {
        if ((getDriveRobotMethod = MsgServicesGrpc.getDriveRobotMethod) == null) {
          MsgServicesGrpc.getDriveRobotMethod = getDriveRobotMethod =
              io.grpc.MethodDescriptor.<msg.grpc.Drive, msg.grpc.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DriveRobot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  msg.grpc.Drive.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  msg.grpc.Response.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServicesMethodDescriptorSupplier("DriveRobot"))
              .build();
        }
      }
    }
    return getDriveRobotMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MsgServicesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgServicesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgServicesStub>() {
        @java.lang.Override
        public MsgServicesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgServicesStub(channel, callOptions);
        }
      };
    return MsgServicesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MsgServicesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgServicesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgServicesBlockingStub>() {
        @java.lang.Override
        public MsgServicesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgServicesBlockingStub(channel, callOptions);
        }
      };
    return MsgServicesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MsgServicesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgServicesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgServicesFutureStub>() {
        @java.lang.Override
        public MsgServicesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgServicesFutureStub(channel, callOptions);
        }
      };
    return MsgServicesFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MsgServicesImplBase implements io.grpc.BindableService {

    /**
     */
    public void configMap(msg.grpc.Map request,
        io.grpc.stub.StreamObserver<msg.grpc.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getConfigMapMethod(), responseObserver);
    }

    /**
     */
    public void robotPosition(msg.grpc.RBPosition request,
        io.grpc.stub.StreamObserver<msg.grpc.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getRobotPositionMethod(), responseObserver);
    }

    /**
     */
    public void robotPath(msg.grpc.RBPath request,
        io.grpc.stub.StreamObserver<msg.grpc.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getRobotPathMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<msg.grpc.VoiceData> sendVoiceFile(
        io.grpc.stub.StreamObserver<msg.grpc.Response> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendVoiceFileMethod(), responseObserver);
    }

    /**
     */
    public void voiceResult(msg.grpc.VoiceStr request,
        io.grpc.stub.StreamObserver<msg.grpc.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getVoiceResultMethod(), responseObserver);
    }

    /**
     */
    public void controlCommand(msg.grpc.ControlCmd request,
        io.grpc.stub.StreamObserver<msg.grpc.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getControlCommandMethod(), responseObserver);
    }

    /**
     */
    public void robotFinished(msg.grpc.Response request,
        io.grpc.stub.StreamObserver<msg.grpc.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getRobotFinishedMethod(), responseObserver);
    }

    /**
     */
    public void driveRobot(msg.grpc.Drive request,
        io.grpc.stub.StreamObserver<msg.grpc.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getDriveRobotMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConfigMapMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                msg.grpc.Map,
                msg.grpc.Response>(
                  this, METHODID_CONFIG_MAP)))
          .addMethod(
            getRobotPositionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                msg.grpc.RBPosition,
                msg.grpc.Response>(
                  this, METHODID_ROBOT_POSITION)))
          .addMethod(
            getRobotPathMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                msg.grpc.RBPath,
                msg.grpc.Response>(
                  this, METHODID_ROBOT_PATH)))
          .addMethod(
            getSendVoiceFileMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                msg.grpc.VoiceData,
                msg.grpc.Response>(
                  this, METHODID_SEND_VOICE_FILE)))
          .addMethod(
            getVoiceResultMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                msg.grpc.VoiceStr,
                msg.grpc.Response>(
                  this, METHODID_VOICE_RESULT)))
          .addMethod(
            getControlCommandMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                msg.grpc.ControlCmd,
                msg.grpc.Response>(
                  this, METHODID_CONTROL_COMMAND)))
          .addMethod(
            getRobotFinishedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                msg.grpc.Response,
                msg.grpc.Response>(
                  this, METHODID_ROBOT_FINISHED)))
          .addMethod(
            getDriveRobotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                msg.grpc.Drive,
                msg.grpc.Response>(
                  this, METHODID_DRIVE_ROBOT)))
          .build();
    }
  }

  /**
   */
  public static final class MsgServicesStub extends io.grpc.stub.AbstractAsyncStub<MsgServicesStub> {
    private MsgServicesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgServicesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgServicesStub(channel, callOptions);
    }

    /**
     */
    public void configMap(msg.grpc.Map request,
        io.grpc.stub.StreamObserver<msg.grpc.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConfigMapMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void robotPosition(msg.grpc.RBPosition request,
        io.grpc.stub.StreamObserver<msg.grpc.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRobotPositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void robotPath(msg.grpc.RBPath request,
        io.grpc.stub.StreamObserver<msg.grpc.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRobotPathMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<msg.grpc.VoiceData> sendVoiceFile(
        io.grpc.stub.StreamObserver<msg.grpc.Response> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSendVoiceFileMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void voiceResult(msg.grpc.VoiceStr request,
        io.grpc.stub.StreamObserver<msg.grpc.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVoiceResultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void controlCommand(msg.grpc.ControlCmd request,
        io.grpc.stub.StreamObserver<msg.grpc.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getControlCommandMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void robotFinished(msg.grpc.Response request,
        io.grpc.stub.StreamObserver<msg.grpc.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRobotFinishedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void driveRobot(msg.grpc.Drive request,
        io.grpc.stub.StreamObserver<msg.grpc.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDriveRobotMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MsgServicesBlockingStub extends io.grpc.stub.AbstractBlockingStub<MsgServicesBlockingStub> {
    private MsgServicesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgServicesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgServicesBlockingStub(channel, callOptions);
    }

    /**
     */
    public msg.grpc.Response configMap(msg.grpc.Map request) {
      return blockingUnaryCall(
          getChannel(), getConfigMapMethod(), getCallOptions(), request);
    }

    /**
     */
    public msg.grpc.Response robotPosition(msg.grpc.RBPosition request) {
      return blockingUnaryCall(
          getChannel(), getRobotPositionMethod(), getCallOptions(), request);
    }

    /**
     */
    public msg.grpc.Response robotPath(msg.grpc.RBPath request) {
      return blockingUnaryCall(
          getChannel(), getRobotPathMethod(), getCallOptions(), request);
    }

    /**
     */
    public msg.grpc.Response voiceResult(msg.grpc.VoiceStr request) {
      return blockingUnaryCall(
          getChannel(), getVoiceResultMethod(), getCallOptions(), request);
    }

    /**
     */
    public msg.grpc.Response controlCommand(msg.grpc.ControlCmd request) {
      return blockingUnaryCall(
          getChannel(), getControlCommandMethod(), getCallOptions(), request);
    }

    /**
     */
    public msg.grpc.Response robotFinished(msg.grpc.Response request) {
      return blockingUnaryCall(
          getChannel(), getRobotFinishedMethod(), getCallOptions(), request);
    }

    /**
     */
    public msg.grpc.Response driveRobot(msg.grpc.Drive request) {
      return blockingUnaryCall(
          getChannel(), getDriveRobotMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MsgServicesFutureStub extends io.grpc.stub.AbstractFutureStub<MsgServicesFutureStub> {
    private MsgServicesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgServicesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgServicesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<msg.grpc.Response> configMap(
        msg.grpc.Map request) {
      return futureUnaryCall(
          getChannel().newCall(getConfigMapMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<msg.grpc.Response> robotPosition(
        msg.grpc.RBPosition request) {
      return futureUnaryCall(
          getChannel().newCall(getRobotPositionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<msg.grpc.Response> robotPath(
        msg.grpc.RBPath request) {
      return futureUnaryCall(
          getChannel().newCall(getRobotPathMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<msg.grpc.Response> voiceResult(
        msg.grpc.VoiceStr request) {
      return futureUnaryCall(
          getChannel().newCall(getVoiceResultMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<msg.grpc.Response> controlCommand(
        msg.grpc.ControlCmd request) {
      return futureUnaryCall(
          getChannel().newCall(getControlCommandMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<msg.grpc.Response> robotFinished(
        msg.grpc.Response request) {
      return futureUnaryCall(
          getChannel().newCall(getRobotFinishedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<msg.grpc.Response> driveRobot(
        msg.grpc.Drive request) {
      return futureUnaryCall(
          getChannel().newCall(getDriveRobotMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONFIG_MAP = 0;
  private static final int METHODID_ROBOT_POSITION = 1;
  private static final int METHODID_ROBOT_PATH = 2;
  private static final int METHODID_VOICE_RESULT = 3;
  private static final int METHODID_CONTROL_COMMAND = 4;
  private static final int METHODID_ROBOT_FINISHED = 5;
  private static final int METHODID_DRIVE_ROBOT = 6;
  private static final int METHODID_SEND_VOICE_FILE = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MsgServicesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MsgServicesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONFIG_MAP:
          serviceImpl.configMap((msg.grpc.Map) request,
              (io.grpc.stub.StreamObserver<msg.grpc.Response>) responseObserver);
          break;
        case METHODID_ROBOT_POSITION:
          serviceImpl.robotPosition((msg.grpc.RBPosition) request,
              (io.grpc.stub.StreamObserver<msg.grpc.Response>) responseObserver);
          break;
        case METHODID_ROBOT_PATH:
          serviceImpl.robotPath((msg.grpc.RBPath) request,
              (io.grpc.stub.StreamObserver<msg.grpc.Response>) responseObserver);
          break;
        case METHODID_VOICE_RESULT:
          serviceImpl.voiceResult((msg.grpc.VoiceStr) request,
              (io.grpc.stub.StreamObserver<msg.grpc.Response>) responseObserver);
          break;
        case METHODID_CONTROL_COMMAND:
          serviceImpl.controlCommand((msg.grpc.ControlCmd) request,
              (io.grpc.stub.StreamObserver<msg.grpc.Response>) responseObserver);
          break;
        case METHODID_ROBOT_FINISHED:
          serviceImpl.robotFinished((msg.grpc.Response) request,
              (io.grpc.stub.StreamObserver<msg.grpc.Response>) responseObserver);
          break;
        case METHODID_DRIVE_ROBOT:
          serviceImpl.driveRobot((msg.grpc.Drive) request,
              (io.grpc.stub.StreamObserver<msg.grpc.Response>) responseObserver);
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
        case METHODID_SEND_VOICE_FILE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendVoiceFile(
              (io.grpc.stub.StreamObserver<msg.grpc.Response>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MsgServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgServicesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return msg.grpc.Msg.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MsgServices");
    }
  }

  private static final class MsgServicesFileDescriptorSupplier
      extends MsgServicesBaseDescriptorSupplier {
    MsgServicesFileDescriptorSupplier() {}
  }

  private static final class MsgServicesMethodDescriptorSupplier
      extends MsgServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MsgServicesMethodDescriptorSupplier(String methodName) {
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
      synchronized (MsgServicesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MsgServicesFileDescriptorSupplier())
              .addMethod(getConfigMapMethod())
              .addMethod(getRobotPositionMethod())
              .addMethod(getRobotPathMethod())
              .addMethod(getSendVoiceFileMethod())
              .addMethod(getVoiceResultMethod())
              .addMethod(getControlCommandMethod())
              .addMethod(getRobotFinishedMethod())
              .addMethod(getDriveRobotMethod())
              .build();
        }
      }
    }
    return result;
  }
}

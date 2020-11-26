// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: msg.proto

package msg.grpc;

/**
 * <pre>
 * control command
 * </pre>
 *
 * Protobuf type {@code msg.ControlCmd}
 */
public  final class ControlCmd extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:msg.ControlCmd)
    ControlCmdOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ControlCmd.newBuilder() to construct.
  private ControlCmd(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ControlCmd() {
    cmd_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ControlCmd(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            cmd_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return msg.grpc.Msg.internal_static_msg_ControlCmd_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return msg.grpc.Msg.internal_static_msg_ControlCmd_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            msg.grpc.ControlCmd.class, msg.grpc.ControlCmd.Builder.class);
  }

  /**
   * Protobuf enum {@code msg.ControlCmd.CtrlCmd}
   */
  public enum CtrlCmd
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>START = 0;</code>
     */
    START(0),
    /**
     * <code>STOP = 1;</code>
     */
    STOP(1),
    /**
     * <code>CONNECT = 2;</code>
     */
    CONNECT(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>START = 0;</code>
     */
    public static final int START_VALUE = 0;
    /**
     * <code>STOP = 1;</code>
     */
    public static final int STOP_VALUE = 1;
    /**
     * <code>CONNECT = 2;</code>
     */
    public static final int CONNECT_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static CtrlCmd valueOf(int value) {
      return forNumber(value);
    }

    public static CtrlCmd forNumber(int value) {
      switch (value) {
        case 0: return START;
        case 1: return STOP;
        case 2: return CONNECT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CtrlCmd>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CtrlCmd> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CtrlCmd>() {
            public CtrlCmd findValueByNumber(int number) {
              return CtrlCmd.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return msg.grpc.ControlCmd.getDescriptor().getEnumTypes().get(0);
    }

    private static final CtrlCmd[] VALUES = values();

    public static CtrlCmd valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private CtrlCmd(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:msg.ControlCmd.CtrlCmd)
  }

  public static final int CMD_FIELD_NUMBER = 1;
  private int cmd_;
  /**
   * <code>.msg.ControlCmd.CtrlCmd cmd = 1;</code>
   */
  public int getCmdValue() {
    return cmd_;
  }
  /**
   * <code>.msg.ControlCmd.CtrlCmd cmd = 1;</code>
   */
  public msg.grpc.ControlCmd.CtrlCmd getCmd() {
    @SuppressWarnings("deprecation")
    msg.grpc.ControlCmd.CtrlCmd result = msg.grpc.ControlCmd.CtrlCmd.valueOf(cmd_);
    return result == null ? msg.grpc.ControlCmd.CtrlCmd.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (cmd_ != msg.grpc.ControlCmd.CtrlCmd.START.getNumber()) {
      output.writeEnum(1, cmd_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cmd_ != msg.grpc.ControlCmd.CtrlCmd.START.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, cmd_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof msg.grpc.ControlCmd)) {
      return super.equals(obj);
    }
    msg.grpc.ControlCmd other = (msg.grpc.ControlCmd) obj;

    boolean result = true;
    result = result && cmd_ == other.cmd_;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CMD_FIELD_NUMBER;
    hash = (53 * hash) + cmd_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static msg.grpc.ControlCmd parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static msg.grpc.ControlCmd parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static msg.grpc.ControlCmd parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static msg.grpc.ControlCmd parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static msg.grpc.ControlCmd parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static msg.grpc.ControlCmd parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static msg.grpc.ControlCmd parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static msg.grpc.ControlCmd parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static msg.grpc.ControlCmd parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static msg.grpc.ControlCmd parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static msg.grpc.ControlCmd parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static msg.grpc.ControlCmd parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(msg.grpc.ControlCmd prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * control command
   * </pre>
   *
   * Protobuf type {@code msg.ControlCmd}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:msg.ControlCmd)
      msg.grpc.ControlCmdOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return msg.grpc.Msg.internal_static_msg_ControlCmd_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return msg.grpc.Msg.internal_static_msg_ControlCmd_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              msg.grpc.ControlCmd.class, msg.grpc.ControlCmd.Builder.class);
    }

    // Construct using msg.grpc.ControlCmd.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      cmd_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return msg.grpc.Msg.internal_static_msg_ControlCmd_descriptor;
    }

    @java.lang.Override
    public msg.grpc.ControlCmd getDefaultInstanceForType() {
      return msg.grpc.ControlCmd.getDefaultInstance();
    }

    @java.lang.Override
    public msg.grpc.ControlCmd build() {
      msg.grpc.ControlCmd result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public msg.grpc.ControlCmd buildPartial() {
      msg.grpc.ControlCmd result = new msg.grpc.ControlCmd(this);
      result.cmd_ = cmd_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof msg.grpc.ControlCmd) {
        return mergeFrom((msg.grpc.ControlCmd)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(msg.grpc.ControlCmd other) {
      if (other == msg.grpc.ControlCmd.getDefaultInstance()) return this;
      if (other.cmd_ != 0) {
        setCmdValue(other.getCmdValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      msg.grpc.ControlCmd parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (msg.grpc.ControlCmd) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int cmd_ = 0;
    /**
     * <code>.msg.ControlCmd.CtrlCmd cmd = 1;</code>
     */
    public int getCmdValue() {
      return cmd_;
    }
    /**
     * <code>.msg.ControlCmd.CtrlCmd cmd = 1;</code>
     */
    public Builder setCmdValue(int value) {
      cmd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.msg.ControlCmd.CtrlCmd cmd = 1;</code>
     */
    public msg.grpc.ControlCmd.CtrlCmd getCmd() {
      @SuppressWarnings("deprecation")
      msg.grpc.ControlCmd.CtrlCmd result = msg.grpc.ControlCmd.CtrlCmd.valueOf(cmd_);
      return result == null ? msg.grpc.ControlCmd.CtrlCmd.UNRECOGNIZED : result;
    }
    /**
     * <code>.msg.ControlCmd.CtrlCmd cmd = 1;</code>
     */
    public Builder setCmd(msg.grpc.ControlCmd.CtrlCmd value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      cmd_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.msg.ControlCmd.CtrlCmd cmd = 1;</code>
     */
    public Builder clearCmd() {
      
      cmd_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:msg.ControlCmd)
  }

  // @@protoc_insertion_point(class_scope:msg.ControlCmd)
  private static final msg.grpc.ControlCmd DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new msg.grpc.ControlCmd();
  }

  public static msg.grpc.ControlCmd getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ControlCmd>
      PARSER = new com.google.protobuf.AbstractParser<ControlCmd>() {
    @java.lang.Override
    public ControlCmd parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ControlCmd(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ControlCmd> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ControlCmd> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public msg.grpc.ControlCmd getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


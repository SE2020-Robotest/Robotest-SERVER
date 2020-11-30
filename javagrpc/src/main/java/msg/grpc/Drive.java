// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: msg.proto

package msg.grpc;

/**
 * Protobuf type {@code msg.Drive}
 */
public  final class Drive extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:msg.Drive)
    DriveOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Drive.newBuilder() to construct.
  private Drive(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Drive() {
    drivecmd_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Drive(
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

            drivecmd_ = rawValue;
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
    return msg.grpc.Msg.internal_static_msg_Drive_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return msg.grpc.Msg.internal_static_msg_Drive_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            msg.grpc.Drive.class, msg.grpc.Drive.Builder.class);
  }

  /**
   * Protobuf enum {@code msg.Drive.DriveCmd}
   */
  public enum DriveCmd
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>FRONT = 0;</code>
     */
    FRONT(0),
    /**
     * <code>BACK = 1;</code>
     */
    BACK(1),
    /**
     * <code>LEFT = 2;</code>
     */
    LEFT(2),
    /**
     * <code>RIGHT = 3;</code>
     */
    RIGHT(3),
    /**
     * <code>CLOCKWISE = 4;</code>
     */
    CLOCKWISE(4),
    /**
     * <code>ANTICLOCKWISE = 5;</code>
     */
    ANTICLOCKWISE(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>FRONT = 0;</code>
     */
    public static final int FRONT_VALUE = 0;
    /**
     * <code>BACK = 1;</code>
     */
    public static final int BACK_VALUE = 1;
    /**
     * <code>LEFT = 2;</code>
     */
    public static final int LEFT_VALUE = 2;
    /**
     * <code>RIGHT = 3;</code>
     */
    public static final int RIGHT_VALUE = 3;
    /**
     * <code>CLOCKWISE = 4;</code>
     */
    public static final int CLOCKWISE_VALUE = 4;
    /**
     * <code>ANTICLOCKWISE = 5;</code>
     */
    public static final int ANTICLOCKWISE_VALUE = 5;


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
    public static DriveCmd valueOf(int value) {
      return forNumber(value);
    }

    public static DriveCmd forNumber(int value) {
      switch (value) {
        case 0: return FRONT;
        case 1: return BACK;
        case 2: return LEFT;
        case 3: return RIGHT;
        case 4: return CLOCKWISE;
        case 5: return ANTICLOCKWISE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DriveCmd>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DriveCmd> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DriveCmd>() {
            public DriveCmd findValueByNumber(int number) {
              return DriveCmd.forNumber(number);
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
      return msg.grpc.Drive.getDescriptor().getEnumTypes().get(0);
    }

    private static final DriveCmd[] VALUES = values();

    public static DriveCmd valueOf(
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

    private DriveCmd(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:msg.Drive.DriveCmd)
  }

  public static final int DRIVECMD_FIELD_NUMBER = 1;
  private int drivecmd_;
  /**
   * <code>.msg.Drive.DriveCmd drivecmd = 1;</code>
   */
  public int getDrivecmdValue() {
    return drivecmd_;
  }
  /**
   * <code>.msg.Drive.DriveCmd drivecmd = 1;</code>
   */
  public msg.grpc.Drive.DriveCmd getDrivecmd() {
    @SuppressWarnings("deprecation")
    msg.grpc.Drive.DriveCmd result = msg.grpc.Drive.DriveCmd.valueOf(drivecmd_);
    return result == null ? msg.grpc.Drive.DriveCmd.UNRECOGNIZED : result;
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
    if (drivecmd_ != msg.grpc.Drive.DriveCmd.FRONT.getNumber()) {
      output.writeEnum(1, drivecmd_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (drivecmd_ != msg.grpc.Drive.DriveCmd.FRONT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, drivecmd_);
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
    if (!(obj instanceof msg.grpc.Drive)) {
      return super.equals(obj);
    }
    msg.grpc.Drive other = (msg.grpc.Drive) obj;

    boolean result = true;
    result = result && drivecmd_ == other.drivecmd_;
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
    hash = (37 * hash) + DRIVECMD_FIELD_NUMBER;
    hash = (53 * hash) + drivecmd_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static msg.grpc.Drive parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static msg.grpc.Drive parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static msg.grpc.Drive parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static msg.grpc.Drive parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static msg.grpc.Drive parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static msg.grpc.Drive parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static msg.grpc.Drive parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static msg.grpc.Drive parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static msg.grpc.Drive parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static msg.grpc.Drive parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static msg.grpc.Drive parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static msg.grpc.Drive parseFrom(
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
  public static Builder newBuilder(msg.grpc.Drive prototype) {
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
   * Protobuf type {@code msg.Drive}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:msg.Drive)
      msg.grpc.DriveOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return msg.grpc.Msg.internal_static_msg_Drive_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return msg.grpc.Msg.internal_static_msg_Drive_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              msg.grpc.Drive.class, msg.grpc.Drive.Builder.class);
    }

    // Construct using msg.grpc.Drive.newBuilder()
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
      drivecmd_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return msg.grpc.Msg.internal_static_msg_Drive_descriptor;
    }

    @java.lang.Override
    public msg.grpc.Drive getDefaultInstanceForType() {
      return msg.grpc.Drive.getDefaultInstance();
    }

    @java.lang.Override
    public msg.grpc.Drive build() {
      msg.grpc.Drive result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public msg.grpc.Drive buildPartial() {
      msg.grpc.Drive result = new msg.grpc.Drive(this);
      result.drivecmd_ = drivecmd_;
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
      if (other instanceof msg.grpc.Drive) {
        return mergeFrom((msg.grpc.Drive)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(msg.grpc.Drive other) {
      if (other == msg.grpc.Drive.getDefaultInstance()) return this;
      if (other.drivecmd_ != 0) {
        setDrivecmdValue(other.getDrivecmdValue());
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
      msg.grpc.Drive parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (msg.grpc.Drive) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int drivecmd_ = 0;
    /**
     * <code>.msg.Drive.DriveCmd drivecmd = 1;</code>
     */
    public int getDrivecmdValue() {
      return drivecmd_;
    }
    /**
     * <code>.msg.Drive.DriveCmd drivecmd = 1;</code>
     */
    public Builder setDrivecmdValue(int value) {
      drivecmd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.msg.Drive.DriveCmd drivecmd = 1;</code>
     */
    public msg.grpc.Drive.DriveCmd getDrivecmd() {
      @SuppressWarnings("deprecation")
      msg.grpc.Drive.DriveCmd result = msg.grpc.Drive.DriveCmd.valueOf(drivecmd_);
      return result == null ? msg.grpc.Drive.DriveCmd.UNRECOGNIZED : result;
    }
    /**
     * <code>.msg.Drive.DriveCmd drivecmd = 1;</code>
     */
    public Builder setDrivecmd(msg.grpc.Drive.DriveCmd value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      drivecmd_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.msg.Drive.DriveCmd drivecmd = 1;</code>
     */
    public Builder clearDrivecmd() {
      
      drivecmd_ = 0;
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


    // @@protoc_insertion_point(builder_scope:msg.Drive)
  }

  // @@protoc_insertion_point(class_scope:msg.Drive)
  private static final msg.grpc.Drive DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new msg.grpc.Drive();
  }

  public static msg.grpc.Drive getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Drive>
      PARSER = new com.google.protobuf.AbstractParser<Drive>() {
    @java.lang.Override
    public Drive parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Drive(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Drive> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Drive> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public msg.grpc.Drive getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: msg.proto

package msg.grpc;

/**
 * <pre>
 * robot position
 * </pre>
 *
 * Protobuf type {@code msg.RBPosition}
 */
public  final class RBPosition extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:msg.RBPosition)
    RBPositionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RBPosition.newBuilder() to construct.
  private RBPosition(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RBPosition() {
    angle_ = 0D;
    vx_ = 0D;
    vy_ = 0D;
    timestamp_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RBPosition(
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
          case 10: {
            msg.grpc.Point.Builder subBuilder = null;
            if (pos_ != null) {
              subBuilder = pos_.toBuilder();
            }
            pos_ = input.readMessage(msg.grpc.Point.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pos_);
              pos_ = subBuilder.buildPartial();
            }

            break;
          }
          case 17: {

            angle_ = input.readDouble();
            break;
          }
          case 25: {

            vx_ = input.readDouble();
            break;
          }
          case 33: {

            vy_ = input.readDouble();
            break;
          }
          case 40: {

            timestamp_ = input.readInt32();
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
    return msg.grpc.Msg.internal_static_msg_RBPosition_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return msg.grpc.Msg.internal_static_msg_RBPosition_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            msg.grpc.RBPosition.class, msg.grpc.RBPosition.Builder.class);
  }

  public static final int POS_FIELD_NUMBER = 1;
  private msg.grpc.Point pos_;
  /**
   * <code>.msg.Point pos = 1;</code>
   */
  public boolean hasPos() {
    return pos_ != null;
  }
  /**
   * <code>.msg.Point pos = 1;</code>
   */
  public msg.grpc.Point getPos() {
    return pos_ == null ? msg.grpc.Point.getDefaultInstance() : pos_;
  }
  /**
   * <code>.msg.Point pos = 1;</code>
   */
  public msg.grpc.PointOrBuilder getPosOrBuilder() {
    return getPos();
  }

  public static final int ANGLE_FIELD_NUMBER = 2;
  private double angle_;
  /**
   * <code>double angle = 2;</code>
   */
  public double getAngle() {
    return angle_;
  }

  public static final int VX_FIELD_NUMBER = 3;
  private double vx_;
  /**
   * <code>double vx = 3;</code>
   */
  public double getVx() {
    return vx_;
  }

  public static final int VY_FIELD_NUMBER = 4;
  private double vy_;
  /**
   * <code>double vy = 4;</code>
   */
  public double getVy() {
    return vy_;
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 5;
  private int timestamp_;
  /**
   * <code>int32 timestamp = 5;</code>
   */
  public int getTimestamp() {
    return timestamp_;
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
    if (pos_ != null) {
      output.writeMessage(1, getPos());
    }
    if (angle_ != 0D) {
      output.writeDouble(2, angle_);
    }
    if (vx_ != 0D) {
      output.writeDouble(3, vx_);
    }
    if (vy_ != 0D) {
      output.writeDouble(4, vy_);
    }
    if (timestamp_ != 0) {
      output.writeInt32(5, timestamp_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pos_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPos());
    }
    if (angle_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, angle_);
    }
    if (vx_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, vx_);
    }
    if (vy_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, vy_);
    }
    if (timestamp_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, timestamp_);
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
    if (!(obj instanceof msg.grpc.RBPosition)) {
      return super.equals(obj);
    }
    msg.grpc.RBPosition other = (msg.grpc.RBPosition) obj;

    boolean result = true;
    result = result && (hasPos() == other.hasPos());
    if (hasPos()) {
      result = result && getPos()
          .equals(other.getPos());
    }
    result = result && (
        java.lang.Double.doubleToLongBits(getAngle())
        == java.lang.Double.doubleToLongBits(
            other.getAngle()));
    result = result && (
        java.lang.Double.doubleToLongBits(getVx())
        == java.lang.Double.doubleToLongBits(
            other.getVx()));
    result = result && (
        java.lang.Double.doubleToLongBits(getVy())
        == java.lang.Double.doubleToLongBits(
            other.getVy()));
    result = result && (getTimestamp()
        == other.getTimestamp());
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
    if (hasPos()) {
      hash = (37 * hash) + POS_FIELD_NUMBER;
      hash = (53 * hash) + getPos().hashCode();
    }
    hash = (37 * hash) + ANGLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getAngle()));
    hash = (37 * hash) + VX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getVx()));
    hash = (37 * hash) + VY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getVy()));
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + getTimestamp();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static msg.grpc.RBPosition parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static msg.grpc.RBPosition parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static msg.grpc.RBPosition parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static msg.grpc.RBPosition parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static msg.grpc.RBPosition parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static msg.grpc.RBPosition parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static msg.grpc.RBPosition parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static msg.grpc.RBPosition parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static msg.grpc.RBPosition parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static msg.grpc.RBPosition parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static msg.grpc.RBPosition parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static msg.grpc.RBPosition parseFrom(
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
  public static Builder newBuilder(msg.grpc.RBPosition prototype) {
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
   * robot position
   * </pre>
   *
   * Protobuf type {@code msg.RBPosition}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:msg.RBPosition)
      msg.grpc.RBPositionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return msg.grpc.Msg.internal_static_msg_RBPosition_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return msg.grpc.Msg.internal_static_msg_RBPosition_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              msg.grpc.RBPosition.class, msg.grpc.RBPosition.Builder.class);
    }

    // Construct using msg.grpc.RBPosition.newBuilder()
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
      if (posBuilder_ == null) {
        pos_ = null;
      } else {
        pos_ = null;
        posBuilder_ = null;
      }
      angle_ = 0D;

      vx_ = 0D;

      vy_ = 0D;

      timestamp_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return msg.grpc.Msg.internal_static_msg_RBPosition_descriptor;
    }

    @java.lang.Override
    public msg.grpc.RBPosition getDefaultInstanceForType() {
      return msg.grpc.RBPosition.getDefaultInstance();
    }

    @java.lang.Override
    public msg.grpc.RBPosition build() {
      msg.grpc.RBPosition result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public msg.grpc.RBPosition buildPartial() {
      msg.grpc.RBPosition result = new msg.grpc.RBPosition(this);
      if (posBuilder_ == null) {
        result.pos_ = pos_;
      } else {
        result.pos_ = posBuilder_.build();
      }
      result.angle_ = angle_;
      result.vx_ = vx_;
      result.vy_ = vy_;
      result.timestamp_ = timestamp_;
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
      if (other instanceof msg.grpc.RBPosition) {
        return mergeFrom((msg.grpc.RBPosition)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(msg.grpc.RBPosition other) {
      if (other == msg.grpc.RBPosition.getDefaultInstance()) return this;
      if (other.hasPos()) {
        mergePos(other.getPos());
      }
      if (other.getAngle() != 0D) {
        setAngle(other.getAngle());
      }
      if (other.getVx() != 0D) {
        setVx(other.getVx());
      }
      if (other.getVy() != 0D) {
        setVy(other.getVy());
      }
      if (other.getTimestamp() != 0) {
        setTimestamp(other.getTimestamp());
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
      msg.grpc.RBPosition parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (msg.grpc.RBPosition) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private msg.grpc.Point pos_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        msg.grpc.Point, msg.grpc.Point.Builder, msg.grpc.PointOrBuilder> posBuilder_;
    /**
     * <code>.msg.Point pos = 1;</code>
     */
    public boolean hasPos() {
      return posBuilder_ != null || pos_ != null;
    }
    /**
     * <code>.msg.Point pos = 1;</code>
     */
    public msg.grpc.Point getPos() {
      if (posBuilder_ == null) {
        return pos_ == null ? msg.grpc.Point.getDefaultInstance() : pos_;
      } else {
        return posBuilder_.getMessage();
      }
    }
    /**
     * <code>.msg.Point pos = 1;</code>
     */
    public Builder setPos(msg.grpc.Point value) {
      if (posBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pos_ = value;
        onChanged();
      } else {
        posBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.msg.Point pos = 1;</code>
     */
    public Builder setPos(
        msg.grpc.Point.Builder builderForValue) {
      if (posBuilder_ == null) {
        pos_ = builderForValue.build();
        onChanged();
      } else {
        posBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.msg.Point pos = 1;</code>
     */
    public Builder mergePos(msg.grpc.Point value) {
      if (posBuilder_ == null) {
        if (pos_ != null) {
          pos_ =
            msg.grpc.Point.newBuilder(pos_).mergeFrom(value).buildPartial();
        } else {
          pos_ = value;
        }
        onChanged();
      } else {
        posBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.msg.Point pos = 1;</code>
     */
    public Builder clearPos() {
      if (posBuilder_ == null) {
        pos_ = null;
        onChanged();
      } else {
        pos_ = null;
        posBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.msg.Point pos = 1;</code>
     */
    public msg.grpc.Point.Builder getPosBuilder() {
      
      onChanged();
      return getPosFieldBuilder().getBuilder();
    }
    /**
     * <code>.msg.Point pos = 1;</code>
     */
    public msg.grpc.PointOrBuilder getPosOrBuilder() {
      if (posBuilder_ != null) {
        return posBuilder_.getMessageOrBuilder();
      } else {
        return pos_ == null ?
            msg.grpc.Point.getDefaultInstance() : pos_;
      }
    }
    /**
     * <code>.msg.Point pos = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        msg.grpc.Point, msg.grpc.Point.Builder, msg.grpc.PointOrBuilder> 
        getPosFieldBuilder() {
      if (posBuilder_ == null) {
        posBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            msg.grpc.Point, msg.grpc.Point.Builder, msg.grpc.PointOrBuilder>(
                getPos(),
                getParentForChildren(),
                isClean());
        pos_ = null;
      }
      return posBuilder_;
    }

    private double angle_ ;
    /**
     * <code>double angle = 2;</code>
     */
    public double getAngle() {
      return angle_;
    }
    /**
     * <code>double angle = 2;</code>
     */
    public Builder setAngle(double value) {
      
      angle_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double angle = 2;</code>
     */
    public Builder clearAngle() {
      
      angle_ = 0D;
      onChanged();
      return this;
    }

    private double vx_ ;
    /**
     * <code>double vx = 3;</code>
     */
    public double getVx() {
      return vx_;
    }
    /**
     * <code>double vx = 3;</code>
     */
    public Builder setVx(double value) {
      
      vx_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double vx = 3;</code>
     */
    public Builder clearVx() {
      
      vx_ = 0D;
      onChanged();
      return this;
    }

    private double vy_ ;
    /**
     * <code>double vy = 4;</code>
     */
    public double getVy() {
      return vy_;
    }
    /**
     * <code>double vy = 4;</code>
     */
    public Builder setVy(double value) {
      
      vy_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double vy = 4;</code>
     */
    public Builder clearVy() {
      
      vy_ = 0D;
      onChanged();
      return this;
    }

    private int timestamp_ ;
    /**
     * <code>int32 timestamp = 5;</code>
     */
    public int getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>int32 timestamp = 5;</code>
     */
    public Builder setTimestamp(int value) {
      
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 timestamp = 5;</code>
     */
    public Builder clearTimestamp() {
      
      timestamp_ = 0;
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


    // @@protoc_insertion_point(builder_scope:msg.RBPosition)
  }

  // @@protoc_insertion_point(class_scope:msg.RBPosition)
  private static final msg.grpc.RBPosition DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new msg.grpc.RBPosition();
  }

  public static msg.grpc.RBPosition getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RBPosition>
      PARSER = new com.google.protobuf.AbstractParser<RBPosition>() {
    @java.lang.Override
    public RBPosition parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RBPosition(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RBPosition> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RBPosition> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public msg.grpc.RBPosition getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

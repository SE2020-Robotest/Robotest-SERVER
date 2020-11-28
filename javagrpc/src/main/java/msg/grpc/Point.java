// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: msg.proto

package msg.grpc;

/**
 * Protobuf type {@code msg.Point}
 */
public  final class Point extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:msg.Point)
    PointOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Point.newBuilder() to construct.
  private Point(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Point() {
    posx_ = 0D;
    posy_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Point(
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
          case 9: {

            posx_ = input.readDouble();
            break;
          }
          case 17: {

            posy_ = input.readDouble();
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
    return msg.grpc.Msg.internal_static_msg_Point_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return msg.grpc.Msg.internal_static_msg_Point_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            msg.grpc.Point.class, msg.grpc.Point.Builder.class);
  }

  public static final int POSX_FIELD_NUMBER = 1;
  private double posx_;
  /**
   * <code>double posx = 1;</code>
   */
  public double getPosx() {
    return posx_;
  }

  public static final int POSY_FIELD_NUMBER = 2;
  private double posy_;
  /**
   * <code>double posy = 2;</code>
   */
  public double getPosy() {
    return posy_;
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
    if (posx_ != 0D) {
      output.writeDouble(1, posx_);
    }
    if (posy_ != 0D) {
      output.writeDouble(2, posy_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (posx_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, posx_);
    }
    if (posy_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, posy_);
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
    if (!(obj instanceof msg.grpc.Point)) {
      return super.equals(obj);
    }
    msg.grpc.Point other = (msg.grpc.Point) obj;

    boolean result = true;
    result = result && (
        java.lang.Double.doubleToLongBits(getPosx())
        == java.lang.Double.doubleToLongBits(
            other.getPosx()));
    result = result && (
        java.lang.Double.doubleToLongBits(getPosy())
        == java.lang.Double.doubleToLongBits(
            other.getPosy()));
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
    hash = (37 * hash) + POSX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPosx()));
    hash = (37 * hash) + POSY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPosy()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static msg.grpc.Point parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static msg.grpc.Point parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static msg.grpc.Point parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static msg.grpc.Point parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static msg.grpc.Point parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static msg.grpc.Point parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static msg.grpc.Point parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static msg.grpc.Point parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static msg.grpc.Point parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static msg.grpc.Point parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static msg.grpc.Point parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static msg.grpc.Point parseFrom(
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
  public static Builder newBuilder(msg.grpc.Point prototype) {
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
   * Protobuf type {@code msg.Point}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:msg.Point)
      msg.grpc.PointOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return msg.grpc.Msg.internal_static_msg_Point_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return msg.grpc.Msg.internal_static_msg_Point_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              msg.grpc.Point.class, msg.grpc.Point.Builder.class);
    }

    // Construct using msg.grpc.Point.newBuilder()
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
      posx_ = 0D;

      posy_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return msg.grpc.Msg.internal_static_msg_Point_descriptor;
    }

    @java.lang.Override
    public msg.grpc.Point getDefaultInstanceForType() {
      return msg.grpc.Point.getDefaultInstance();
    }

    @java.lang.Override
    public msg.grpc.Point build() {
      msg.grpc.Point result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public msg.grpc.Point buildPartial() {
      msg.grpc.Point result = new msg.grpc.Point(this);
      result.posx_ = posx_;
      result.posy_ = posy_;
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
      if (other instanceof msg.grpc.Point) {
        return mergeFrom((msg.grpc.Point)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(msg.grpc.Point other) {
      if (other == msg.grpc.Point.getDefaultInstance()) return this;
      if (other.getPosx() != 0D) {
        setPosx(other.getPosx());
      }
      if (other.getPosy() != 0D) {
        setPosy(other.getPosy());
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
      msg.grpc.Point parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (msg.grpc.Point) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double posx_ ;
    /**
     * <code>double posx = 1;</code>
     */
    public double getPosx() {
      return posx_;
    }
    /**
     * <code>double posx = 1;</code>
     */
    public Builder setPosx(double value) {
      
      posx_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double posx = 1;</code>
     */
    public Builder clearPosx() {
      
      posx_ = 0D;
      onChanged();
      return this;
    }

    private double posy_ ;
    /**
     * <code>double posy = 2;</code>
     */
    public double getPosy() {
      return posy_;
    }
    /**
     * <code>double posy = 2;</code>
     */
    public Builder setPosy(double value) {
      
      posy_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double posy = 2;</code>
     */
    public Builder clearPosy() {
      
      posy_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:msg.Point)
  }

  // @@protoc_insertion_point(class_scope:msg.Point)
  private static final msg.grpc.Point DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new msg.grpc.Point();
  }

  public static msg.grpc.Point getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Point>
      PARSER = new com.google.protobuf.AbstractParser<Point>() {
    @java.lang.Override
    public Point parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Point(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Point> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Point> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public msg.grpc.Point getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

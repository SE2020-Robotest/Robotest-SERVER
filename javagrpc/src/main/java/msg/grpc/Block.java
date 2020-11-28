// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: msg.proto

package msg.grpc;

/**
 * <pre>
 * virtual block
 * </pre>
 *
 * Protobuf type {@code msg.Block}
 */
public  final class Block extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:msg.Block)
    BlockOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Block.newBuilder() to construct.
  private Block(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Block() {
    type_ = 0;
    w_ = 0D;
    h_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Block(
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

            type_ = rawValue;
            break;
          }
          case 17: {

            w_ = input.readDouble();
            break;
          }
          case 25: {

            h_ = input.readDouble();
            break;
          }
          case 34: {
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
    return msg.grpc.Msg.internal_static_msg_Block_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return msg.grpc.Msg.internal_static_msg_Block_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            msg.grpc.Block.class, msg.grpc.Block.Builder.class);
  }

  /**
   * <pre>
   * block type
   * </pre>
   *
   * Protobuf enum {@code msg.Block.Type}
   */
  public enum Type
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CUBE = 0;</code>
     */
    CUBE(0),
    /**
     * <code>CYLINDER = 1;</code>
     */
    CYLINDER(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>CUBE = 0;</code>
     */
    public static final int CUBE_VALUE = 0;
    /**
     * <code>CYLINDER = 1;</code>
     */
    public static final int CYLINDER_VALUE = 1;


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
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    public static Type forNumber(int value) {
      switch (value) {
        case 0: return CUBE;
        case 1: return CYLINDER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Type> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Type>() {
            public Type findValueByNumber(int number) {
              return Type.forNumber(number);
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
      return msg.grpc.Block.getDescriptor().getEnumTypes().get(0);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(
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

    private Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:msg.Block.Type)
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <code>.msg.Block.Type type = 1;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.msg.Block.Type type = 1;</code>
   */
  public msg.grpc.Block.Type getType() {
    @SuppressWarnings("deprecation")
    msg.grpc.Block.Type result = msg.grpc.Block.Type.valueOf(type_);
    return result == null ? msg.grpc.Block.Type.UNRECOGNIZED : result;
  }

  public static final int W_FIELD_NUMBER = 2;
  private double w_;
  /**
   * <pre>
   * if type is cube, then w means width, h means height.
   * if type is cylinder, the w means radius, h means height.
   * </pre>
   *
   * <code>double w = 2;</code>
   */
  public double getW() {
    return w_;
  }

  public static final int H_FIELD_NUMBER = 3;
  private double h_;
  /**
   * <code>double h = 3;</code>
   */
  public double getH() {
    return h_;
  }

  public static final int POS_FIELD_NUMBER = 4;
  private msg.grpc.Point pos_;
  /**
   * <code>.msg.Point pos = 4;</code>
   */
  public boolean hasPos() {
    return pos_ != null;
  }
  /**
   * <code>.msg.Point pos = 4;</code>
   */
  public msg.grpc.Point getPos() {
    return pos_ == null ? msg.grpc.Point.getDefaultInstance() : pos_;
  }
  /**
   * <code>.msg.Point pos = 4;</code>
   */
  public msg.grpc.PointOrBuilder getPosOrBuilder() {
    return getPos();
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
    if (type_ != msg.grpc.Block.Type.CUBE.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (w_ != 0D) {
      output.writeDouble(2, w_);
    }
    if (h_ != 0D) {
      output.writeDouble(3, h_);
    }
    if (pos_ != null) {
      output.writeMessage(4, getPos());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != msg.grpc.Block.Type.CUBE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (w_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, w_);
    }
    if (h_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, h_);
    }
    if (pos_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getPos());
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
    if (!(obj instanceof msg.grpc.Block)) {
      return super.equals(obj);
    }
    msg.grpc.Block other = (msg.grpc.Block) obj;

    boolean result = true;
    result = result && type_ == other.type_;
    result = result && (
        java.lang.Double.doubleToLongBits(getW())
        == java.lang.Double.doubleToLongBits(
            other.getW()));
    result = result && (
        java.lang.Double.doubleToLongBits(getH())
        == java.lang.Double.doubleToLongBits(
            other.getH()));
    result = result && (hasPos() == other.hasPos());
    if (hasPos()) {
      result = result && getPos()
          .equals(other.getPos());
    }
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + W_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getW()));
    hash = (37 * hash) + H_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getH()));
    if (hasPos()) {
      hash = (37 * hash) + POS_FIELD_NUMBER;
      hash = (53 * hash) + getPos().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static msg.grpc.Block parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static msg.grpc.Block parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static msg.grpc.Block parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static msg.grpc.Block parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static msg.grpc.Block parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static msg.grpc.Block parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static msg.grpc.Block parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static msg.grpc.Block parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static msg.grpc.Block parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static msg.grpc.Block parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static msg.grpc.Block parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static msg.grpc.Block parseFrom(
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
  public static Builder newBuilder(msg.grpc.Block prototype) {
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
   * virtual block
   * </pre>
   *
   * Protobuf type {@code msg.Block}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:msg.Block)
      msg.grpc.BlockOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return msg.grpc.Msg.internal_static_msg_Block_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return msg.grpc.Msg.internal_static_msg_Block_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              msg.grpc.Block.class, msg.grpc.Block.Builder.class);
    }

    // Construct using msg.grpc.Block.newBuilder()
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
      type_ = 0;

      w_ = 0D;

      h_ = 0D;

      if (posBuilder_ == null) {
        pos_ = null;
      } else {
        pos_ = null;
        posBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return msg.grpc.Msg.internal_static_msg_Block_descriptor;
    }

    @java.lang.Override
    public msg.grpc.Block getDefaultInstanceForType() {
      return msg.grpc.Block.getDefaultInstance();
    }

    @java.lang.Override
    public msg.grpc.Block build() {
      msg.grpc.Block result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public msg.grpc.Block buildPartial() {
      msg.grpc.Block result = new msg.grpc.Block(this);
      result.type_ = type_;
      result.w_ = w_;
      result.h_ = h_;
      if (posBuilder_ == null) {
        result.pos_ = pos_;
      } else {
        result.pos_ = posBuilder_.build();
      }
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
      if (other instanceof msg.grpc.Block) {
        return mergeFrom((msg.grpc.Block)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(msg.grpc.Block other) {
      if (other == msg.grpc.Block.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.getW() != 0D) {
        setW(other.getW());
      }
      if (other.getH() != 0D) {
        setH(other.getH());
      }
      if (other.hasPos()) {
        mergePos(other.getPos());
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
      msg.grpc.Block parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (msg.grpc.Block) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_ = 0;
    /**
     * <code>.msg.Block.Type type = 1;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.msg.Block.Type type = 1;</code>
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.msg.Block.Type type = 1;</code>
     */
    public msg.grpc.Block.Type getType() {
      @SuppressWarnings("deprecation")
      msg.grpc.Block.Type result = msg.grpc.Block.Type.valueOf(type_);
      return result == null ? msg.grpc.Block.Type.UNRECOGNIZED : result;
    }
    /**
     * <code>.msg.Block.Type type = 1;</code>
     */
    public Builder setType(msg.grpc.Block.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.msg.Block.Type type = 1;</code>
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private double w_ ;
    /**
     * <pre>
     * if type is cube, then w means width, h means height.
     * if type is cylinder, the w means radius, h means height.
     * </pre>
     *
     * <code>double w = 2;</code>
     */
    public double getW() {
      return w_;
    }
    /**
     * <pre>
     * if type is cube, then w means width, h means height.
     * if type is cylinder, the w means radius, h means height.
     * </pre>
     *
     * <code>double w = 2;</code>
     */
    public Builder setW(double value) {
      
      w_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * if type is cube, then w means width, h means height.
     * if type is cylinder, the w means radius, h means height.
     * </pre>
     *
     * <code>double w = 2;</code>
     */
    public Builder clearW() {
      
      w_ = 0D;
      onChanged();
      return this;
    }

    private double h_ ;
    /**
     * <code>double h = 3;</code>
     */
    public double getH() {
      return h_;
    }
    /**
     * <code>double h = 3;</code>
     */
    public Builder setH(double value) {
      
      h_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double h = 3;</code>
     */
    public Builder clearH() {
      
      h_ = 0D;
      onChanged();
      return this;
    }

    private msg.grpc.Point pos_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        msg.grpc.Point, msg.grpc.Point.Builder, msg.grpc.PointOrBuilder> posBuilder_;
    /**
     * <code>.msg.Point pos = 4;</code>
     */
    public boolean hasPos() {
      return posBuilder_ != null || pos_ != null;
    }
    /**
     * <code>.msg.Point pos = 4;</code>
     */
    public msg.grpc.Point getPos() {
      if (posBuilder_ == null) {
        return pos_ == null ? msg.grpc.Point.getDefaultInstance() : pos_;
      } else {
        return posBuilder_.getMessage();
      }
    }
    /**
     * <code>.msg.Point pos = 4;</code>
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
     * <code>.msg.Point pos = 4;</code>
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
     * <code>.msg.Point pos = 4;</code>
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
     * <code>.msg.Point pos = 4;</code>
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
     * <code>.msg.Point pos = 4;</code>
     */
    public msg.grpc.Point.Builder getPosBuilder() {
      
      onChanged();
      return getPosFieldBuilder().getBuilder();
    }
    /**
     * <code>.msg.Point pos = 4;</code>
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
     * <code>.msg.Point pos = 4;</code>
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


    // @@protoc_insertion_point(builder_scope:msg.Block)
  }

  // @@protoc_insertion_point(class_scope:msg.Block)
  private static final msg.grpc.Block DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new msg.grpc.Block();
  }

  public static msg.grpc.Block getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Block>
      PARSER = new com.google.protobuf.AbstractParser<Block>() {
    @java.lang.Override
    public Block parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Block(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Block> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Block> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public msg.grpc.Block getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

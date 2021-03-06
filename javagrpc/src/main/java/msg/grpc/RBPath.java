// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: msg.proto

package msg.grpc;

/**
 * <pre>
 * robot path
 * </pre>
 *
 * Protobuf type {@code msg.RBPath}
 */
public  final class RBPath extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:msg.RBPath)
    RBPathOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RBPath.newBuilder() to construct.
  private RBPath(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RBPath() {
    pos_ = java.util.Collections.emptyList();
    starttime_ = 0D;
    endtime_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RBPath(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              pos_ = new java.util.ArrayList<msg.grpc.Point>();
              mutable_bitField0_ |= 0x00000001;
            }
            pos_.add(
                input.readMessage(msg.grpc.Point.parser(), extensionRegistry));
            break;
          }
          case 17: {

            starttime_ = input.readDouble();
            break;
          }
          case 25: {

            endtime_ = input.readDouble();
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        pos_ = java.util.Collections.unmodifiableList(pos_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return msg.grpc.Msg.internal_static_msg_RBPath_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return msg.grpc.Msg.internal_static_msg_RBPath_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            msg.grpc.RBPath.class, msg.grpc.RBPath.Builder.class);
  }

  private int bitField0_;
  public static final int POS_FIELD_NUMBER = 1;
  private java.util.List<msg.grpc.Point> pos_;
  /**
   * <code>repeated .msg.Point pos = 1;</code>
   */
  public java.util.List<msg.grpc.Point> getPosList() {
    return pos_;
  }
  /**
   * <code>repeated .msg.Point pos = 1;</code>
   */
  public java.util.List<? extends msg.grpc.PointOrBuilder> 
      getPosOrBuilderList() {
    return pos_;
  }
  /**
   * <code>repeated .msg.Point pos = 1;</code>
   */
  public int getPosCount() {
    return pos_.size();
  }
  /**
   * <code>repeated .msg.Point pos = 1;</code>
   */
  public msg.grpc.Point getPos(int index) {
    return pos_.get(index);
  }
  /**
   * <code>repeated .msg.Point pos = 1;</code>
   */
  public msg.grpc.PointOrBuilder getPosOrBuilder(
      int index) {
    return pos_.get(index);
  }

  public static final int STARTTIME_FIELD_NUMBER = 2;
  private double starttime_;
  /**
   * <code>double starttime = 2;</code>
   */
  public double getStarttime() {
    return starttime_;
  }

  public static final int ENDTIME_FIELD_NUMBER = 3;
  private double endtime_;
  /**
   * <code>double endtime = 3;</code>
   */
  public double getEndtime() {
    return endtime_;
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
    for (int i = 0; i < pos_.size(); i++) {
      output.writeMessage(1, pos_.get(i));
    }
    if (starttime_ != 0D) {
      output.writeDouble(2, starttime_);
    }
    if (endtime_ != 0D) {
      output.writeDouble(3, endtime_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < pos_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, pos_.get(i));
    }
    if (starttime_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, starttime_);
    }
    if (endtime_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, endtime_);
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
    if (!(obj instanceof msg.grpc.RBPath)) {
      return super.equals(obj);
    }
    msg.grpc.RBPath other = (msg.grpc.RBPath) obj;

    boolean result = true;
    result = result && getPosList()
        .equals(other.getPosList());
    result = result && (
        java.lang.Double.doubleToLongBits(getStarttime())
        == java.lang.Double.doubleToLongBits(
            other.getStarttime()));
    result = result && (
        java.lang.Double.doubleToLongBits(getEndtime())
        == java.lang.Double.doubleToLongBits(
            other.getEndtime()));
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
    if (getPosCount() > 0) {
      hash = (37 * hash) + POS_FIELD_NUMBER;
      hash = (53 * hash) + getPosList().hashCode();
    }
    hash = (37 * hash) + STARTTIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getStarttime()));
    hash = (37 * hash) + ENDTIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getEndtime()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static msg.grpc.RBPath parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static msg.grpc.RBPath parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static msg.grpc.RBPath parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static msg.grpc.RBPath parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static msg.grpc.RBPath parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static msg.grpc.RBPath parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static msg.grpc.RBPath parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static msg.grpc.RBPath parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static msg.grpc.RBPath parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static msg.grpc.RBPath parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static msg.grpc.RBPath parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static msg.grpc.RBPath parseFrom(
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
  public static Builder newBuilder(msg.grpc.RBPath prototype) {
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
   * robot path
   * </pre>
   *
   * Protobuf type {@code msg.RBPath}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:msg.RBPath)
      msg.grpc.RBPathOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return msg.grpc.Msg.internal_static_msg_RBPath_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return msg.grpc.Msg.internal_static_msg_RBPath_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              msg.grpc.RBPath.class, msg.grpc.RBPath.Builder.class);
    }

    // Construct using msg.grpc.RBPath.newBuilder()
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
        getPosFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (posBuilder_ == null) {
        pos_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        posBuilder_.clear();
      }
      starttime_ = 0D;

      endtime_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return msg.grpc.Msg.internal_static_msg_RBPath_descriptor;
    }

    @java.lang.Override
    public msg.grpc.RBPath getDefaultInstanceForType() {
      return msg.grpc.RBPath.getDefaultInstance();
    }

    @java.lang.Override
    public msg.grpc.RBPath build() {
      msg.grpc.RBPath result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public msg.grpc.RBPath buildPartial() {
      msg.grpc.RBPath result = new msg.grpc.RBPath(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (posBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          pos_ = java.util.Collections.unmodifiableList(pos_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.pos_ = pos_;
      } else {
        result.pos_ = posBuilder_.build();
      }
      result.starttime_ = starttime_;
      result.endtime_ = endtime_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof msg.grpc.RBPath) {
        return mergeFrom((msg.grpc.RBPath)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(msg.grpc.RBPath other) {
      if (other == msg.grpc.RBPath.getDefaultInstance()) return this;
      if (posBuilder_ == null) {
        if (!other.pos_.isEmpty()) {
          if (pos_.isEmpty()) {
            pos_ = other.pos_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePosIsMutable();
            pos_.addAll(other.pos_);
          }
          onChanged();
        }
      } else {
        if (!other.pos_.isEmpty()) {
          if (posBuilder_.isEmpty()) {
            posBuilder_.dispose();
            posBuilder_ = null;
            pos_ = other.pos_;
            bitField0_ = (bitField0_ & ~0x00000001);
            posBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPosFieldBuilder() : null;
          } else {
            posBuilder_.addAllMessages(other.pos_);
          }
        }
      }
      if (other.getStarttime() != 0D) {
        setStarttime(other.getStarttime());
      }
      if (other.getEndtime() != 0D) {
        setEndtime(other.getEndtime());
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
      msg.grpc.RBPath parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (msg.grpc.RBPath) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<msg.grpc.Point> pos_ =
      java.util.Collections.emptyList();
    private void ensurePosIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        pos_ = new java.util.ArrayList<msg.grpc.Point>(pos_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        msg.grpc.Point, msg.grpc.Point.Builder, msg.grpc.PointOrBuilder> posBuilder_;

    /**
     * <code>repeated .msg.Point pos = 1;</code>
     */
    public java.util.List<msg.grpc.Point> getPosList() {
      if (posBuilder_ == null) {
        return java.util.Collections.unmodifiableList(pos_);
      } else {
        return posBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .msg.Point pos = 1;</code>
     */
    public int getPosCount() {
      if (posBuilder_ == null) {
        return pos_.size();
      } else {
        return posBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .msg.Point pos = 1;</code>
     */
    public msg.grpc.Point getPos(int index) {
      if (posBuilder_ == null) {
        return pos_.get(index);
      } else {
        return posBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .msg.Point pos = 1;</code>
     */
    public Builder setPos(
        int index, msg.grpc.Point value) {
      if (posBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePosIsMutable();
        pos_.set(index, value);
        onChanged();
      } else {
        posBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .msg.Point pos = 1;</code>
     */
    public Builder setPos(
        int index, msg.grpc.Point.Builder builderForValue) {
      if (posBuilder_ == null) {
        ensurePosIsMutable();
        pos_.set(index, builderForValue.build());
        onChanged();
      } else {
        posBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .msg.Point pos = 1;</code>
     */
    public Builder addPos(msg.grpc.Point value) {
      if (posBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePosIsMutable();
        pos_.add(value);
        onChanged();
      } else {
        posBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .msg.Point pos = 1;</code>
     */
    public Builder addPos(
        int index, msg.grpc.Point value) {
      if (posBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePosIsMutable();
        pos_.add(index, value);
        onChanged();
      } else {
        posBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .msg.Point pos = 1;</code>
     */
    public Builder addPos(
        msg.grpc.Point.Builder builderForValue) {
      if (posBuilder_ == null) {
        ensurePosIsMutable();
        pos_.add(builderForValue.build());
        onChanged();
      } else {
        posBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .msg.Point pos = 1;</code>
     */
    public Builder addPos(
        int index, msg.grpc.Point.Builder builderForValue) {
      if (posBuilder_ == null) {
        ensurePosIsMutable();
        pos_.add(index, builderForValue.build());
        onChanged();
      } else {
        posBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .msg.Point pos = 1;</code>
     */
    public Builder addAllPos(
        java.lang.Iterable<? extends msg.grpc.Point> values) {
      if (posBuilder_ == null) {
        ensurePosIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, pos_);
        onChanged();
      } else {
        posBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .msg.Point pos = 1;</code>
     */
    public Builder clearPos() {
      if (posBuilder_ == null) {
        pos_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        posBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .msg.Point pos = 1;</code>
     */
    public Builder removePos(int index) {
      if (posBuilder_ == null) {
        ensurePosIsMutable();
        pos_.remove(index);
        onChanged();
      } else {
        posBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .msg.Point pos = 1;</code>
     */
    public msg.grpc.Point.Builder getPosBuilder(
        int index) {
      return getPosFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .msg.Point pos = 1;</code>
     */
    public msg.grpc.PointOrBuilder getPosOrBuilder(
        int index) {
      if (posBuilder_ == null) {
        return pos_.get(index);  } else {
        return posBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .msg.Point pos = 1;</code>
     */
    public java.util.List<? extends msg.grpc.PointOrBuilder> 
         getPosOrBuilderList() {
      if (posBuilder_ != null) {
        return posBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(pos_);
      }
    }
    /**
     * <code>repeated .msg.Point pos = 1;</code>
     */
    public msg.grpc.Point.Builder addPosBuilder() {
      return getPosFieldBuilder().addBuilder(
          msg.grpc.Point.getDefaultInstance());
    }
    /**
     * <code>repeated .msg.Point pos = 1;</code>
     */
    public msg.grpc.Point.Builder addPosBuilder(
        int index) {
      return getPosFieldBuilder().addBuilder(
          index, msg.grpc.Point.getDefaultInstance());
    }
    /**
     * <code>repeated .msg.Point pos = 1;</code>
     */
    public java.util.List<msg.grpc.Point.Builder> 
         getPosBuilderList() {
      return getPosFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        msg.grpc.Point, msg.grpc.Point.Builder, msg.grpc.PointOrBuilder> 
        getPosFieldBuilder() {
      if (posBuilder_ == null) {
        posBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            msg.grpc.Point, msg.grpc.Point.Builder, msg.grpc.PointOrBuilder>(
                pos_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        pos_ = null;
      }
      return posBuilder_;
    }

    private double starttime_ ;
    /**
     * <code>double starttime = 2;</code>
     */
    public double getStarttime() {
      return starttime_;
    }
    /**
     * <code>double starttime = 2;</code>
     */
    public Builder setStarttime(double value) {
      
      starttime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double starttime = 2;</code>
     */
    public Builder clearStarttime() {
      
      starttime_ = 0D;
      onChanged();
      return this;
    }

    private double endtime_ ;
    /**
     * <code>double endtime = 3;</code>
     */
    public double getEndtime() {
      return endtime_;
    }
    /**
     * <code>double endtime = 3;</code>
     */
    public Builder setEndtime(double value) {
      
      endtime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double endtime = 3;</code>
     */
    public Builder clearEndtime() {
      
      endtime_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:msg.RBPath)
  }

  // @@protoc_insertion_point(class_scope:msg.RBPath)
  private static final msg.grpc.RBPath DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new msg.grpc.RBPath();
  }

  public static msg.grpc.RBPath getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RBPath>
      PARSER = new com.google.protobuf.AbstractParser<RBPath>() {
    @java.lang.Override
    public RBPath parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RBPath(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RBPath> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RBPath> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public msg.grpc.RBPath getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


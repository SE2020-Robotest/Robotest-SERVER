// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: msg.proto

package msg.grpc;

/**
 * <pre>
 * voice recognition result
 * </pre>
 *
 * Protobuf type {@code msg.VoiceStr}
 */
public  final class VoiceStr extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:msg.VoiceStr)
    VoiceStrOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VoiceStr.newBuilder() to construct.
  private VoiceStr(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VoiceStr() {
    voice_ = "";
    timestamp_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VoiceStr(
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
            java.lang.String s = input.readStringRequireUtf8();

            voice_ = s;
            break;
          }
          case 16: {

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
    return msg.grpc.Msg.internal_static_msg_VoiceStr_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return msg.grpc.Msg.internal_static_msg_VoiceStr_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            msg.grpc.VoiceStr.class, msg.grpc.VoiceStr.Builder.class);
  }

  public static final int VOICE_FIELD_NUMBER = 1;
  private volatile java.lang.Object voice_;
  /**
   * <code>string voice = 1;</code>
   */
  public java.lang.String getVoice() {
    java.lang.Object ref = voice_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      voice_ = s;
      return s;
    }
  }
  /**
   * <code>string voice = 1;</code>
   */
  public com.google.protobuf.ByteString
      getVoiceBytes() {
    java.lang.Object ref = voice_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      voice_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 2;
  private int timestamp_;
  /**
   * <code>int32 timestamp = 2;</code>
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
    if (!getVoiceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, voice_);
    }
    if (timestamp_ != 0) {
      output.writeInt32(2, timestamp_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getVoiceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, voice_);
    }
    if (timestamp_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, timestamp_);
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
    if (!(obj instanceof msg.grpc.VoiceStr)) {
      return super.equals(obj);
    }
    msg.grpc.VoiceStr other = (msg.grpc.VoiceStr) obj;

    boolean result = true;
    result = result && getVoice()
        .equals(other.getVoice());
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
    hash = (37 * hash) + VOICE_FIELD_NUMBER;
    hash = (53 * hash) + getVoice().hashCode();
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + getTimestamp();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static msg.grpc.VoiceStr parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static msg.grpc.VoiceStr parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static msg.grpc.VoiceStr parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static msg.grpc.VoiceStr parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static msg.grpc.VoiceStr parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static msg.grpc.VoiceStr parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static msg.grpc.VoiceStr parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static msg.grpc.VoiceStr parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static msg.grpc.VoiceStr parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static msg.grpc.VoiceStr parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static msg.grpc.VoiceStr parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static msg.grpc.VoiceStr parseFrom(
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
  public static Builder newBuilder(msg.grpc.VoiceStr prototype) {
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
   * voice recognition result
   * </pre>
   *
   * Protobuf type {@code msg.VoiceStr}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:msg.VoiceStr)
      msg.grpc.VoiceStrOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return msg.grpc.Msg.internal_static_msg_VoiceStr_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return msg.grpc.Msg.internal_static_msg_VoiceStr_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              msg.grpc.VoiceStr.class, msg.grpc.VoiceStr.Builder.class);
    }

    // Construct using msg.grpc.VoiceStr.newBuilder()
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
      voice_ = "";

      timestamp_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return msg.grpc.Msg.internal_static_msg_VoiceStr_descriptor;
    }

    @java.lang.Override
    public msg.grpc.VoiceStr getDefaultInstanceForType() {
      return msg.grpc.VoiceStr.getDefaultInstance();
    }

    @java.lang.Override
    public msg.grpc.VoiceStr build() {
      msg.grpc.VoiceStr result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public msg.grpc.VoiceStr buildPartial() {
      msg.grpc.VoiceStr result = new msg.grpc.VoiceStr(this);
      result.voice_ = voice_;
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
      if (other instanceof msg.grpc.VoiceStr) {
        return mergeFrom((msg.grpc.VoiceStr)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(msg.grpc.VoiceStr other) {
      if (other == msg.grpc.VoiceStr.getDefaultInstance()) return this;
      if (!other.getVoice().isEmpty()) {
        voice_ = other.voice_;
        onChanged();
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
      msg.grpc.VoiceStr parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (msg.grpc.VoiceStr) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object voice_ = "";
    /**
     * <code>string voice = 1;</code>
     */
    public java.lang.String getVoice() {
      java.lang.Object ref = voice_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        voice_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string voice = 1;</code>
     */
    public com.google.protobuf.ByteString
        getVoiceBytes() {
      java.lang.Object ref = voice_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        voice_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string voice = 1;</code>
     */
    public Builder setVoice(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      voice_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string voice = 1;</code>
     */
    public Builder clearVoice() {
      
      voice_ = getDefaultInstance().getVoice();
      onChanged();
      return this;
    }
    /**
     * <code>string voice = 1;</code>
     */
    public Builder setVoiceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      voice_ = value;
      onChanged();
      return this;
    }

    private int timestamp_ ;
    /**
     * <code>int32 timestamp = 2;</code>
     */
    public int getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>int32 timestamp = 2;</code>
     */
    public Builder setTimestamp(int value) {
      
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 timestamp = 2;</code>
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


    // @@protoc_insertion_point(builder_scope:msg.VoiceStr)
  }

  // @@protoc_insertion_point(class_scope:msg.VoiceStr)
  private static final msg.grpc.VoiceStr DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new msg.grpc.VoiceStr();
  }

  public static msg.grpc.VoiceStr getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VoiceStr>
      PARSER = new com.google.protobuf.AbstractParser<VoiceStr>() {
    @java.lang.Override
    public VoiceStr parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VoiceStr(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VoiceStr> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VoiceStr> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public msg.grpc.VoiceStr getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: meta.proto

package com.metasrv.grpc.proto;

/**
 * Protobuf type {@code meta.Event}
 */
public final class Event extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:meta.Event)
    EventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Event.newBuilder() to construct.
  private Event(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Event() {
    key_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Event();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Event(
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

            key_ = s;
            break;
          }
          case 18: {
            com.metasrv.grpc.proto.SeqV.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) != 0)) {
              subBuilder = current_.toBuilder();
            }
            current_ = input.readMessage(com.metasrv.grpc.proto.SeqV.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(current_);
              current_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case 26: {
            com.metasrv.grpc.proto.SeqV.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) != 0)) {
              subBuilder = prev_.toBuilder();
            }
            prev_ = input.readMessage(com.metasrv.grpc.proto.SeqV.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(prev_);
              prev_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000002;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return com.metasrv.grpc.proto.MetaProtobuf.internal_static_meta_Event_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.metasrv.grpc.proto.MetaProtobuf.internal_static_meta_Event_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.metasrv.grpc.proto.Event.class, com.metasrv.grpc.proto.Event.Builder.class);
  }

  private int bitField0_;
  public static final int KEY_FIELD_NUMBER = 1;
  private volatile java.lang.Object key_;
  /**
   * <code>string key = 1;</code>
   * @return The key.
   */
  @java.lang.Override
  public java.lang.String getKey() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      key_ = s;
      return s;
    }
  }
  /**
   * <code>string key = 1;</code>
   * @return The bytes for key.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKeyBytes() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      key_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CURRENT_FIELD_NUMBER = 2;
  private com.metasrv.grpc.proto.SeqV current_;
  /**
   * <pre>
   * current hold current value of key(if any)
   * </pre>
   *
   * <code>optional .meta.SeqV current = 2;</code>
   * @return Whether the current field is set.
   */
  @java.lang.Override
  public boolean hasCurrent() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * current hold current value of key(if any)
   * </pre>
   *
   * <code>optional .meta.SeqV current = 2;</code>
   * @return The current.
   */
  @java.lang.Override
  public com.metasrv.grpc.proto.SeqV getCurrent() {
    return current_ == null ? com.metasrv.grpc.proto.SeqV.getDefaultInstance() : current_;
  }
  /**
   * <pre>
   * current hold current value of key(if any)
   * </pre>
   *
   * <code>optional .meta.SeqV current = 2;</code>
   */
  @java.lang.Override
  public com.metasrv.grpc.proto.SeqVOrBuilder getCurrentOrBuilder() {
    return current_ == null ? com.metasrv.grpc.proto.SeqV.getDefaultInstance() : current_;
  }

  public static final int PREV_FIELD_NUMBER = 3;
  private com.metasrv.grpc.proto.SeqV prev_;
  /**
   * <pre>
   * prev value of key(if any)
   * </pre>
   *
   * <code>optional .meta.SeqV prev = 3;</code>
   * @return Whether the prev field is set.
   */
  @java.lang.Override
  public boolean hasPrev() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * prev value of key(if any)
   * </pre>
   *
   * <code>optional .meta.SeqV prev = 3;</code>
   * @return The prev.
   */
  @java.lang.Override
  public com.metasrv.grpc.proto.SeqV getPrev() {
    return prev_ == null ? com.metasrv.grpc.proto.SeqV.getDefaultInstance() : prev_;
  }
  /**
   * <pre>
   * prev value of key(if any)
   * </pre>
   *
   * <code>optional .meta.SeqV prev = 3;</code>
   */
  @java.lang.Override
  public com.metasrv.grpc.proto.SeqVOrBuilder getPrevOrBuilder() {
    return prev_ == null ? com.metasrv.grpc.proto.SeqV.getDefaultInstance() : prev_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, key_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getCurrent());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getPrev());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, key_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCurrent());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPrev());
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
    if (!(obj instanceof com.metasrv.grpc.proto.Event)) {
      return super.equals(obj);
    }
    com.metasrv.grpc.proto.Event other = (com.metasrv.grpc.proto.Event) obj;

    if (!getKey()
        .equals(other.getKey())) return false;
    if (hasCurrent() != other.hasCurrent()) return false;
    if (hasCurrent()) {
      if (!getCurrent()
          .equals(other.getCurrent())) return false;
    }
    if (hasPrev() != other.hasPrev()) return false;
    if (hasPrev()) {
      if (!getPrev()
          .equals(other.getPrev())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    if (hasCurrent()) {
      hash = (37 * hash) + CURRENT_FIELD_NUMBER;
      hash = (53 * hash) + getCurrent().hashCode();
    }
    if (hasPrev()) {
      hash = (37 * hash) + PREV_FIELD_NUMBER;
      hash = (53 * hash) + getPrev().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.metasrv.grpc.proto.Event parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.metasrv.grpc.proto.Event parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.metasrv.grpc.proto.Event parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.metasrv.grpc.proto.Event parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.metasrv.grpc.proto.Event parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.metasrv.grpc.proto.Event parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.metasrv.grpc.proto.Event parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.metasrv.grpc.proto.Event parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.metasrv.grpc.proto.Event parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.metasrv.grpc.proto.Event parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.metasrv.grpc.proto.Event parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.metasrv.grpc.proto.Event parseFrom(
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
  public static Builder newBuilder(com.metasrv.grpc.proto.Event prototype) {
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
   * Protobuf type {@code meta.Event}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:meta.Event)
      com.metasrv.grpc.proto.EventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.metasrv.grpc.proto.MetaProtobuf.internal_static_meta_Event_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.metasrv.grpc.proto.MetaProtobuf.internal_static_meta_Event_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.metasrv.grpc.proto.Event.class, com.metasrv.grpc.proto.Event.Builder.class);
    }

    // Construct using com.metasrv.grpc.proto.Event.newBuilder()
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
        getCurrentFieldBuilder();
        getPrevFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      key_ = "";

      if (currentBuilder_ == null) {
        current_ = null;
      } else {
        currentBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      if (prevBuilder_ == null) {
        prev_ = null;
      } else {
        prevBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.metasrv.grpc.proto.MetaProtobuf.internal_static_meta_Event_descriptor;
    }

    @java.lang.Override
    public com.metasrv.grpc.proto.Event getDefaultInstanceForType() {
      return com.metasrv.grpc.proto.Event.getDefaultInstance();
    }

    @java.lang.Override
    public com.metasrv.grpc.proto.Event build() {
      com.metasrv.grpc.proto.Event result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.metasrv.grpc.proto.Event buildPartial() {
      com.metasrv.grpc.proto.Event result = new com.metasrv.grpc.proto.Event(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.key_ = key_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (currentBuilder_ == null) {
          result.current_ = current_;
        } else {
          result.current_ = currentBuilder_.build();
        }
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        if (prevBuilder_ == null) {
          result.prev_ = prev_;
        } else {
          result.prev_ = prevBuilder_.build();
        }
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.metasrv.grpc.proto.Event) {
        return mergeFrom((com.metasrv.grpc.proto.Event)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.metasrv.grpc.proto.Event other) {
      if (other == com.metasrv.grpc.proto.Event.getDefaultInstance()) return this;
      if (!other.getKey().isEmpty()) {
        key_ = other.key_;
        onChanged();
      }
      if (other.hasCurrent()) {
        mergeCurrent(other.getCurrent());
      }
      if (other.hasPrev()) {
        mergePrev(other.getPrev());
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
      com.metasrv.grpc.proto.Event parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.metasrv.grpc.proto.Event) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object key_ = "";
    /**
     * <code>string key = 1;</code>
     * @return The key.
     */
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        key_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string key = 1;</code>
     * @return The bytes for key.
     */
    public com.google.protobuf.ByteString
        getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string key = 1;</code>
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      key_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string key = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }
    /**
     * <code>string key = 1;</code>
     * @param value The bytes for key to set.
     * @return This builder for chaining.
     */
    public Builder setKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      key_ = value;
      onChanged();
      return this;
    }

    private com.metasrv.grpc.proto.SeqV current_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.metasrv.grpc.proto.SeqV, com.metasrv.grpc.proto.SeqV.Builder, com.metasrv.grpc.proto.SeqVOrBuilder> currentBuilder_;
    /**
     * <pre>
     * current hold current value of key(if any)
     * </pre>
     *
     * <code>optional .meta.SeqV current = 2;</code>
     * @return Whether the current field is set.
     */
    public boolean hasCurrent() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * current hold current value of key(if any)
     * </pre>
     *
     * <code>optional .meta.SeqV current = 2;</code>
     * @return The current.
     */
    public com.metasrv.grpc.proto.SeqV getCurrent() {
      if (currentBuilder_ == null) {
        return current_ == null ? com.metasrv.grpc.proto.SeqV.getDefaultInstance() : current_;
      } else {
        return currentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * current hold current value of key(if any)
     * </pre>
     *
     * <code>optional .meta.SeqV current = 2;</code>
     */
    public Builder setCurrent(com.metasrv.grpc.proto.SeqV value) {
      if (currentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        current_ = value;
        onChanged();
      } else {
        currentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * current hold current value of key(if any)
     * </pre>
     *
     * <code>optional .meta.SeqV current = 2;</code>
     */
    public Builder setCurrent(
        com.metasrv.grpc.proto.SeqV.Builder builderForValue) {
      if (currentBuilder_ == null) {
        current_ = builderForValue.build();
        onChanged();
      } else {
        currentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * current hold current value of key(if any)
     * </pre>
     *
     * <code>optional .meta.SeqV current = 2;</code>
     */
    public Builder mergeCurrent(com.metasrv.grpc.proto.SeqV value) {
      if (currentBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
            current_ != null &&
            current_ != com.metasrv.grpc.proto.SeqV.getDefaultInstance()) {
          current_ =
            com.metasrv.grpc.proto.SeqV.newBuilder(current_).mergeFrom(value).buildPartial();
        } else {
          current_ = value;
        }
        onChanged();
      } else {
        currentBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * current hold current value of key(if any)
     * </pre>
     *
     * <code>optional .meta.SeqV current = 2;</code>
     */
    public Builder clearCurrent() {
      if (currentBuilder_ == null) {
        current_ = null;
        onChanged();
      } else {
        currentBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <pre>
     * current hold current value of key(if any)
     * </pre>
     *
     * <code>optional .meta.SeqV current = 2;</code>
     */
    public com.metasrv.grpc.proto.SeqV.Builder getCurrentBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCurrentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * current hold current value of key(if any)
     * </pre>
     *
     * <code>optional .meta.SeqV current = 2;</code>
     */
    public com.metasrv.grpc.proto.SeqVOrBuilder getCurrentOrBuilder() {
      if (currentBuilder_ != null) {
        return currentBuilder_.getMessageOrBuilder();
      } else {
        return current_ == null ?
            com.metasrv.grpc.proto.SeqV.getDefaultInstance() : current_;
      }
    }
    /**
     * <pre>
     * current hold current value of key(if any)
     * </pre>
     *
     * <code>optional .meta.SeqV current = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.metasrv.grpc.proto.SeqV, com.metasrv.grpc.proto.SeqV.Builder, com.metasrv.grpc.proto.SeqVOrBuilder> 
        getCurrentFieldBuilder() {
      if (currentBuilder_ == null) {
        currentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.metasrv.grpc.proto.SeqV, com.metasrv.grpc.proto.SeqV.Builder, com.metasrv.grpc.proto.SeqVOrBuilder>(
                getCurrent(),
                getParentForChildren(),
                isClean());
        current_ = null;
      }
      return currentBuilder_;
    }

    private com.metasrv.grpc.proto.SeqV prev_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.metasrv.grpc.proto.SeqV, com.metasrv.grpc.proto.SeqV.Builder, com.metasrv.grpc.proto.SeqVOrBuilder> prevBuilder_;
    /**
     * <pre>
     * prev value of key(if any)
     * </pre>
     *
     * <code>optional .meta.SeqV prev = 3;</code>
     * @return Whether the prev field is set.
     */
    public boolean hasPrev() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * prev value of key(if any)
     * </pre>
     *
     * <code>optional .meta.SeqV prev = 3;</code>
     * @return The prev.
     */
    public com.metasrv.grpc.proto.SeqV getPrev() {
      if (prevBuilder_ == null) {
        return prev_ == null ? com.metasrv.grpc.proto.SeqV.getDefaultInstance() : prev_;
      } else {
        return prevBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * prev value of key(if any)
     * </pre>
     *
     * <code>optional .meta.SeqV prev = 3;</code>
     */
    public Builder setPrev(com.metasrv.grpc.proto.SeqV value) {
      if (prevBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        prev_ = value;
        onChanged();
      } else {
        prevBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * prev value of key(if any)
     * </pre>
     *
     * <code>optional .meta.SeqV prev = 3;</code>
     */
    public Builder setPrev(
        com.metasrv.grpc.proto.SeqV.Builder builderForValue) {
      if (prevBuilder_ == null) {
        prev_ = builderForValue.build();
        onChanged();
      } else {
        prevBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * prev value of key(if any)
     * </pre>
     *
     * <code>optional .meta.SeqV prev = 3;</code>
     */
    public Builder mergePrev(com.metasrv.grpc.proto.SeqV value) {
      if (prevBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
            prev_ != null &&
            prev_ != com.metasrv.grpc.proto.SeqV.getDefaultInstance()) {
          prev_ =
            com.metasrv.grpc.proto.SeqV.newBuilder(prev_).mergeFrom(value).buildPartial();
        } else {
          prev_ = value;
        }
        onChanged();
      } else {
        prevBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * prev value of key(if any)
     * </pre>
     *
     * <code>optional .meta.SeqV prev = 3;</code>
     */
    public Builder clearPrev() {
      if (prevBuilder_ == null) {
        prev_ = null;
        onChanged();
      } else {
        prevBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <pre>
     * prev value of key(if any)
     * </pre>
     *
     * <code>optional .meta.SeqV prev = 3;</code>
     */
    public com.metasrv.grpc.proto.SeqV.Builder getPrevBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPrevFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * prev value of key(if any)
     * </pre>
     *
     * <code>optional .meta.SeqV prev = 3;</code>
     */
    public com.metasrv.grpc.proto.SeqVOrBuilder getPrevOrBuilder() {
      if (prevBuilder_ != null) {
        return prevBuilder_.getMessageOrBuilder();
      } else {
        return prev_ == null ?
            com.metasrv.grpc.proto.SeqV.getDefaultInstance() : prev_;
      }
    }
    /**
     * <pre>
     * prev value of key(if any)
     * </pre>
     *
     * <code>optional .meta.SeqV prev = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.metasrv.grpc.proto.SeqV, com.metasrv.grpc.proto.SeqV.Builder, com.metasrv.grpc.proto.SeqVOrBuilder> 
        getPrevFieldBuilder() {
      if (prevBuilder_ == null) {
        prevBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.metasrv.grpc.proto.SeqV, com.metasrv.grpc.proto.SeqV.Builder, com.metasrv.grpc.proto.SeqVOrBuilder>(
                getPrev(),
                getParentForChildren(),
                isClean());
        prev_ = null;
      }
      return prevBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:meta.Event)
  }

  // @@protoc_insertion_point(class_scope:meta.Event)
  private static final com.metasrv.grpc.proto.Event DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.metasrv.grpc.proto.Event();
  }

  public static com.metasrv.grpc.proto.Event getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Event>
      PARSER = new com.google.protobuf.AbstractParser<Event>() {
    @java.lang.Override
    public Event parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Event(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Event> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Event> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.metasrv.grpc.proto.Event getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

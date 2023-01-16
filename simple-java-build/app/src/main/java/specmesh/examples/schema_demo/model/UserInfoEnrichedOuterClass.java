// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user_info_enriched.proto

package specmesh.examples.schema_demo.model;

public final class UserInfoEnrichedOuterClass {
  private UserInfoEnrichedOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UserInfoEnrichedOrBuilder extends
      // @@protoc_insertion_point(interface_extends:specmesh.examples.schema_demo.model.UserInfoEnriched)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 userId = 1;</code>
     * @return The userId.
     */
    int getUserId();

    /**
     * <code>string fullName = 2;</code>
     * @return The fullName.
     */
    java.lang.String getFullName();
    /**
     * <code>string fullName = 2;</code>
     * @return The bytes for fullName.
     */
    com.google.protobuf.ByteString
        getFullNameBytes();

    /**
     * <code>string email = 3;</code>
     * @return The email.
     */
    java.lang.String getEmail();
    /**
     * <code>string email = 3;</code>
     * @return The bytes for email.
     */
    com.google.protobuf.ByteString
        getEmailBytes();

    /**
     * <code>int32 age = 4;</code>
     * @return The age.
     */
    int getAge();

    /**
     * <code>int32 demographic = 5;</code>
     * @return The demographic.
     */
    int getDemographic();
  }
  /**
   * Protobuf type {@code specmesh.examples.schema_demo.model.UserInfoEnriched}
   */
  public static final class UserInfoEnriched extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:specmesh.examples.schema_demo.model.UserInfoEnriched)
      UserInfoEnrichedOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UserInfoEnriched.newBuilder() to construct.
    private UserInfoEnriched(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UserInfoEnriched() {
      fullName_ = "";
      email_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UserInfoEnriched();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.internal_static_specmesh_examples_schema_demo_model_UserInfoEnriched_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.internal_static_specmesh_examples_schema_demo_model_UserInfoEnriched_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched.class, specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched.Builder.class);
    }

    public static final int USERID_FIELD_NUMBER = 1;
    private int userId_ = 0;
    /**
     * <code>int32 userId = 1;</code>
     * @return The userId.
     */
    @java.lang.Override
    public int getUserId() {
      return userId_;
    }

    public static final int FULLNAME_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object fullName_ = "";
    /**
     * <code>string fullName = 2;</code>
     * @return The fullName.
     */
    @java.lang.Override
    public java.lang.String getFullName() {
      java.lang.Object ref = fullName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fullName_ = s;
        return s;
      }
    }
    /**
     * <code>string fullName = 2;</code>
     * @return The bytes for fullName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFullNameBytes() {
      java.lang.Object ref = fullName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fullName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int EMAIL_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object email_ = "";
    /**
     * <code>string email = 3;</code>
     * @return The email.
     */
    @java.lang.Override
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        email_ = s;
        return s;
      }
    }
    /**
     * <code>string email = 3;</code>
     * @return The bytes for email.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AGE_FIELD_NUMBER = 4;
    private int age_ = 0;
    /**
     * <code>int32 age = 4;</code>
     * @return The age.
     */
    @java.lang.Override
    public int getAge() {
      return age_;
    }

    public static final int DEMOGRAPHIC_FIELD_NUMBER = 5;
    private int demographic_ = 0;
    /**
     * <code>int32 demographic = 5;</code>
     * @return The demographic.
     */
    @java.lang.Override
    public int getDemographic() {
      return demographic_;
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
      if (userId_ != 0) {
        output.writeInt32(1, userId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fullName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fullName_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(email_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, email_);
      }
      if (age_ != 0) {
        output.writeInt32(4, age_);
      }
      if (demographic_ != 0) {
        output.writeInt32(5, demographic_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (userId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, userId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fullName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fullName_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(email_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, email_);
      }
      if (age_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, age_);
      }
      if (demographic_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, demographic_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched)) {
        return super.equals(obj);
      }
      specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched other = (specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched) obj;

      if (getUserId()
          != other.getUserId()) return false;
      if (!getFullName()
          .equals(other.getFullName())) return false;
      if (!getEmail()
          .equals(other.getEmail())) return false;
      if (getAge()
          != other.getAge()) return false;
      if (getDemographic()
          != other.getDemographic()) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + USERID_FIELD_NUMBER;
      hash = (53 * hash) + getUserId();
      hash = (37 * hash) + FULLNAME_FIELD_NUMBER;
      hash = (53 * hash) + getFullName().hashCode();
      hash = (37 * hash) + EMAIL_FIELD_NUMBER;
      hash = (53 * hash) + getEmail().hashCode();
      hash = (37 * hash) + AGE_FIELD_NUMBER;
      hash = (53 * hash) + getAge();
      hash = (37 * hash) + DEMOGRAPHIC_FIELD_NUMBER;
      hash = (53 * hash) + getDemographic();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched parseFrom(
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
    public static Builder newBuilder(specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched prototype) {
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
     * Protobuf type {@code specmesh.examples.schema_demo.model.UserInfoEnriched}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:specmesh.examples.schema_demo.model.UserInfoEnriched)
        specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnrichedOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.internal_static_specmesh_examples_schema_demo_model_UserInfoEnriched_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.internal_static_specmesh_examples_schema_demo_model_UserInfoEnriched_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched.class, specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched.Builder.class);
      }

      // Construct using specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        userId_ = 0;
        fullName_ = "";
        email_ = "";
        age_ = 0;
        demographic_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.internal_static_specmesh_examples_schema_demo_model_UserInfoEnriched_descriptor;
      }

      @java.lang.Override
      public specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched getDefaultInstanceForType() {
        return specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched.getDefaultInstance();
      }

      @java.lang.Override
      public specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched build() {
        specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched buildPartial() {
        specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched result = new specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.userId_ = userId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.fullName_ = fullName_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.email_ = email_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.age_ = age_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.demographic_ = demographic_;
        }
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
        if (other instanceof specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched) {
          return mergeFrom((specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched other) {
        if (other == specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched.getDefaultInstance()) return this;
        if (other.getUserId() != 0) {
          setUserId(other.getUserId());
        }
        if (!other.getFullName().isEmpty()) {
          fullName_ = other.fullName_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (!other.getEmail().isEmpty()) {
          email_ = other.email_;
          bitField0_ |= 0x00000004;
          onChanged();
        }
        if (other.getAge() != 0) {
          setAge(other.getAge());
        }
        if (other.getDemographic() != 0) {
          setDemographic(other.getDemographic());
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                userId_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                fullName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                email_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              case 32: {
                age_ = input.readInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
              case 40: {
                demographic_ = input.readInt32();
                bitField0_ |= 0x00000010;
                break;
              } // case 40
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int userId_ ;
      /**
       * <code>int32 userId = 1;</code>
       * @return The userId.
       */
      @java.lang.Override
      public int getUserId() {
        return userId_;
      }
      /**
       * <code>int32 userId = 1;</code>
       * @param value The userId to set.
       * @return This builder for chaining.
       */
      public Builder setUserId(int value) {
        
        userId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 userId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUserId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        userId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object fullName_ = "";
      /**
       * <code>string fullName = 2;</code>
       * @return The fullName.
       */
      public java.lang.String getFullName() {
        java.lang.Object ref = fullName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          fullName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string fullName = 2;</code>
       * @return The bytes for fullName.
       */
      public com.google.protobuf.ByteString
          getFullNameBytes() {
        java.lang.Object ref = fullName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          fullName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string fullName = 2;</code>
       * @param value The fullName to set.
       * @return This builder for chaining.
       */
      public Builder setFullName(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        fullName_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string fullName = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearFullName() {
        fullName_ = getDefaultInstance().getFullName();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string fullName = 2;</code>
       * @param value The bytes for fullName to set.
       * @return This builder for chaining.
       */
      public Builder setFullNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        fullName_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private java.lang.Object email_ = "";
      /**
       * <code>string email = 3;</code>
       * @return The email.
       */
      public java.lang.String getEmail() {
        java.lang.Object ref = email_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          email_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string email = 3;</code>
       * @return The bytes for email.
       */
      public com.google.protobuf.ByteString
          getEmailBytes() {
        java.lang.Object ref = email_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          email_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string email = 3;</code>
       * @param value The email to set.
       * @return This builder for chaining.
       */
      public Builder setEmail(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        email_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>string email = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearEmail() {
        email_ = getDefaultInstance().getEmail();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>string email = 3;</code>
       * @param value The bytes for email to set.
       * @return This builder for chaining.
       */
      public Builder setEmailBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        email_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      private int age_ ;
      /**
       * <code>int32 age = 4;</code>
       * @return The age.
       */
      @java.lang.Override
      public int getAge() {
        return age_;
      }
      /**
       * <code>int32 age = 4;</code>
       * @param value The age to set.
       * @return This builder for chaining.
       */
      public Builder setAge(int value) {
        
        age_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>int32 age = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearAge() {
        bitField0_ = (bitField0_ & ~0x00000008);
        age_ = 0;
        onChanged();
        return this;
      }

      private int demographic_ ;
      /**
       * <code>int32 demographic = 5;</code>
       * @return The demographic.
       */
      @java.lang.Override
      public int getDemographic() {
        return demographic_;
      }
      /**
       * <code>int32 demographic = 5;</code>
       * @param value The demographic to set.
       * @return This builder for chaining.
       */
      public Builder setDemographic(int value) {
        
        demographic_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>int32 demographic = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearDemographic() {
        bitField0_ = (bitField0_ & ~0x00000010);
        demographic_ = 0;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:specmesh.examples.schema_demo.model.UserInfoEnriched)
    }

    // @@protoc_insertion_point(class_scope:specmesh.examples.schema_demo.model.UserInfoEnriched)
    private static final specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched();
    }

    public static specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UserInfoEnriched>
        PARSER = new com.google.protobuf.AbstractParser<UserInfoEnriched>() {
      @java.lang.Override
      public UserInfoEnriched parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<UserInfoEnriched> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UserInfoEnriched> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public specmesh.examples.schema_demo.model.UserInfoEnrichedOuterClass.UserInfoEnriched getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_specmesh_examples_schema_demo_model_UserInfoEnriched_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_specmesh_examples_schema_demo_model_UserInfoEnriched_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030user_info_enriched.proto\022#specmesh.exa" +
      "mples.schema_demo.model\"e\n\020UserInfoEnric" +
      "hed\022\016\n\006userId\030\001 \001(\005\022\020\n\010fullName\030\002 \001(\t\022\r\n" +
      "\005email\030\003 \001(\t\022\013\n\003age\030\004 \001(\005\022\023\n\013demographic" +
      "\030\005 \001(\005b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_specmesh_examples_schema_demo_model_UserInfoEnriched_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_specmesh_examples_schema_demo_model_UserInfoEnriched_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_specmesh_examples_schema_demo_model_UserInfoEnriched_descriptor,
        new java.lang.String[] { "UserId", "FullName", "Email", "Age", "Demographic", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

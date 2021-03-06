// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: main/protobuf/ActionCost.proto

package cz.agents.madla.communication.generated;

public final class ProtobufActionCostMessage {
  private ProtobufActionCostMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PBActionCostMessageOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int32 stateHash = 1;
    /**
     * <code>required int32 stateHash = 1;</code>
     */
    boolean hasStateHash();
    /**
     * <code>required int32 stateHash = 1;</code>
     */
    int getStateHash();

    // required int32 actionHash = 2;
    /**
     * <code>required int32 actionHash = 2;</code>
     */
    boolean hasActionHash();
    /**
     * <code>required int32 actionHash = 2;</code>
     */
    int getActionHash();

    // required int32 heuristicValue = 3;
    /**
     * <code>required int32 heuristicValue = 3;</code>
     */
    boolean hasHeuristicValue();
    /**
     * <code>required int32 heuristicValue = 3;</code>
     */
    int getHeuristicValue();
  }
  /**
   * Protobuf type {@code protocol.PBActionCostMessage}
   */
  public static final class PBActionCostMessage extends
      com.google.protobuf.GeneratedMessage
      implements PBActionCostMessageOrBuilder {
    // Use PBActionCostMessage.newBuilder() to construct.
    private PBActionCostMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private PBActionCostMessage(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final PBActionCostMessage defaultInstance;
    public static PBActionCostMessage getDefaultInstance() {
      return defaultInstance;
    }

    public PBActionCostMessage getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private PBActionCostMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              stateHash_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              actionHash_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              heuristicValue_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cz.agents.madla.communication.generated.ProtobufActionCostMessage.internal_static_protocol_PBActionCostMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cz.agents.madla.communication.generated.ProtobufActionCostMessage.internal_static_protocol_PBActionCostMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cz.agents.madla.communication.generated.ProtobufActionCostMessage.PBActionCostMessage.class, cz.agents.madla.communication.generated.ProtobufActionCostMessage.PBActionCostMessage.Builder.class);
    }

    public static com.google.protobuf.Parser<PBActionCostMessage> PARSER =
        new com.google.protobuf.AbstractParser<PBActionCostMessage>() {
      public PBActionCostMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PBActionCostMessage(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PBActionCostMessage> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required int32 stateHash = 1;
    public static final int STATEHASH_FIELD_NUMBER = 1;
    private int stateHash_;
    /**
     * <code>required int32 stateHash = 1;</code>
     */
    public boolean hasStateHash() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 stateHash = 1;</code>
     */
    public int getStateHash() {
      return stateHash_;
    }

    // required int32 actionHash = 2;
    public static final int ACTIONHASH_FIELD_NUMBER = 2;
    private int actionHash_;
    /**
     * <code>required int32 actionHash = 2;</code>
     */
    public boolean hasActionHash() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 actionHash = 2;</code>
     */
    public int getActionHash() {
      return actionHash_;
    }

    // required int32 heuristicValue = 3;
    public static final int HEURISTICVALUE_FIELD_NUMBER = 3;
    private int heuristicValue_;
    /**
     * <code>required int32 heuristicValue = 3;</code>
     */
    public boolean hasHeuristicValue() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int32 heuristicValue = 3;</code>
     */
    public int getHeuristicValue() {
      return heuristicValue_;
    }

    private void initFields() {
      stateHash_ = 0;
      actionHash_ = 0;
      heuristicValue_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasStateHash()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasActionHash()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasHeuristicValue()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, stateHash_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, actionHash_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, heuristicValue_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, stateHash_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, actionHash_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, heuristicValue_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static cz.agents.madla.communication.generated.ProtobufActionCostMessage.PBActionCostMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cz.agents.madla.communication.generated.ProtobufActionCostMessage.PBActionCostMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cz.agents.madla.communication.generated.ProtobufActionCostMessage.PBActionCostMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cz.agents.madla.communication.generated.ProtobufActionCostMessage.PBActionCostMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cz.agents.madla.communication.generated.ProtobufActionCostMessage.PBActionCostMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cz.agents.madla.communication.generated.ProtobufActionCostMessage.PBActionCostMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static cz.agents.madla.communication.generated.ProtobufActionCostMessage.PBActionCostMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static cz.agents.madla.communication.generated.ProtobufActionCostMessage.PBActionCostMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static cz.agents.madla.communication.generated.ProtobufActionCostMessage.PBActionCostMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cz.agents.madla.communication.generated.ProtobufActionCostMessage.PBActionCostMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(cz.agents.madla.communication.generated.ProtobufActionCostMessage.PBActionCostMessage prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protocol.PBActionCostMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements cz.agents.madla.communication.generated.ProtobufActionCostMessage.PBActionCostMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cz.agents.madla.communication.generated.ProtobufActionCostMessage.internal_static_protocol_PBActionCostMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cz.agents.madla.communication.generated.ProtobufActionCostMessage.internal_static_protocol_PBActionCostMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cz.agents.madla.communication.generated.ProtobufActionCostMessage.PBActionCostMessage.class, cz.agents.madla.communication.generated.ProtobufActionCostMessage.PBActionCostMessage.Builder.class);
      }

      // Construct using cz.agents.madla.communication.generated.ProtobufActionCostMessage.PBActionCostMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        stateHash_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        actionHash_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        heuristicValue_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cz.agents.madla.communication.generated.ProtobufActionCostMessage.internal_static_protocol_PBActionCostMessage_descriptor;
      }

      public cz.agents.madla.communication.generated.ProtobufActionCostMessage.PBActionCostMessage getDefaultInstanceForType() {
        return cz.agents.madla.communication.generated.ProtobufActionCostMessage.PBActionCostMessage.getDefaultInstance();
      }

      public cz.agents.madla.communication.generated.ProtobufActionCostMessage.PBActionCostMessage build() {
        cz.agents.madla.communication.generated.ProtobufActionCostMessage.PBActionCostMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public cz.agents.madla.communication.generated.ProtobufActionCostMessage.PBActionCostMessage buildPartial() {
        cz.agents.madla.communication.generated.ProtobufActionCostMessage.PBActionCostMessage result = new cz.agents.madla.communication.generated.ProtobufActionCostMessage.PBActionCostMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.stateHash_ = stateHash_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.actionHash_ = actionHash_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.heuristicValue_ = heuristicValue_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cz.agents.madla.communication.generated.ProtobufActionCostMessage.PBActionCostMessage) {
          return mergeFrom((cz.agents.madla.communication.generated.ProtobufActionCostMessage.PBActionCostMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cz.agents.madla.communication.generated.ProtobufActionCostMessage.PBActionCostMessage other) {
        if (other == cz.agents.madla.communication.generated.ProtobufActionCostMessage.PBActionCostMessage.getDefaultInstance()) return this;
        if (other.hasStateHash()) {
          setStateHash(other.getStateHash());
        }
        if (other.hasActionHash()) {
          setActionHash(other.getActionHash());
        }
        if (other.hasHeuristicValue()) {
          setHeuristicValue(other.getHeuristicValue());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasStateHash()) {
          
          return false;
        }
        if (!hasActionHash()) {
          
          return false;
        }
        if (!hasHeuristicValue()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        cz.agents.madla.communication.generated.ProtobufActionCostMessage.PBActionCostMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cz.agents.madla.communication.generated.ProtobufActionCostMessage.PBActionCostMessage) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int32 stateHash = 1;
      private int stateHash_ ;
      /**
       * <code>required int32 stateHash = 1;</code>
       */
      public boolean hasStateHash() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 stateHash = 1;</code>
       */
      public int getStateHash() {
        return stateHash_;
      }
      /**
       * <code>required int32 stateHash = 1;</code>
       */
      public Builder setStateHash(int value) {
        bitField0_ |= 0x00000001;
        stateHash_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 stateHash = 1;</code>
       */
      public Builder clearStateHash() {
        bitField0_ = (bitField0_ & ~0x00000001);
        stateHash_ = 0;
        onChanged();
        return this;
      }

      // required int32 actionHash = 2;
      private int actionHash_ ;
      /**
       * <code>required int32 actionHash = 2;</code>
       */
      public boolean hasActionHash() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 actionHash = 2;</code>
       */
      public int getActionHash() {
        return actionHash_;
      }
      /**
       * <code>required int32 actionHash = 2;</code>
       */
      public Builder setActionHash(int value) {
        bitField0_ |= 0x00000002;
        actionHash_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 actionHash = 2;</code>
       */
      public Builder clearActionHash() {
        bitField0_ = (bitField0_ & ~0x00000002);
        actionHash_ = 0;
        onChanged();
        return this;
      }

      // required int32 heuristicValue = 3;
      private int heuristicValue_ ;
      /**
       * <code>required int32 heuristicValue = 3;</code>
       */
      public boolean hasHeuristicValue() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int32 heuristicValue = 3;</code>
       */
      public int getHeuristicValue() {
        return heuristicValue_;
      }
      /**
       * <code>required int32 heuristicValue = 3;</code>
       */
      public Builder setHeuristicValue(int value) {
        bitField0_ |= 0x00000004;
        heuristicValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 heuristicValue = 3;</code>
       */
      public Builder clearHeuristicValue() {
        bitField0_ = (bitField0_ & ~0x00000004);
        heuristicValue_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:protocol.PBActionCostMessage)
    }

    static {
      defaultInstance = new PBActionCostMessage(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:protocol.PBActionCostMessage)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_protocol_PBActionCostMessage_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protocol_PBActionCostMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036main/protobuf/ActionCost.proto\022\010protoc" +
      "ol\"T\n\023PBActionCostMessage\022\021\n\tstateHash\030\001" +
      " \002(\005\022\022\n\nactionHash\030\002 \002(\005\022\026\n\016heuristicVal" +
      "ue\030\003 \002(\005BD\n\'cz.agents.madla.communicatio" +
      "n.generatedB\031ProtobufActionCostMessage"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_protocol_PBActionCostMessage_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_protocol_PBActionCostMessage_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_protocol_PBActionCostMessage_descriptor,
              new java.lang.String[] { "StateHash", "ActionHash", "HeuristicValue", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}

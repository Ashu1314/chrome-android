// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/search/now/wire/feed/version.proto

package com.google.search.now.wire.feed;

public final class VersionProto {
  private VersionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface VersionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:search.now.wire.feed.Version)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional int32 major = 1;</code>
     */
    boolean hasMajor();
    /**
     * <code>optional int32 major = 1;</code>
     */
    int getMajor();

    /**
     * <code>optional int32 minor = 2;</code>
     */
    boolean hasMinor();
    /**
     * <code>optional int32 minor = 2;</code>
     */
    int getMinor();

    /**
     * <code>optional int32 build = 3;</code>
     */
    boolean hasBuild();
    /**
     * <code>optional int32 build = 3;</code>
     */
    int getBuild();

    /**
     * <code>optional int32 revision = 4;</code>
     */
    boolean hasRevision();
    /**
     * <code>optional int32 revision = 4;</code>
     */
    int getRevision();

    /**
     * <code>optional .search.now.wire.feed.Version.Architecture architecture = 5;</code>
     */
    boolean hasArchitecture();
    /**
     * <code>optional .search.now.wire.feed.Version.Architecture architecture = 5;</code>
     */
    com.google.search.now.wire.feed.VersionProto.Version.Architecture getArchitecture();

    /**
     * <code>optional .search.now.wire.feed.Version.BuildType build_type = 6;</code>
     */
    boolean hasBuildType();
    /**
     * <code>optional .search.now.wire.feed.Version.BuildType build_type = 6;</code>
     */
    com.google.search.now.wire.feed.VersionProto.Version.BuildType getBuildType();

    /**
     * <pre>
     * Specific to Android OS versions. Specifies the API version that the OS
     * supports.
     * </pre>
     *
     * <code>optional int32 api_version = 7;</code>
     */
    boolean hasApiVersion();
    /**
     * <pre>
     * Specific to Android OS versions. Specifies the API version that the OS
     * supports.
     * </pre>
     *
     * <code>optional int32 api_version = 7;</code>
     */
    int getApiVersion();
  }
  /**
   * <pre>
   * Specification of an application or OS version.
   * A version string typically looks like: 'major.minor.build.revision'
   * </pre>
   *
   * Protobuf type {@code search.now.wire.feed.Version}
   */
  public  static final class Version extends
      com.google.protobuf.GeneratedMessageLite<
          Version, Version.Builder> implements
      // @@protoc_insertion_point(message_implements:search.now.wire.feed.Version)
      VersionOrBuilder {
    private Version() {
    }
    /**
     * <pre>
     * The CPU architecture that the native libraries support
     * </pre>
     *
     * Protobuf enum {@code search.now.wire.feed.Version.Architecture}
     */
    public enum Architecture
        implements com.google.protobuf.Internal.EnumLite {
      /**
       * <code>UNKNOWN_ACHITECTURE = 0;</code>
       */
      UNKNOWN_ACHITECTURE(0),
      /**
       * <code>ARM = 1;</code>
       */
      ARM(1),
      /**
       * <code>ARM64 = 2;</code>
       */
      ARM64(2),
      /**
       * <code>MIPS = 3;</code>
       */
      MIPS(3),
      /**
       * <code>MIPS64 = 4;</code>
       */
      MIPS64(4),
      /**
       * <code>X86 = 5;</code>
       */
      X86(5),
      /**
       * <code>X86_64 = 6;</code>
       */
      X86_64(6),
      ;

      /**
       * <code>UNKNOWN_ACHITECTURE = 0;</code>
       */
      public static final int UNKNOWN_ACHITECTURE_VALUE = 0;
      /**
       * <code>ARM = 1;</code>
       */
      public static final int ARM_VALUE = 1;
      /**
       * <code>ARM64 = 2;</code>
       */
      public static final int ARM64_VALUE = 2;
      /**
       * <code>MIPS = 3;</code>
       */
      public static final int MIPS_VALUE = 3;
      /**
       * <code>MIPS64 = 4;</code>
       */
      public static final int MIPS64_VALUE = 4;
      /**
       * <code>X86 = 5;</code>
       */
      public static final int X86_VALUE = 5;
      /**
       * <code>X86_64 = 6;</code>
       */
      public static final int X86_64_VALUE = 6;


      @java.lang.Override
      public final int getNumber() {
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static Architecture valueOf(int value) {
        return forNumber(value);
      }

      public static Architecture forNumber(int value) {
        switch (value) {
          case 0: return UNKNOWN_ACHITECTURE;
          case 1: return ARM;
          case 2: return ARM64;
          case 3: return MIPS;
          case 4: return MIPS64;
          case 5: return X86;
          case 6: return X86_64;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Architecture>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Architecture> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Architecture>() {
              @java.lang.Override
              public Architecture findValueByNumber(int number) {
                return Architecture.forNumber(number);
              }
            };

      private final int value;

      private Architecture(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:search.now.wire.feed.Version.Architecture)
    }

    /**
     * <pre>
     * The release stage of the build
     * </pre>
     *
     * Protobuf enum {@code search.now.wire.feed.Version.BuildType}
     */
    public enum BuildType
        implements com.google.protobuf.Internal.EnumLite {
      /**
       * <code>UNKNOWN_BUILD_TYPE = 0;</code>
       */
      UNKNOWN_BUILD_TYPE(0),
      /**
       * <code>DEV = 1;</code>
       */
      DEV(1),
      /**
       * <code>ALPHA = 2;</code>
       */
      ALPHA(2),
      /**
       * <code>BETA = 3;</code>
       */
      BETA(3),
      /**
       * <code>RELEASE = 4;</code>
       */
      RELEASE(4),
      ;

      /**
       * <code>UNKNOWN_BUILD_TYPE = 0;</code>
       */
      public static final int UNKNOWN_BUILD_TYPE_VALUE = 0;
      /**
       * <code>DEV = 1;</code>
       */
      public static final int DEV_VALUE = 1;
      /**
       * <code>ALPHA = 2;</code>
       */
      public static final int ALPHA_VALUE = 2;
      /**
       * <code>BETA = 3;</code>
       */
      public static final int BETA_VALUE = 3;
      /**
       * <code>RELEASE = 4;</code>
       */
      public static final int RELEASE_VALUE = 4;


      @java.lang.Override
      public final int getNumber() {
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static BuildType valueOf(int value) {
        return forNumber(value);
      }

      public static BuildType forNumber(int value) {
        switch (value) {
          case 0: return UNKNOWN_BUILD_TYPE;
          case 1: return DEV;
          case 2: return ALPHA;
          case 3: return BETA;
          case 4: return RELEASE;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<BuildType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          BuildType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<BuildType>() {
              @java.lang.Override
              public BuildType findValueByNumber(int number) {
                return BuildType.forNumber(number);
              }
            };

      private final int value;

      private BuildType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:search.now.wire.feed.Version.BuildType)
    }

    private int bitField0_;
    public static final int MAJOR_FIELD_NUMBER = 1;
    private int major_;
    /**
     * <code>optional int32 major = 1;</code>
     */
    @java.lang.Override
    public boolean hasMajor() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 major = 1;</code>
     */
    @java.lang.Override
    public int getMajor() {
      return major_;
    }
    /**
     * <code>optional int32 major = 1;</code>
     */
    private void setMajor(int value) {
      bitField0_ |= 0x00000001;
      major_ = value;
    }
    /**
     * <code>optional int32 major = 1;</code>
     */
    private void clearMajor() {
      bitField0_ = (bitField0_ & ~0x00000001);
      major_ = 0;
    }

    public static final int MINOR_FIELD_NUMBER = 2;
    private int minor_;
    /**
     * <code>optional int32 minor = 2;</code>
     */
    @java.lang.Override
    public boolean hasMinor() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 minor = 2;</code>
     */
    @java.lang.Override
    public int getMinor() {
      return minor_;
    }
    /**
     * <code>optional int32 minor = 2;</code>
     */
    private void setMinor(int value) {
      bitField0_ |= 0x00000002;
      minor_ = value;
    }
    /**
     * <code>optional int32 minor = 2;</code>
     */
    private void clearMinor() {
      bitField0_ = (bitField0_ & ~0x00000002);
      minor_ = 0;
    }

    public static final int BUILD_FIELD_NUMBER = 3;
    private int build_;
    /**
     * <code>optional int32 build = 3;</code>
     */
    @java.lang.Override
    public boolean hasBuild() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 build = 3;</code>
     */
    @java.lang.Override
    public int getBuild() {
      return build_;
    }
    /**
     * <code>optional int32 build = 3;</code>
     */
    private void setBuild(int value) {
      bitField0_ |= 0x00000004;
      build_ = value;
    }
    /**
     * <code>optional int32 build = 3;</code>
     */
    private void clearBuild() {
      bitField0_ = (bitField0_ & ~0x00000004);
      build_ = 0;
    }

    public static final int REVISION_FIELD_NUMBER = 4;
    private int revision_;
    /**
     * <code>optional int32 revision = 4;</code>
     */
    @java.lang.Override
    public boolean hasRevision() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int32 revision = 4;</code>
     */
    @java.lang.Override
    public int getRevision() {
      return revision_;
    }
    /**
     * <code>optional int32 revision = 4;</code>
     */
    private void setRevision(int value) {
      bitField0_ |= 0x00000008;
      revision_ = value;
    }
    /**
     * <code>optional int32 revision = 4;</code>
     */
    private void clearRevision() {
      bitField0_ = (bitField0_ & ~0x00000008);
      revision_ = 0;
    }

    public static final int ARCHITECTURE_FIELD_NUMBER = 5;
    private int architecture_;
    /**
     * <code>optional .search.now.wire.feed.Version.Architecture architecture = 5;</code>
     */
    @java.lang.Override
    public boolean hasArchitecture() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional .search.now.wire.feed.Version.Architecture architecture = 5;</code>
     */
    @java.lang.Override
    public com.google.search.now.wire.feed.VersionProto.Version.Architecture getArchitecture() {
      com.google.search.now.wire.feed.VersionProto.Version.Architecture result = com.google.search.now.wire.feed.VersionProto.Version.Architecture.forNumber(architecture_);
      return result == null ? com.google.search.now.wire.feed.VersionProto.Version.Architecture.UNKNOWN_ACHITECTURE : result;
    }
    /**
     * <code>optional .search.now.wire.feed.Version.Architecture architecture = 5;</code>
     */
    private void setArchitecture(com.google.search.now.wire.feed.VersionProto.Version.Architecture value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000010;
      architecture_ = value.getNumber();
    }
    /**
     * <code>optional .search.now.wire.feed.Version.Architecture architecture = 5;</code>
     */
    private void clearArchitecture() {
      bitField0_ = (bitField0_ & ~0x00000010);
      architecture_ = 0;
    }

    public static final int BUILD_TYPE_FIELD_NUMBER = 6;
    private int buildType_;
    /**
     * <code>optional .search.now.wire.feed.Version.BuildType build_type = 6;</code>
     */
    @java.lang.Override
    public boolean hasBuildType() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional .search.now.wire.feed.Version.BuildType build_type = 6;</code>
     */
    @java.lang.Override
    public com.google.search.now.wire.feed.VersionProto.Version.BuildType getBuildType() {
      com.google.search.now.wire.feed.VersionProto.Version.BuildType result = com.google.search.now.wire.feed.VersionProto.Version.BuildType.forNumber(buildType_);
      return result == null ? com.google.search.now.wire.feed.VersionProto.Version.BuildType.UNKNOWN_BUILD_TYPE : result;
    }
    /**
     * <code>optional .search.now.wire.feed.Version.BuildType build_type = 6;</code>
     */
    private void setBuildType(com.google.search.now.wire.feed.VersionProto.Version.BuildType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000020;
      buildType_ = value.getNumber();
    }
    /**
     * <code>optional .search.now.wire.feed.Version.BuildType build_type = 6;</code>
     */
    private void clearBuildType() {
      bitField0_ = (bitField0_ & ~0x00000020);
      buildType_ = 0;
    }

    public static final int API_VERSION_FIELD_NUMBER = 7;
    private int apiVersion_;
    /**
     * <pre>
     * Specific to Android OS versions. Specifies the API version that the OS
     * supports.
     * </pre>
     *
     * <code>optional int32 api_version = 7;</code>
     */
    @java.lang.Override
    public boolean hasApiVersion() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <pre>
     * Specific to Android OS versions. Specifies the API version that the OS
     * supports.
     * </pre>
     *
     * <code>optional int32 api_version = 7;</code>
     */
    @java.lang.Override
    public int getApiVersion() {
      return apiVersion_;
    }
    /**
     * <pre>
     * Specific to Android OS versions. Specifies the API version that the OS
     * supports.
     * </pre>
     *
     * <code>optional int32 api_version = 7;</code>
     */
    private void setApiVersion(int value) {
      bitField0_ |= 0x00000040;
      apiVersion_ = value;
    }
    /**
     * <pre>
     * Specific to Android OS versions. Specifies the API version that the OS
     * supports.
     * </pre>
     *
     * <code>optional int32 api_version = 7;</code>
     */
    private void clearApiVersion() {
      bitField0_ = (bitField0_ & ~0x00000040);
      apiVersion_ = 0;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, major_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, minor_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, build_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, revision_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeEnum(5, architecture_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeEnum(6, buildType_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeInt32(7, apiVersion_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, major_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, minor_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, build_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, revision_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, architecture_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(6, buildType_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, apiVersion_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static com.google.search.now.wire.feed.VersionProto.Version parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.google.search.now.wire.feed.VersionProto.Version parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.google.search.now.wire.feed.VersionProto.Version parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.google.search.now.wire.feed.VersionProto.Version parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.google.search.now.wire.feed.VersionProto.Version parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.google.search.now.wire.feed.VersionProto.Version parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.google.search.now.wire.feed.VersionProto.Version parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.google.search.now.wire.feed.VersionProto.Version parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.google.search.now.wire.feed.VersionProto.Version parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static com.google.search.now.wire.feed.VersionProto.Version parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.google.search.now.wire.feed.VersionProto.Version parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.google.search.now.wire.feed.VersionProto.Version parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(com.google.search.now.wire.feed.VersionProto.Version prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     * Specification of an application or OS version.
     * A version string typically looks like: 'major.minor.build.revision'
     * </pre>
     *
     * Protobuf type {@code search.now.wire.feed.Version}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.google.search.now.wire.feed.VersionProto.Version, Builder> implements
        // @@protoc_insertion_point(builder_implements:search.now.wire.feed.Version)
        com.google.search.now.wire.feed.VersionProto.VersionOrBuilder {
      // Construct using com.google.search.now.wire.feed.VersionProto.Version.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional int32 major = 1;</code>
       */
      @java.lang.Override
      public boolean hasMajor() {
        return instance.hasMajor();
      }
      /**
       * <code>optional int32 major = 1;</code>
       */
      @java.lang.Override
      public int getMajor() {
        return instance.getMajor();
      }
      /**
       * <code>optional int32 major = 1;</code>
       */
      public Builder setMajor(int value) {
        copyOnWrite();
        instance.setMajor(value);
        return this;
      }
      /**
       * <code>optional int32 major = 1;</code>
       */
      public Builder clearMajor() {
        copyOnWrite();
        instance.clearMajor();
        return this;
      }

      /**
       * <code>optional int32 minor = 2;</code>
       */
      @java.lang.Override
      public boolean hasMinor() {
        return instance.hasMinor();
      }
      /**
       * <code>optional int32 minor = 2;</code>
       */
      @java.lang.Override
      public int getMinor() {
        return instance.getMinor();
      }
      /**
       * <code>optional int32 minor = 2;</code>
       */
      public Builder setMinor(int value) {
        copyOnWrite();
        instance.setMinor(value);
        return this;
      }
      /**
       * <code>optional int32 minor = 2;</code>
       */
      public Builder clearMinor() {
        copyOnWrite();
        instance.clearMinor();
        return this;
      }

      /**
       * <code>optional int32 build = 3;</code>
       */
      @java.lang.Override
      public boolean hasBuild() {
        return instance.hasBuild();
      }
      /**
       * <code>optional int32 build = 3;</code>
       */
      @java.lang.Override
      public int getBuild() {
        return instance.getBuild();
      }
      /**
       * <code>optional int32 build = 3;</code>
       */
      public Builder setBuild(int value) {
        copyOnWrite();
        instance.setBuild(value);
        return this;
      }
      /**
       * <code>optional int32 build = 3;</code>
       */
      public Builder clearBuild() {
        copyOnWrite();
        instance.clearBuild();
        return this;
      }

      /**
       * <code>optional int32 revision = 4;</code>
       */
      @java.lang.Override
      public boolean hasRevision() {
        return instance.hasRevision();
      }
      /**
       * <code>optional int32 revision = 4;</code>
       */
      @java.lang.Override
      public int getRevision() {
        return instance.getRevision();
      }
      /**
       * <code>optional int32 revision = 4;</code>
       */
      public Builder setRevision(int value) {
        copyOnWrite();
        instance.setRevision(value);
        return this;
      }
      /**
       * <code>optional int32 revision = 4;</code>
       */
      public Builder clearRevision() {
        copyOnWrite();
        instance.clearRevision();
        return this;
      }

      /**
       * <code>optional .search.now.wire.feed.Version.Architecture architecture = 5;</code>
       */
      @java.lang.Override
      public boolean hasArchitecture() {
        return instance.hasArchitecture();
      }
      /**
       * <code>optional .search.now.wire.feed.Version.Architecture architecture = 5;</code>
       */
      @java.lang.Override
      public com.google.search.now.wire.feed.VersionProto.Version.Architecture getArchitecture() {
        return instance.getArchitecture();
      }
      /**
       * <code>optional .search.now.wire.feed.Version.Architecture architecture = 5;</code>
       */
      public Builder setArchitecture(com.google.search.now.wire.feed.VersionProto.Version.Architecture value) {
        copyOnWrite();
        instance.setArchitecture(value);
        return this;
      }
      /**
       * <code>optional .search.now.wire.feed.Version.Architecture architecture = 5;</code>
       */
      public Builder clearArchitecture() {
        copyOnWrite();
        instance.clearArchitecture();
        return this;
      }

      /**
       * <code>optional .search.now.wire.feed.Version.BuildType build_type = 6;</code>
       */
      @java.lang.Override
      public boolean hasBuildType() {
        return instance.hasBuildType();
      }
      /**
       * <code>optional .search.now.wire.feed.Version.BuildType build_type = 6;</code>
       */
      @java.lang.Override
      public com.google.search.now.wire.feed.VersionProto.Version.BuildType getBuildType() {
        return instance.getBuildType();
      }
      /**
       * <code>optional .search.now.wire.feed.Version.BuildType build_type = 6;</code>
       */
      public Builder setBuildType(com.google.search.now.wire.feed.VersionProto.Version.BuildType value) {
        copyOnWrite();
        instance.setBuildType(value);
        return this;
      }
      /**
       * <code>optional .search.now.wire.feed.Version.BuildType build_type = 6;</code>
       */
      public Builder clearBuildType() {
        copyOnWrite();
        instance.clearBuildType();
        return this;
      }

      /**
       * <pre>
       * Specific to Android OS versions. Specifies the API version that the OS
       * supports.
       * </pre>
       *
       * <code>optional int32 api_version = 7;</code>
       */
      @java.lang.Override
      public boolean hasApiVersion() {
        return instance.hasApiVersion();
      }
      /**
       * <pre>
       * Specific to Android OS versions. Specifies the API version that the OS
       * supports.
       * </pre>
       *
       * <code>optional int32 api_version = 7;</code>
       */
      @java.lang.Override
      public int getApiVersion() {
        return instance.getApiVersion();
      }
      /**
       * <pre>
       * Specific to Android OS versions. Specifies the API version that the OS
       * supports.
       * </pre>
       *
       * <code>optional int32 api_version = 7;</code>
       */
      public Builder setApiVersion(int value) {
        copyOnWrite();
        instance.setApiVersion(value);
        return this;
      }
      /**
       * <pre>
       * Specific to Android OS versions. Specifies the API version that the OS
       * supports.
       * </pre>
       *
       * <code>optional int32 api_version = 7;</code>
       */
      public Builder clearApiVersion() {
        copyOnWrite();
        instance.clearApiVersion();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:search.now.wire.feed.Version)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.google.search.now.wire.feed.VersionProto.Version();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          com.google.search.now.wire.feed.VersionProto.Version other = (com.google.search.now.wire.feed.VersionProto.Version) arg1;
          major_ = visitor.visitInt(
              hasMajor(), major_,
              other.hasMajor(), other.major_);
          minor_ = visitor.visitInt(
              hasMinor(), minor_,
              other.hasMinor(), other.minor_);
          build_ = visitor.visitInt(
              hasBuild(), build_,
              other.hasBuild(), other.build_);
          revision_ = visitor.visitInt(
              hasRevision(), revision_,
              other.hasRevision(), other.revision_);
          architecture_ = visitor.visitInt(hasArchitecture(), architecture_,
              other.hasArchitecture(), other.architecture_);
          buildType_ = visitor.visitInt(hasBuildType(), buildType_,
              other.hasBuildType(), other.buildType_);
          apiVersion_ = visitor.visitInt(
              hasApiVersion(), apiVersion_,
              other.hasApiVersion(), other.apiVersion_);
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
            bitField0_ |= other.bitField0_;
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
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
                  bitField0_ |= 0x00000001;
                  major_ = input.readInt32();
                  break;
                }
                case 16: {
                  bitField0_ |= 0x00000002;
                  minor_ = input.readInt32();
                  break;
                }
                case 24: {
                  bitField0_ |= 0x00000004;
                  build_ = input.readInt32();
                  break;
                }
                case 32: {
                  bitField0_ |= 0x00000008;
                  revision_ = input.readInt32();
                  break;
                }
                case 40: {
                  int rawValue = input.readEnum();
                  com.google.search.now.wire.feed.VersionProto.Version.Architecture value = com.google.search.now.wire.feed.VersionProto.Version.Architecture.forNumber(rawValue);
                  if (value == null) {
                    super.mergeVarintField(5, rawValue);
                  } else {
                    bitField0_ |= 0x00000010;
                    architecture_ = rawValue;
                  }
                  break;
                }
                case 48: {
                  int rawValue = input.readEnum();
                  com.google.search.now.wire.feed.VersionProto.Version.BuildType value = com.google.search.now.wire.feed.VersionProto.Version.BuildType.forNumber(rawValue);
                  if (value == null) {
                    super.mergeVarintField(6, rawValue);
                  } else {
                    bitField0_ |= 0x00000020;
                    buildType_ = rawValue;
                  }
                  break;
                }
                case 56: {
                  bitField0_ |= 0x00000040;
                  apiVersion_ = input.readInt32();
                  break;
                }
                default: {
                  if (!parseUnknownField(tag, input)) {
                    done = true;
                  }
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<com.google.search.now.wire.feed.VersionProto.Version> parser = PARSER;
          if (parser == null) {
            synchronized (com.google.search.now.wire.feed.VersionProto.Version.class) {
              parser = PARSER;
              if (parser == null) {
                parser = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                PARSER = parser;
              }
            }
          }
          return parser;
      }
      case GET_MEMOIZED_IS_INITIALIZED: {
        return (byte) 1;
      }
      case SET_MEMOIZED_IS_INITIALIZED: {
        return null;
      }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:search.now.wire.feed.Version)
    private static final com.google.search.now.wire.feed.VersionProto.Version DEFAULT_INSTANCE;
    static {
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = new Version();
    }

    public static com.google.search.now.wire.feed.VersionProto.Version getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Version> PARSER;

    public static com.google.protobuf.Parser<Version> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/example/example_parser_configuration.proto

package org.tensorflow.example;

public interface FeatureConfigurationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.FeatureConfiguration)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .tensorflow.FixedLenFeatureProto fixed_len_feature = 1;</code>
   */
  org.tensorflow.example.FixedLenFeatureProto getFixedLenFeature();
  /**
   * <code>optional .tensorflow.FixedLenFeatureProto fixed_len_feature = 1;</code>
   */
  org.tensorflow.example.FixedLenFeatureProtoOrBuilder getFixedLenFeatureOrBuilder();

  /**
   * <code>optional .tensorflow.VarLenFeatureProto var_len_feature = 2;</code>
   */
  org.tensorflow.example.VarLenFeatureProto getVarLenFeature();
  /**
   * <code>optional .tensorflow.VarLenFeatureProto var_len_feature = 2;</code>
   */
  org.tensorflow.example.VarLenFeatureProtoOrBuilder getVarLenFeatureOrBuilder();

  public org.tensorflow.example.FeatureConfiguration.ConfigCase getConfigCase();
}
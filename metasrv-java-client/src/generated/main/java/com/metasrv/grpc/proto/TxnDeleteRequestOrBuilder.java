// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request.proto

package com.metasrv.grpc.proto;

public interface TxnDeleteRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:meta.TxnDeleteRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string key = 1;</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <code>string key = 1;</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <pre>
   * if or not return the prev value
   * </pre>
   *
   * <code>bool prev_value = 2;</code>
   * @return The prevValue.
   */
  boolean getPrevValue();
}
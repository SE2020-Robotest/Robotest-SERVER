// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: msg.proto

package msg.grpc;

public interface MapOrBuilder extends
    // @@protoc_insertion_point(interface_extends:msg.Map)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>double roomwidth = 1;</code>
   */
  double getRoomwidth();

  /**
   * <code>double roomheight = 2;</code>
   */
  double getRoomheight();

  /**
   * <code>repeated .msg.Block blocks = 3;</code>
   */
  java.util.List<msg.grpc.Block> 
      getBlocksList();
  /**
   * <code>repeated .msg.Block blocks = 3;</code>
   */
  msg.grpc.Block getBlocks(int index);
  /**
   * <code>repeated .msg.Block blocks = 3;</code>
   */
  int getBlocksCount();
  /**
   * <code>repeated .msg.Block blocks = 3;</code>
   */
  java.util.List<? extends msg.grpc.BlockOrBuilder> 
      getBlocksOrBuilderList();
  /**
   * <code>repeated .msg.Block blocks = 3;</code>
   */
  msg.grpc.BlockOrBuilder getBlocksOrBuilder(
      int index);
}

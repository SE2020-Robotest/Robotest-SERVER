// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: msg.proto

package msg.grpc;

public final class Msg {
  private Msg() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msg_Point_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msg_Point_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msg_RBPosition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msg_RBPosition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msg_RBPath_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msg_RBPath_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msg_VoiceData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msg_VoiceData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msg_VoiceStr_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msg_VoiceStr_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msg_LogStr_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msg_LogStr_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msg_Block_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msg_Block_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msg_Map_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msg_Map_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msg_ControlCmd_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msg_ControlCmd_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msg_Drive_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msg_Drive_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msg_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msg_Response_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tmsg.proto\022\003msg\"#\n\005Point\022\014\n\004posx\030\001 \001(\001\022" +
      "\014\n\004posy\030\002 \001(\001\"_\n\nRBPosition\022\027\n\003pos\030\001 \001(\013" +
      "2\n.msg.Point\022\r\n\005angle\030\002 \001(\001\022\n\n\002vx\030\003 \001(\001\022" +
      "\n\n\002vy\030\004 \001(\001\022\021\n\ttimestamp\030\005 \001(\001\"E\n\006RBPath" +
      "\022\027\n\003pos\030\001 \003(\0132\n.msg.Point\022\021\n\tstarttime\030\002" +
      " \001(\001\022\017\n\007endtime\030\003 \001(\001\"\031\n\tVoiceData\022\014\n\004fi" +
      "le\030\001 \001(\014\",\n\010VoiceStr\022\r\n\005voice\030\001 \001(\t\022\021\n\tt" +
      "imestamp\030\002 \001(\001\"\025\n\006LogStr\022\013\n\003log\030\001 \001(\t\"u\n" +
      "\005Block\022\035\n\004type\030\001 \001(\0162\017.msg.Block.Type\022\t\n" +
      "\001w\030\002 \001(\001\022\t\n\001h\030\003 \001(\001\022\027\n\003pos\030\004 \001(\0132\n.msg.P" +
      "oint\"\036\n\004Type\022\010\n\004CUBE\020\000\022\014\n\010CYLINDER\020\001\"H\n\003" +
      "Map\022\021\n\troomwidth\030\001 \001(\001\022\022\n\nroomheight\030\002 \001" +
      "(\001\022\032\n\006blocks\030\003 \003(\0132\n.msg.Block\"_\n\nContro" +
      "lCmd\022$\n\003cmd\030\001 \001(\0162\027.msg.ControlCmd.CtrlC" +
      "md\"+\n\007CtrlCmd\022\t\n\005START\020\000\022\010\n\004STOP\020\001\022\013\n\007CO" +
      "NNECT\020\002\"\206\001\n\005Drive\022%\n\010drivecmd\030\001 \001(\0162\023.ms" +
      "g.Drive.DriveCmd\"V\n\010DriveCmd\022\t\n\005FRONT\020\000\022" +
      "\010\n\004BACK\020\001\022\010\n\004LEFT\020\002\022\t\n\005RIGHT\020\003\022\r\n\tCLOCKW" +
      "ISE\020\004\022\021\n\rANTICLOCKWISE\020\005\"[\n\010Response\022$\n\006" +
      "status\030\001 \001(\0162\024.msg.Response.Status\")\n\006St" +
      "atus\022\006\n\002OK\020\000\022\t\n\005ERROR\020\001\022\014\n\010FINISHED\020\0022\231\003" +
      "\n\013MsgServices\022$\n\tConfigMap\022\010.msg.Map\032\r.m" +
      "sg.Response\022/\n\rRobotPosition\022\017.msg.RBPos" +
      "ition\032\r.msg.Response\022\'\n\tRobotPath\022\013.msg." +
      "RBPath\032\r.msg.Response\0220\n\rSendVoiceFile\022\016" +
      ".msg.VoiceData\032\r.msg.Response(\001\022+\n\013Voice" +
      "Result\022\r.msg.VoiceStr\032\r.msg.Response\022!\n\003" +
      "Log\022\013.msg.LogStr\032\r.msg.Response\0220\n\016Contr" +
      "olCommand\022\017.msg.ControlCmd\032\r.msg.Respons" +
      "e\022-\n\rRobotFinished\022\r.msg.Response\032\r.msg." +
      "Response\022\'\n\nDriveRobot\022\n.msg.Drive\032\r.msg" +
      ".ResponseB\014\n\010msg.grpcP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_msg_Point_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msg_Point_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msg_Point_descriptor,
        new java.lang.String[] { "Posx", "Posy", });
    internal_static_msg_RBPosition_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_msg_RBPosition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msg_RBPosition_descriptor,
        new java.lang.String[] { "Pos", "Angle", "Vx", "Vy", "Timestamp", });
    internal_static_msg_RBPath_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_msg_RBPath_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msg_RBPath_descriptor,
        new java.lang.String[] { "Pos", "Starttime", "Endtime", });
    internal_static_msg_VoiceData_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_msg_VoiceData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msg_VoiceData_descriptor,
        new java.lang.String[] { "File", });
    internal_static_msg_VoiceStr_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_msg_VoiceStr_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msg_VoiceStr_descriptor,
        new java.lang.String[] { "Voice", "Timestamp", });
    internal_static_msg_LogStr_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_msg_LogStr_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msg_LogStr_descriptor,
        new java.lang.String[] { "Log", });
    internal_static_msg_Block_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_msg_Block_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msg_Block_descriptor,
        new java.lang.String[] { "Type", "W", "H", "Pos", });
    internal_static_msg_Map_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_msg_Map_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msg_Map_descriptor,
        new java.lang.String[] { "Roomwidth", "Roomheight", "Blocks", });
    internal_static_msg_ControlCmd_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_msg_ControlCmd_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msg_ControlCmd_descriptor,
        new java.lang.String[] { "Cmd", });
    internal_static_msg_Drive_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_msg_Drive_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msg_Drive_descriptor,
        new java.lang.String[] { "Drivecmd", });
    internal_static_msg_Response_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_msg_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msg_Response_descriptor,
        new java.lang.String[] { "Status", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

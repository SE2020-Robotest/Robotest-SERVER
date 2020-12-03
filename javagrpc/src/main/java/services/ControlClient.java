package services;

import msg.grpc.Drive;
import msg.grpc.Response;
import msg.grpc.Block;
import msg.grpc.Point;
import msg.grpc.ControlCmd;
import msg.grpc.MsgServicesGrpc.MsgServicesBlockingStub;
import msg.grpc.MsgServicesGrpc;

import io.grpc.stub.StreamObserver;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class ControlClient {
	public static enum Receiver{
		AR, CONTROL, ROBOT
	};
	private static Map<Receiver, String> IPs;
	private static Map<Receiver, Integer> Ports;
	static {
		IPs = new HashMap<Receiver, String>();
			IPs.put(Receiver.AR, "localhost");
			IPs.put(Receiver.CONTROL, "183.172.220.1");
                        IPs.put(Receiver.ROBOT, "59.66.190.24");
		Ports = new HashMap<Receiver, Integer>();
			Ports.put(Receiver.AR, 8888);
			Ports.put(Receiver.CONTROL, 8889);
			Ports.put(Receiver.ROBOT, 8888);
	}
	
	public static enum BlockType{
		CUBE, CYLINDER
	};
	
	public static Block SetBlock(BlockType type, double w, double h, double posx, double posy) {
		/*
		 * this function accept the parameters of a block and return a value in Block structure.
		 * if type is cube, then w means width, h means height.
		 * if type is cylinder, the w means radius, h means height.
		 * */
		Block.Type tp = Block.Type.CUBE;
		if(type == BlockType.CYLINDER) {
			tp = Block.Type.CYLINDER;
		}
		Block block = Block.newBuilder()
				.setType(tp)
				.setW(w)
				.setH(h)
				.setPos(Point.newBuilder().setPosx(posx).setPosy(posy).build())
				.build();
		return block;
	}
	
	public static int SendConfigMap(Receiver receiver, double roomwidth, double roomheight, ArrayList<Block> blocks) {
		/*
		 * this function sends the config map message to receiver site.
		 * parameter receiver decides where the message will be sent.
		 * parameter blocks contain the all the virtual blocks.
		 * you can use function SetBlock(type, w, h) to get a Block.
		 * this function return the response value: 0-ok, 1-error
		 * */
		String ip = IPs.get(receiver);
		int port = Ports.get(receiver);
		msg.grpc.Map request = msg.grpc.Map.newBuilder()
				.setRoomwidth(roomwidth)
				.setRoomheight(roomheight)
				.addAllBlocks(blocks)
				.build();
		ManagedChannel channel = ManagedChannelBuilder.forAddress(ip,port).usePlaintext().build();
		MsgServicesBlockingStub stub = MsgServicesGrpc.newBlockingStub(channel);
		Response response = stub.configMap(request);
		return response.getStatusValue();
	}
	
	public static enum Command{
		START, STOP, CONNECT
	}
	
	public static int SendControlCommand(Receiver receiver, Command cmd) {
		/*
		 * this function sends the control command to receiver site.
		 * cmd is the command that will be sent.
		 * this function return the response value: 0-ok, 1-error
		 * */
		String ip = IPs.get(receiver);
		int port = Ports.get(receiver);
		ControlCmd.CtrlCmd command = ControlCmd.CtrlCmd.START;
		if(cmd == Command.STOP) {
			command = ControlCmd.CtrlCmd.STOP;
		}
		else if(cmd == Command.CONNECT) {
			command = ControlCmd.CtrlCmd.CONNECT;
		}
		ControlCmd request = ControlCmd.newBuilder().setCmd(command).build();
		ManagedChannel channel = ManagedChannelBuilder.forAddress(ip,port).usePlaintext().build();
		MsgServicesBlockingStub stub = MsgServicesGrpc.newBlockingStub(channel);
                
		Response response = stub.controlCommand(request);
                
		return response.getStatusValue();
	}
        
        public static enum DriveCommand{
		FRONT, BACK, LEFT, RIGHT, CLOCKWISE, ANTICLOCKWISE
	}
	
	public static int SendDriveCommand(Receiver receiver, DriveCommand cmd) {
		/*
		 * this function sends the drive robot command to receiver site.
		 * cmd is th command that will be send.
		 * this function return the response value: 0-ok, 1-error
		 * */
		String ip = IPs.get(receiver);
		int port = Ports.get(receiver);
		
		Drive.DriveCmd command = Drive.DriveCmd.FRONT;
		if(cmd == DriveCommand.BACK) {
			command = Drive.DriveCmd.BACK;
		}
		else if(cmd == DriveCommand.LEFT){
			command = Drive.DriveCmd.LEFT;
		}
		else if(cmd == DriveCommand.RIGHT) {
			command = Drive.DriveCmd.RIGHT;
		}
		else if(cmd == DriveCommand.CLOCKWISE) {
			command = Drive.DriveCmd.CLOCKWISE;
		}
		else if(cmd == DriveCommand.ANTICLOCKWISE) {
			command = Drive.DriveCmd.ANTICLOCKWISE;
		}
		Drive request = Drive.newBuilder().setDrivecmd(command).build();
		ManagedChannel channel = ManagedChannelBuilder.forAddress(ip,port).usePlaintext().build();
		MsgServicesBlockingStub stub = MsgServicesGrpc.newBlockingStub(channel);
		Response response = stub.driveRobot(request);
		return response.getStatusValue();
	}
}

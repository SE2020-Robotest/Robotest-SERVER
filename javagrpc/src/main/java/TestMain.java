import java.io.IOException;

import services.ControlServer;
import services.ControlClient;
import msg.grpc.Block;

import java.util.ArrayList;

public class TestMain {
	public static void main(String[] args)throws IOException, InterruptedException {
		//ControlServer.StartServer();
		ArrayList<Block> blocks = new ArrayList<Block>();
		blocks.add(ControlClient.SetBlock(ControlClient.BlockType.CUBE, 3.3, 6.4));
		blocks.add(ControlClient.SetBlock(ControlClient.BlockType.CYLINDER, 6.9, 2.6));
		ControlClient.SendConfigMap(ControlClient.Receiver.ROBOT, 10.2, 10.6, blocks);
		
		ControlClient.SendControlCommand(ControlClient.Receiver.ROBOT, ControlClient.Command.CONNECT);
	}
}

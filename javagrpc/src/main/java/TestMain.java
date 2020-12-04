import java.io.IOException;

import services.ControlServer;
import services.ControlClient;
import msg.grpc.Block;

import java.util.ArrayList;

public class TestMain {
	public static void main(String[] args)throws IOException, InterruptedException {
		//ControlServer.StartServer();
		//ArrayList<Block> blocks = new ArrayList<Block>();
		//blocks.add(ControlClient.SetBlock(ControlClient.BlockType.CUBE, 330/2, 640/2, 350/2, 560/2));
		//blocks.add(ControlClient.SetBlock(ControlClient.BlockType.CYLINDER, 690/2, 260/2, 470/2, 850/2));
		//ControlClient.SendConfigMap(ControlClient.Receiver.ROBOT, 1000/2, 1000/2, blocks);
		
		//ControlClient.SendControlCommand(ControlClient.Receiver.ROBOT, ControlClient.Command.CONNECT);
		Runnable startexp=new Runnable(){
            public void run(){
                    try {
						ControlServer.StartServer();
					} catch (IOException | InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                   
            }
        };
            new Thread(startexp).start();
            System.out.println("Server Start");
            Thread.sleep(1000);
            ControlServer.StopServer();
	}
}

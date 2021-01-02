package services;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import services.ControlServices;

public class ControlServer {
	private static int Port = 8889;
	private static Server server = ServerBuilder.forPort(Port).addService(new ControlServices()).build();

	public static void StartServer()throws IOException, InterruptedException {
	    /*
	     * this function starts the control message listen server.
	     * the port is the static value Port in this class.
	     * */
		System.out.println("Start Control Message Listen Server at " + Port);
		//Server server = ServerBuilder.forPort(Port).addService(new ControlServices()).build();
		server.start();
		server.awaitTermination();
                
                //System.out.println("Server Stopped");
	}
	public static void StopServer() {
		if(server!=null) {
			System.out.println("Stop Server");
			server.shutdown();
		}
		else {
			System.out.println("Server has already stopped");
		}
	}
}

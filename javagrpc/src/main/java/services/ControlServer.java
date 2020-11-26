package services;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import services.ControlServices;

public class ControlServer {
	static int Port = 8888;
	public static void StartServer()throws IOException, InterruptedException {
	    /*
	     * this function starts the control message listen server.
	     * the port is the static value Port in this class.
	     * */
		System.out.println("Start Control Message Listen Server at " + Port);
		Server server = ServerBuilder.forPort(Port).addService(new ControlServices()).build();
		server.start();
		server.awaitTermination();
	}
}

package services;
import application.Main;
import msg.grpc.RBPath;
import msg.grpc.RBPosition;
import msg.grpc.Response;
import msg.grpc.VoiceStr;
import msg.grpc.Point;
import application.Environment;
import msg.grpc.MsgServicesGrpc.MsgServicesImplBase;

import io.grpc.stub.StreamObserver;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;

public class ControlServices extends MsgServicesImplBase{
	
	@Override
	public void robotPosition(RBPosition request, StreamObserver<Response> responseObserver) {
		/*
		 * this function is the response function of RBPosition message from robot site.
		 * parameter request is the received message.
		 * TODO: please implement the functionality of posting RBPosition message to your program.
		 * */
		// the following code shows how to operate the data structure RBPosition
		Point point = request.getPos();
		double posx = point.getPosx();
		double posy = point.getPosy();
		double angle = request.getAngle();
                
		double vx = request.getVx();
		double vy = request.getVy();
		int timestamp = request.getTimestamp();
		System.out.printf("posx:%.2f\n posy:%.2f\n angle:%.2f\n vx:%.2f\n vy:%.2f\n timestamp:%d\n",posx, posy, angle, vx, vy, timestamp);
		// the following code returns the Response response to the client.
		// if the received message goes wrong, please modify OK to Error.
                if(Environment.isstart==true)
                {   Platform.runLater(()->{
                    Environment.initial_position(posx,posy,angle);

                            });
                    
                    
                    Environment.isstart=false;
                        }
                else 
                    Platform.runLater(()->{
                    Environment.temp_position(posx,posy,angle);

                            });
                
		Response response = Response.newBuilder().setStatus(Response.Status.OK).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void robotPath(RBPath request, StreamObserver<Response> responseObserver) {
		/*
		 * this function is the response function of RBPath message from robot site.
		 * parameter request is the received message RBPath.
		 * TODO: please implement the functionality of posting RBPath message to your program.
		 * */
		// the following code shows how to operate the data structure RBPath
		int starttime = request.getStarttime();
		int endtime = request.getEndtime();
		System.out.printf("start time: %d, end time: %d", starttime, endtime);
		List<Point> points = request.getPosList();
		for(Point point:points) {
			System.out.printf("position x: %.2f, position y: %.2f\n", point.getPosx(), point.getPosy());
		}
		int len = request.getPosCount();
		for(int i = 0;i<len;i++) {
			Point point = request.getPos(i);
			System.out.printf("index: %d, position x: %.2f, position y: %.2f\n", i, point.getPosx(), point.getPosy());
		}
		// the following code returns the Response response to the client.
		// if the received message goes wrong, please modify OK to Error.
		Response response = Response.newBuilder().setStatus(Response.Status.OK).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
}

	@Override
	public void voiceResult(VoiceStr request, StreamObserver<Response> responseObserver) {
		/*
		 * this function is the response function of voice result message from robot site.
		 * parameter request is the received voice recognition, whose format is string.
		 * TODO: please implement the functionality of posting voice result message to your program.
		 * */
		// the following code shows how to operate the parameter VoiceStr
		String voicestr = request.getVoice();
		System.out.printf("voice recognition result: %s\n", voicestr);
		// the following code returns the Response response to the client.
		// if the received message goes wrong, please modify OK to Error.
                
                //test
                 File  data=new File("src\\main\\java\\application\\data.txt");
                 
                 FileWriter datar;
            try {
                datar = new FileWriter(data);
                BufferedWriter bw = new BufferedWriter(datar);
                bw.write(voicestr);
                bw.close();
                datar.close();
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ControlServices.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ControlServices.class.getName()).log(Level.SEVERE, null, ex);
            }
                       
                
                Main.b1.button.setText("ww");
		Response response = Response.newBuilder().setStatus(Response.Status.OK).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
                
	}

	@Override
	public void robotFinished(Response request, StreamObserver<Response> responseObserver) {
		/*
		 * this function is the response function of robot finished message from robot site when the experiment is finished and the robot stops.
		 * parameter request is the received robot status.
		 * TODO: please implement the functionality of posting robot finished message to your program.
		 * */
		int status = request.getStatusValue();
		System.out.printf("status: %d", status);
		// the following code returns the Response response to the client.
		// if the received message goes wrong, please modify OK to Error.
		Response response = Response.newBuilder().setStatus(Response.Status.OK).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}
}

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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;

public class ControlServices extends MsgServicesImplBase{
        Environment Env=Main.Env;
	private static boolean isstart=true;
        static double initime=0;
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
		double timestamp = request.getTimestamp();
		//System.out.printf("posx:%.2f\n posy:%.2f\n angle:%.2f\n vx:%.2f\n vy:%.2f\n timestamp:%d\n",posx, posy, angle, vx, vy, timestamp);
		// the following code returns the Response response to the client.
		// if the received message goes wrong, please modify OK to Error.
                Main.setofp.add(new Main.pointi(posx,posy,angle,vx,vy,timestamp));
                
                if(isstart==true)
                {   Platform.runLater(()->{Env.initial_position(posx,posy,angle);});
                    initime=timestamp;
                    isstart=false;
                }
                else 
                    Platform.runLater(()->{Env.temp_position(posx,posy,angle);});
                Platform.runLater(()->{Main.Cha.add_data(timestamp-initime, posx, posy, vx, vy, angle);});
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
                ArrayList<Main.pot> apath=new ArrayList<Main.pot>();
		double starttime = request.getStarttime();
		double endtime = request.getEndtime();
		System.out.printf("start time: %d, end time: %d", starttime, endtime);
		List<Point> points = request.getPosList();
                boolean isstart2=true;
		for(Point point:points) {
                        if(isstart2){
                            Platform.runLater(()->{Env.cal_initial_position(point.getPosx(), point.getPosy());});
                            isstart2=false;
                        }
                        else
                            Platform.runLater(()->{Env.cal_temp_position(point.getPosx(), point.getPosy());});
			System.out.printf("position x: %.2f, position y: %.2f\n", point.getPosx(), point.getPosy());
                        apath.add(new Main.pot(point.getPosx(), point.getPosy()));
		}
                Main.setofpath.add(apath);
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
                Main.voiceresult.add(voicestr);
		System.out.printf("voice recognition result: %s\n", voicestr);
		// the following code returns the Response response to the client.
		// if the received message goes wrong, please modify OK to Error.
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
                if(status==2)
                    System.out.printf("robotstatus: FINISHED" );
                else if(status==1)
                    System.out.printf("robotstatus: ERROR");
                else
                    System.out.printf("sth out bounder");
		System.out.printf("status: %d", status);
		// the following code returns the Response response to the client.
		// if the received message goes wrong, please modify OK to Error.
		Response response = Response.newBuilder().setStatus(Response.Status.OK).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void log(LogStr request, StreamObserver<Response> responseObserver) {
		/*
		 * this function is the response function of log message from robot site.
		 * parameter request is the received robot log string.
		 * TODO: please implement the functionality of posting robot log message to your program.
		 */
		String logstr = request.getLog();
		System.out.println("get robot log message");
		System.out.printf("log: %s", logstr);
		Response response = Response.newBuilder().setStatus(Response.Status.OK).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}
}

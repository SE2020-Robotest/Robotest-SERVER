package application;
import java.io.Serializable;
import services.ControlServer;
import services.ControlClient;
import msg.grpc.Block;
import services.ControlServices;
import application.Environment;
import application.Test;
import java.io.File;
import java.io.IOException;
import java.lang.Thread;
import com.sun.javafx.scene.SceneEventDispatcher;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.WindowEvent;
import msg.grpc.Block;


public class Main extends Application {
    static int co=0;
        void testit(){
            setofp.add(new pointi(21,0,0,0,0,0));
            setofp.add(new pointi(22,0,0,0,0,0));
            setofp.add(new pointi(23,0,0,0,0,0));
            ArrayList<pot> tis=new ArrayList<pot>();
            tis.add(new pot(3+co,0));
            tis.add(new pot(4+co,0));
            tis.add(new pot(5+co,0));
            co++;
            setofpath.add(tis);
        }
        public static class pot implements Serializable{
        double posx;double posy;
        public pot(double a1,double a2){
            posx=a1;posy=a2;
        }
    }
        public static class pointi implements Serializable{
    double posx,posy,angle,vx,vy,timestamp;
    public pointi(double a1,double a2,double a3, double a4,double a5,int a6){//posx,posy,angle,vx,vy,time
        posx=a1;posy=a2;angle=a3;vx=a4;vy=a5;timestamp=a6;
    }
    }
        public static ArrayList<pointi> setofp=new ArrayList<pointi>();//array that save imformation of points
        public static ArrayList<ArrayList<pot>> setofpath=new ArrayList<ArrayList<pot>>();
    
	Group root = new Group();
	Environment Env=new Environment(root);
	@Override
	public void start(Stage primaryStage) {
                primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
                @Override
                public void handle(WindowEvent event) {
                System.exit(0);
                }});
                testit();testit();
                Runnable startexp=new Runnable(){
                        public void run(){
                            try {
                                ControlServer.StartServer();                              
                            } catch (IOException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);      
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    };
                new Thread(startexp).start();
                        
		Button_type b1 = new Button_type(620, 500, "发送配置");
		Button_type b2 = new Button_type(820, 500, "开始实验");
		Button_type b3 = new Button_type(620, 600, "结束实验");
		Button_type b4 = new Button_type(820, 600, "数据保存");
		Button_type b5 = new Button_type(1020, 500, "保存配置");
		Button_type b6 = new Button_type(1020, 600, "退出");
                Button_type b7 = new Button_type(1220, 500, "数据读取");
                
		b1.button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Stage stage1=new Stage();
				FileChooser fc = new FileChooser();
				fc.setTitle("选择文件");
				File file=fc.showOpenDialog(stage1);
				if (file==null) {
					return;
				}
				System.out.println(file.getAbsolutePath());
				try {
					Env.read(file);
                                        Env.send(file);
                                       
                                        if(0==0)
                                            System.out.println("配置文件发送成功");
                                        else
                                            System.out.println("发送失败");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
                b2.button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
                    
                    try {
                        
                        
                        int tag=0;
                        //tag+=ControlClient.SendControlCommand(ControlClient.Receiver.AR, ControlClient.Command.CONNECT);
                        tag+=ControlClient.SendControlCommand(ControlClient.Receiver.ROBOT, ControlClient.Command.CONNECT);
                        //tag+=ControlClient.SendControlCommand(ControlClient.Receiver.AR, ControlClient.Command.START);
                        tag+=ControlClient.SendControlCommand(ControlClient.Receiver.ROBOT, ControlClient.Command.START);
                        if(tag==0)
                            System.out.println("连接并开始成功");
                        else
                            System.out.println("连接并开始失败");
                }   
                        catch(Throwable t){
                        t.printStackTrace();
                        }
                }});
                b3.button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
                   //ControlClient.SendControlCommand(ControlClient.Receiver.AR, ControlClient.Command.STOP);
                   ControlClient.SendControlCommand(ControlClient.Receiver.ROBOT, ControlClient.Command.STOP);
                   System.out.println("实验已停止");
                }});
                b4.button.setOnAction(new EventHandler<ActionEvent>(){
                    @Override
			public void handle(ActionEvent event) {
                            try
                                {
                                   FileOutputStream fileOut =
                                   new FileOutputStream("./data.txt");
                                   ObjectOutputStream out = new ObjectOutputStream(fileOut);
                                   out.writeObject(setofp);
                                   out.writeObject(setofpath);
                                   out.close();
                                   fileOut.close();
                                   System.out.printf("数据已保存");
                                }catch(IOException i)
                                {
                                    i.printStackTrace();
                                }
                            
                        }
                });//save data
		b5.button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Stage stage1=new Stage();
				FileChooser fc = new FileChooser();
				fc.setTitle("保存配置文件");
				File file=fc.showOpenDialog(stage1);
				if (file==null) {
					return;
				}
					try {
						Env.save(file);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		});
		b6.button.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				System.exit(0);
				
			}
		});
                b7.button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
                            try
                        {
                           FileInputStream fileIn = new FileInputStream("./data.txt");
                           ObjectInputStream in = new ObjectInputStream(fileIn);
                           ArrayList<pointi> ppp= (ArrayList<pointi>) in.readObject();
                           ArrayList<ArrayList<pot>> ppp2=(ArrayList<ArrayList<pot>>) in.readObject();
                           for(pointi p1:ppp)
                               System.out.println(p1.posx);
                           System.out.println("||");
                           for(ArrayList<pot>pp2:ppp2){
                               for(pot p2:pp2)
                                   System.out.println(p2.posx);
                               System.out.println("apath read");
                           }
                           in.close();
                           fileIn.close();
                        }catch(IOException i)
                        {
                           i.printStackTrace();
                           return;
                        }catch(ClassNotFoundException c)
                        {
                           System.out.println("class not found");
                           c.printStackTrace();
                           return;
                        }
                        }
                });//read data
		root.getChildren().add(b1.button);
		root.getChildren().add(b2.button);
		root.getChildren().add(b3.button);
		root.getChildren().add(b4.button);
		root.getChildren().add(b5.button);
		root.getChildren().add(b6.button);
		root.getChildren().add(b7.button);
		TextArea text=new TextArea();
		Tooltip tip2 = new Tooltip("测试文本框");
		tip2.setFont(Font.font(40));
		text.setTooltip(tip2);
		text.setLayoutX(30);
		text.setLayoutY(500);
		text.setPrefWidth(550);
		text.setPrefHeight(270);
		text.setWrapText(true);
		root.getChildren().add(text);
//		test.setOnKeyPressed(new EventHandler<KeyEvent>(){
//
//			@Override
//			public void handle(KeyEvent event) {
//				text.appendText(event.getCode().getName());	
//				// TODO Auto-generated method stub		
//			}		
//		});
		Scene scene = new Scene(root,1200,800);
		System.out.println(root);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("demo");
		primaryStage.show();

	}
	public void end() throws IOException {
		Env.temp.delete();
		// TODO Auto-generated method stub
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

package application;
import javafx.scene.control.TextArea;
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
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
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
    void clearall(){
        
    }
    static int co=0;
    static int chartcate=1;//图表类型
        void testit(){
            setofp.add(new pointi(21,30,0,4,7,0));
            setofp.add(new pointi(32,40,12,9,1,5));
            setofp.add(new pointi(42,50,23,12,23,10));
            ArrayList<pot> tis=new ArrayList<pot>();
            tis.add(new pot(3+co,34));
            tis.add(new pot(14+co,65));
            tis.add(new pot(25+co,90));
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
        File confm;
        public static ArrayList<pointi> setofp=new ArrayList<pointi>();//array that save imformation of points
        public static ArrayList<ArrayList<pot>> setofpath=new ArrayList<ArrayList<pot>>();
        public static ArrayList<String> voiceresult=new ArrayList<String>();
	public static Group root = new Group();
	public static Environment Env=new Environment(root);
        public static Chart Cha=new Chart(root);
        public static ArrayList<String> conf=new ArrayList<String>();
	@Override
	public void start(Stage primaryStage) {
                primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
                @Override
                public void handle(WindowEvent event) {
                System.exit(0);
                }});
                //testit();testit();
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
                
                final ToggleGroup tgroup = new ToggleGroup();
                
                RadioButton rb0 = new RadioButton("show pos-t");
                RadioButton rb1 = new RadioButton("show v-t");
                RadioButton rb2 = new RadioButton("show θ-t");
                rb0.setToggleGroup(tgroup);
                rb1.setToggleGroup(tgroup);  
                rb2.setToggleGroup(tgroup);
                rb1.setSelected(true) ;
                rb0.setLayoutX(650);
                rb0.setLayoutY(10);
                rb1.setLayoutX(760);
                rb1.setLayoutY(10);
                rb2.setLayoutX(870);
                rb2.setLayoutY(10);
                root.getChildren().add(rb0);
                root.getChildren().add(rb1);
                root.getChildren().add(rb2);
                rb0.setOnAction(action->{chartcate=0;Cha.print_chart(chartcate);});
                rb1.setOnAction(action->{chartcate=1;Cha.print_chart(chartcate);});
                rb2.setOnAction(action->{chartcate=2;Cha.print_chart(chartcate);});
                Button cleardata=new Button("清除数据") ;
                cleardata.setLayoutX(1050);
                cleardata.setLayoutY(5);
                cleardata.setPrefSize(100, 30);
                root.getChildren().add(cleardata);
                cleardata.setOnAction(action->{Cha.print_chart(3);});
                
                new Thread(new Runnable(){
                    public void run(){
                        while(true){
                            Platform.runLater(()->{Cha.print_chart(chartcate);});
                            try {
                                Thread.sleep(1000);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                                }
                        }
                    }
                }).start();
                
		Button_type b1 = new Button_type(620, 500, "发送配置");
		Button_type b2 = new Button_type(820, 500, "开始实验");
		Button_type b3 = new Button_type(620, 600, "结束实验");
		Button_type b4 = new Button_type(820, 600, "数据保存");
		Button_type b5 = new Button_type(1020, 500, "保存配置");
		Button_type b6 = new Button_type(1020, 600, "退出");
                Button_type b7 = new Button_type(620, 700, "数据读取");
                
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
                        tag+=ControlClient.SendControlCommand(ControlClient.Receiver.ROBOT, ControlClient.Command.CONNECT);
                        tag+=ControlClient.SendControlCommand(ControlClient.Receiver.ROBOT, ControlClient.Command.START);
                        //tag+=ControlClient.SendControlCommand(ControlClient.Receiver.AR, ControlClient.Command.CONNECT);
                        
                        //tag+=ControlClient.SendControlCommand(ControlClient.Receiver.AR, ControlClient.Command.START);
                        
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
                            clearall();
                   //ControlClient.SendControlCommand(ControlClient.Receiver.AR, ControlClient.Command.STOP);
                   ControlClient.SendControlCommand(ControlClient.Receiver.ROBOT, ControlClient.Command.STOP);
                   System.out.println("实验已停止");
                }});
                b4.button.setOnAction(new EventHandler<ActionEvent>(){
                    @Override
			public void handle(ActionEvent event) {
                            try
                                {
                                     FileChooser fileChooser = new FileChooser();
                                    FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
                                    fileChooser.getExtensionFilters().add(extFilter);
                                    Stage s = new Stage();
                                    File file = fileChooser.showSaveDialog(s);
                                    if (file == null)
                                        return;
                                    if(file.exists()){//文件已存在，则删除覆盖文件
                                        file.delete();
                                    }
                                   FileOutputStream fileOut =
                                   new FileOutputStream(file);
                                   ObjectOutputStream out = new ObjectOutputStream(fileOut);
                                   out.writeObject(setofp);
                                   out.writeObject(setofpath);
                                   out.writeObject(voiceresult);
                                   out.writeObject(conf);
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
                            Stage stage1=new Stage();
				FileChooser fc = new FileChooser();
				fc.setTitle("导入数据");
				File file=fc.showOpenDialog(stage1);
				if (file==null) {
					return;
				}
                           FileInputStream fileIn = new FileInputStream(file);
                           ObjectInputStream in = new ObjectInputStream(fileIn);
                           ArrayList<pointi> ppp= (ArrayList<pointi>) in.readObject();
                           
                           ArrayList<ArrayList<pot>> ppp2=(ArrayList<ArrayList<pot>>) in.readObject();
                           
                           ArrayList<String> voc=(ArrayList<String>) in.readObject();
                           ArrayList<String> confm=(ArrayList<String>) in.readObject();
                           File conftemp=new File("./conf.tmp");
                           FileWriter fw = new FileWriter(conftemp);
                           BufferedWriter bw = new BufferedWriter(fw);
                           for (String line:confm){
                               bw.write(line);
                               bw.newLine();
                           }
                           bw.close();
                           fw.close();
                           Env.read(conftemp);
                           conftemp.delete();
                           boolean tag1=true;
                           double timestampzero=ppp.get(0).timestamp;
                           for(pointi p1:ppp){
                               if(tag1)
                               {
                                   Env.initial_position(p1.posx, p1.posy, p1.angle);
                                   tag1=false;
                               }
                               else
                                   Env.temp_position(p1.posx, p1.posy, p1.angle);
                               Cha.add_data(p1.timestamp-timestampzero, p1.posx, p1.posy, p1.vx, p1.vy, p1.angle);
                               //Thread.sleep(10);
                               
                           }
                           System.out.println("||");
                           for(ArrayList<pot>pp2:ppp2){
                               boolean tag2=true;
                               for(pot p2:pp2){
                                   if (tag2){
                                       tag2=false;
                                       Env.cal_initial_position(p2.posx, p2.posy);
                                   }
                                   else
                                       Env.cal_temp_position(p2.posx, p2.posy);
                                   
                               }
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
                        }   /*catch (InterruptedException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            }*/
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
                text.setEditable(false);
		root.getChildren().add(text);
		/*root.setOnKeyPressed(new EventHandler<KeyEvent>(){
			@Override
			public void handle(KeyEvent event) {
				System.out.println(event.getCode());		
			}		
		});*/
                root.addEventFilter(KeyEvent.KEY_PRESSED, event->{
                    ControlClient.DriveCommand cmd;
                    switch(event.getCode()){
                        case W:cmd=ControlClient.DriveCommand.FRONT;break;
                        case S:cmd=ControlClient.DriveCommand.BACK;break;
                        case Q:cmd=ControlClient.DriveCommand.LEFT;break;
                        case E:cmd=ControlClient.DriveCommand.RIGHT;break;
                        case A:cmd=ControlClient.DriveCommand.CLOCKWISE;break;
                        case D:cmd=ControlClient.DriveCommand.ANTICLOCKWISE;break;
                        default:event.consume();return;
                    }
                    ControlClient.SendDriveCommand(ControlClient.Receiver.ROBOT,cmd);
                    
                    event.consume();
                });
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

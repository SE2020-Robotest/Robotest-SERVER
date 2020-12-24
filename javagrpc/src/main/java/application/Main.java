package application;
import java.io.Serializable;
import services.ControlServer;
import services.ControlClient;
import services.ControlServices;
import java.io.File;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.stage.WindowEvent;


public class Main extends Application {
    boolean isTest=false;
    Button_type sendMap;
    Button_type connect;
    Button_type stopExp;
    Button_type saveData;
    Button_type startExp;
    Button_type shutDown;
    Button_type loadData;
    Button_type keyDrive;
    Button_type setIp;
    public void sleep(int time){try{Thread.sleep(1000*time);System.out.println("i wake up!");}catch(Throwable e){};}
    void autoTest(){
        sleep(1);
        Platform.runLater(()->{connect.button.fireEvent(new ActionEvent());});
        sleep(1);
        Platform.runLater(()->{startExp.button.fireEvent(new ActionEvent());});
        sleep(1);
        Platform.runLater(()->{sendMap.button.fireEvent(new ActionEvent());});
        sleep(1);
        Platform.runLater(()->{stopExp.button.fireEvent(new ActionEvent());});
        sleep(1);
        Platform.runLater(()->{saveData.button.fireEvent(new ActionEvent());});
        sleep(1);
        Platform.runLater(()->{loadData.button.fireEvent(new ActionEvent());});
    }
    void clearAll(){
        
        clearData();
        //clearmap();
        Env.remove_all(); 
        conf.clear();
    }
    void clearData(){
        setOfPoints.clear();
        setOfPaths.clear();
        voiceResultList.clear();
        vrText.clear();
        logText.clear();
        Env.remove_positon(); 
    }
    private boolean firstConnect=true;
    private boolean cmdDrive=false;
    public static boolean onExp=false;
    public static boolean haveMap=false;
    static int chartCate=1;//图表类型

    public static class PointInPath implements Serializable{
        double posx;double posy;
        public PointInPath(double a1,double a2){
            posx=a1;posy=a2;
        }
    }
    public static class Point implements Serializable{
    double posx,posy,angle,vx,vy,timestamp;
    public Point(double a1,double a2,double a3, double a4,double a5,double a6){//posx,posy,angle,vx,vy,time
        posx=a1;posy=a2;angle=a3;vx=a4;vy=a5;timestamp=a6;
    }
    }
        
    public static ArrayList<Point> setOfPoints=new ArrayList<Point>();//array that save imformation of points
    public static ArrayList<ArrayList<PointInPath>> setOfPaths=new ArrayList<ArrayList<PointInPath>>();
    public static ArrayList<String> voiceResultList=new ArrayList<String>();
    public static Group root = new Group();
    public static Environment Env=new Environment(root);
    public static Chart Cha=new Chart(root);
    public static ArrayList<String> conf=new ArrayList<String>();
    public static TextArea vrText,logText;
    @Override
    public void start(Stage primaryStage) {
                primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
                @Override
                public void handle(WindowEvent event) {
                System.exit(0);
                }}); 
                new Thread(new Runnable(){
                        public void run(){
                            try {
                                ControlServer.StartServer();                              
                            } catch (IOException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);      
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }).start();
                
                final ToggleGroup tgroup = new ToggleGroup();
                
                vrText=new TextArea();
		Tooltip tip2 = new Tooltip("语音识别结果");
		tip2.setFont(Font.font(20));
		vrText.setTooltip(tip2);
		vrText.setLayoutX(30);
		vrText.setLayoutY(500);
		vrText.setPrefWidth(550);
		vrText.setPrefHeight(70);
		vrText.setWrapText(true);
                vrText.setEditable(false);
                
                logText=new TextArea();
		Tooltip tip3 = new Tooltip("日志");
		tip3.setFont(Font.font(20));
		logText.setTooltip(tip3);
		logText.setLayoutX(30);
		logText.setLayoutY(590);
		logText.setPrefWidth(550);
		logText.setPrefHeight(180);
		logText.setWrapText(true);
                logText.setEditable(false);
                
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
                rb0.setOnAction(action->{chartCate=0;Cha.print_chart(chartCate);});
                rb1.setOnAction(action->{chartCate=1;Cha.print_chart(chartCate);});
                rb2.setOnAction(action->{chartCate=2;Cha.print_chart(chartCate);});              
                new Thread(new Runnable(){
                    public void run(){
                        while(true){
                            Platform.runLater(()->{Cha.print_chart(chartCate);});
                            try {
                                Thread.sleep(1000);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                                }
                        }
                    }
                }).start();
                
		sendMap = new Button_type(1020, 500, "发送配置");
		connect = new Button_type(620, 500, "建立连接");
		stopExp = new Button_type(820, 600, "结束实验");
		saveData = new Button_type(1020, 600, "数据保存");
		startExp = new Button_type(820, 500, "开始实验");
		shutDown = new Button_type(1020, 700, "退出");
                loadData = new Button_type(620, 700, "数据读取");
                keyDrive = new Button_type(620, 600, "键盘开车");
                setIp = new Button_type(820, 700, "设置IP");
                startExp.button.setDisable(true);
                sendMap.button.setDisable(true);
                saveData.button.setDisable(true);
                stopExp.button.setDisable(true);
                keyDrive.button.setDisable(true);
                setIp.button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
                            FileWriter fr=null;
                            File setting=new File("./setting.txt");
                            TextInputDialog dialog = new TextInputDialog();
                            dialog.setTitle("set IP");
                            dialog.setHeaderText("IP Input Dialog");
                            dialog.setContentText("IP of ROBOT:");
                            Optional<String> ip_of_robot = dialog.showAndWait();
                            if (ip_of_robot.isPresent()){
                                ControlClient.IPs.put(ControlClient.Receiver.ROBOT, ip_of_robot.get());
                                try {
                                fr = new FileWriter(setting);
                                BufferedWriter br = new BufferedWriter(fr);
                                br.write(ip_of_robot.get());
                                br.newLine();
                                br.close();
                                fr.close();
                                }catch (IOException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            dialog.setContentText("IP of AR:");
                            Optional<String> ip_of_ar = dialog.showAndWait();
                            if (ip_of_ar.isPresent()){
                                ControlClient.IPs.put(ControlClient.Receiver.AR, ip_of_ar.get());
                                try {
                                fr = new FileWriter(setting,true);
                                BufferedWriter br = new BufferedWriter(fr);
                                br.write(ip_of_ar.get());
                                br.newLine();
                                br.close();
                                fr.close();
                                }catch (IOException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
                });
		sendMap.button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
                                clearAll();
                                File file;
                                if(isTest){
                                    file=new File("./map.txt");
                                }else{
				Stage stage1=new Stage();
				FileChooser fc = new FileChooser();
				fc.setTitle("选择文件");
				file=fc.showOpenDialog(stage1);
                                }
				if (file==null) {
					return;
				}
				System.out.println(file.getAbsolutePath());
				
                                try{
                                Env.read(file);}
                                catch (IOException e) {
                                e.printStackTrace();
                                } 
                                catch(Throwable e){
                                    System.out.println("invalid map");
                                    conf.clear();
                                    return;
                                }
                                new Thread(new Runnable(){
                                    public void run(){
                                        try{
                                            Env.send(file,ControlClient.Receiver.ROBOT);
                                            System.out.println("Send map to ROBOT successfully");
                                        }
                                        catch(Throwable e){
                                            System.out.println("Fail to send map to ROBOT");
                                        }
                                    }
                                }).start();
                                new Thread(new Runnable(){
                                    public void run(){
                                        try{
                                            Env.send(file,ControlClient.Receiver.AR);
                                            System.out.println("Send map to AR successfully");
                                        }
                                        catch(Throwable e){
                                            System.out.println("Fail to send map to AR");
                                        }
                                    }
                                }).start();
                                haveMap=true;


                                sendMap.button.setDisable(true);
                                keyDrive.button.setDisable(false);
			}
		});
                connect.button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
                        new Thread(new Runnable(){
                            public void run(){
                                try{
                                    ControlClient.SendControlCommand(ControlClient.Receiver.ROBOT, ControlClient.Command.CONNECT);
                                    System.out.println("Build connect with ROBOT successfully");
                                }catch(Throwable a){
                                    System.out.println("Failed to build connect with ROBOT");
                                }                            }
                        }).start();
                        new Thread(new Runnable(){
                            public void run(){
                                try{
                                    ControlClient.SendControlCommand(ControlClient.Receiver.AR, ControlClient.Command.CONNECT);
                                    System.out.println("Build connect with AR successfully");
                                }catch(Throwable a){
                                    System.out.println("Failed to build connect with AR");
                                }                                
                            }
                        }).start();
                        if(firstConnect)
                            startExp.button.setDisable(false);
                        firstConnect=false;
                }});
                stopExp.button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
                        new Thread(new Runnable(){
                            public void run(){
                                try{
                                    ControlClient.SendControlCommand(ControlClient.Receiver.ROBOT, ControlClient.Command.STOP);
                                    System.out.println("Stop with ROBOT successfully");
                                    onExp=false;
                                }catch(Throwable a){
                                    System.out.println("Failed to Stop with ROBOT");
                                }                            }
                        }).start();
                        new Thread(new Runnable(){
                            public void run(){
                                try{
                                    ControlClient.SendControlCommand(ControlClient.Receiver.AR, ControlClient.Command.STOP);
                                    System.out.println("Stop with AR successfully");
                                }catch(Throwable a){
                                    System.out.println("Failed to Stop with AR");
                                }                                
                            }
                        }).start();
                        startExp.button.setDisable(false);
                        sendMap.button.setDisable(true);
                        loadData.button.setDisable(false);
                        saveData.button.setDisable(false);
                        keyDrive.button.setDisable(true);
                        stopExp.button.setDisable(true);
                        onExp=false;
                }});
                saveData.button.setOnAction(new EventHandler<ActionEvent>(){
                    @Override
			public void handle(ActionEvent event) {
                            try
                                {
                                    File file;
                                    if(isTest)
                                        file=new File("demo.txt");
                                    else{
                                     FileChooser fileChooser = new FileChooser();
                                    FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
                                    fileChooser.getExtensionFilters().add(extFilter);
                                    Stage s = new Stage();
                                    file = fileChooser.showSaveDialog(s);}
                                    if (file == null)
                                        return;
                                    if(file.exists()){//文件已存在，则删除覆盖文件
                                        file.delete();
                                    }
                                   FileOutputStream fileOut =
                                   new FileOutputStream(file);
                                   ObjectOutputStream out = new ObjectOutputStream(fileOut);
                                   out.writeObject(setOfPoints);
                                   out.writeObject(setOfPaths);
                                   out.writeObject(voiceResultList);
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
		startExp.button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
                            if(haveMap)
                                clearData();
                            else
                                clearAll();
                            new Thread(new Runnable(){
                            public void run(){
                                try{
                                    ControlClient.SendControlCommand(ControlClient.Receiver.ROBOT, ControlClient.Command.START);
                                    System.out.println("Start with ROBOT successfully");
                                    onExp=true;
                                    
                                }catch(Throwable a){
                                    System.out.println("Failed to Start with ROBOT");
                                }                            }
                        }).start();
                        new Thread(new Runnable(){
                            public void run(){
                                try{
                                    ControlClient.SendControlCommand(ControlClient.Receiver.AR, ControlClient.Command.START);
                                    System.out.println("Start with AR successfully");
                                    
                                }catch(Throwable a){
                                    System.out.println("Failed to start with AR");
                                }                                
                            }
                        }).start();
                        stopExp.button.setDisable(false);
                        sendMap.button.setDisable(false);
                        startExp.button.setDisable(true);
                        loadData.button.setDisable(true);
                        saveData.button.setDisable(true);
                        if(haveMap)
                            keyDrive.button.setDisable(false);
			}
		});
		shutDown.button.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
                                ControlServer.StopServer();
				System.exit(0);
				
			}
		});
                loadData.button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
                            clearAll();
                            try
                        {
                            File file;
                            if(isTest)
                                file=new File("demo.txt");
                            else{
                            Stage stage1=new Stage();
				FileChooser fc = new FileChooser();
				fc.setTitle("导入数据");
				file=fc.showOpenDialog(stage1);}
				if (file==null) {
					return;
				}
                           FileInputStream fileIn = new FileInputStream(file);
                           ObjectInputStream in = new ObjectInputStream(fileIn);
                           ArrayList<Point> ppp= (ArrayList<Point>) in.readObject();
                           
                           ArrayList<ArrayList<PointInPath>> ppp2=(ArrayList<ArrayList<PointInPath>>) in.readObject();
                           
                           ArrayList<String> voc=(ArrayList<String>) in.readObject();
                           ArrayList<String> confm=(ArrayList<String>) in.readObject();
                           for(String Voice:voc){
                            vrText.appendText(Voice);
                            vrText.appendText("\n");
                            }
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
                           double timestampzero=0;
                           if(!ppp.isEmpty())
                           {timestampzero=ppp.get(0).timestamp;}
                           for(Point p1:ppp){
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
                           
                           for(ArrayList<PointInPath>pp2:ppp2){
                               boolean tag2=true;
                               for(PointInPath p2:pp2){
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
                        }catch(java.io.StreamCorruptedException e)
                        {System.out.println("Invalid file");return;}
                        catch(IOException i)
                        {
                           i.printStackTrace();
                           return;
                        }catch(ClassNotFoundException c)
                        {
                           System.out.println("class not found");
                           c.printStackTrace();
                           return;
                        }
                            /*catch (InterruptedException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            }*/
                            
                        saveData.button.setDisable(true);
                        haveMap=false;
                        }
                });//read data
                keyDrive.button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
                            cmdDrive=!cmdDrive;
                            if(cmdDrive)
                                keyDrive.button.setText("结束开车");
                            else
                                keyDrive.button.setText("键盘开车");
                        }});
		root.getChildren().add(sendMap.button);
		root.getChildren().add(connect.button);
		root.getChildren().add(stopExp.button);
		root.getChildren().add(saveData.button);
		root.getChildren().add(startExp.button);
		root.getChildren().add(shutDown.button);
		root.getChildren().add(loadData.button);
                root.getChildren().add(keyDrive.button);
                root.getChildren().add(setIp.button);
                root.getChildren().add(vrText);
                root.getChildren().add(logText);
		
		/*root.setOnKeyPressed(new EventHandler<KeyEvent>(){
			@Override
			public void handle(KeyEvent event) {
				System.out.println(event.getCode());		
			}		
		});*/
                root.addEventFilter(KeyEvent.KEY_PRESSED, event->{

                    ControlClient.DriveCommand cmd;
                    if(!cmdDrive){
                        event.consume();
                        return;
                    }
                    switch(event.getCode()){
                        case UP:cmd=ControlClient.DriveCommand.FRONT;break;
                        case DOWN:cmd=ControlClient.DriveCommand.BACK;break;
                        case Q:cmd=ControlClient.DriveCommand.LEFT;break;
                        case E:cmd=ControlClient.DriveCommand.RIGHT;break;
                        case LEFT:cmd=ControlClient.DriveCommand.CLOCKWISE;break;
                        case RIGHT:cmd=ControlClient.DriveCommand.ANTICLOCKWISE;break;
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
                if(isTest)
                    new Thread(new Runnable(){public void run(){autoTest();}}).start();

	}
	public void end() throws IOException {
		Env.temp.delete();
		// TODO Auto-generated method stub
	}
	
	public static void main(String[] args) {
		launch(args);
               
	}
}

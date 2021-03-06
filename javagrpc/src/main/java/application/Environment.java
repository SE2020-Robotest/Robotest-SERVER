package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import msg.grpc.Block;
import services.ControlClient;
import application.Main;

public class Environment {
Group Env;
double data[][]=null;
double X;				//width of the ground
double Y;				//height of the ground
double initial_x;
double initial_y;
double r;
double Coeff_x;		//the coeff of x
double Coeff_y;
double delta_x;
double delta_y;
double px_temp;
double py_temp;
int posi_cir;
int posi_arc;
double cal_px_temp;
double cal_py_temp;
Boolean flag_cal;
static int H=450;
int environ_tag;
int position_tag;
int posi_rad;
BufferedWriter bw;
File temp; 
//max width : 550
//max height: 450
public Environment(Group root) {
	Env=root;
}

public void Environment_initial(double x,double y)throws IOException {
	if (x>=y) {
		X=H;
		Y=H*y/x;
	}
	else {
		X=H*x/y;
		Y=H;
	}
	initial_x=x;
	initial_y=y;
	Coeff_x=X/x;
	Coeff_y=Y/y;
	r=5*Coeff_x;
	delta_x=(550-X)/2+30;
	delta_y=(H-Y)/2+30;
	
	javafx.scene.shape.Rectangle rec = new javafx.scene.shape.Rectangle();
	rec.setX(delta_x);
	rec.setY(delta_y);
	rec.setWidth(X);
	rec.setHeight(Y);
	rec.setFill(Color.valueOf("#ffffff00"));
	rec.setArcWidth(5);
	rec.setArcHeight(5);
	rec.setStroke(Color.BLACK);
	rec.setStrokeWidth(3);
	rec.setStrokeType(StrokeType.OUTSIDE);
	Env.getChildren().add(rec);
	try{
	    temp = File.createTempFile("tempfile", ".tmp"); 
		bw = new BufferedWriter(new FileWriter(temp));
	    bw.write("X "+x+" Y "+y+"\n");
			
	}catch(IOException e){
	    e.printStackTrace();
	}

};
//构造长方形
public void rec(double x,double y,double px,double py,Color c) throws IOException{
	javafx.scene.shape.Rectangle rec = new javafx.scene.shape.Rectangle();
	rec.setX((px-x/2)*Coeff_x+delta_x);
	rec.setY(Y-(py+y/2)*Coeff_y+delta_y);
	rec.setArcWidth(5);
	rec.setArcHeight(5);
	rec.setWidth(Math.floor(x*Coeff_x));
	rec.setHeight(Math.floor(y*Coeff_y));
	rec.setFill(c);
	Env.getChildren().add(rec);
	bw.write("1 "+x+" "+y+" "+px+" "+py+"\n");
};
//构造圆形
public void cir(double x,double y,double px,double py,Color c) throws IOException{
	Circle cir2 = new Circle();
	cir2.setCenterX(px*Coeff_x+delta_x);
	cir2.setCenterY(Y-py*Coeff_y+delta_y);
	cir2.setRadius(x*Coeff_x);
	cir2.setFill(c);
	Env.getChildren().add(cir2);
	bw.write("2 "+x+" "+y+" "+px+" "+py+"\n");
};
//初始位置
public void initial_position(double x,double y,double angle) {
	position_tag=Env.getChildren().size();
        Circle cir = new Circle();
	px_temp=x*Coeff_x+delta_x;
	py_temp=Y-y*Coeff_y+delta_y;
	cir.setCenterX(px_temp);
	cir.setCenterY(py_temp);
	cir.setRadius(r+2);
	cir.setFill(Color.BLACK);
	Env.getChildren().add(cir);
	Circle cir2 = new Circle();
	cir2.setCenterX(px_temp);
	cir2.setCenterY(py_temp);
	cir2.setRadius(r);
	cir2.setFill(Color.RED);
	Env.getChildren().add(cir2);
	posi_cir=Env.getChildren().size()-1;
	
        Circle cir3 = new Circle();
	cir3.setCenterX(px_temp);
	cir3.setCenterY(py_temp);
	cir3.setRadius(10*Coeff_x);
	cir3.setFill(Color.valueOf("ff8c0000"));
	cir3.setStroke(Color.BLACK);
	Env.getChildren().add(cir3);
	posi_rad=Env.getChildren().size()-1;
        
	Arc arc = new Arc();
	arc.setCenterX(px_temp);
	arc.setCenterY(py_temp);
	arc.setStartAngle(angle-22.5);
	arc.setLength(45);
	arc.setRadiusX(20);
	arc.setRadiusY(20);
	arc.setFill(Color.valueOf("ff8c0080"));
	arc.setType(ArcType.ROUND);
	Env.getChildren().add(arc);
	posi_arc=Env.getChildren().size()-1;
	
}
//实际轨迹
public void temp_position(double x,double y,double angle) {
	Line  l=new Line();
	l.setStartX(px_temp);
	l.setStartY(py_temp);
	px_temp=x*Coeff_x+delta_x;
	py_temp=Y-y*Coeff_y+delta_y;
	l.setEndX(px_temp);
	l.setEndY(py_temp);
	Env.getChildren().add(l);
	Circle cir2=(Circle) Env.getChildren().remove(posi_cir);
	Circle cir3=(Circle) Env.getChildren().remove(posi_rad-1);
	Arc arc=(Arc)Env.getChildren().remove(posi_arc-2);
	cir2.setCenterX(px_temp);
	cir2.setCenterY(py_temp);
	Env.getChildren().add(cir2);
	posi_cir=Env.getChildren().size()-1;
        cir3.setCenterX(px_temp);
	cir3.setCenterY(py_temp);
	Env.getChildren().add(cir3);
	posi_rad=Env.getChildren().size()-1;
	arc.setCenterX(px_temp);
	arc.setCenterY(py_temp);
	arc.setStartAngle(angle-22.5);
	Env.getChildren().add(arc);
	posi_arc=Env.getChildren().size()-1;	
}


//保存读取配置文件
public void save(File fd)throws Exception {
	bw.close();
    int length=2097152;
    FileInputStream in=new FileInputStream(temp);
    FileOutputStream out=new FileOutputStream(fd);
    FileChannel inC=in.getChannel();
    FileChannel outC=out.getChannel();
    ByteBuffer b=null;
    while(true){
        if(inC.position()==inC.size()){
            inC.close();
            outC.close();
        }
        if((inC.size()-inC.position())<length){
            length=(int)(inC.size()-inC.position());
        }else
            length=2097152;
        b=ByteBuffer.allocateDirect(length);
        inC.read(b);
        b.flip();
        outC.write(b);
        outC.force(false);
        temp.delete();
    }
	
};
//读取配置文档
public void read(File fd) throws IOException{
	environ_tag=Env.getChildren().size();
        FileReader fr = new FileReader(fd);
	BufferedReader br = new BufferedReader(fr);
	String line = "";
	String[] arrs = null;
	if((line = br.readLine())!=null) {
                Main.conf.add(line);
		arrs = line.split(" ");
		this.Environment_initial(Double.parseDouble(arrs[1]),Double.parseDouble(arrs[3]));
	}
	while((line = br.readLine())!=null) {
                Main.conf.add(line);
		arrs = line.split(" ");
		double type = Double.parseDouble(arrs[0]);
		if (type==1) {
			this.rec(Double.parseDouble(arrs[1]), Double.parseDouble(arrs[2]), Double.parseDouble(arrs[3]), Double.parseDouble(arrs[4]), Color.AQUAMARINE);
		}
		if (type==2) {
			this.cir(Double.parseDouble(arrs[1]), Double.parseDouble(arrs[2]), Double.parseDouble(arrs[3]), Double.parseDouble(arrs[4]), Color.AQUAMARINE);
		}
		
	}
        br.close();
        fr.close();
};
//发送配置文件
public void send(File file, ControlClient.Receiver receiver) throws IOException{
        ArrayList<Block> blocks = new ArrayList<Block>();
        double roomwidth = 0;
        double roomlength = 0;
        //System.out.println(file.getAbsolutePath());
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        String[] arrs = null;
        if ((line = br.readLine()) != null) {    
            arrs = line.split(" ");
            roomwidth = Double.parseDouble(arrs[1]);
            roomlength = Double.parseDouble(arrs[3]);
        }
        while ((line = br.readLine()) != null) {
            arrs = line.split(" ");
            double type = Double.parseDouble(arrs[0]);
            ControlClient.BlockType btype;
            if (type == 1) {
                btype = ControlClient.BlockType.CUBE;
            } else{
                btype = ControlClient.BlockType.CYLINDER;
            }
            blocks.add(ControlClient.SetBlock(btype,
                    Double.parseDouble(arrs[1]),
                    Double.parseDouble(arrs[2]),
                    Double.parseDouble(arrs[3]),
                    Double.parseDouble(arrs[4])));
        } 
        ControlClient.SendConfigMap(receiver, roomwidth, roomlength, blocks);
        br.close();
        fr.close();
    }
//路径规划初始化
public void cal_initial_position(double x,double y) {
	cal_px_temp=x*Coeff_x+delta_x;
	cal_py_temp=Y-y*Coeff_y+delta_y;
};
//路径规划显示
public void cal_temp_position(double x,double y) {
	Line  l=new Line();
	l.setStartX(cal_px_temp);
	l.setStartY(cal_py_temp);
	cal_px_temp=x*Coeff_x+delta_x;
	cal_py_temp=Y-y*Coeff_y+delta_y;
	l.setEndX(cal_px_temp);
	l.setEndY(cal_py_temp);
	l.setStroke(Paint.valueOf("#0000FF"));
	Env.getChildren().add(l);
}
public void remove_positon() {
        if(position_tag>0){
	for(int index=position_tag;index<Env.getChildren().size();)
	{
	Env.getChildren().remove(index);
	}
        
        }
}
public void remove_all() {
        if(environ_tag>0)
	for(int index=environ_tag;index<Env.getChildren().size();)
	{
	Env.getChildren().remove(index);
	}
}
};
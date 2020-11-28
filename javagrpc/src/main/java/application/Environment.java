package application;
        
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Date;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;


public class Environment {
Group Env;
double data[][]=null;
double X;				//width of the ground
double Y;				//height of the ground
double Coeff_x;		//the coeff of x
double Coeff_y;
double delta_x;
double delta_y;
double px_temp;
double py_temp;
int posi_cir;
int posi_arc;
static int H=450;
BufferedWriter bw;
File temp; 
//max width : 600
//max height: 550
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
	Coeff_x=X/x;
	Coeff_y=Y/y;
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
	rec.setY(Y-(py-y/2)*Coeff_y+delta_y);
	rec.setArcWidth(5);
	rec.setArcHeight(5);
	rec.setWidth(Math.floor(x*Coeff_x));
	rec.setHeight(Math.floor(y*Coeff_y));
	rec.setFill(c);
	Env.getChildren().add(rec);
	bw.write("1 "+x+" "+y+" "+px+" "+py+"\n");
};
//初始位置
public void initial_position(double x,double y,double angle) {
	Circle cir = new Circle();
	px_temp=x*Coeff_x+delta_x;
	py_temp=Y-y*Coeff_y+delta_y;
	cir.setCenterX(px_temp);
	cir.setCenterY(py_temp);
	cir.setRadius(4);
	cir.setFill(Color.BLACK);
	Env.getChildren().add(cir);
	Circle cir2 = new Circle();
	cir2.setCenterX(px_temp);
	cir2.setCenterY(py_temp);
	cir2.setRadius(3);
	cir2.setFill(Color.RED);
	Env.getChildren().add(cir2);
	posi_cir=Env.getChildren().size()-1;
	
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
	Arc arc=(Arc)Env.getChildren().remove(posi_arc-1);
	cir2.setCenterX(px_temp);
	cir2.setCenterY(py_temp);
	Env.getChildren().add(cir2);
	posi_cir=Env.getChildren().size()-1;
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
public void read(File fd) throws IOException{
	FileReader fr = new FileReader(fd);
	BufferedReader br = new BufferedReader(fr);
	String line = "";
	String[] arrs = null;
	if((line = br.readLine())!=null) {
		arrs = line.split(" ");
		this.Environment_initial(Double.parseDouble(arrs[1]),Double.parseDouble(arrs[3]));
	}
	while((line = br.readLine())!=null) {
		arrs = line.split(" ");
		double type = Double.parseDouble(arrs[0]);
		if (type==1) {
			this.rec(Double.parseDouble(arrs[1]), Double.parseDouble(arrs[2]), Double.parseDouble(arrs[3]), Double.parseDouble(arrs[4]), Color.AQUAMARINE);
		}
		
	}
};
//发送配置文件
public void send() {};

}

package application;
import java.io.File;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
public class Environment {
Group Env;
int X;
int Y;
public Environment(int x,int y,Group root) {
	Env=root;
	X=x;
	Y=y;
};
//构造长方形
public void rec(double x,double y,double px,double py) {
	javafx.scene.shape.Rectangle rec = new javafx.scene.shape.Rectangle();
	rec.setX(100);
	rec.setY(400);
	rec.setWidth(100);
	rec.setHeight(200);
	Env.getChildren().add(rec);
	
};
//保存读取配置文件
public void save(File fd) {};
public void read(File fd) {};
//发送配置文件
public void send() {};

}

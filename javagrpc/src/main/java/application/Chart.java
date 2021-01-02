package application;

import javafx.scene.Group;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class Chart {
Group Char;
static LineChart<Number, Number> chart;
static NumberAxis axis_x;
static NumberAxis axis_y;
static XYChart.Series<Number, Number> px;
static XYChart.Series<Number, Number> py;
static XYChart.Series<Number, Number> vx;
static XYChart.Series<Number, Number> vy;
static XYChart.Series<Number, Number> ang;
double max_pos;
double min_pos;
double max_vel;
double min_vel;
double max_ang;
double min_ang;
public Chart(Group root) {
	Char=root;
	axis_x = new NumberAxis("time (s)",0,20,1);
	axis_y = new NumberAxis("",0,10,1);
	chart =new LineChart<>(axis_x, axis_y);
	chart.setLayoutX(620);
	chart.setLayoutY(30);
	chart.setPrefHeight(450);
	chart.setPrefWidth(550);
	chart.setAnimated(false);
	chart.setCreateSymbols(false);
	px=new XYChart.Series<Number,Number>();
	py=new XYChart.Series<Number,Number>();
	vx=new XYChart.Series<Number,Number>();
	vy=new XYChart.Series<Number,Number>();
	ang=new XYChart.Series<Number,Number>();
	px.setName("X Position");
	py.setName("Y Position");
	vx.setName("X Velosity");
	vy.setName("Y Velosity");
	ang.setName("Angle");
	Char.getChildren().add(chart);
}
//加入数据
//有新数据来的时候直接调用该函数即可
public void add_data(double t,double x,double y,double v_x,double v_y,double angle) {
	XYChart.Data<Number, Number> data1 = new XYChart.Data<>(t,x);
	px.getData().add(data1);
	XYChart.Data<Number, Number> data2 = new XYChart.Data<>(t,y);
	py.getData().add(data2);
	XYChart.Data<Number, Number> data3 = new XYChart.Data<>(t,v_x);
	vx.getData().add(data3);
	XYChart.Data<Number, Number> data4 = new XYChart.Data<>(t,v_y);
	vy.getData().add(data4);
	XYChart.Data<Number, Number> data5 = new XYChart.Data<>(t,angle);
	ang.getData().add(data5);
	if (t>20) {
		axis_x.setUpperBound((int)t+2);
	}
	if(px.getData().size()==1) {
		axis_x.setLowerBound((int)t-2);
		max_pos=Math.max(x, y);
		min_pos=Math.min(x, y);	
		max_vel=Math.max(v_x, v_y);
		min_vel=Math.min(v_x, v_y);	
		max_ang=angle;
		min_ang=angle;	
	}
	else {
		max_pos=Math.max(max_pos, x);
		max_pos=Math.max(max_pos, y);
		min_pos=Math.min(min_pos, x);	
		min_pos=Math.min(min_pos, y);
		max_vel=Math.max(max_vel, v_x);
		max_vel=Math.max(max_vel, v_y);
		min_vel=Math.min(min_vel, v_x);	
		min_vel=Math.min(min_vel, v_y);	
		max_ang=Math.max(max_ang,angle);
		min_ang=Math.min(min_ang,angle);
	}
}
//画图需要调用，此函数为控制命令
//0-画位置图; 1-画速度图; 2-画角度图; 3-清除数据
public void print_chart(int flag) {
	chart.getData().clear();
	if (flag==0) {
		chart.getData().add(px);
		chart.getData().add(py);
		axis_y.setUpperBound((int)max_pos+2);
		axis_y.setLowerBound((int)min_pos-2);
		axis_y.setLabel("Position (cm)");
		axis_y.setTickUnit(10);
		}
	if (flag==1) {
		chart.getData().add(vx);
		chart.getData().add(vy);
		axis_y.setUpperBound((int)max_vel+2);
		axis_y.setLowerBound((int)min_vel-2);
		axis_y.setLabel("Velosity (cm/s)");
		axis_y.setTickUnit(1);
		}
	if (flag==2) {
		chart.getData().add(ang);
		axis_y.setUpperBound((int)(max_ang)+5);
		axis_y.setLowerBound((int)(min_ang)-5);
		axis_y.setLabel("Angle (Degree)");
		axis_y.setTickUnit(30);
		}
	if (flag==3) {
		//double t=(double)px.getData().get(px.getData().size()-1).getXValue();
		px.getData().clear();
		py.getData().clear();
		vx.getData().clear();
		vy.getData().clear();
		ang.getData().clear();
		//axis_x.setLowerBound((int)t-2);
                axis_x.setLowerBound(0);
                axis_x.setUpperBound(20);
	}
};
}

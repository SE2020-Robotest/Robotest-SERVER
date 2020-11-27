package application;

import java.io.File;
import java.io.IOException;

import com.sun.javafx.scene.SceneEventDispatcher;

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
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;



public class Main extends Application {
	Group root = new Group();
	Environment Env=new Environment(root);
	@Override
	public void start(Stage primaryStage) {
//		try {
		Button_type b1 = new Button_type(620, 500, "配置文档");
		Button_type b2 = new Button_type(820, 500, "开始实验");
		Button_type b3 = new Button_type(620, 600, "结束实验");
		Button_type b4 = new Button_type(820, 600, "日志保存");
		Button_type b5 = new Button_type(1020, 500, "保存文档");
		Button_type b6 = new Button_type(1020, 600, "构建环境");
//		Env.Environment_initial(10, 20);
//		Env.rec(3, 3,5,5,Color.AQUAMARINE);
//		Env.initial_position(5, 12,0);
//		Env.temp_position(5, 7,30);
//		Env.temp_position(7, 16,90);
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
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
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
				System.out.println("push");
				// TODO Auto-generated method stub
				
			}
		});
		
		root.getChildren().add(b1.button);
		root.getChildren().add(b2.button);
		root.getChildren().add(b3.button);
		root.getChildren().add(b4.button);
		root.getChildren().add(b5.button);
		root.getChildren().add(b6.button);
		
		TextField text=new TextField();
		Tooltip tip2 = new Tooltip("测试文本框");
		tip2.setFont(Font.font(40));
		text.setTooltip(tip2);
		text.setLayoutX(30);
		text.setLayoutY(410);
		text.setPrefWidth(550);
		text.setPrefHeight(350);
		
		text.textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable, String oldvalue, String newvalue) {
				text.deleteText(0,oldvalue.length());
				text.appendText(newvalue);
				// TODO Auto-generated method stub
				
			}});
		root.getChildren().add(text);
//		test.setOnKeyPressed(new EventHandler<KeyEvent>(){
//
//			@Override
//			public void handle(KeyEvent event) {
//				text.appendText(event.getCode().getName());
//				
//				// TODO Auto-generated method stub
//				
//			}
//			
//		});
		
		
		Scene scene = new Scene(root,1200,800);
		System.out.println(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("demo");
		primaryStage.show();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
	}
	public void end() throws IOException {
		Env.temp.delete();
		// TODO Auto-generated method stub
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

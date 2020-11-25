package application;

import com.sun.javafx.scene.SceneEventDispatcher;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
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
import javafx.scene.text.Font;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
//		try {
		Button_type b1 = new Button_type(620, 500, "配置文档");
		Button_type b2 = new Button_type(820, 500, "开始实验");
		Button_type b3 = new Button_type(620, 600, "结束实验");
		Button_type b4 = new Button_type(820, 600, "日志保存");
		Group root = new Group();
		root.getChildren().add(b1.button);
		root.getChildren().add(b2.button);
		root.getChildren().add(b3.button);
		root.getChildren().add(b4.button);
		
		TextField text=new TextField();
		Tooltip tip2 = new Tooltip("测试文本框");
		tip2.setFont(Font.font(40));
		text.setTooltip(tip2);
		text.setLayoutX(30);
		text.setLayoutY(410);
		text.setPrefWidth(550);
		text.setPrefHeight(350);
		root.getChildren().add(text);
		
		TextField test=new TextField();
		
		Tooltip tip = new Tooltip("测试输入框");
		tip.setFont(Font.font(40));
		test.setTooltip(tip);
		test.setLayoutX(30);
		test.setLayoutY(40);
		test.setPrefWidth(550);
		test.setPrefHeight(350);
		test.textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable, String oldvalue, String newvalue) {
				text.deleteText(0,oldvalue.length());
				text.appendText(newvalue);
				// TODO Auto-generated method stub
				
			}});
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
		
		
        b1.button.setOnAction(action -> {
            text.appendText(test.getText());
        });
    	
    	
		root.getChildren().add(test);
		System.out.println(root.getChildren());
		
		Environment Env=new Environment(100, 200,root);
		Env.rec(0, 0, 0, 0);
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
	
	public static void main(String[] args) {
		launch(args);
	}
}

package application;
import javafx.scene.control.Button;
import javafx.scene.text.Font;

public class Button_type extends Button {
public Button button;
public Button_type(int x, int y, String arg0) {
button=new Button();
button.setLayoutX(x);
button.setLayoutY(y);
button.setText(arg0);
button.setPrefWidth(160);
button.setPrefHeight(60);
button.setFont(Font.font("sans-serif",30));
// TODO Auto-generated constructor stub
}
};


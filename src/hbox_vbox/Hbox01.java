package hbox_vbox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Hbox01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		//HBox hb = new HBox();//가로 정렬
		VBox hb = new VBox();//세로 정렬
		hb.setSpacing(10);//사이간격
		hb.getChildren().addAll(new Button("버튼"), new Label("라벨"),new Button("버튼22"));
		arg0.setScene(new Scene(hb,300,300));
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}

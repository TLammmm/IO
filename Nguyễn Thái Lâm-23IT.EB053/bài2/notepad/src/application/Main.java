package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		
			 FXMLLoader loader = new FXMLLoader();
		        loader.setLocation(Main.class.getResource("notepad.fxml"));
			        Parent root = loader.load();
		        primaryStage.setMinHeight(400);
		        primaryStage.setMinWidth(600);
		        Scene scene = new Scene(root);
		        primaryStage.setTitle("notepad");
		        primaryStage.setScene(scene);
		        primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

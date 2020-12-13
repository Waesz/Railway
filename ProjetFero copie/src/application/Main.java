package application;
	

	


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;


/**
 * @author lry41 Geoffrey leroy
 * @version 1.0
 * @return erreur ou lance la page javaFx
 * 
 */
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
			//Parent root = FXMLLoader.load(getClass().getResource("MediaPlay.fxml"));
			//Parent root = FXMLLoader.load(getClass().getResource("Planning.fxml"));
			//Parent root = FXMLLoader.load(getClass().getResource("InterfaceLogin.fxml")); //changer les pages pour mes test
			Scene scene = new Scene(root);
			primaryStage.setTitle("Home"); 
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}

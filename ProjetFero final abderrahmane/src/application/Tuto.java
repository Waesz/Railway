package application;

import java.io.File;

import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import javafx.stage.Stage;

public class Tuto {

	
	    public void Tutoriel(Stage primaryStage) { 
	        final File file = new File("C:\\adt-bundle-windows-x86_64-20140321\\sdk\\extras\\android\\support\\samples\\Support4Demos\\res\\raw\\videoviewdemo.mp4"); 
	        final Media media = new Media(file.toURI().toString()); 
	        final MediaPlayer mediaPlayer = new MediaPlayer(media); 
	        final MediaView mediaView = new MediaView(mediaPlayer); 
	        final StackPane root = new StackPane(); 
	        root.getChildren().setAll(mediaView); 
	        final Scene scene = new Scene(root, 350, 300); 
	        primaryStage.setTitle("Test de lecture de vidéo"); 
	        primaryStage.setScene(scene); 
	        primaryStage.show(); 
	        mediaView.fitWidthProperty().bind(root.widthProperty()); 
	        mediaView.fitHeightProperty().bind(root.heightProperty()); 
	        mediaPlayer.play(); 
	    } 
	  
	    
	}



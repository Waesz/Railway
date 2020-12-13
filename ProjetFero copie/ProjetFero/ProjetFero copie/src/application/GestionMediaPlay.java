package application;


import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class GestionMediaPlay implements Initializable{

	@FXML
	private MediaView mediaView;
	private MediaPlayer mediaPlayer;
	private Media media;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		String path=new File("vedio/tutoriel.mp4").getAbsolutePath();
	}

}
   
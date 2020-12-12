package application;


import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Modality;
import javafx.stage.Stage;

public class HomeGestion implements Initializable{

	
	/**
	 * @author lry41 
	 * @version 1.0
	 * @return Lance la page html qui est le tuto
	 * 
	 */

    public void OuvertureTutoriel(ActionEvent event) throws IOException, URISyntaxException { 
       
    	/*Parent root = FXMLLoader.load(getClass().getResource("MediaPlay.fxml"));
		
		Stage stage = new Stage(); 
		stage.initModality(Modality.APPLICATION_MODAL); 
		stage.setOpacity(1); 
		stage.setTitle("Tutoriel"); 
		
		stage.setScene(new Scene(root, 700, 500)); 
		stage.showAndWait(); */
    	
    	  Desktop.getDesktop().browse(new URI("http://localhost:8888/Aide.php"));
    	
   } 
    
    /**
	 * @author lry41 
	 * @version 1.0
	 * @return lance et créer la page permettant de se connecter
	 * 
	 */
    public void OuvertureLogin(ActionEvent event)throws IOException{
    	Parent root = FXMLLoader.load(getClass().getResource("InterfaceLogin.fxml"));
    		
    		Stage stage = new Stage(); 
    		stage.initModality(Modality.APPLICATION_MODAL); 
    		stage.setOpacity(1); 
    		stage.setTitle("Connection RailWay"); 
    		
    		stage.setScene(new Scene(root, 700, 500)); 
    		stage.showAndWait(); 
    		
    	}
	
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}

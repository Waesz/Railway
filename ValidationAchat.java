package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import javafx.stage.Modality;
import javafx.stage.Stage;

public class ValidationAchat implements Initializable {
	@FXML private Label VilleA;
	@FXML private Label VilleD;
	@FXML private Label HeureD;
	@FXML private Label Date;
	//il faut ajouter les requetes sql pour afficher les labels 
	
	 public void OuvertureVali(ActionEvent event) throws IOException{
		 Parent root = FXMLLoader.load(getClass().getResource("FinalValid.fxml"));
 		
 		Stage stage = new Stage(); 
 		stage.initModality(Modality.APPLICATION_MODAL); 
 		stage.setOpacity(1); 
 		stage.setTitle("Validation"); 
 		
 		stage.setScene(new Scene(root, 700, 500)); 
 		stage.showAndWait(); 
	 }
	 public void Modifier(ActionEvent event) throws IOException{
		 Parent root = FXMLLoader.load(getClass().getResource("Planning.fxml"));
 		
 		Stage stage = new Stage(); 
 		stage.initModality(Modality.APPLICATION_MODAL); 
 		stage.setOpacity(1); 
 		stage.setTitle("Planning"); 
 		
 		stage.setScene(new Scene(root, 700, 500)); 
 		stage.showAndWait(); 
	 }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}

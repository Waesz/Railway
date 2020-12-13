
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

public class AdminPage extends LoginGestion  implements Initializable {
	@FXML
    private Label userCo;
	
	public void OuvertureRese(ActionEvent event) throws IOException { 
	       
    	Parent root = FXMLLoader.load(getClass().getResource("Planning.fxml"));
		
		Stage stage = new Stage(); 
		stage.initModality(Modality.APPLICATION_MODAL); 
		stage.setOpacity(1); 
		stage.setTitle("Login"); 
		
		stage.setScene(new Scene(root, 700, 500)); 
		stage.showAndWait(); 
   }

	
	public void OuvertureAccu(ActionEvent event) throws IOException { 
	       
    	Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
		
		Stage stage = new Stage(); 
		stage.initModality(Modality.APPLICATION_MODAL); 
		stage.setOpacity(1); 
		stage.setTitle("home"); 
		
		stage.setScene(new Scene(root, 700, 500)); 
		stage.showAndWait(); 
   }
/*public static String addNom(User a) {
	System.out.println(""+a.getPseudo()+"");
	return "a.getPseudo()";
	
}*/
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		//userCo.setText(""+getNom()+"");
		userCo.setText(""+getNom()+"");
		
			} 
	public   void addTrain(ActionEvent event) throws IOException {
		   
    	Parent root = FXMLLoader.load(getClass().getResource("addTrain.fxml"));
		
		Stage stage = new Stage(); 
		stage.initModality(Modality.APPLICATION_MODAL); 
		stage.setOpacity(1); 
		stage.setTitle("addTrain"); 
		
		stage.setScene(new Scene(root, 700, 500)); 
		stage.showAndWait(); 
    }
	
		
}
						
					
		
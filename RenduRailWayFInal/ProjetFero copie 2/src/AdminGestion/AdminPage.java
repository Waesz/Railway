
package AdminGestion;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import ClientGestion.LoginGestion;
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
	
	 

	/**
	 * permet de retourner a la page home principale
	 * @author Mouad,abderrahmne
	 * @param event 
	 * @throws SQLException
	 * @version 1.0
	 */
	
	public void OuvertureAccu(ActionEvent event) throws IOException { 
	       
    	Parent root = FXMLLoader.load(getClass().getResource("/application/Home.fxml"));
		
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
		//userCo.setText(""+getNom()+"");
		
			} 
	/**
	 * 
	 * envoi a la page qui permet lajout de train
	 * 
	 * @author Mouad,abderrahmne
	 * @param event 
	 * @throws SQLException
	 * @version 1.0
	 * 
	 */
	
	public  void addTrain(ActionEvent event) throws IOException {
		   
    	Parent root = FXMLLoader.load(getClass().getResource("/application/addTrain.fxml"));
		
		Stage stage = new Stage(); 
		stage.initModality(Modality.APPLICATION_MODAL); 
		stage.setOpacity(1); 
		stage.setTitle("addTrain"); 
		
		stage.setScene(new Scene(root, 700, 500)); 
		stage.showAndWait(); 
    }
	/**
	 * envoi vers la page qui permet lajout dadmin
	 * @author Mouad,abderrahmne
	 * @param event 
	 * @throws SQLException
	 * @version 1.0
	 *   
	 */
	
	  @FXML
	  public void addAdmin(ActionEvent event) throws IOException {

	    
 
		  Parent root = FXMLLoader.load(getClass().getResource("/application/AdminRegister.fxml"));
			
			Stage stage = new Stage(); 
			stage.initModality(Modality.APPLICATION_MODAL); 
			stage.setOpacity(1); 
			stage.setTitle("AdminRegister"); 
			
			stage.setScene(new Scene(root, 700, 500)); 
			stage.showAndWait(); 
	    }
	  @FXML
	    void addLigne(ActionEvent event) throws IOException {
	    	

			  Parent root = FXMLLoader.load(getClass().getResource("/application/ajoutLigne.fxml"));
				
				Stage stage = new Stage(); 
				stage.initModality(Modality.APPLICATION_MODAL); 
				stage.setOpacity(1); 
				stage.setTitle("addLigne"); 
				
				stage.setScene(new Scene(root, 700, 500)); 
				stage.showAndWait(); 
	    }


		
}
						
					
		
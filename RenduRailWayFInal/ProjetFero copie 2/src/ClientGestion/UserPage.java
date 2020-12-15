package ClientGestion; 
 
import java.io.IOException; 
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle; 
 
import javafx.event.ActionEvent; 
import javafx.fxml.FXMLLoader; 
import javafx.fxml.Initializable; 
import javafx.scene.Parent; 
import javafx.scene.Scene; 
import javafx.stage.Modality; 
import javafx.stage.Stage; 
 
public class UserPage implements Initializable { 
	/**
	 * permet d'ouvrir le planning
	 * @author Mostapha
	 * @param event 
	 * @throws SQLException
	 * @version 1.0
	 */
	
	public void OuvertureRese(ActionEvent event) throws IOException {  
	        
    	Parent root = FXMLLoader.load(getClass().getResource("/application/Planning.fxml")); 
		 
		Stage stage = new Stage();  
		stage.initModality(Modality.APPLICATION_MODAL);  
		stage.setOpacity(1);  
		stage.setTitle("Login");  
		 
		stage.setScene(new Scene(root, 700, 500));  
		stage.showAndWait();  
   } 
 
	/**
	 * permet d'ouvrir le Home principale
	 * @author Mostapha
	 * @param event 
	 * @throws SQLException
	 * @version 1.0
	 */
	public void OuvertureAccu(ActionEvent event) throws IOException {  
	        
    	Parent root = FXMLLoader.load(getClass().getResource("/application/Home.fxml")); 
		 
		Stage stage = new Stage();  
		stage.initModality(Modality.APPLICATION_MODAL);  
		stage.setOpacity(1);  
		stage.setTitle("Page d'utilisateur");  
		 
		stage.setScene(new Scene(root, 700, 500));  
		stage.showAndWait();  
   } 
 
	@Override 
	public void initialize(URL arg0, ResourceBundle arg1) { 
		// TODO Auto-generated method stub 
		 
	}  
} 

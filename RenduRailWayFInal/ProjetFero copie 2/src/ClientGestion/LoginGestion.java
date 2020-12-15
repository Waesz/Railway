package ClientGestion;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import ConnectionBdFero.ConnectionBdFero;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class LoginGestion implements Initializable{

	@FXML private TextField emailCo;
	@FXML private PasswordField passwordCo;
	@FXML private Label etatCo;
	/*String nom1=GetNom(null);
	
	
	public  String GetNom(ActionEvent event) {
		Connection con=ConnectionBdFero.connect();
		PreparedStatement stat = null;
		ResultSet rs= null;
		
		String sql="SELECT * FROM Personne2 WHERE email = ? AND mdp = ?";
				try {
					stat = con.prepareStatement(sql);
					
					stat.setString(1, emailCo.getText().toString()); 
					stat.setString(2, passwordCo.getText().toString()); //on prend les données inseres dans les champs 
					
					rs=stat.executeQuery();
	
						
							String nom =rs.getString("nom");
							return nom;
						
							
						
						
					}catch 
					(Exception e ){
					
						
					
						
					return nom1;
					}
				
		
	}*/

	/**
	 * erreur ou verifie donnée dans la bd pour accés user et acceder au planning ou a la page admin
	 * @author lry41=geoffrey,wassim
	 * @param event 
	 * @throws SQLException
	 * @version 1.0
	 *  
	 */
	
	@FXML
	public  void login(ActionEvent event) throws SQLException {
		
		Connection con=ConnectionBdFero.connect();
		PreparedStatement stat = null;
		ResultSet rs= null;
		
		String sql="SELECT * FROM Personne2 WHERE email = ? AND mdp = ?";
				try {
					stat = con.prepareStatement(sql);
					
					stat.setString(1, emailCo.getText().toString()); 
					stat.setString(2, passwordCo.getText().toString()); //on prend les données inseres dans les champs 
					
					rs=stat.executeQuery();
					
				
					
					if(rs.next()) {
						etatCo.setText("connecté");
						
						String nom =rs.getString("nom");
						double solde=rs.getDouble("Solde");
						Boolean admin=rs.getBoolean("admin");
						//String email =rs.getString("email");
						//@SuppressWarnings("unused")
						//String emailCompte=emailCo.getText().toString();
						
						//OuverturePlanning(event);//appelle la methode pour ouvrir le planning accessible par un utilisateur dans la BD
						
						
						Client a = new Client(nom,solde);
						
					if(admin==true) { // verifie si la personne a un compte admin ou non
						GestionAdmin(event);
						
						
						
					}else {// verifie si la personne a un compte admin ou non
						
						Alert alert = new Alert(AlertType.INFORMATION);
						
				        alert.setTitle("RailWay");
				 
				         alert.setHeaderText("Welcome");
				         
				        alert.setContentText(""+a.nom+" ,votre solde est de : "+a.solde +"e");
				       
				        alert.showAndWait();
				       
				        //pop up infos client
				        
						
						PlanningGestion pg= new PlanningGestion();
							pg.AddNom(a);
							OuverturePlanning(event);
							//pg.InfosUser(event ,a);
							
					}
						
						
						
					}
					else {
						etatCo.setText("Votre mail ou votre mot de passe est incorrect"); //on inidque les problemes a l'utilisateur que ces identifiants sont incorrect
					}
				}catch 
					(Exception e ){
					
					}
				}
		
	


	

	/**
	 * Lance la page admin
	 * @author lry41=geoffrey 
	 * @param event 
	 * @throws SQLException
	 * @version 1.0
	 *
	 **/

	private void GestionAdmin(ActionEvent event) throws IOException {
		// TODO Auto-generated method stub
		
		
		Parent root = FXMLLoader.load(getClass().getResource("/application/AdminPage.fxml"));
		
		Stage stage = new Stage(); 
		stage.initModality(Modality.APPLICATION_MODAL); 
		stage.setOpacity(1); 
		//stage.setTitle(nom); 
		stage.setScene(new Scene(root, 700, 500)); 
		stage.showAndWait(); 
		
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Ouverture du planning des trains 
	 * @author lry41=geoffrey
	 * @param event 
	 * @throws SQLException
	 * @version 1.0
	 * @param nom 
	 * 
	 * 
	 */	
public void OuverturePlanning(ActionEvent event)throws IOException{
Parent root = FXMLLoader.load(getClass().getResource("/application/UserPage.fxml"));
	
	Stage stage = new Stage(); 
	stage.initModality(Modality.APPLICATION_MODAL); 
	stage.setOpacity(1); 
	//stage.setTitle(nom); 
	stage.setScene(new Scene(root, 700, 500)); 
	stage.showAndWait(); 
	
}
	
/**
 *  ouverture page creation compte client
 * @author lry41,wassim
 * @param event 
 * @throws SQLException
 * @version 1.0
 * 
 */
public void OuvertureRegister (ActionEvent event) throws IOException{
	Parent root = FXMLLoader.load(getClass().getResource("/application/Register.fxml"));
	
	Stage stage = new Stage(); 
	stage.initModality(Modality.APPLICATION_MODAL); 
	stage.setOpacity(1); 
	stage.setTitle("Inscription RailWay"); 
	stage.setScene(new Scene(root, 700, 500)); 
	stage.showAndWait(); 
	
	 //primaryStage.close();
}

}
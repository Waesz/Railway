package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import ConnectionBdFero.ConnectionBdFero;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class LoginGestion   implements  Initializable{

	@FXML private TextField emailCo;
	@FXML private PasswordField passwordCo;
	@FXML private Label etatCo;
	private String nom =null ;
	 
	
	 

	/**
	 * @author lry41
	 * @param event 
	 * @throws SQLException
	 * @version 1.0
	 * @return erreur ou verifie donnée dans la bd pour accés user et acceder au planning
	 
	 */
	public String getNom() {
		return nom;
	}





	public void setNom(String nom) {
		this.nom = getNom();
	}
	@FXML
	public void login(ActionEvent event) throws SQLException{
		Connection con=ConnectionBdFero.connect();
		PreparedStatement stat = null;
		ResultSet rs= null;
		
		FXMLLoader Loader =new FXMLLoader() ; 
		Loader.setLocation(getClass().getResource("UserPage"));
		
		String sql="SELECT * FROM Personne2 WHERE email = ? AND mdp = ?";
				try {
					stat = con.prepareStatement(sql);
					
					stat.setString(1, emailCo.getText().toString()); 
					stat.setString(2, passwordCo.getText().toString()); //on prend les données inseres dans les champs 
					
					rs=stat.executeQuery();
					
					if(rs.next()) {
						//etatCo.setText("connecté");
						
						//@SuppressWarnings("unused")
						//String emailCompte=emailCo.getText().toString();
						String prenom =rs.getString("nom");
						setNom(prenom);
						
						//String mot =rs.getString("nom");
						//User user =new User(mot);
						//ModelePlanning.addNom(user);
						
						OuvertureUser(event,getNom());
						
						
						
						
						
						
					}
					else {
						etatCo.setText("Votre mail ou votre mot de passe est incorrect"); //on inidque les problemes a l'utilisateur que ces identifiants sont incorrect
					}
				}catch 
					(Exception e ){
					
					}

				//appelle la methode pour ouvrir le planning accessible par un utilisateur dans la BD
			
				}
		
	
	


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * @author lry41
	 * @param event 
	 * @throws SQLException
	 * @version 1.0
	 * @param name 
	 * @return Ouverture du planning des trains 
	 * 
	 */	
public void OuvertureUser(ActionEvent event, String name)throws IOException{
	
	Stage stage = new Stage();
	Parent root = FXMLLoader.load(getClass().getResource("UserPage.fxml"));

	 
	stage.initModality(Modality.APPLICATION_MODAL); 
	stage.setOpacity(1); 
	stage.setTitle(name); 
	stage.setScene(new Scene(root, 700, 500)); 
	stage.showAndWait(); 
	

	
}
	
/**
 * @author lry41
 * @param event 
 * @throws SQLException
 * @version 1.0
 * @return Si pas de compte ouverture creation compte
 */
public void OuvertureRegister (ActionEvent event) throws IOException{
	Parent root = FXMLLoader.load(getClass().getResource("Register.fxml"));
	
	Stage stage = new Stage(); 
	stage.initModality(Modality.APPLICATION_MODAL); 
	stage.setOpacity(1); 
	stage.setTitle("Inscription RailWay"); 
	stage.setScene(new Scene(root, 700, 500)); 
	stage.showAndWait(); 
	
	 //primaryStage.close();
}
@FXML
void admin(ActionEvent event) throws IOException {
Parent root = FXMLLoader.load(getClass().getResource("loginAdmin.fxml"));
	
	Stage stage = new Stage(); 
	stage.initModality(Modality.APPLICATION_MODAL); 
	stage.setOpacity(1); 
	stage.setTitle("Inscription RailWay"); 
	stage.setScene(new Scene(root, 700, 500)); 
	stage.showAndWait(); 
	
}






}









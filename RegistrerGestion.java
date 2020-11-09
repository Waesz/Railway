package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import ConnectionBdFero.ConnectionBdFero;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegistrerGestion implements Initializable{

	@FXML private TextField nom;
	@FXML private TextField prenom;
	@FXML private TextField email;
	@FXML private PasswordField password;
	@FXML private PasswordField passwordV;
	@FXML private Label erreur;
	
	
	
	
	@FXML
	public void Inscription(ActionEvent event) throws SQLException {
		
		
		
		 String nomS= nom.getText().toString();
		 String prenomS= prenom.getText().toString();
		 String emailS= email.getText().toString();
		 String passwordS= password.getText().toString();
		 String passwordVS= passwordV.getText().toString();
		 
		 	
		
		
		
		
		
		//if(nomS!=null && prenomS!=null &&passwordS!=null && passwordVS!=null ) {
			
			
		if ( nomS.matches("[a-zA-Z]+")) {
			
			
			if ( prenomS.matches("[a-zA-Z]+")) {
				
				// faire les prenoms composé 					
			
				if (  passwordS.length()>=8 && passwordS.length()<=25) {
					
					if(passwordS.equals(passwordVS)) {
					
				
					//if ( emailS.matches("[a-z0-9]+@[a-z0-9]+\\.[a-z]{2,4}$")) {
						
						
							//if(passwordS.matches("")) //Mettre specification mdp pour admin
									//{
							
						System.out.println(nomS);
						System.out.println(prenomS);
						System.out.println(emailS);
						System.out.println(passwordS);
						System.out.println(passwordVS);
							
						
						Connection con=ConnectionBdFero.connect();
						PreparedStatement stat = null;
						ResultSet rs= null;
						
							String sql="INSERT INTO Personne (nom,prénom,mdp,email) VALUES (?,?,?,?)";
									try {
										stat =con.prepareStatement(sql);
										stat.setString(1,nomS); 
										stat.setString(2, prenomS);
										stat.setString(3, passwordS); 
										stat.setString(4, emailS);
										
										
										rs=stat.executeQuery();
										if(rs.next()) {
											erreur.setText("Inscription réussie");
										}
										else {
											erreur.setText("problème systeme");
										}
									}catch 
										(Exception e ){
											
										}
									
	
			
							
		
							
			   /* }else {
								
						erreur.setText("Désolé ! Veuillez renseigne un email correct ");
			}*/
				}else {
						erreur.setText("Désolé! Vos mots de passes renseignées ne sont pas identiques");
			}
				}else {
						erreur.setText("Désolé ! Veuillez renseigne un mdp de taille comprise entre 8 et 25");
			}
				
				}else {
						erreur.setText("Désolé ! Veuillez renseigne prénom composé uniquement de lettre");
			}
				}else {
				
						erreur.setText("Désolé ! Veuillez renseigne un nom composé uniquement de lettre ");		
					

			}
			/*}else {
						erreur.setText("Désolé ! Veuillez remplir tous les champs pour créer votre compte");	
					}
		
		*/
	
		
}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}






}
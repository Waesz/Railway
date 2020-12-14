package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import ConnectionBdFero.ConnectionBdFero;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class AdminRegister implements Initializable{
	 @FXML
	    private TextField prenomAd;

	    @FXML
	    private PasswordField passwordVad;

	    @FXML
	    private TextField emailAd;

	    @FXML
	    private PasswordField passwordAd;

	    @FXML
	    private TextField nomAd;

	    @FXML
	    private Label erreurAd;
	
	/**
	 * @author lry41
	 * @param event 
	 * @throws SQLException
	 * @version 1.0
	 * @return erreur ou envoi dans la bd 
	 */
	
	@FXML
	public void Inscription(ActionEvent event) throws SQLException {

		 String nomS= nomAd.getText().toString();
		 String prenomS= prenomAd.getText().toString();
		 String emailS= emailAd.getText().toString();
		 String passwordS= passwordAd.getText().toString();
		 String passwordVS= passwordVad.getText().toString();
		 
		 	//on associe les valeurs des champs de texte a des string pour mieu manipuler les variables

		
		
		 	
		
		
		//if(nomS!=null && prenomS!=null &&passwordS!=null && passwordVS!=null ) {
			
			
		if ( nomS.matches("[a-zA-Z]+")) { //on test si l'utilisateur rentre bien que des lettres
			
			
			if ( prenomS.matches("[a-zA-Z]+")) { //on test si l'utilisateur rentre bien que des lettres
				
				// faire les prenoms composé 					
			
				if (  passwordS.length()>=8 && passwordS.length()<=25) { //on test si l'utilisateur rentre bien 8 caractere pour la securité et MAX 25
					
					if(passwordS.equals(passwordVS)) { //on verifie si les 2 mdp sont bien identiques 
					
				
					if ( emailS.matches("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)+$")) {
						
						
							//if(passwordS.matches("")) //Mettre specification mdp pour admin 
									//{
						
						
						
							
						/*System.out.println(nomS);
						System.out.println(prenomS);
						System.out.println(emailS);
						System.out.println(passwordS);
						System.out.println(passwordVS);*/
						//pour les test
							
						
						   	

						Connection con=ConnectionBdFero.connect();
						
						//appelle de la methode dans la classe ConnectionBdFero pour retourner la co
					
						   try {
						     
						      Statement INSCRIPTION = con.createStatement();
						      INSCRIPTION.executeUpdate("INSERT INTO PERSONNE2 (nom,pr�nom,mdp,email,admin) VALUES ('"+nomS+"','"+prenomS+"','"+passwordS+"','"+emailS+"','1')");//encapsulation des variables dans la requete
						     
						      //System.out.println("utilisateur créer"); //pour les test
						    erreurAd.setText("Bienvenue ! Votre inscription a été un succés,vous pouvez maintenant vous connectez et accèder à votre espace personnelle! ");
						      
						   } catch (Exception e) {
						      e.printStackTrace();
						     
						   }
									
									  
									 
									   
								   
								 
									
							
		
							
			   }else {
								 	
						erreurAd.setText("Désolé ! Veuillez renseigne un email correct ");
			}
				}else {
						erreurAd.setText("Désolé! Vos mots de passes renseignées ne sont pas identiques");
			}
				}else {
						erreurAd.setText("Désolé ! Veuillez renseigne un mdp de taille comprise entre 8 et 25");
			}
				
				}else {
						erreurAd.setText("Désolé ! Veuillez renseigne prénom composé uniquement de lettre");
			}
				}else {
				
						erreurAd.setText("Désolé ! Veuillez renseigne un nom composé uniquement de lettre ");		
					

			}
			/*}else {
						erreur.setText("Désolé ! Veuillez remplir tous les champs pour créer votre compte");	
					}
		
		*/
	
		
}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}}







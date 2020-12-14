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

public class addTrain implements Initializable{

	@FXML
    private TextField cout;

    @FXML
    private TextField nom;

    @FXML
    private Label erreur;

    @FXML
    private TextField place;

	
	
	/**
	 * @author lry41
	 * @param event 
	 * @throws SQLException
	 * @version 1.0
	 * @return erreur ou envoi dans la bd
	 */
	
	@FXML
	public void addTrain(ActionEvent event) throws SQLException {

		 String nomT= nom.getText().toString();
		 String coutT= cout.getText();
		 String placeT= place.getText();
		 int kilometrage= 0 ;
		 

		 	//on associe les valeurs des champs de texte a des string pour mieux manipuler les variables

		
		 if ( nomT.matches("[_a-zA-Z0-9]+")) { //on test si l'utilisateur rentre bien que des lettres
				
				
				if ( coutT.matches("[0-9]")) { //on test si l'utilisateur rentre bien que des chifres 
					
					// faire les prenoms composé 					
				
					if (  placeT.matches("[0-9]")) { //on test si l'utilisateur rentre bien 8 caractere pour la securité et MAX 25
		
		
		
		
		 Connection con=ConnectionBdFero.connect();
		 	PreparedStatement stat = null;
			ResultSet rs= null;
			
		 String sql="SELECT * FROM train WHERE nom_train = ? ";
			try {
				stat = con.prepareStatement(sql);
				
				stat.setString(1, nomT); 
				 //on prend les donn�es inseres dans les champs 
				
				rs=stat.executeQuery();
				
				if(!rs.next()) {
		      Statement INSCRIPTION = con.createStatement();
		      INSCRIPTION.executeUpdate("INSERT INTO train (nom_train,cout_annuel,total_place,kilometrage) VALUES ('"+nomT+"','"+coutT+"','"+placeT+"','"+kilometrage+"')"); //encapsulation des variables dans la requete
		     
		   
		    erreur.setText("Le nouveau train a �t� ajout�" );
		      
				}else {
					erreur.setText("le train existe d�ja ");
				}
				} catch (Exception e) {
		      e.printStackTrace();
		     
		   }
			
									  
									 
									   
					 }else {	
							
							erreur.setText("Désolé! Veuillez saisir que des chifres pour le nombre de places ");
				}
					}else {
							erreur.setText("Désolé! Veuillez saisir que des chifres pour le cout ");
				}
					}else {
							erreur.setText("Désolé! Veuillez saisir que des chifres et des lettres pour le nom ");
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







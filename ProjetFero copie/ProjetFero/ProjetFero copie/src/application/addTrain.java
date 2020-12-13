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
		 int coutT= Integer.parseInt(cout.getText());
		 int placeT= Integer.parseInt(place.getText());
		 int kilometrage= 0 ;
		 

		 	//on associe les valeurs des champs de texte a des string pour mieux manipuler les variables

		
		
		
		
		
		
		 Connection con=ConnectionBdFero.connect();
		 	PreparedStatement stat = null;
			ResultSet rs= null;
			
		 String sql="SELECT * FROM train WHERE nom_train = ? ";
			try {
				stat = con.prepareStatement(sql);
				
				stat.setString(1, "biha"); 
				 //on prend les données inseres dans les champs 
				
				rs=stat.executeQuery();
				
				if(!rs.next()) {
		      Statement INSCRIPTION = con.createStatement();
		      INSCRIPTION.executeUpdate("INSERT INTO train (nom_train,cout_annuel,total_place,kilometrage) VALUES ('"+nomT+"','"+coutT+"','"+placeT+"','"+kilometrage+"')"); //encapsulation des variables dans la requete
		     
		   
		    erreur.setText("Le nouveau train a été ajouté" );
		      
				}else {
					erreur.setText("erreur");
				}
				} catch (Exception e) {
		      e.printStackTrace();
		     
		   }
									  
									 
									   
								   
								 
									
							
		
							
			
			/*}else {
						erreur.setText("DÃ©solÃ© ! Veuillez remplir tous les champs pour crÃ©er votre compte");	
					}
		
		*/
	
		
}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}}







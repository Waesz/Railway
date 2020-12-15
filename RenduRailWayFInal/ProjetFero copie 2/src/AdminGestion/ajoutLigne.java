package AdminGestion;


import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import ConnectionBdFero.ConnectionBdFero;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;




/**
 * gere la page ajoutLigne
 * @author Mouad,abderrahmne
 * @version 1.0
 *   
 */


public class ajoutLigne implements Initializable{
	
	
	
	
	
	
	
	
	


	
	 
	 
	 
	 @FXML
	    private TableView<TrainsL> trains;

	    @FXML
	    private TableColumn<TrainsL, String> idTrain;

	    @FXML
	    private TableColumn<TrainsL, String> train;

	    @FXML
	    private TableColumn<TrainsL, String> nb_place;
		ObservableList<TrainsL>listT=FXCollections.observableArrayList();

	    @FXML
	    private TableView<garesL> gares;

	    @FXML
	    private TableColumn<garesL, String> ville;

	    @FXML
	    private TableColumn<garesL, String> nom_gare;
		ObservableList<garesL>listG=FXCollections.observableArrayList();
		 @FXML
		    private TextField nom_ligne;

		    @FXML
		    private TextField gare_depL;

		    @FXML
		    private TextField gare_arrL;

		    @FXML
		    private TextField date_arrivé;

		    @FXML
		    private TextField date_dep;

		    @FXML
		    private TextField distance;

		    @FXML
		    private TextField prix;

		    @FXML
		    private TextField id_train;

		    @FXML
		    private TextField place_dispo;
		    @FXML
		    private Label erreur1;




/**
 * @author aberamane , Mouad
 * @version 1.0
 * @return planning javafx avec les donnÃ©es de la Bd
 */
public void initialize(URL arg0, ResourceBundle arg1) {
	
	
	
	idTrain.setCellValueFactory(new PropertyValueFactory<>("idTrain"));
	nb_place.setCellValueFactory(new PropertyValueFactory<>("nb_train"));
	train.setCellValueFactory(new PropertyValueFactory<>("train"));
	
	nom_gare.setCellValueFactory(new PropertyValueFactory<>("nom_gare"));

	ville.setCellValueFactory(new PropertyValueFactory<>("ville"));

	//on affecte les cellules du tableau
	try {
		
	
	Connection con=ConnectionBdFero.connect();
	
	 ResultSet rs= con.createStatement().executeQuery(" SELECT * FROM train " ); //Resolu
	 
	ResultSet rs2= con.createStatement().executeQuery("SELECT * FROM gare " ); //Resolu
	 
	while(rs.next()&&rs2.next()){//boucle tant que des donnÃ©es existe on rentre les donnÃ©es
		
		
		listT.add(new TrainsL(rs.getInt("idtrain") , rs.getString("nom_train"),rs.getInt("total_place")));
		
		
		
		listG.add(new garesL(rs2.getInt("idgare"),rs2.getString("nom_gare")));
	}
	
	
	
	
	
	}
	catch(Exception e) {
		//a faire 
	}
	
	
	trains.setItems(listT); //on met la liste ListP dans le planning de java fx 
	gares.setItems(listG);
}

@FXML
void AddLigne(ActionEvent event) {





String ligne_name=nom_ligne.getText();

String gareDep=gare_depL.getText();

String gareArr=gare_arrL.getText();

String dateArr=date_arrivé.getText();

String dateDep=date_dep.getText();

String dis=distance.getText();

String prixL= prix.getText();

String id=id_train.getText();

String place= place_dispo.getText();




	//on associe les valeurs des champs de texte a des string pour mieux manipuler les variables


if ( ligne_name.matches("[_a-zA-Z0-9]+")) { //on test si l'utilisateur rentre bien que des lettres
		
		
		if ( gareDep.matches("[0-9]+")) { //on test si l'utilisateur rentre bien que des chifres 
			
			// faire les prenoms composÃ© 					
		
			if ( gareArr.matches("[0-9]+")) { 
				
				if ( dis.matches("[0-9]+")) {
					
					
					if ( prixL.matches("[0-9]+")) {
						if ( id.matches("[0-9]+")) {
							if ( place.matches("[0-9]+")) {

Connection con=ConnectionBdFero.connect();
	PreparedStatement stat = null;
	ResultSet rs= null;
	
//String sql="SELECT * FROM ligne WHERE nom_ligne= ? AND gare_dep= ? AND gare_arr= ? AND distance= ? AND date_dep= ? AND datet_arriv= ? ";
	try {
		/*stat = con.prepareStatement(sql);
		
		stat.setString(1, ligne_name); 
		stat.setString(2, gareDep); 
		stat.setString(3, gareArr); 
		stat.setString(4, dis);
		stat.setString(5, dateDep); 
		stat.setString(6, dateArr); 
		
		
		 //on prend les données inseres dans les champs 
		
		rs=stat.executeQuery();*/
		
		
     Statement addLigne = con.createStatement();
     addLigne.executeUpdate("INSERT INTO ligne (nom_ligne, gare_dep, gare_arr, distance, date_dep, datet_arriv, place_Dispo, prix_billet, place_vendu, idtrain) VALUES ('"+ligne_name+"' , '"+gareDep+"' , '"+gareArr+"' , '"+dis+"' , '"+dateDep+"' , '"+dateArr+"' , '"+place+"' , '"+prixL+"' , '0' , '"+id+"' )"); //encapsulation des variables dans la requete
    
  
   erreur1.setText("La nouvelle ligne a été ajouté" );
     
		}
		 catch (Exception e) {
     e.printStackTrace();
    
  }
	
							  
							 
							   
			 }else {
					
				 erreur1.setText(" Veuillez saisir que des chifres pour le nombre de places ");
		}
						}else {
				erreur1.setText(" Veuillez saisir que des chifres pour le id ");
		}
					}else {	
				erreur1.setText(" Veuillez saisir que des chifres pour le prix ");
					}
					
					}else {
			erreur1.setText(" Veuillez saisir que des chifres pour la distance ");
}					   		   
			}else {
			erreur1.setText("! Veuillez saisir que des chifres	 pour la garre d'arrivé ");
}					   
		}	else {
					erreur1.setText(" Veuillez saisir que des chifres pour la garre de départ ");
		}					   					
}	else {
					erreur1.setText(" Veuillez saisir que des chifres et des lettres pour le nom ");
		}					   	

					
	
	/*}else {
				erreur.setText("DÃ©solÃ© ! Veuillez remplir tous les champs pour crÃ©er votre compte");	
			}

*/





}
}




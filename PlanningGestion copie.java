package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import ConnectionBdFero.ConnectionBdFero;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class PlanningGestion implements Initializable{
	
	@FXML private Label DateAffichage;
	
	//initialiazation des valeurs de javaFx
	
	
	private static  Date aujourdhui = new Date();
	
	public static Date getAujourdhui() {
		return aujourdhui;
	}
	public static void setAujourdhui(Date aujourdhui) {
		PlanningGestion.aujourdhui = aujourdhui;
	}
	


	Format formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");
	 String DateAujourdhuiString = formatter.format(aujourdhui);
	    //On met la date sous String avec le format désiré pour l affiche avec un setText
	
	
	 
	 
	 
	 
	 //on assigne les colums du tableau de javaFx 
	 
	 @FXML
	 private TableView<ModelePlanning>planning;//nom de la table javaFx
	 @FXML
	 private TableColumn<ModelePlanning,String>col_villeD; //collumn 
	 @FXML
	 private TableColumn<ModelePlanning,String>col_dateDepart;
	 @FXML
	 private TableColumn<ModelePlanning,String>col_dateArrivee;
	 @FXML
	 private TableColumn<ModelePlanning,String>col_destination;
	 @FXML
	 private TableColumn<ModelePlanning,String>col_prixB;
	 @FXML
	 private TableColumn<ModelePlanning,String>col_placeDispo;
	
	ObservableList<ModelePlanning>listP=FXCollections.observableArrayList(); //creation ListP

@SuppressWarnings("unused")
@Override



/**
 * @author lry41
 * @version 1.0
 * @return planning javafx avec les données de la Bd
 */
public void initialize(URL arg0, ResourceBundle arg1) {//sert a initaliser la page avec les modif
	// TODO Auto-generated method stub
	DateAffichage.setText(DateAujourdhuiString);//on place la date dans son label
	//Nom.setText();
	
	
	col_villeD.setCellValueFactory(new PropertyValueFactory<>("ville"));
	col_dateDepart.setCellValueFactory(new PropertyValueFactory<>("dateD"));
	col_dateArrivee.setCellValueFactory(new PropertyValueFactory<>("dateA"));
	col_destination.setCellValueFactory(new PropertyValueFactory<>("destination"));
	col_prixB.setCellValueFactory(new PropertyValueFactory<>("prix"));
	col_placeDispo.setCellValueFactory(new PropertyValueFactory<>("placeD"));
	//on affecte les cellules du tableau
	try {
		
	
	Connection con=ConnectionBdFero.connect();
	
	 ResultSet rs= con.createStatement().executeQuery(" SELECT * FROM train , gare , ligne WHERE ligne.gare_dep = gare.idgare AND date_dep <='"+aujourdhui+"' AND place_Dispo >'0' "
				+ " ORDER BY date_dep "); //probleme avec le signe pour la date //pour tout sauf ville destination
	 
	ResultSet rs2= con.createStatement().executeQuery(" SELECT * FROM train , gare , ligne WHERE ligne.gare_arr = gare.idgare AND  date_dep <='"+aujourdhui+"' AND place_Dispo >'0'"
			+ " ORDER BY date_dep "); //probleme avec le signe pour la date //pour la ville destination
	 
	while(rs.next()&&rs2.next()){//boucle tant que des données existe on rentre les données
		
		listP.add(new ModelePlanning(rs.getString("ville"),rs2.getString("ville") ,rs.getString("date_dep"),rs.getString("datet_arriv"),
				rs.getDouble("prix_billet") ,rs.getInt("place_Dispo")));
		//on rentre dans le tableau les resultats de la requete sql
		
	}
	
	
	
	
	
	}
	catch(Exception e) {
		//a faire 
	}
	
	
	planning.setItems(listP); //on met la liste ListP dans le planning de java fx 
	
}

}


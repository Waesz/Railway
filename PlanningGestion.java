package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.SQLException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import ConnectionBdFero.ConnectionBdFero;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Callback;


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

@SuppressWarnings({ "unused"})
@Override



/**
 * @author lry41, jessica
 * @version 1.0
 * @return planning javafx avec les données de la Bd
 */
public void initialize(URL arg0, ResourceBundle arg1) {//sert a initaliser la page avec les modif
	DateAffichage.setText(DateAujourdhuiString);//on place la date dans son label
	
	
	TableColumn<ModelePlanning, ModelePlanning> btnCol = new TableColumn<>("Réservation"); 
	btnCol.setMinWidth(90); 
	btnCol.setCellValueFactory(new Callback<CellDataFeatures<ModelePlanning, ModelePlanning>, ObservableValue<ModelePlanning>>() {
		//création de la colonne pour le bouton
		
		@Override
		public ObservableValue<ModelePlanning> call(CellDataFeatures<ModelePlanning, ModelePlanning> features) {
			return new ReadOnlyObjectWrapper<ModelePlanning>(features.getValue());
		} 
	});
	
	btnCol.setCellFactory(new Callback<TableColumn<ModelePlanning, ModelePlanning>, TableCell<ModelePlanning, ModelePlanning>>() { 
	    @Override public TableCell<ModelePlanning, ModelePlanning> call(TableColumn<ModelePlanning, ModelePlanning> btnCol) { 
	    final Button button = new Button(); 
	    button.setMinWidth(70); // creation du bouton à insérer par la suite dans la colonne crée pour 
	    
	    TableCell<ModelePlanning, ModelePlanning> cell = new TableCell<ModelePlanning, ModelePlanning>() {    
	     @Override public void updateItem(final ModelePlanning ModelePlanning, boolean empty) { 
	     super.updateItem(ModelePlanning, empty); 
	     if (ModelePlanning == null) { 
	      setGraphic(null); 
	     } else { 
	      button.setText("Reserver"); 
	      setGraphic(button); 
	     } 

	     } 
	    }; 
	    // affichage du bouton seulement si la colonne n'est pas vide 
	    

	    button.setOnAction(new EventHandler<ActionEvent>() { 
	    	
	     @Override 
	     public void handle(ActionEvent event) { 
	    	 ModelePlanning currentItem = cell.getItem(); 
	    	 try {
				OuvertureValidationAchat(event);// appelle de la méthode pour ouvrir la validation d'achat
			} catch (IOException e) {
				e.printStackTrace();
			}
	    	 
	     } 
	    }); 

	    return cell ; 
	    } 
	}); 
	
	planning.getColumns().add(btnCol); 
	col_villeD.setCellValueFactory(new PropertyValueFactory<>("ville"));
	col_dateDepart.setCellValueFactory(new PropertyValueFactory<>("dateD"));
	col_dateArrivee.setCellValueFactory(new PropertyValueFactory<>("dateA"));
	col_destination.setCellValueFactory(new PropertyValueFactory<>("destination"));
	col_prixB.setCellValueFactory(new PropertyValueFactory<>("prix"));
	col_placeDispo.setCellValueFactory(new PropertyValueFactory<>("placeD"));
	
	//on affecte les cellules du tableau ainsi que le bouton 
	try {
		
	
	Connection con=ConnectionBdFero.connect();
	
	 ResultSet rs= con.createStatement().executeQuery(" SELECT * FROM train , gare,ligne Where ligne.idtrain=train.idtrain AND ligne.gare_dep = gare.idgare AND date_dep >='"+DateAujourdhuiString+"' AND place_Dispo >'0' "
				+ " ORDER BY date_dep "); //pour tout sauf ville destination
	 
	 ResultSet rs2= con.createStatement().executeQuery("SELECT * FROM train , gare,ligne Where ligne.idtrain=train.idtrain AND ligne.gare_arr = gare.idgare AND  date_dep >='"+DateAujourdhuiString+"' AND place_Dispo >'0'"
			+ " ORDER BY date_dep "); //pour la ville destination
	 
	

	while(rs.next()&&rs2.next()){//boucle tant que des données existe on rentre les données
		
		listP.add(new ModelePlanning(rs.getString("ville"),rs2.getString("ville") ,rs.getString("date_dep"),rs.getString("datet_arriv"),
				rs.getDouble("prix_billet") ,rs.getInt("place_Dispo")));
		//on rentre dans le tableau les resultats de la requete sql
		
	} 
	
	
	
	
	
	
	}
	catch(Exception e) {
		System.out.println("ca fonctionne pas ");//a faire 
	}
	
	
	planning.setItems(listP); //on met la liste ListP dans le planning de java fx 
	
}

public void OuvertureValidationAchat(ActionEvent event)throws IOException{ //méthode qui redirige vers la page FXML pour la validation d'achat
Parent root = FXMLLoader.load(getClass().getResource("ValidationAchat.fxml"));
	
	Stage stage = new Stage(); 
	stage.initModality(Modality.APPLICATION_MODAL); 
	stage.setOpacity(1); 
	stage.setTitle("Validation Achat"); 
	stage.setScene(new Scene(root, 700, 500)); 
	stage.showAndWait(); 
	
}


}


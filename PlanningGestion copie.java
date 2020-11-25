package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import ConnectionBdFero.ConnectionBdFero;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

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
	


	Format formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	 String DateAujourdhuiString = formatter.format(aujourdhui);
	    //On met la date sous String avec le format désiré pour l affiche avec un setText
	
	
	
	
	
	   

@Override
public void initialize(URL arg0, ResourceBundle arg1) {//sert a initaliser la page avec les modif
	// TODO Auto-generated method stub
	DateAffichage.setText(DateAujourdhuiString);//on place la date dans son label
	//Nom.setText();
	
	 Connection con=ConnectionBdFero.connect();
		@SuppressWarnings("unused")
		PreparedStatement stat = null;
		@SuppressWarnings("unused")
		ResultSet rs= null;
	String sql= " SELECT nom_train,nom_gare AS nom_gareDepart , ville ,date_dep,datet_arriv,place_Dispo,prix_billet "
			+ "FROM train , gare , ligne WHERE ligne.gare_dep = gare.idgare AND date_dep >='2020-11-27 21:30:53' AND place_Dispo >'0'"
			+ " ORDER BY date_dep ";
	//avoir renseignement depart
	try {
		stat = con.prepareStatement(sql);
	}
	catch 
		(Exception e ){
		
	}
	
	
}

}


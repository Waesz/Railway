package application;

import java.net.URL;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;


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
}

}


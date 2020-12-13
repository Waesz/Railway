package application;



public class ModelePlanning {
private String ville,dateD,dateA,destination;
private double prix;
private int placeD;



//constructeur pour le tableau planing javaFx

/**
 * @author lry41
 * @version 1.0
 * @return constructeur pour la table a inserer dans javaFx
 */



public  ModelePlanning(String ville,String destination, String dateD,String dateA,double prix,int placeD) {
	this.dateA=dateA;
	this.dateD=dateD;
	this.ville=ville;
	this.destination=destination;
	this.prix=prix;
	this.placeD=placeD;
}
public String getDestination() {
	return destination;
}

public void setDestination(String destination) {
	this.destination = destination;
}

public String getVille() {
	return ville;
}

public void setVille(String ville) {
	this.ville = ville;
}

public String getDateD() {
	return dateD;
}

public void setDateD(String dateD) {
	this.dateD = dateD;
}

public String getDateA() {
	return dateA;
}

public void setDateA(String dateA) {
	this.dateA = dateA;
}

public double getPrix() {
	return prix;
}

public void setPrix(double prix) {
	this.prix = prix;
}

public int getPlaceD() {
	return placeD;
}

public void setPlaceD(int placeD) {
	this.placeD = placeD;
}

}

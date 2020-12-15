package ClientGestion;



public class ModelePlanning {
private String ville,dateD,dateA,destination;
private double prix;
private int placeD;



//constructeur pour le tableau planing javaFx

/**
 * constructeur pour la table planning à inserer dans javaFx.
 * @author lry41=geoffrey
 * @version 1.0
 * 
 * 
 */
public  ModelePlanning(String ville,String destination, String dateD,String dateA,double prix,int placeD) {
	this.dateA=dateA;
	this.dateD=dateD;
	this.ville=ville;
	this.destination=destination;
	this.prix=prix;
	this.placeD=placeD;
}
/**
 * 
 * @author lry41=geoffrey
 * @version 1.0
 * @return destination
 * 
 */
public String getDestination() {
	return destination;
}

public void setDestination(String destination) {
	this.destination = destination;
}
/**
 * 
 * @author lry41=geoffrey
 * @version 1.0
 * @return ville
 * 
 */
public String getVille() {
	return ville;
}

public void setVille(String ville) {
	this.ville = ville;
}
/**
 * 
 * @author lry41
 * @version 1.0
 * @return dateDepart
 * 
 */
public String getDateD() {
	return dateD;
}

public void setDateD(String dateD) {
	this.dateD = dateD;
}
/**
 * 
 * @author lry41
 * @version 1.0
 * @return date Arrivée
 * 
 */
public String getDateA() {
	return dateA;
}

public void setDateA(String dateA) {
	this.dateA = dateA;
}
/**
 * 
 * @author lry41
 * @version 1.0
 * @return prix
 * 
 */
public double getPrix() {
	return prix;
}

public void setPrix(double prix) {
	this.prix = prix;
}
/**
 * 
 * @author lry41
 * @version 1.0
 * @return nbPlace
 * 
 */
public int getPlaceD() {
	return placeD;
}

public void setPlaceD(int placeD) {
	this.placeD = placeD;
}

}

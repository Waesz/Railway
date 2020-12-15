package ClientGestion;


/**
 *contient les données du client
 * @author lry41=geoffrey
 * @version 1.0
 * 
 * 
 */
public class Client {
public String nom;
public Double solde;


public Client (String nom, double solde) {
	this.nom=nom;
	this.solde=solde;
}



/**
 * @author lry41 
 * @version 1.0
 * @return nom du client
 * 
 */
public String nom(String nom) {
	// TODO Auto-generated method stub
	return nom;
}


public String toString(Client a) {
	return a.nom;
}


}

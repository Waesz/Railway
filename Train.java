package V1;

import java.util.ArrayList;

public class Train {
	
	private String nom; //nom du train 
	private int maxWagon;// maximum de wagons possible pour ce train
	private ArrayList<Wagon> wagons;// list de tout les wagons contenue dans le train  
	private double coutAnnuel;// cout d'entretien de ce train a l'année 
	private ArrayList<Ligne> trajets;
	private double kilometrage= 0;
	private int totalPlaces=0;
	private int placeDispo;
	private int placePrise;
	
    
	//constructeur
	public Train (String nom, int maxWagon, ArrayList<Wagon> wagons, ArrayList<Ligne> trajets) {
		this.setNom(nom);
		this.setMaxWagon(maxWagon);
		this.setWagons(wagons);
		this.setTrajets(trajets);
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getMaxWagon() {
		return maxWagon;
	}

	public void setMaxWagon(int maxWagon) {
		this.maxWagon = maxWagon;
	}

	public ArrayList<Wagon> getWagons() {
		return wagons;
	}

	public void setWagons(ArrayList<Wagon> wagons) {
		this.wagons = wagons;
	}

	public double getCoutAnnuel() {
		return coutAnnuel;
	}

	public void setCoutAnnuel(double coutAnnuel) {
		this.coutAnnuel = coutAnnuel;
	}
	
	public ArrayList<Ligne> getTrajets() {
		return trajets;
	}

	public void setTrajets(ArrayList<Ligne> trajets) {
		this.trajets = trajets;
	}
	
	public double getKilometrage() {
		return kilometrage;
	}

	public void setKilometrage(double kilometrage) {
		this.kilometrage = kilometrage;
	}
	
	public int getPlacePrise() {
		return placePrise;
	}
	public void setPlacePrise(int placePrise) {
		this.placePrise = placePrise;
	}
	public int getPlaceDispo() {
		return placeDispo;
	}
	public void setPlaceDispo(int placeDispo) {
		this.placeDispo = placeDispo;
	}
	
	
	public int getTotalPlaces() {
		return totalPlaces;
	}

	public void setTotalPlaces(int totalPlaces) {
		this.totalPlaces = totalPlaces;
	}

	public String toString() { // affichage des caractéristiques principales du train
		return getNom()+" peut contenir au maximum "+getMaxWagon()+", il en contient actuellement "+getWagons().size()+
				". Il a deja effectué "+getKilometrage()+", il peut contenir "+getTotalPlaces()+" et il lui en reste actuellement "
		+getPlaceDispo();
	}
	
	public void afficheWagon() { // affichage de toute les caractéristiques des wagons contenue dans le train
		for(int i=0; i<wagons.size(); i++) {
			System.out.println(wagons.get(i).toString());
		}
	}
	
	private boolean isExist(Wagon wagon) { // comparaison de 2 Wagons grace a une methode "equals()" fait dans wagon
		for (int i =0; i< wagons.size(); i++) {
			if (wagons.get(i).equals(wagon)) return true;
		}
		return false;
	}
	
	public void addWagon(Wagon wagon) { // ajout de wagon au train
		if (maxWagon > wagons.size()) {
			if (!isExist(wagon)==false) {
				wagons.add(wagon);
			}
			else {
				System.out.println("Ce wagon est deja dans le train.");
			}
		}
		else {
			System.out.println("Le train ne peut ajouter d'autre wagon.");
		}
	}
	
	private boolean isExist(Ligne l) { // comparaison de 2 Lignes grace a une methode "equals()" fait dans lignes
		for (int i =0; i< trajets.size(); i++) {
			if (!trajets.get(i).equals(l)) return true;
		}
		return false;
	}

	public void addDistance(Ligne l) {
		if (!isExist(l)==false) { //test si le trajet proposé n'est pas deja enseigné dans la list
				trajets.add(l); //ajout du trajet
			}
			else {
				System.out.println("Ce trajet est deja pris en compte.");
			}
		}
	
	public void CalculDistance() {
		for (int i=0; i< trajets.size(); i++) { //on parcourt toutes les lignes effectué par le train
			setKilometrage(trajets.get(i).getDistance()); //on modifie le kilometrage du train en ajoutant les distances parcourue
		}
		System.out.println(getKilometrage());
	}

	public int calculDispo() {
		for(int i=0; i<wagons.size(); i++) { //on parcourt tout les wagons present dans le train
			setTotalPlaces(wagons.get(i).getNbPlace()); // on calcul le total de places dans le train
		}
		setPlaceDispo(getTotalPlaces()-placePrise); // on met a jour le nombre de place disponible en retirant celle qui sont prises 
		return getPlaceDispo(); // on renvoie le nombre de place disponible au moment T
	}
		
	public void addplace() { 
		if (placeDispo>0) { // y a-t-il encore des places dispo
			placePrise++; // augmenter le nbr de place prise
			placeDispo--; // diminuer le nombre de place restante 
		}
		else {
			System.out.println("il n'y a plus de place");
		}
		
	}
	

	
}

package application;

public class garesL {
	



	
	private String nom_gare;
	private int ville;
	
	public garesL(int ville , String nom_gare) {
		this.setNom_gare(nom_gare) ; 
		this.setVille(ville); 
		
	}


	public String getNom_gare() {
		return nom_gare;
	}


	public void setNom_gare(String nom_gare) {
		this.nom_gare = nom_gare;
	}


	public int getVille() {
		return ville;
	}


	public void setVille(int ville) {
		this.ville = ville;
	}
}

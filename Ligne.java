package V1;

public class Ligne {
	
	
	private GareVille villeDepart;// ville d'où part le train 
	private GareVille villeArrive;// destination final du train
	private double distance;// distance parcours entre la ville de depart et celle d'arrivé 
	private String heureDepart; 
	private String heureArrive;
	private String durée;
    private int mois; // date du trajet
    private int jour; // date du trajet
    private int année; //date du trajet
    private Train train; //train associé a ce trajet
    
    public Ligne (GareVille villeDepart, GareVille villeArrive, double distance, String heureDepart, String heureArrive, int mois, int jour, int année, String durée, Train train) {
    	this.setVilleDepart(villeDepart);
    	this.setVilleArrive(villeArrive);
    	this.setDistance(distance);
    	this.setHeureDepart(heureDepart);
    	this.setHeureArrive(heureArrive);
    	this.setDurée(durée);
    	this.setMois(mois);
    	this.setJour(jour);
    	this.setAnnée(année);
    	this.setTrain(train);
    }

	public GareVille getVilleDepart() {
		return villeDepart;
	}

	public void setVilleDepart(GareVille villeDepart) {
		this.villeDepart = villeDepart;
	}

	public GareVille getVilleArrive() {
		return villeArrive;
	}

	public void setVilleArrive(GareVille villeArrive) {
		this.villeArrive = villeArrive;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public String getHeureDepart() {
		return heureDepart;
	}

	public void setHeureDepart(String heureDepart) {
		this.heureDepart = heureDepart;
	}

	public String getHeureArrive() {
		return heureArrive;
	}

	public void setHeureArrive(String heureArrive) {
		this.heureArrive = heureArrive;
	}

	public String getDurée() {
		return durée;
	}

	public void setDurée(String durée) {
		this.durée = durée;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public int getAnnée() {
		return année;
	}

	public void setAnnée(int année) {
		this.année = année;
	}
	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}
	
	public boolean equals(Ligne l) {
		return ((villeDepart.equals( l.villeDepart))&&(villeArrive.equals(l.villeArrive))&& (getJour()==l.getJour())&&(getMois()==l.getMois()
				)&&(getAnnée()==l.getAnnée())&& (heureDepart.equals(l.heureDepart))&& (heureArrive.equals(l.heureArrive)));	
		
	}
	
	public String affichageInfo() {
		return " Le trajet "+villeDepart+" "+villeArrive+" le "+jour+" "+mois+" "+année+" à "+heureDepart+" sera assuré par le train"
				+train+", aura une durée de "+durée+" et arrivera donc à "+heureArrive;
	}

	

}

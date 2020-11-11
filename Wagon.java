package V1;


public class Wagon {
	
		
		private int numeroDeWagon; // rajouté pour differencier les wagons les uns des autres
		private int nbPlace;
		
		
		public Wagon(int nbPlace, int numeroDeWagon) {
			
			this.numeroDeWagon=numeroDeWagon;
			this.nbPlace=nbPlace;
			
		}
		
		
		public int getNbPlace() {
			return nbPlace;
		}
		public void setNbPlace(int nbPlace) {
			this.nbPlace = nbPlace;
		}
		
		public int getNumeroDeWagon() {
			return numeroDeWagon;
		}
		public void setNumeroDeWagon(int numeroDeWagon) {
			this.numeroDeWagon = numeroDeWagon;
		}
		
	
		public String toString() {
			
			if(getNbPlace()==0) {
				
				return"Le wagon contient "+getNbPlace()+" place dans le wagon";
			}
			else {
				return"Le wagon contient "+getNbPlace()+" places dans le wagon";
			}
		
		}

	public boolean equals (Wagon w) {
		if (numeroDeWagon==w.getNumeroDeWagon()) {
			return true;
		}
		else return false;
	}


	
}
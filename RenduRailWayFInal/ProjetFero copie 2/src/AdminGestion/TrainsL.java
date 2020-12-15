package AdminGestion;

public class TrainsL {
	



	
	private String train;
	
	private int idTrain , nb_train; 
	public TrainsL(int idTrain,String train , int nb_train) {
		this.setIdTrain(idTrain) ; 
		this.setTrain(train); 
		this.setNb_train(nb_train);
	}
	public int getNb_train() {
		return nb_train;
	}
	public void setNb_train(int nb_train) {
		this.nb_train = nb_train;
	}
	public int getIdTrain() {
		return idTrain;
	}
	public void setIdTrain(int idTrain) {
		this.idTrain = idTrain;
	}
	public String getTrain() {
		return train;
	}
	public void setTrain(String train) {
		this.train = train;
	}
}

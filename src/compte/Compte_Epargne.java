
public class Compte_Epargne extends Compte{
	private double taux;
	
	 public Compte_Epargne(double solde, String nom_titulaire, double taux, int numero){
	    	super(numero, nom_titulaire, solde);
	    	this.taux=taux;
	    	
		}
	
	
	
	public void calcule(double solde){
		solde = solde + taux;
	}



	public double getTaux() {
		return taux;
	}



	public void setTaux(double taux) {
		this.taux = taux;
	}



	public String toString() {
		return "Compte_Epargne [taux=" + taux + "]";
	}


}

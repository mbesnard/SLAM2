
public class Compte_Courant extends Compte {
	private double decouvert_autorise;
	
    public Compte_Courant(double solde, String nom_titulaire, double decouvert_autorise, int numero){
    	super(numero, nom_titulaire, solde);
    	this.decouvert_autorise=decouvert_autorise;
    	
	}
    
    public void retraitdecouvert(double solde){
    	int moins;
		System.out.println("Combien voulez-vous retirer d'argent ? ");
		moins=Clavier.lire_int();
		solde=solde-moins;
		if (solde<decouvert_autorise){			
		System.out.println("Vous ne pouvez pas retirer");
		}
		else {
		System.out.println("Votre solde est de" +solde);
		}
    }

	public double getDecouvert_autorise() {
		return decouvert_autorise;
	}

	public void setDecouvert_autorise(double decouvert_autorise) {
		this.decouvert_autorise = decouvert_autorise;
	}

	public String toString() {
		return "Compte_Courant [decouvert_autorise=" + decouvert_autorise + "]";
	}

}
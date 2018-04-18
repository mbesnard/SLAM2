
public class Appli {


	public static void main(String[] args) {
		
		Compte_Courant monCompte= new Compte_Courant(10, "Besnard", 5, 20);
		monCompte.retraitdecouvert(20);
		
	
		Compte_Epargne monCompte1= new Compte_Epargne(10, "Besnard", 3, 20);
		monCompte1.calcule(10);
		}

}



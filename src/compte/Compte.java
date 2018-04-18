
public class Compte {
	private int numero;
	private String nom_titulaire;
	private double solde;
	
	public Compte(int numero, String nom_titulaire, double solde){
		this.solde= solde;
		this.nom_titulaire=nom_titulaire;
		this.numero= numero;
	
	}

	public void deposer(){
		int plus;
		System.out.println("Combien voulez-vous deposez d'argent ?");
		plus=Clavier.lire_int();
		solde=solde+plus;
		System.out.println("Votre solde est de "+solde);		
    }
	
	public void retirer(){
		int moins;
		System.out.println("Combien voulez-vous retirer d'argent ? ");
		moins=Clavier.lire_int();
		solde=solde-moins;
		System.out.println("Votre solde est de "+solde);		
		
	}
	
	public void consulter(){
		System.out.println("Votre solde est de "+solde);
	}


	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNom_titulaire() {
		return nom_titulaire;
	}

	public void setNom_titulaire(String nom_titulaire) {
		this.nom_titulaire = nom_titulaire;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public String toString() {
		return "Compte [numero=" + numero + ", nom_titulaire=" + nom_titulaire
				+ ", solde=" + solde + "]";
	}

}

public class Client{

	int id;
	String nom;
	String prenom;
	CompteBancaire compte;

	public Client(){}

	public Client(int id, String nom, String prenom, int numeroCompte, double solde){
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.compte = new CompteBancaire(numeroCompte, solde);
	}

	public void deposer(double montant){
		this.compte.solde += montant;
	}

	public void retirer(double montant){
		this.compte.solde -= montant;
	}

	public void afficher(){
		System.out.println("ID : " + this.id);
		System.out.println("Nom : " + this.nom);
		System.out.println("Prénom : " + this.prenom);
		System.out.println("Numéro de compte : " + this.compte.numeroCompte);
		this.compte.afficheSolde();
	}


}
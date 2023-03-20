public class CompteBancaire {

	int numeroCompte;
	double solde;
	private double taux_interet = 0.05;

	public CompteBancaire(int numeroCompte, double solde){
		this.numeroCompte = numeroCompte;
		this.solde = solde;
	}

	public void changerTauxInteret(double taux){
		this.taux_interet = taux;
	}

	public void ajouterInteret(){
		this.solde += this.solde * this.taux_interet;
	}

	public void afficheSolde(){
		System.out.println("Le solde du compte : " + this.solde);
	}

}
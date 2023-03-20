public class Vehicule{

	String marque;
	final int puissance_fiscale = 100;
	int vitesse_maximale, vitesse_courante;
	private Boolean isRunning = false;

	public Vehicule(){}

	public Vehicule(String marque, int vitesse_maximale, int vitesse_courante){
		this.marque = marque;
		this.vitesse_maximale = vitesse_maximale;
		this.vitesse_courante = vitesse_courante;
	}

	public void demarrer(){
		this.isRunning = true;
	}

	public void eteindre(){
		this.isRunning = false;
	}

	public void afficher(){
		System.out.println("Marque: " + this.marque);
		System.out.println("Puisance fiscale: " + this.puissance_fiscale);
		System.out.println("Vitesse maximale: " + this.vitesse_maximale);
		System.out.println("Vitesse courante: " + this.vitesse_courante);
	}

}
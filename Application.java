public class Application {

	public static void main(){
		Client c1 = new Client(1, "Robert", "Gilbert", 1254, 1000);
		Client c2 = new Client(1, "Jean", "Dujardin", 545, 5000);
		Client c3 = new Client(1, "Valerie", "Pécresse", 845, 10);
		Client[] clients = {c1, c2, c3};

		c2.deposer(5000);
		c2.compte.changerTauxInteret(0.1);
		c2.afficher();

		for(int i=0; i<clients.length; i++){
			clients[i].compte.afficheSolde();
		}
	}

}
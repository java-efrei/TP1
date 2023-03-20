public class Rectangle {
    
    Point corner;
    int longueur, largeur;

    public Rectangle(double x, double y, int longueur, int largeur){
        corner = new Point(x, y);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public int perimetre(){
        return 2*(this.longueur + this.largeur);
    }

    public int surface(){
        return this.longueur * this.largeur;
    }

}

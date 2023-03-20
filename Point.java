public class Point {
    
    double x;
    double y;

    public Point(){}

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void afficher(){
        System.out.println("P1(" + this.x  + ';' + this.y + ')');
    }

    public static double distanceStat(Point p1, Point p2){
        return (p1.x - p2.x)*(p1.x - p2.x) + (p1.y - p2.y)*(p1.y - p2.y);
    }

    public double distanceStat(Point p){
        return (this.x - p.x)*(this.x - p.x) + (this.y - p.y)*(this.y - p.y);
    }

}

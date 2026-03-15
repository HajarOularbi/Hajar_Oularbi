//TP1EX2
public class Point {
    private char nom;
    private double abscisse;

    public void initialiser(char nom, double abscisse) {
        this.nom=nom;
        this.abscisse=abscisse;
    }

    public void initialiser(Point p1) {
        this.nom = p1.nom;
        this.abscisse = p1.abscisse;
    }

    public void affiche() {
        System.out.println("Le point est " + nom + " d'abscisse " + abscisse);
    }

    public void translate(double valTrans) {
        this.abscisse += valTrans;
    }
}

public class MainPoint {
    public static void main(String[] args) {
        Point p1=new Point();
        p1.initialiser('a', 3.0);
        p1.affiche();
        p1.translate(3.5);
        p1.affiche();
    }
}

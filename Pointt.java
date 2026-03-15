//TP1EX3
public class Pointt {
    private String nom;
    private double abscisse;

    // Constructeur
    public Pointt(String nom, double abscisse) {
        this.nom=nom;
        this.abscisse=abscisse;
    }

    public void affiche() {
        System.out.println("Le point est " + nom + " d'abscisse " + abscisse);
    }

    public void translate(double valeur) {
        this.abscisse += valeur;
    }
}

public class MainPointt {
    public static void main(String[] args) {
        Pointt p1 = new Pointt('a', 3.0);
        p1.affiche();
        p1.translate(3.5);
        p1.affiche();
    }
}

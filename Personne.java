//EX1TP1
public class Personne {
    private String CIN;
    private String nom;
    private String prenom;
    private String email;
    private int age;

    //Qst2TP1
    public void initialiser(String CIN,String nom,String prenom,String email,int age){
        this.CIN=CIN;
        this.nom=nom;
        this.prenom=prenom;
        this.email=email;
        this.age=age;
    }

    //Qst3TP1
    public void afficherPersonne() {
        System.out.println("Votre CIN : "+CIN);
        System.out.println("Votre Nom : "+nom);
        System.out.println("Votre Prénom :"+prenom);
        System.out.println("Votre Email : "+email);
        System.out.println("Votre Age : "+age);
    }


//Qst4TP1

    public static void main(String[] args) {
        Personne p = new Personne();
        p.initialiser("AB123456", "Hajar", "Oula", "hajaroula@gmail.com", 20);
        p.afficherPersonne();
    }
}

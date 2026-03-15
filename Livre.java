//EX4TP1
public class Livre {
    private String titre;
    private String auteur;
    private int nbPages;
    private double prix;
    private boolean prixFixe;

    //QST1
    public Livre(String titre, String auteur, int nbPages){
        this.titre=titre;
        this.auteur=auteur;
        this.nbPages=nbPages;
        this.prix=-1; //pas donné
        this.prixFixe=false;
    }

    public Livre(String titre, String auteur, int nbPages, double prix) {
        this(titre, auteur, nbPages);
        setPrix(prix);
    }

    //QST2
    public String getTitre() { return titre; }
    public void setTitre(String titre) { this.titre = titre; }

    public String getAuteur() { return auteur; }
    public void setAuteur(String auteur) { this.auteur = auteur; }

    public int getNbPages() { return nbPages; }
    public void setNbPages(int nbPages) { this.nbPages = nbPages; }

    public double getPrix() { return prix; }
    public void setPrix(double prix) {
        if (prixFixe) {
            System.out.println("Attention ! /n Le prix est déjà fixé et ne peut plus être modifié !");
        } else {
            this.prix=prix;
            this.prixFixe=true;
        }}

    //QST3
    public String toString() {
        String descrip = "Livre : " + titre + ", Auteur : " + auteur + ", Pages : " + nbPages;
        if (prix == -1) descrip += "Prix pas encore donné";
        else descrip += "Prix : " + prix + " DHS ";
        return descrip;
    }

    //QST4
    public boolean isPrixFixe() {
        return prixFixe; }

    //QST5
    public int compare(Livre autre) {
        if (this.nbPages == autre.nbPages) return 0;
            else if(this.nbPages > autre.nbPages) return 1;
                else return -1;}
    
//QST6
class Etagere {
    private Livre[] livres;
    private int compteur;

    //QST7
    public Etagere(int taille) {
        livres = new Livre[taille];
        compteur = 0;
    }
    //QST8-a
    public int getCapacite(){return livres.length; }
    public int getNbLivres(){return compteur; }
    //QST8-b
    public void ajouter(Livre l){
        if(compteur<livres.length) {
            livres[compteur]=l;
            compteur++;
        }else{
            System.out.println("Erreur : étagère pleine !");
        }
    }

    //QST8-c
    public Livre getLivre(int position){
        if(position<1 || position>compteur) {
            System.out.println("Erreur de positionnement !");
            return null;
        }
        return livres[position-1];
    }

    //QST8-d
    public int chercher(String titre,String auteur){
        for(int i=0;i<compteur;i++){
            if(livres[i].getTitre().equals(titre)&&livres[i].getAuteur().equals(auteur)) {
                return i+1;
            }}
        return 0;
    }

    public void supprimer(int position){
        if (position < 1||position > compteur) {
            System.out.println("Erreur de positionnement !");
            return;
        }
        for (int i=position-1; i<compteur-1;i++){
            livres[i]=livres[i+1];
        }
        livres[compteur-1] =null;
        compteur--;
    }
}

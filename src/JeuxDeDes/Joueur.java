package JeuxDeDes;

public class Joueur implements Runnable{

    private String nom;
    private Partie partie;
    private int lancer = 0;
    private Thread t;

    public Joueur(String nom, Partie partie) {
        this.nom = nom;
        this.partie = partie;
        t = new Thread(this);
        t.start();
    }



    public void run() {
         do {
            lancer = partie.jouer(this);
        }while (lancer == 0);

    }














    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Partie getPartie() {
        return partie;
    }

    public void setPartie(Partie partie) {
        this.partie = partie;
    }

    public int getLancer() {
        return lancer;
    }

    public void setLancer(int lancer) {
        this.lancer = lancer;
    }

    public Thread getT() {
        return t;
    }

    public void setT(Thread t) {
        this.t = t;
    }
}

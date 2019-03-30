package SerieExercices.S12;

import java.util.HashMap;

public class Classement {

    private HashMap<Integer, String> resultat;
    private String gagnant;
    private int nbrDeJoueur;

    public Classement(int nbrDeJoueur) {

        this.nbrDeJoueur = nbrDeJoueur;
        resultat = new HashMap<>();

    }

    public synchronized void classement( Integer lancer,String nom) {

        resultat.put(lancer, nom);

            for (Integer s : resultat.keySet()) {

                if (s >= lancer) {
                    gagnant = resultat.get(s) + " avec un lancer de " + s;
                    lancer = s;
                }
            }
            while (nbrDeJoueur != 1) {
                try {
                    nbrDeJoueur--;
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("merde dans les wait du classement");
                }
            }

        notify();
    }

    public String getGagnant() {
        return gagnant;
    }

}

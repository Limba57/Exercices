package SerieExercices.S12;

import java.util.HashMap;

public class Classement {

    private int nbreDeJoueur;
    private HashMap<Integer, String> resultat;
    private String gagnant;

    public Classement(int nbreDeJoueur) {

        this.nbreDeJoueur = nbreDeJoueur;
        resultat = new HashMap<>();

    }

    public synchronized void classement(String nom, int lancer) {

        resultat.put(lancer, nom);

        for (Integer s : resultat.keySet()) {
            gagnant = resultat.get(s);
        }


    }


}

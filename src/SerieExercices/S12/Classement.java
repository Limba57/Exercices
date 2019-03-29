package SerieExercices.S12;

import java.util.HashMap;

public class Classement {

    private HashMap<Integer, String> resultat;
    private String gagnant;

    public Classement() {

        resultat = new HashMap<>();

    }

    public synchronized void classement( Integer lancer,String nom) {

        resultat.put(lancer, nom);


        for (Integer s : resultat.keySet()) {

            if (s >= lancer) {
                gagnant = resultat.get(s)+" avec un lancer de "+s;
                lancer = s;
            }
        }

        notify();

    }

    public String getGagnant() {
        return gagnant;
    }

}

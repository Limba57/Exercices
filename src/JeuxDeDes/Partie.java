package JeuxDeDes;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Partie {

    Dice dice;
    HashMap<String,Integer> resultas;
    boolean drapeau;

    public Partie(){

        int faces;
        Scanner sc = new Scanner(System.in);

        System.out.println("combien de face voulez vous pour votre des : ");
        faces = sc.nextInt();
        dice = new Dice(faces);
        resultas = new HashMap<>();

    }

    public static int aleatoire (int mini ,int maxi){

        int nombreAleatoire = mini + (int)(Math.random() * ((maxi - mini) + 1));
        return nombreAleatoire;
    }

    public synchronized int jouer (Joueur joueur) {

        int lancer;
        String gagnant = joueur.getNom();

        lancer = this.dice.lancer(joueur);
        resultas.put(joueur.getNom(),lancer);

        for (String s : resultas.keySet()) {
            if(resultas.get(s) > lancer)
                gagnant = s;
        }
        System.out.println("le plus grand score est à : "+gagnant+"\n");
        notifyAll();
        return lancer;

    }
}

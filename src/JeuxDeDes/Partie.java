package JeuxDeDes;


import java.util.HashMap;
import java.util.Scanner;

public class Partie {

    Dice dice;
    HashMap<Integer,String> resultas;
    String gagnant;

    public Partie(){

        int faces;
        Scanner sc = new Scanner(System.in);

        System.out.println("combien de face voulez vous pour votre des : ");
        faces = sc.nextInt();
        dice = new Dice(faces);
        resultas = new HashMap<>();

    }


    public synchronized int jouer (Joueur joueur) {

       int lancer;

        lancer = this.dice.lancer(joueur);
        resultas.put(lancer,joueur.getNom());

        for (Integer s : resultas.keySet()) {

            if(s >= lancer) {
                gagnant = resultas.get(s);
                lancer = s;
            }

        }
        System.out.println(resultas);
        System.out.println("le plus grand score est à : "+gagnant+"\n");
        notifyAll();
        return lancer;

    }
}

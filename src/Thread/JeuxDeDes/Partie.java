package Thread.JeuxDeDes;


import java.util.HashMap;
import java.util.Scanner;

public class Partie {

    Dice dice;
    HashMap<Integer,String> resultas;
    String gagnant;
    int compteur = 6;

    public Partie(){

        int faces;
        Scanner sc = new Scanner(System.in);

        System.out.println("combien de face voulez vous pour votre des : ");
        faces = sc.nextInt();
        dice = new Dice(faces);
        resultas = new HashMap<>();

    }


    public synchronized void jouer (Joueur joueur) {

       int lancer;

        lancer = this.dice.lancer(joueur);
        resultas.put(lancer,joueur.getNom());

        for (Integer s : resultas.keySet()) {

            if(s >= lancer) {
                gagnant = resultas.get(s)+" avec "+s;
                lancer = s;
            }

        }
        while (compteur != 1) {
            try {
                compteur--;
                wait();
            } catch (InterruptedException e) {
                System.out.println("erreur ds le wait");
            }
        }
        notifyAll();
        if (compteur == 1){
            System.out.println(gagnant);
        }
        //System.out.println(resultas);
        //System.out.println("le plus grand score est à : "+gagnant+"\n");
        //notifyAll();
        //System.out.println("le gagnant est "+gagnant);
        //return gagnant;

    }
}

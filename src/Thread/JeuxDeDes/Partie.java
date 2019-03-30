package Thread.JeuxDeDes;


import java.util.HashMap;
import java.util.Scanner;

public class Partie {

    Dice dice;
    HashMap<Integer,String> resultas;
    String gagnant;
    int compteur = 11;

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
                gagnant = "\n****** Et c'est "+resultas.get(s)+" qui gagne avec un lancé à "+s+" ******\n";
                lancer = s;
            }

        }
        if(compteur != 1) {
            try {
                compteur--;
                System.out.println("on attend les copains");
                wait();
            } catch (InterruptedException e) {
                System.out.println("erreur ds le wait");
            }
        }else{
            notifyAll();
            System.out.println(gagnant);
        }
        System.out.println(joueur.getNom()+" quitte la partie");


    }
}

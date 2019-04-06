package Thread.JeuxDeDes;

import java.util.Random;
import java.util.Scanner;

public class Dice {

    int nbrDeFaces;
    //private Random rand;

    public Dice(int nbrDeFaces) {

        this.nbrDeFaces = nbrDeFaces;
        // this rand = new Random();
    }

    public Dice() {
        nbrDeFaces = 6;
    }

    public synchronized int lancer (Joueur joueur){

        Scanner sc = new Scanner(System.in);
        System.out.println("\n---------------------\n");
        System.out.println(joueur.getNom()+" Pret à lancer le des ...");
        //sc.nextLine();
        int nombreAleatoire = 1 + (int)(Math.random() * (nbrDeFaces));
        // ou int nombreAleatoire = rand.nextInt(nbrDeFaces)+1
        System.out.println("Et c'est un : "+nombreAleatoire+" !!!!!!");

        return nombreAleatoire;

    }
}

package Thread.JeuxDeDes;

import java.util.Scanner;

public class Dice {

    int nbrDeFaces;

    public Dice(int nbrDeFaces) {

        this.nbrDeFaces = nbrDeFaces;

    }

    public Dice() {
        nbrDeFaces = 6;
    }

    public int lancer (Joueur joueur){

        Scanner sc = new Scanner(System.in);
        System.out.println("\n---------------------\n");
        System.out.println(joueur.getNom()+" Pret à lancer le des ...");
        //sc.nextLine();
        int nombreAleatoire = 1 + (int)(Math.random() * (nbrDeFaces));
        System.out.println("Et c'est un : "+nombreAleatoire+" !!!!!!");

        return nombreAleatoire;

    }
}

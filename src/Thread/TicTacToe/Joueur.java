package Thread.TicTacToe;

import java.util.Scanner;

public class Joueur implements Runnable{

    String nom;
    String jeton;
    Scanner sc ;
    Grille grille;
    Scanner scanner;

    public Joueur(int numero,String jeton,Grille grille) {

        sc = new Scanner(System.in);
        System.out.println("Joueur "+numero+" quel est votre nom ");
        nom = sc.nextLine();
        this.jeton = jeton;
        this.grille = grille;
        sc = new Scanner(System.in);

    }

    @Override
    public void run() {
        synchronized (grille) {
            boolean stop;
            do {

                System.out.println(nom + " choisissez une position");
                System.out.println(grille);
                int reponse = sc.nextInt();
                stop = grille.ajouter(jeton, reponse);

            } while (stop);
        }

    }
}

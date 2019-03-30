package Thread.TicTacToe;

import java.util.Scanner;

public class Joueur {

    String nom;
    String jeton;
    Scanner sc ;

    public Joueur(String jeton) {

        sc = new Scanner(System.in);
        System.out.println("Quel est votre nom ");
        nom = sc.nextLine();
        this.jeton = jeton;

    }
}

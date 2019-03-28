package SerieExercices.S12;

import Thread.JeuxDeDes.Dice;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ConnexionDeJoueur implements Runnable {

    private ConnectDice dice;
    private Socket joueurSocket;
    private String nom;
    private Scanner sc;
    private int resultat = 0;
    private PrintWriter out;
    Thread t;


    public ConnexionDeJoueur(Socket joueurSocket, int faces) throws IOException {

        sc = new Scanner(System.in);
        System.out.println("Quel est votre nom ?");
        nom = sc.nextLine();

        this.joueurSocket = joueurSocket;
        System.out.println("Connexion au serveur OK");
        dice = new ConnectDice(faces);

        out = new PrintWriter(joueurSocket.getOutputStream(), true);

        t = new Thread(this);
        t.start();
    }



    @Override
    public void run() {

        resultat = dice.lancer(this);
        out.println(nom);
        out.println(resultat);

    }

    public String getNom() {
        return nom;
    }
}

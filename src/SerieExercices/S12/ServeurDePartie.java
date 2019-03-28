package SerieExercices.S12;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class ServeurDePartie {

    private ServerSocket serverSocket;
    private Socket joueurSocket;
    private int nbrDeJoueur;
    private Scanner sc;
    private int nbrDeFaces;
    private Classement classement;
    private ConnectDice des;
    boolean stop = false;


    public ServeurDePartie (int port) {

        sc = new Scanner(System.in);

        System.out.println("Combien de joueur pour cette partie ?");
        nbrDeJoueur = sc.nextInt();
        classement = new Classement(nbrDeJoueur);

        System.out.println("Avec un dés à combien de faces voulez-vous jouer ?");
        nbrDeFaces = sc.nextInt();
        des = new ConnectDice(nbrDeFaces);
        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            System.out.println("Erreur de creation du socketServer");
        }
        System.out.println("-- SERVEUR OK --");
        System.out.println("-- En attente de "+nbrDeJoueur+" joueurs");

        attenteDeConnexion();
    }

    private synchronized void attenteDeConnexion() {

        int compteur = nbrDeJoueur;

        ArrayList<Thread> fileAttente = new ArrayList<>();

         do{
             try {
                joueurSocket = serverSocket.accept();
                System.out.println("Un nouveau joueur connecté");
                compteur--;
                System.out.println("Plus que " + compteur + " joueur en attente");

                 Thread t = new Thread(new ConnexionJoueur(this));
                 fileAttente.add(t);
             } catch (IOException e) {
                 System.out.println("connexion au joueur impossible");
             }


        }while (compteur != 0);
        for (Thread t : fileAttente) {
            t.start();
        }

        System.out.println("Tout le monde est là, on peut commencer");


        do {
        } while (!stop);
        //deconnexion();
    }

    private void deconnexion() {

        char reponse;
        Scanner scUn = new Scanner(System.in);

        do{
            System.out.println("Voulez vous couper le serveur o/n");
            reponse = scUn.nextLine().charAt(0);
        }while ( reponse != 'o');

        System.out.println("Salut");


    }














    public ConnectDice getDes() {
        return des;
    }

    public void setDes(ConnectDice des) {
        this.des = des;
    }

    public ServerSocket getServerSocket() {
        return serverSocket;
    }

    public void setServerSocket(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    public Socket getJoueurSocket() {
        return joueurSocket;
    }

    public void setJoueurSocket(Socket joueurSocket) {
        this.joueurSocket = joueurSocket;
    }

    public int getNbrDeJoueur() {
        return nbrDeJoueur;
    }

    public void setNbrDeJoueur(int nbrDeJoueur) {
        this.nbrDeJoueur = nbrDeJoueur;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public int getNbrDeFaces() {
        return nbrDeFaces;
    }

    public void setNbrDeFaces(int nbrDeFaces) {
        this.nbrDeFaces = nbrDeFaces;
    }

    public Classement getClassement() {
        return classement;
    }

    public void setClassement(Classement classement) {
        this.classement = classement;
    }
}

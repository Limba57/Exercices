package SerieExercices.S12;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServeurDePartie {

    private ServerSocket serverSocket;
    private Socket joueurSocket;
    private int nbrDeJoueur;
    private Scanner sc;
    private int nbrDeFaces;
    public Classement classement;


    public ServeurDePartie (int port) throws IOException {

        sc = new Scanner(System.in);

        System.out.println("Combien de joueur pour cette partie ?");
        nbrDeJoueur = sc.nextInt();
        classement = new Classement(nbrDeJoueur);

        System.out.println("Avec un dés à combien de faces voulez-vous jouer ?");
        nbrDeFaces = sc.nextInt();

        serverSocket = new ServerSocket(port);
        System.out.println("-- SERVEUR OK --");
        System.out.println("-- En attente de "+nbrDeJoueur+" joueurs");

        attenteDeConnexion();
    }

    private synchronized void attenteDeConnexion() throws IOException{

        int compteur = nbrDeJoueur;

        while (compteur != 0) {

            joueurSocket = serverSocket.accept();
            System.out.println("Un nouveau joueur connecté");
            compteur--;
            System.out.println("Plus que " + compteur + " joueur en attente");
            Thread t = new Thread(new ConnexionJoueur(joueurSocket, this.classement));
        }
        notifyAll();
        System.out.println("Tout le monde est là, on peut commencer");
    }

}

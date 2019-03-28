package SerieExercices.S12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ConnexionJoueur implements Runnable{

    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    private ServeurDePartie serveur;


    int lancer;
    String nom;

    public ConnexionJoueur(ServeurDePartie serveur) {

        this.socket = serveur.getJoueurSocket();
        this.serveur = serveur;
        try {
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            out.println("connexion ok");

        } catch (IOException e) {
            System.out.println("variable nom pas recue");
        }
    }

    @Override
    public void run() {
        System.out.println("test");
        //lancer = serveur.getDes().lancer();
        out.println("c'est partie");
        out.println("ok");

        try {
            do {
                nom = in.readLine();
                System.out.println(nom);
            } while (nom.isEmpty() == false);
        } catch (IOException e) {
            System.out.println("prbl à la reception du nom");
        }
        System.out.println(nom);

    }
}

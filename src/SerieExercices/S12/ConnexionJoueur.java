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

        this.serveur = serveur;
        this.socket = this.serveur.getJoueurSocket();

        try {
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            nom = in.readLine();

        } catch (IOException e) {
            System.out.println("probleme à l'ouverture des flux sur les threads");
        }
    }

    @Override
    public void run() {

        lancer = this.serveur.getDes().lancer(nom);

        serveur.getClassement().classement(lancer, nom);
        out.println("ok");

        out.println("--> "+nom+" vous avez fait un jet de : "+lancer+".--> le gagnant est "+serveur.getClassement().getGagnant());

    }
}

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

    public ConnexionJoueur(ServeurDePartie serveur) throws IOException {

        this.socket = serveur.getJoueurSocket();
        this.serveur = serveur;

        in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
        do {
            nom = in.readLine();
        } while (nom.isEmpty());
        out = new PrintWriter(socket.getOutputStream(), true);

    }

    @Override
    public void run() {

        lancer = serveur.getDes().lancer();

        out.println("ok");

    }
}

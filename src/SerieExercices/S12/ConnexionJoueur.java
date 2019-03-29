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

        lancer = this.serveur.getDes().lancer();

        try {
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            //out.println("connexion ok");

        } catch (IOException e) {
            System.out.println("variable nom pas recue");
        }
    }

    @Override
    public void run() {

        try {

        out.println("ok");
        nom = in.readLine();
        //out.println(nom);

        out.println(nom+" vous avez fait un jet de : "+lancer);

        } catch (IOException e) {
            System.out.println("prbl à la reception du nom");
        }


    }
}

package SerieExercices.S12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ConnexionJoueur implements Runnable{

    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    public Classement classement;

    public ConnexionJoueur(Socket socket, Classement classement) throws IOException {
        this.socket = socket;
        this.classement = classement;
        out = new PrintWriter(socket.getOutputStream(), true);
    }

    @Override
    public void run() {
        out.println("En attente des joueurs");
        try {
            wait();
        } catch (InterruptedException e) {
            System.out.println("Merde ds tes wait");
        }


        out.println("tout le monde est là on peut commencer");
        /*do {
            in =
        } while ();

         */
    }
}
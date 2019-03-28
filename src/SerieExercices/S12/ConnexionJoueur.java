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
    public Classement classement;
    String nom;

    public ConnexionJoueur(Socket socket, Classement classement) throws IOException {
        this.socket = socket;
        this.classement = classement;
        out = new PrintWriter(socket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));

    }

    @Override
    public void run() {

        out.println("ok");

    }
}

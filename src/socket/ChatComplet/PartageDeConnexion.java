package socket.ChatComplet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;


public class PartageDeConnexion implements Runnable{

    private Socket socket;
    private Serveur serveur;
    private ReceptionServeur reception;
    private PrintWriter out;


    public PartageDeConnexion(Socket socket, Serveur serveur) {
        this.serveur = serveur;
        this.socket = socket;
        try {
            out = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void emissionClient(String message) {
        out.println(message);
    }

    @Override
    public void run() {
        reception = new ReceptionServeur(socket,serveur);
    }

}

package socket.ExempleCour;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.UnexpectedException;

public class MyClient {

    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public MyClient(String msg) throws UnexpectedException, IOException {
        // essai de connexion
        clientSocket = new Socket("127.0.0.1", 5000);
        out = new PrintWriter(clientSocket.getOutputStream(), true);

        System.out.println("Client - on envoie : " + msg);
        // utilisation du flux de sortie pour envoyer le message au serveur
        out.println(msg);

        out.close();
        clientSocket.close();
    }

    public static void main(String[] args) {

        try {
            MyClient client = new MyClient("bonjours le serveur");
        } catch (Exception e) {
            System.out.println("pblm chez le client");
        }
    }
}

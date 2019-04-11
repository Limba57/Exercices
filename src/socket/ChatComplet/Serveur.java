package socket.ChatComplet;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Serveur {

    private ServerSocket serverSocket;
    private Socket socket;
    private boolean infini = true;
    private ArrayList<Socket> diffusion;

    public Serveur(int port) throws IOException{

        System.out.println("----- LANCEMENT DU SERVEUR -----");

        serverSocket = new ServerSocket(port);

        connexion();
    }

    public void connexion() throws IOException{

        while (infini) {

            socket = serverSocket.accept();

            System.out.println("----- NOUVEAU CLIENT CONNECTE -----");
            Thread t = new Thread(new PartageDeConnexion(socket));
            t.start();

        }
    }
}

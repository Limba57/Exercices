package socket.ChatComplet.Serveur;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Serveur {

    private ServerSocket serverSocket;
    private Socket socket;
    private boolean infini = true;
    private ArrayList<PartageDeConnexion> diffusion;

    public Serveur(int port) {

        System.out.println("----- LANCEMENT DU SERVEUR -----");
        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
        diffusion = new ArrayList<>();
        connexion();
    }

    public void connexion() {

        while (infini) {

            try {
                socket = serverSocket.accept();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("----- NOUVEAU CLIENT CONNECTE -----");
            PartageDeConnexion p = new PartageDeConnexion(socket, this);
            diffusion.add(p);
            Thread t = new Thread(p);

            t.start();

        }
    }

    public synchronized void emissionTotal(String message) {

        for (PartageDeConnexion p : diffusion) {
            p.emissionClient(message);
        }
    }
}

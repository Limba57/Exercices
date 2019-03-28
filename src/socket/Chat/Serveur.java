package socket.Chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {

    private ServerSocket serverSocket;
    private Socket clientSocket;
    private boolean infini = true;

    public Serveur(int port) throws IOException {

        System.out.println("Lancement du serveur");
        serverSocket = new ServerSocket(port);
        connexion();

    }

    public void connexion() throws IOException{

        while (infini) {
            clientSocket = serverSocket.accept();
            System.out.println("Un nouveau client connecté");
            Thread t = new Thread(new ChatClient(clientSocket));
            t.start();
            // ici normalement le buffer reader
        }

    }

}

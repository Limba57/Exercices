package socket.ExempleCour.Ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Serveur {

    private ServerSocket serverSocket;
    private Socket socketClient;
    private BufferedReader in;
    private boolean infini = true;

    public Serveur(int port) throws IOException {

        System.out.println("--- Lancement du serveur ---");
        serverSocket = new ServerSocket(port);

        // en attente d'un client
        do {
            socketClient = serverSocket.accept();
            System.out.println("connexion au client ok");
            Thread t = new Thread(new ThreadClient(socketClient));
            t.start();
        } while (infini);

        in = new BufferedReader(new InputStreamReader(this.socketClient.getInputStream()));

    }

    public boolean reception() throws IOException{

        String message = in.readLine();

        if (message.equals("stop")) {

            return false;

        }else{
            System.out.println("Message recue : " + message);
            return true;
        }

    }

    public void deconnexion() {
        try {
            in.close();
            socketClient.close();
            serverSocket.close();
        } catch (IOException e) {
            System.out.println("IO Exeption à la fermeture du serveur");
        }

    }




}

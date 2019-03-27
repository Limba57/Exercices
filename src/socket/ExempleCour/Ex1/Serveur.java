package socket.ExempleCour.Ex1;

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
    private PrintWriter out;
    Scanner sc;

    public Serveur(int port) throws IOException {

        System.out.println("--- Lancement du serveur ---");
        serverSocket = new ServerSocket(port);

        socketClient = serverSocket.accept();
        System.out.println("connexion au client ok");
        out = new PrintWriter(socketClient.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(socketClient.getInputStream()));

        sc = new Scanner(System.in);
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

    public void emission(String message) {

        out.println(message);

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

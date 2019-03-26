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

    public Serveur() throws IOException {

        System.out.println("--- Lancement du serveur ---");
        serverSocket = new ServerSocket(5000);

        socketClient = serverSocket.accept();

        out = new PrintWriter(socketClient.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(socketClient.getInputStream()));

        sc = new Scanner(System.in);
    }


    public void reception() throws IOException{

        String message = in.readLine();

        System.out.println("Message recue : " + message);

    }

    public void emission(String message) {

        //String message;

        //System.out.println("Entrez votre message : ");
        //message = sc.nextLine();
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

package socket.ExempleCour.Ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private Socket socketClient;
    private BufferedReader in;
    private PrintWriter out;
    Scanner sc;

    public Client() throws IOException {

        socketClient = new Socket("127.0.001", 5000);

        out = new PrintWriter(socketClient.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(socketClient.getInputStream()));
        System.out.println("--- Client connecté ---");

        //reception();

        sc = new Scanner(System.in);

    }

    public void reception() throws IOException{

        String message = in.readLine();

        System.out.println("Message recue : " + message);

    }

    public void emission(String message) {

        //System.out.println("Entrez votre message : ");
        //message = sc.nextLine();
        out.println(message);

    }

    public void deconnexion() {
        try {
            in.close();
            socketClient.close();
        } catch (IOException e) {
            System.out.println("IO Exeption à la fermeture du client");
        }

    }
}

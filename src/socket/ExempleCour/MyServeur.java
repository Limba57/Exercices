package socket.ExempleCour;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServeur {

    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public MyServeur() throws IOException {

        System.out.println("SERVER LAUNCH");
        serverSocket = new ServerSocket(5000);

        // on attennd la connexion d'un client
        clientSocket = serverSocket.accept();

        // on recupert le flux d'entree et de sortie du client socket
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        // on attend un message du client
        String msg = in.readLine();
        System.out.println("SERVER - message recu : " + msg);

        //fermer les ressources
        try {
            in.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            System.out.println("IO Exeption trow on serveur end");
        }
    }

    public static void main(String[] args) {
        try {
            MyServeur server = new MyServeur();

        } catch (IOException e) {
            System.out.println("IO Exeption trow on serveur end");
        }
    }


}

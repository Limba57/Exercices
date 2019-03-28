package socket.Chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    private PrintWriter out;
    private Socket socket;
    private String nom;


    public Client(String nom, int port)throws IOException {

        this.nom = nom;
        // ouverture de la ligne vers l'adresss au port
        socket = new Socket("127.0.001",port);
        // confirmation de connexion
        System.out.println(this.nom+" ---> CONNECTION AU SERVEUR OK");
        // ouverture du flux d'ecriture et on y met ce qui sort de la socket, true pour flush auto (flux verifie que tout est envoyé)
        out = new PrintWriter(socket.getOutputStream(), true);

    }

    public void emission(String message) {

        out.println(message);

    }

    public void deconnexion() throws IOException{
        emission("stop");
        socket.close();
        out.close();
    }

    public String getNom() {
        return nom;
    }
}

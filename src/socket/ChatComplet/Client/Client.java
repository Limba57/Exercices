package socket.ChatComplet.Client;

import java.io.IOException;
import java.net.Socket;

public class Client {

    private String pseudo;
    private Socket socket;
    private Emission emission;
    private Reception reception;

    public Client(String pseudo, int port) {

        this.pseudo = pseudo;
        try {
            socket = new Socket("127.0.001",port);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("----- CONNEXION AU SERVEUR OK -----");

        emission = new Emission(socket,this);
        reception = new Reception(socket);
    }

    public String getPseudo() {
        return pseudo;
    }

    public Socket getSocket() {
        return socket;
    }

}

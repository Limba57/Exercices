package socket.Chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ChatClient implements Runnable {

    private Socket clientSocket;
    private BufferedReader in;
    private boolean stop = false;

    public ChatClient(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try {
        // on ouvre un buffer ds le quel on met un flux qui contient les données envoyée par le client socket
        do {

                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                String message = in.readLine();
                if (message.equals("stop")) {
                    stop = true;
                } else {
                    System.out.println(message);
                }

        } while (!stop);

        deconexion();
        } catch (IOException e) {
            System.out.println("Probleme ds le flux entrant");
        }
    }

    public void deconexion() throws IOException{
        System.out.println("deconnexion");
        in.close();
        clientSocket.close();
    }
}

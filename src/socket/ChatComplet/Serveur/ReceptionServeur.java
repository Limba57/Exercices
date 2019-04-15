package socket.ChatComplet.Serveur;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceptionServeur implements Runnable{

    private Socket socket;
    private BufferedReader in;
    private Thread t;
    private boolean stop;
    private Serveur serveur;

    public ReceptionServeur(Socket socket,Serveur serveur) {
        this.serveur = serveur;
        this.socket = socket;
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stop = false;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {

        do {
            try {
                String message = in.readLine();
                //System.out.println(message);
                serveur.emissionTotal(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (!stop);
    }

}

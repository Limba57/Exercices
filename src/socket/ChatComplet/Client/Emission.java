package socket.ChatComplet.Client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Emission implements Runnable{

    private Socket socket;
    private Client client;
    private PrintWriter out;
    private Thread t;
    boolean stop;
    private Scanner sc;

    public Emission(Socket socket,Client client) {

        this.client = client;
        sc = new Scanner(System.in);
        stop = false;
        this.socket = socket;
        try {
            out = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {

        do {

            String message = client.getPseudo()+" : "+sc.nextLine();

            out.println(message);

        } while (!stop);
    }
}


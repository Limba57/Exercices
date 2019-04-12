package socket.ChatComplet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EmissionServeur implements Runnable{

    private Socket socket;
    private PrintWriter out;
    private Thread t;
    boolean stop;
    private Scanner sc;

    public EmissionServeur(Socket socket) {

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

            String message = sc.nextLine();

            out.println(message);

        } while (!stop);
    }
}

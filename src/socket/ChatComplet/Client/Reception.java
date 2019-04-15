package socket.ChatComplet.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Reception implements Runnable{

    private Socket socket;
    private BufferedReader in;
    private Thread t;
    private boolean stop;

    public Reception(Socket socket) {
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
                System.out.println(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (!stop);
    }
}

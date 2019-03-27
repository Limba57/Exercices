package socket.ExempleCour.Ex2;

import java.net.Socket;

public class ThreadClient implements Runnable{

    private Serveur serveur;
    private Thread t;

    public ThreadClient(Serveur serveur) {

        this.serveur = serveur;
        t.start();
    }

    @Override
    public void run() {



    }
}

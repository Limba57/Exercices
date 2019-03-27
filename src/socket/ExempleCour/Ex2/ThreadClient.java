package socket.ExempleCour.Ex2;


import java.net.Socket;

public class ThreadClient implements Runnable{

    private Socket clientSocket;

    public ThreadClient(Socket clientSocket) {

        this.clientSocket = clientSocket;

    }

    @Override
    public void run(){


    }


}

package socket.ExempleCour.Ex2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ThreadClient implements Runnable{

    private Socket clientSocket;
    private BufferedReader in;
    private boolean running = true;


    public ThreadClient(Socket clientSocket) {

        this.clientSocket = clientSocket;

    }

    @Override
    public void run(){
//        try {
//            in = new BufferedReader(new InputStreamReader(this.clientSocket.getInputStream()));
//        } catch (IOException e) {
//            System.out.println("T'as fais de la merde");
//        }

        while (running){
            try {
                in = new BufferedReader(new InputStreamReader(this.clientSocket.getInputStream()));
                String message = in.readLine();
                if (message == null){
                    running = false;
                    System.out.println("Deconnexion du client");
                    clientSocket.close();
                }
                else
                    System.out.println(message);

            } catch (IOException e) {
                System.out.println("T'as fais de la merde");
            }
        }
    }


}

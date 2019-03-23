package OCR.Net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

    public static void main(String[] zero) {
        Socket socket;
        BufferedReader in;
        PrintWriter out;

        try{
            socket = new Socket(InetAddress.getLocalHost(),2009);
            System.out.println("Demande de connexion");
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String messageDistant = in.readLine();
            System.out.println(messageDistant);
            socket.close();
        }catch (UnknownHostException e){
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
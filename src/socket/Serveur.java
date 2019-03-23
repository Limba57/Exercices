package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {

    public static void main(String[] zero) {

        ServerSocket socketserver;
        Socket socketduserveur;
        BufferedReader in;
        PrintWriter out;


        try{

            socketserver = new ServerSocket(2009);
            System.out.println("Le serveur est a l'ecoute du port"+socketserver.getLocalPort());
            socketduserveur = socketserver.accept();
            System.out.println("Seb est conecté");
            out = new PrintWriter(socketduserveur.getOutputStream());
            out.println("Vous etes connecté seb");
            out.flush();
            socketserver.close();
            socketduserveur.close();
        }catch (IOException e){
            System.out.println("erreur serveur");
        }

    }

}

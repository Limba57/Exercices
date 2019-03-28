package SerieExercices.S12;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Joueur {

    private String nom;
    //private Partie partie; voir pour redefinir partie
    private Thread t; // thread du joueur
    private Socket socket;
    private Scanner sc;
    private BufferedReader in;
    private PrintWriter out;
    //private

    public Joueur( int port) throws IOException {

        sc = new Scanner(System.in);
        System.out.println("Quel est votre nom ?");
        nom = sc.nextLine();
        socket = new Socket("127.0.001", port);
        System.out.println("-- "+nom+" CONNEXION OK --");
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        attente();
    }

    public void attente() throws IOException{

        String ok;

        do {
            ok = in.readLine();
        } while (ok.isEmpty());

        System.out.println("Au revoir");
    }


}

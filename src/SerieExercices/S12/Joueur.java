package SerieExercices.S12;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Joueur {

    private String nom;
    private Socket socket;
    private Scanner sc;
    private BufferedReader in;
    private PrintWriter out;

    public Joueur( int port){

        sc = new Scanner(System.in);
        System.out.println("Quel est votre nom ?");
        nom = sc.nextLine();
        try {
        socket = new Socket("127.0.001", port);
        System.out.println("-- "+nom+" CONNEXION OK --");

            out = new PrintWriter(socket.getOutputStream(),true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out.println(nom);
        } catch (IOException e) {
            System.out.println("erreur de connexion coté joueur : "+nom);
        }
        attente();

    }

    public void attente() {

        String ok;
        System.out.println("en attente d'autre joueurs");

        try {
            do {

                ok = in.readLine();
                System.out.println(ok);

            } while (!ok.equals("ok"));
        } catch (IOException e) {
            System.out.println("erreure pdt l'attente");
        }
        out.println(nom);
        pretAJouer();

    }

    public void pretAJouer() {

        String message ;

            try {
                message = in.readLine();
                String regex = "(\\.)";
                Pattern pattern = Pattern.compile(regex);
                String[] array = pattern.split(message);
                System.out.println(array[0]);
                System.out.println(array[1]);
            } catch (IOException e) {
                System.out.println("probleme en reception de fin de partie");
            }

    }


}

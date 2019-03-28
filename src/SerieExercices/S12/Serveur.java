package SerieExercices.S12;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

public class Serveur {

    private ServerSocket serverSocket;
    private Socket joueurSocket;
    private int nbrDeJoueur;
    private Scanner sc;
    //private Dice dice;
    private HashMap<Integer, String> resultat;
    private String gagnant;
    int faces;
    private BufferedReader in;




    public Serveur(int port) throws IOException {

        Scanner sc = new Scanner(System.in);

        // Nombre de joueurs désiré
        System.out.println("Nombre de joueurs ?");
        nbrDeJoueur = sc.nextInt();

        // Nombre de faces du des
        System.out.println("Combien de face voulez vous pour le des");
        faces = sc.nextInt();
        //dice = new Dice(faces);

        // serveur actif
        serverSocket = new ServerSocket(port);
        System.out.println("--- SERVEUR ACTIF EN ATTENTE DES JOUEURS ---");
        attenteDeConnexion();

        // buffer
        in = new BufferedReader(new InputStreamReader(joueurSocket.getInputStream()));
    }

    public void attenteDeConnexion() throws IOException {

        int compteur = nbrDeJoueur;

        // attente de la connexion du nombre de joueur voulu
        while (compteur != 0) {
            joueurSocket = serverSocket.accept();
            System.out.println("Un nouveau joueur connecté");
            compteur--;
            System.out.println("plus que " + compteur + " en attente pour commencer la partie");
            Thread t = new Thread(new ConnexionDeJoueur(joueurSocket,faces));
            //t.start();
        }
        System.out.println("Tout le monde est là, c'est partie");
        jouer();

    }

    public synchronized void jouer() {

        int compteur = nbrDeJoueur;
        int lancer = 0;
        String nom = "";

        while (compteur != 0) {
            try {
                lancer = in.read();
                nom = in.readLine();
            } catch (IOException e) {
                System.out.println("merde ds jouer");
            }
            resultat.put(lancer, nom);
            notify();
        }

        System.out.println(resultat);


    }
}

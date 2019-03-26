package socket.ExempleCour.Ex1;

import java.io.IOException;
import java.util.Scanner;

public class MainServeur {

    public static void main(String[] args) throws IOException {

        Serveur serveur = new Serveur();
        Scanner sc = new Scanner(System.in);
        String message;


        do {

            System.out.println("Entrez votre message :");
            message = sc.nextLine();
            serveur.emission(message);
            serveur.reception();


        } while (message != "stop");

        serveur.deconnexion();



    }
}

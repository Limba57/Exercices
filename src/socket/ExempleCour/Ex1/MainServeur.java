package socket.ExempleCour.Ex1;

import java.io.IOException;
import java.util.Scanner;

public class MainServeur {

    public static void main(String[] args) throws IOException {

        Serveur serveur = new Serveur();
        Scanner sc = new Scanner(System.in);
        String message;
        boolean stop = false;


        do {

            System.out.println("Entrez votre message :");
            message = sc.nextLine();

            if (message.equals("stop")) {
                System.out.println("deconnexion");
                serveur.deconnexion();
                stop = true;
            } else {
                serveur.emission(message);
                serveur.reception();
            }



        } while (stop == false);





    }
}

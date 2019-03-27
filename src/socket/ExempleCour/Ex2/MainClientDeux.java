package socket.ExempleCour.Ex2;

import java.io.IOException;
import java.util.Scanner;

public class MainClientDeux {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre nom :");
        String nom = sc.nextLine();
        Client client = new Client(5000, nom);

        String message;
        boolean stop = false;

        do {

            System.out.println("-- " + nom + " -- Entrez votre message :");
            message = sc.nextLine();

            if (message.equals("stop")) {
                client.emission(message);
                stop = true;
            } else {
                client.emission("-- " + nom + " -- " + message);
            }

        } while (!stop);

        System.out.println("Deconnexion de " + nom);
        client.deconnexion();
    }
}

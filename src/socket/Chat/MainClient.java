package socket.Chat;

import java.io.IOException;
import java.util.Scanner;

public class MainClient {

    public static void main(String[] args) throws IOException {

        System.out.println("Entrez votre nom : ");
        Scanner sc = new Scanner(System.in);
        String nom = sc.nextLine();
        String message;
        Client client = new Client(nom, 5000);
        boolean stop = false;

        do {

            System.out.println(client.getNom()+" : ");
            message = sc.nextLine();
            if (message.equals("stop")) {
                client.emission(message);
                stop = true;
            } else {
                client.emission(client.getNom()+" : "+message);
            }

        } while (!stop);

        client.deconnexion();

    }
}

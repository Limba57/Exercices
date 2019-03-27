package socket.ExempleCour.Ex1;

import java.io.IOException;
import java.util.Scanner;

public class MainClient {

    public static void main(String[] args) throws IOException {


        Client client = new Client(5000);
        Scanner sc = new Scanner(System.in);
        String message;
        boolean stop = false;

        do{

            System.out.println("--CLIENT-- Entrez votre message :");
            message = sc.nextLine();

            if (message.equals("stop")) {
                client.emission(message);
                stop = true;
            } else {
                client.emission(message);
            }

        }while (!stop);

        System.out.println("Deconnexion du CLIENT");
        client.deconnexion();








    }
}

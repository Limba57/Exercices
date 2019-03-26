package socket.ExempleCour.Ex1;

import java.io.IOException;
import java.util.Scanner;

public class MainClient {

    public static void main(String[] args) throws IOException {


        Client client = new Client();
        Scanner sc = new Scanner(System.in);
        String message;

        do{

            System.out.println("Entrez votre message :");
            message = sc.nextLine();
            client.emission(message);
            client.reception();


        }while (message != "stop");

            client.deconnexion();



    }
}

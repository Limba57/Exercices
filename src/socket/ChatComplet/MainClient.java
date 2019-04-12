package socket.ChatComplet;

import java.util.Scanner;

public class MainClient {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String pseudo ;

        System.out.println("Entrez votre pseudo : ");

        pseudo = sc.nextLine();

        new Client(pseudo, 5000);

    }
}

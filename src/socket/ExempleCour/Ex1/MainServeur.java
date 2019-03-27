package socket.ExempleCour.Ex1;

import java.io.IOException;
import java.util.Scanner;

public class MainServeur {

    public static void main(String[] args) throws IOException {

        Serveur serveur = new Serveur(5000);
        Scanner sc = new Scanner(System.in);
        String message;
        boolean stop;


        do {

                stop = serveur.reception();

        } while (stop);

        System.out.println("deconnexion du SERVER");
        serveur.deconnexion();



    }
}

package Thread.BanqueDeux;

import java.util.Scanner;

public class Banque{

    Client client;

    public Banque(Client client) {
        this.client = client;
        this.guichet();
    }

    public void guichet() {

        int reponse;
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("Quelle opération souhaitez vous faire ?");
            System.out.println("1 --> retrait");
            System.out.println("2 --> depot");
            System.out.println("3 --> consulter le solde");
            System.out.println("4 --> quitter");
            reponse = sc.nextInt();
        } while (reponse != 1 && reponse != 2 && reponse != 3 && reponse != 4);

        switch (reponse) {
            case 1:
                retrait();
                guichet();
                break;
            case 2:
                depot();
                guichet();
                break;
            case 3:
                System.out.println("solde : "+this.client.getCompte().getSolde());
                this.guichet();
            case 4:
                break;
        }
    }

    public int DemandeMontant(){

        int montant;
        Scanner sc = new Scanner(System.in);

        System.out.println("quel montant");
        montant = sc.nextInt();
        return montant;


    }
}

package Thread.Banque;

import java.util.Scanner;

public class CompteBanquaire {

    private int numeroDeCompte;
    private int solde;
    private int plafond;
    private int compteur =0;


    // constructeur par defaut, plafond à 500 et solde à 0
    public CompteBanquaire(){
        this.numeroDeCompte = aleatoire(1000,5000);
        this.plafond = 500;
        this.solde = 0;
    }

    // constructeur avec un solde en parametre
    public CompteBanquaire(int solde){
        this();
        this.solde = solde;
    }

    // retourne un nombre aleatoire
    public static int aleatoire (int mini ,int maxi){

        int nombreAleatoire = mini + (int)(Math.random() * ((maxi - mini) + 1));
        return nombreAleatoire;
    }

    // retrait
    public boolean retrait (int montant){

        if(montant > plafond){
            System.out.println("\nVotre retrait de "+montant+" € est impossible, vous dépassé votre plafond fixé à "+plafond+" € maximum\n");
            return  false;
        }
        if((solde-montant) < plafond){
            System.out.println("\nPOO5_banque.Retrait de "+montant+" € impossible, vous dépassé le solde mini de votre compte");
            System.out.println("Il vous reste actuellement : "+solde+" € sur votre compte\n");
            return false;
        }else{
            System.out.println("\nOpération acceptée");
            System.out.println("debit de "+montant+" €");
            solde -= montant;
            System.out.println("Il vous reste "+solde+" € sur votre compte");
            return true;
        }

    }

    // Depot
    public void depot (int montant){

        solde += montant;
        System.out.println("\nVous venez de déposer "+montant+" € sur votre compte");
        System.out.println("Votre solde est de "+solde+" € \n");
    }

    public String toString(){

        return "\nCompte numero : "+this.getNumeroDeCompte()+"\nSolde : "+this.solde+" €";

    }

    // pose la question donné en parametre et attent une reponse 'o' ou 'n' --> retoure un booleen true = oui, false = non
    public boolean question (String question){

        Scanner sc = new Scanner(System.in);
        char reponse;

        do{
            System.out.println(question+" (o/n) :");
            try {

                reponse = sc.nextLine().charAt(0);

            }catch (Exception e){

                reponse = 'u';

            }

        }while (reponse != 'o' && reponse != 'n');

        if (reponse == 'o')
            return true;
        else
            return false;


    }

    // Getter
    public int getSolde() {
        return solde;
    }

    public int getNumeroDeCompte() {
        return numeroDeCompte;
    }

    public int getPlafond() {
        return plafond;
    }
}

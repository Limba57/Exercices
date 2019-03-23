package SerieExercices.S03;

import java.util.Scanner;

    /*
    -- Exercice 1 :

    Ecrire un programme qui demande un nombre
     a l'utilisateur et calcul sa factoriel.
    */

public class s3_exercice1 {

    public static int factorielle (int nbr){
        if (nbr > 1)
            return (nbr+factorielle(nbr-1));
        else
            return 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nbr;

        System.out.println("Entrez un nombre entier :");
        nbr = sc.nextInt();
        System.out.println(factorielle(nbr));


    }
}

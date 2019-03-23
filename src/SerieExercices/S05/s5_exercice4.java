package SerieExercices.S05;

import java.util.Scanner;

public class s5_exercice4 {

    /*
        -- Exercice 4 :

           Etant donné un tableau d'entiers,
           vérifier si le chiffre 3 apparait exactement 3 fois et que aucun des 3 ne se touche.
     */

    public static boolean verif (int[] tab){

        int compteur = 0;

        for (int i = 0 ; i < tab.length ; i++){
            if (tab[i] == 3) {
                compteur = compteur + 1;
                if (i < tab.length-1 && tab[i+1] == 3)
                    return false;
            }
        }

        if (compteur == 3)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int indice, nbr;


        System.out.println("Combien de chiffre voulez vous entrer :");
        indice = sc.nextInt();
        int tab[] = new int[indice];

        for (int i = 0 ; i < indice ; i++){
            System.out.println("Veuillez entrer le nombre numero "+(i+1)+" :");
            nbr = sc.nextInt();
            tab[i] = (nbr);
        }

        System.out.println(verif(tab));

    }

}

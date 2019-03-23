package SerieExercices.S05;

import java.util.Arrays;
import java.util.Scanner;

public class s5_exercice2 {

    /*
    -- Exercice 2 :

        Etant donné un tableau d'entiers.
        Echanger le premier et dernier élément dans le tableau.
        Afficher le tableau modifié.


        [1, 2, 3, 4] -> [4, 2, 3, 1]
     */

    public static int[] inversion (int tab[]){

        int temp = 0;

        for (int i = 0 ; i < (tab.length/2) ; i++){

            temp = tab[i];
            tab[i] = tab[tab.length-i-1];
            tab[tab.length-i-1] = temp;
        }
        return tab;
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

        tab = inversion(tab);

        System.out.println(Arrays.toString(tab));

    }

}

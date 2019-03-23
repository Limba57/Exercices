package SerieExercices.S05;

import java.util.Scanner;

public class s5_exercice5 {

    /*
    -- Exercice 5 :

       Etant donné un tableau d'entiers, vérifier si chaque chiffre 2 qui apparait se trouve bien à coté d'un autre 2.

       Exemple :
       [4, 2, 2, 3] -> ok
       [2, 2, 4, 2] -> non

     */

    public static boolean verif (int[] tab){

        for (int i =0 ; i < tab.length ; i++){
            if (i < tab.length-1 &&  tab[i] == 2)
                if (tab[i+1] == 2)
                    return false;
        }
        return true;

    }// fin fonction


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


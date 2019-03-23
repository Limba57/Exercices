package SerieExercices.S05;

import java.util.Scanner;

public class s5_exercice3 {

    /*
            -- Exercice 3 :

                Etant donné un tableau d'entiers, vérifier que le tableau ne contient pas de 3 et de 5.

                [0, 2, 4] -> ok
                [1, 2, 3] -> non
     */

    public static boolean verification(int tab[]){

        for (int i = 0 ; i < tab.length ; i++){
            if (tab[i] == 3)
                return false;
            if (tab[i] == 5)
                return false;
        }
        return true;
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

        System.out.println(verification(tab));

    }

}

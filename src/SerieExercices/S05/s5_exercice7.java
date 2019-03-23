package SerieExercices.S05;

import java.util.Scanner;

public class s5_exercice7 {
    /*
    -- Exercice 7 :

           Etant donné un tableau d'entiers, vérifier si ce tableau peut être coupé à un endroit de tel sorte que la somme d'un coté du tableau est égale à la somme de l'autre coté.
           Si oui, afficher le résultat de la somme.

            1, 1, 1, 2, 1] -> ok
            2, 1, 1, 2, 1] -> non
    */


    public static int verif(int[] tab) {

        //int sommeUn = 0, sommeDeux = 0;
        int tete = 0, queue = 0;
        for (int i = 0; i <= tab.length - 1; i++) {
            //int indice = i;
            tete = somme(0, i, tab);
            queue = somme(i + 1, tab.length - 1, tab);
            if (tete == queue)
                return (tete);
        }
        return 0;

    }

    public static int somme(int indiceDebut, int indiceFin, int[] tab) {
        int somme = 0;
        for (int i = indiceDebut; i <= indiceFin; i++)
            somme = somme + tab[i];
        return somme;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int indice, nbr;


        System.out.println("Combien de chiffre voulez vous entrer :");
        indice = sc.nextInt();
        int tab[] = new int[indice];

        for (int i = 0; i < indice; i++) {
            System.out.println("Veuillez entrer le nombre numero " + (i + 1) + " :");
            nbr = sc.nextInt();
            tab[i] = (nbr);
        }

        System.out.println(verif(tab));
    }
}

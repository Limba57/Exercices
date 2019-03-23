package SerieExercices.S06;

import java.util.ArrayList;
import java.util.Scanner;

public class s6_exercice1 {

    /*

        -- Exercice 1 :

            Etant donné une liste d'entiers.
            Retourner une liste où chaque entier est multiplié par lui-même.

            [1, 2, 3] -> [1, 4, 9]
            [6, 8, -6, -8, 1] -> [36, 64, 36, 64, 1]
     */

     static ArrayList<Integer> transformation (ArrayList<Integer> liste){

        for (int i = 0 ; i < liste.size() ; i++)
            liste.set(i, (liste.get(i)*liste.get(i)));
        return liste;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saisi;
        ArrayList<Integer> liste = new ArrayList<>();

        do {

            System.out.println("Entrez vos nombre entier pour alimenter la liste, entrez 0 pour sortir");
            saisi = sc.nextInt();
            if (saisi != 0)
                liste.add(saisi);
        }while (saisi != 0);

        System.out.println(transformation(liste));

    }
}

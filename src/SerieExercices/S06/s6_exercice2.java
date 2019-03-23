package SerieExercices.S06;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class s6_exercice2 {

    /*
    -- Exercice 2 :

        On attends une entrée de la part de l'utilisateur.
        Question de simplicité, l'utilisateur ne rentre que des entiers.
        Ajouter chaque entier dans une liste chainée.

        Verifier que cette liste chaîné est bien triée.
     */

    public static boolean verification(LinkedList<Integer> liste){
        LinkedList<Integer> copie ;
        copie = new LinkedList<Integer>(liste);
        Collections.sort(copie);
        if (liste.equals(copie))
            return true;
        return false;

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int entree;
        LinkedList<Integer> liste = new LinkedList<>();

        do {

            System.out.println("Entrez un entier , 0 sert à sortir :");
            entree = sc.nextInt();

            if (entree != 0)
                liste.add(entree);

        }while (entree != 0);


        System.out.println(verification(liste));



    }

}


package SerieExercices.S03;

public class s3_exercice2 {

    /*
        -- Exercice 2 :

    Nous avons un tableau d'entiers.
    Ecrire un programme qui renvoi le nombre
     de fois où le chiffre '7' apparait.

    Exemple :
    [1, 2, 7]) > 1
    [7, 3, 9]) > 2
    [7, 9, 7, 3, 7]) > 3
     */

    public static int seven (int tab[]){
        int compteur = 0;
        for (int i = 0 ; i < tab.length ; i++)
            if (tab[i] == 7)
                compteur += 1;

            return compteur;
    }

    public static void main(String[] args) {

        int tableau[] = {0,1,2,3,4,5,6,7,7,8};
        System.out.println(seven(tableau));

    }
}

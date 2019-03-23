package SerieExercices.S03;

public class s3_exercice4 {

    /*
        -- Exercice 4 :

        Etant donné un tableau d'entiers,
        retourner vrai si la séquence de nombre '1,2,3'
        se trouve quelque part dans ce tableau.

            [1, 1, 2, 3, 1] > true
            [1, 1, 2, 4, 1] > false
            [1, 1, 2, 1, 2, 3]) > true
     */

    public static boolean verif (int tab[]){

        for (int i = 0 ; i < tab.length-2 ; i++) {

            if (tab[i] == 1 && tab[i+1] == 2 && tab[i+2] == 3)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {

        int tab1[] = {1,2,3,4,5,6,7,8,9};
        int tab2[] = {9,8,7,6,5,4,3,2,1};
        int tab3[] = {1,1,1,1,1,1,1,2,3};
        int tab4[] = {1};

        System.out.println(verif(tab1));
        System.out.println(verif(tab2));
        System.out.println(verif(tab3));
        System.out.println(verif(tab4));

    }
}

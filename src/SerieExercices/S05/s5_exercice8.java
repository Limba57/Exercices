package SerieExercices.S05;

import java.util.Arrays;
import java.util.Scanner;

public class s5_exercice8 {

    /*
        -- Exercice 8 :

            Etant donné n>= 0.
            Créez un tableau de taille n*n avec le motif suivant.

            Exemple:
            n = 3 -> [0, 0, 1, 0, 2, 1, 3, 2, 1]
            n = 4 -> [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
            n = 2 -> [0, 1, 2, 1]
     */

    public static int[][] transformation (int facteur){
        int tab[][] = new int [facteur][facteur];
        for (int i = 0 ; i < facteur ; i++){
            for( int j = 0 ; j < facteur ; j++ ){
                if (i+j < facteur -1)
                    tab[i][j] = 0;
                else
                    tab[i][j] = facteur-j;
            }
        }
        return tab;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Entrez un facteur non nul");
        int facteur = sc.nextInt();
        int tab[] = new int [facteur*facteur];
        int i = 0;
        for (int temp[] : transformation(facteur)){
            for (int tempi : temp){
                tab[i] = tempi;
                i += 1;
            }
        }

        System.out.println(Arrays.toString(tab));


    }
}

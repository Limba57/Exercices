package SerieExercices.S05;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class s5_exercice1 {

    public static void verif (int tabUn[], int tabDeux []){

        int moyenneUn = 0;
        int moyenneDeux = 0;

        moyenneUn = (tabUn[0]+tabUn[1])/2;
        moyenneDeux = (tabDeux[0]+tabDeux[1])/2;

        if (moyenneUn > moyenneDeux)
           Arrays.toString(tabUn);
        else
            System.out.println(Arrays.toString(tabDeux));


    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tabUn[] = new int[2];
        int tabDeux[] = new int[2];

        System.out.println("Entrez un premier nombre pour le tableau un :");
        tabUn[0] = sc.nextInt();

        System.out.println("Entrez un deuxieme nombre pour le tableau un :");
        tabUn[1] = sc.nextInt();

        System.out.println("Entrez un premier nombre pour le tableau deux :");
        tabDeux[0] = sc.nextInt();

        System.out.println("Entrez un deuxieme nombre pour le tableau deux :");
        tabDeux[1] = sc.nextInt();

        verif(tabUn,tabDeux);





    }

}

package SerieExercices.S03;

import java.util.Scanner;

public class s3_exercice3 {

    /*
        -- Exercice 3 :

        Etant donné un String et un entier,
        retourner un String qui est la copie
        (n fois) de l'original.

        Exemple :
        "Salut", 3 > "SalutSalutSalut"
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String st;
        String temp ="";
        int n;

        System.out.println("Entrez un nombre entier :");
        n = sc.nextInt();
        System.out.println("Entrez un mot");
        sc.nextLine();
        st = sc.nextLine();

        for (int i= 0 ; i < n ; i++){
            temp = temp+st;
        }

        System.out.println(temp);



    }
}

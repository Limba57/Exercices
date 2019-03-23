package SerieExercices.S05;


import java.util.Scanner;

public class s5_exercice6 {
    /*
    -- Exercice 6 :

    Etant donné un tableau d'entiers, vérifier si le tableau contiens bien 3 nombres premiers.
    */

    public static int testPremier (int nbr) {
        if (nbr==1)
            return 0;
        for (int i = 2 ; i < nbr ; i++) {
            if (nbr%i == 0)
                return 0;
        }
        return 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int indice, nbr, compteurPremier = 0;



        System.out.println("Combien de chiffre voulez vous entrer :");
        indice = sc.nextInt();
        int tab[] = new int[indice];

        for (int i = 0; i < indice; i++) {
            System.out.println("Veuillez entrer le nombre numero " + (i + 1) + " :");
            nbr = sc.nextInt();
            tab[i] = (nbr);
        }

        for (int temp : tab)
            compteurPremier = compteurPremier + testPremier(temp);

        if (compteurPremier == 3)
            System.out.println("le tableau contient bien trois nombres premier");
        else
            System.out.println("niet !!!!");
    }
}

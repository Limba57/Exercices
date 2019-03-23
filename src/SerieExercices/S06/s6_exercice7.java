package SerieExercices.S06;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class s6_exercice7 {

    /*
       -- Exercice 7 :

        Etant donné un tableau de String,
        créer une Map<String, Integer> avec une clé différente pour chaque String.
        La valeur est le nombre de fois où cette chaîne de caractères apparait.

        Exemple :
        ["a", "b", "a", "c", "b"] -> {"a": 2, "b": 2, "c": 1}

     */



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String , Integer> map = new HashMap<>();
        int indice;
        int compteur = 0;


        System.out.println("entrez le nombre de string :");
        indice = sc.nextInt();

        String tab[] = new String [indice];
        sc.nextLine();
        for (int i = 0 ; i < indice ; i++){
            System.out.println("entrez votre mot");
            tab[i] = sc.nextLine();
        }

        for (String base : tab){
            compteur = 0;
            for (String copy : tab){
                if (base.equals(copy)) {
                    map.put(base, compteur +=1);
                }
            }
        }

        //System.out.println(Arrays.toString(tab));
        System.out.println(map);

    }
}

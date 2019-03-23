package SerieExercices.S06;

import java.util.HashMap;
import java.util.Scanner;

public class s6_exercice4 {

    /*
       -- Exercice 4 :

        Suite de l'exercice 1.

        Si la première clé possède une valeur dans notre tableau,
        ajouter cette valeur dans la seconde clé et supprimer la valeur de la première (vide).

        Exemple :
        Je rentre 'potato' et 'fries'.
        {"potato": "ketchup", "fries": "mayo"} -> {"potato": "", "fries": "ketchup"}
     */

    public static void main(String[] args) {


            Scanner sc =new Scanner(System.in);
            String premiereClef, deuxiemeClef;
            boolean demandeValide = false;

            HashMap<String, String> menu = new HashMap<>();
            menu.put("potatoes" , "ketchup");
            menu.put("legume", "vinaigrette");
            menu.put("saucisse", "moutarde");

            System.out.println(menu);
            System.out.println("entrez votre premiere clef");
            premiereClef = sc.nextLine();
            System.out.println("entrez la deuxieme clef");
            deuxiemeClef = sc.nextLine();

            for (String temp : menu.keySet()) {
                if (temp.equals(premiereClef)) {
                    demandeValide = true;
                }
            }

            if (demandeValide) {
                menu.put(deuxiemeClef, menu.get(premiereClef));
                menu.put(premiereClef, "");
            }
            System.out.println(menu);

    }
}

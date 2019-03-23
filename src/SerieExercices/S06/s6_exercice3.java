package SerieExercices.S06;

import java.util.HashMap;
import java.util.Scanner;

public class s6_exercice3 {

    /*
        -- Exercice 3 :

        On demande a l'utilisateur de rentrer une clé et une deuxième (a la suite).

        Si la première clé possède une valeur dans notre tableau,
        ajouter cette valeur dans la seconde clé.

        Exemple :
        Je rentre 'potato' et 'fries'.
        {"potato": "ketchup"}) -> {"potato": "ketchup", "fries": "ketchup"}
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

        if (demandeValide)
            menu.put(deuxiemeClef, menu.get(premiereClef));

        System.out.println(menu);



    }
}

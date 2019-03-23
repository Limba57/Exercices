package SerieExercices.S06;

import java.util.HashMap;

public class s6_exercice6 {

    /*
        -- Exercice 6 :

            Etant donné un tableau de String,
            créer une Map<String, String> avec une clé pour chaque première lettre différente
            que l'on croise. La valeur de cette clé est la concaténation
            de toutes les Strings qui commence par cette lettre.

            Exemple :
            ["salt", "tea", "soda", "toast"] -> {"s": "saltsoda", "t": "teatoast"}

     */
    public static HashMap<Character, String> classement (String[] tab){
        char clef ;
        HashMap<Character, String> classement =new HashMap<>();
        for (int i = 0 ; i < tab.length ; i++){
            clef = tab[i].charAt(0);
            if (classement.get(clef) == null)
                classement.put(clef, tab[i]);
            else
                classement.put(clef, tab[i]+classement.get(clef));
        }
        return classement;
    }

    public static void main(String[] args) {

        String menu[] = {"salt", "tea", "soda", "toast", "coca"};

        System.out.println(classement(menu));

    }
}

package SerieExercices.S06;

import java.util.HashMap;

public class s6_exercice5 {

    /*
    -- Exercice 5 :

        Etant donné un tableau de Strings,
        créer une Map<String, Integer> qui contient une clé pour chaque String différent
        et la valeur est la longueur de cette String.

        Exemple :
        ["a", "bb", "a", "bb"] -> {"bb": 2, "a": 1}
     */

    public static void main(String[] args) {

        String dico[] = {"to", "toto", "tototo", "totototo"};

        HashMap<String, Integer> comptage = new HashMap<>();

        for (int i = 0 ; i < dico.length ; i++){
            comptage.put(dico[i], dico[i].length());
        }

        System.out.println(comptage);
    }
}

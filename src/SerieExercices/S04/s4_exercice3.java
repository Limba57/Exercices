package SerieExercices.S04;

import java.util.HashMap;

public class s4_exercice3 {
    public static void main(String[] args) {
        /*
        -- Exercice 3 :

            Nous avons une map qui associe une personne et sa croissance :
            "Marie" => "Adulte"
            "Stephane" => "Enfant"
            "Alexandre" => "Adulte"
            "Julie" => Adolescent"
            "Sarah" => "Adulte"
            "Remi" => "Enfant"

            Ecrire un programme qui affiche les adultes et les enfants (pas les adolescent) :
            Les adultes sont : Marie, Alexandre, Sarah.
            Les enfants sont : Stephane, Remi.
         */
        HashMap<String, String> listePersonne = new HashMap<>();

        listePersonne.put("Marie","Adulte");
        listePersonne.put("Stephane","Enfant");
        listePersonne.put("Alexandre","Adulte");
        listePersonne.put("Julie","Adolescent");
        listePersonne.put("Sarah","Adulte");
        listePersonne.put("Remi","Enfant");

        for(String temp : listePersonne.keySet()){
            if (listePersonne.get(temp) == "Adulte")
                System.out.println(temp+" est un "+listePersonne.get(temp));
            if (listePersonne.get(temp) == "Enfant")
                System.out.println(temp+" est un "+listePersonne.get(temp));
        }




    }
}

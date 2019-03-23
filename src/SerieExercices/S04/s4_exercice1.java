package SerieExercices.S04;

import java.util.HashMap;

public class s4_exercice1 {

    /*
    -- Exercice 1 :

     - Créez une structure qui permette de stocker une paire clé/valeur.
        Voici l'ensemble des clés / valeurs :

        "France" => "Paris"
        "Italy"=>"Rome"
        "Luxembourg"=>"Luxembourg"
        "Belgium"=> "Brussels"
        "Denmark"=>"Copenhagen"
        "Finland"=>"Helsinki"
        "Slovakia"=>"Bratislava"
        "Slovenia"=>"Ljubljana"
        "Germany" => "Berlin"
        "Greece" => "Athens"
        "Ireland"=>"Dublin"
        "Netherlands"=>"Amsterdam"
        "Portugal"=>"Lisbon"
        "Spain"=>"Madrid"
        "Sweden"=>"Stockholm"
     */
    public static void main(String[] args) {

        HashMap<String ,String> capitale = new HashMap<>();

        capitale.put("France","Paris");
        capitale.put("Italy","Rome");
        capitale.put("Luxembourg","Luxembourg");
        capitale.put("Belgium","Brussels");
        capitale.put("Denmark","Copenhagen");
        capitale.put("Finland","Helsinki");
        capitale.put("Slovakia","Bratislava");
        capitale.put("Slovenia","Ljubljana");
        capitale.put("Germany","Berlin");
        capitale.put("Greece","Athens");
        capitale.put("Ireland","Dublin");
        capitale.put("Netherlands","Amsterdam");
        capitale.put("Portugal","Lisbon");
        capitale.put("Spain","Madrid");
        capitale.put("Sweden","Stockholm");

        for(String temp : capitale.keySet())
            System.out.println("la ville de "+capitale.get(temp)+" est la capitale de "+temp);

    }
}

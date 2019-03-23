package SerieExercices.S04;
import SerieExercices.S06.Ville;

import java.util.HashMap;

public class s4_exercice6 {

    /*
    -- Exercice 6 :

        Nous avons un tableau qui contient les 10 plus grandes villes de France.
        Pour chaque ville, nous avons le nombre d'habitant et la superficie (en km).

        Pour chaque ville, calculer la densité d’habitants au km2 et rajouter cette valeur en tant que nouvelle "clé"/"valeur".

           "Paris" => (
               "people"=>2244621,
               "surface"=>2244621
           ),
           "Marseille" => (
               "people"=>852516,
               "surface"=>240,6
           ),
           "Lyon" => (
               "people"=>496343,
               "surface"=>47,87
           ),
           "Toulouse" => (
               "people"=>453317,
               "surface"=>118,3
           ),
           "Nice" => (
               "people"=>343629,
               "surface"=>71,92
           ),
           "Nantes" => (
               "people"=>291604,
               "surface"=>65,19
           ),
           "Strasbourg" => (
               "people"=>274394,
               "surface"=>78,26
           ),
           "Montpellier" => (
               "people"=>2244621,
               "surface"=>105,4
           ),
           "Bordeaux" => (
               "people"=>241287,
               "surface"=>49,36
           ),
           "Rennes" => (
               "people"=>209860,
               "surface"=>50,39
           )

     */
    public static void main(String[] args) {

        //ArrayList<Ville> franceArray = new ArrayList();
        HashMap<String, Ville> france = new HashMap<>();

        Ville Paris,Marseille,Lyon,Nice,Nantes,Strasbourg,Montpellier,Bordeau,Rennes,Toulouse;
        france.put("Paris",Paris = new Ville ("Paris", 2244621, 105.4));
        france.put("Marseille", Marseille = new Ville ("Marseille", 852516, 240.6));
        france.put("Lyon" , Lyon = new Ville ("Lyon", 496343, 240.6));
        france.put("Toulouse", Toulouse = new Ville ("Toulouse", 453317, 118.3));
        france.put("Nice", Nice = new Ville ("Nice", 343629, 71.92));
        france.put("Nantes", Nantes = new Ville ("Nantes", 291604, 65.19));
        france.put("Strasbourg", Strasbourg = new Ville ("Strasbourg", 274394, 78.26));
        france.put("Montpellier", Montpellier = new Ville ("Montpellier", 2244621,105.4));
        france.put("Bordeau", Bordeau = new Ville ("Bordeaux",241287, 49.36));
        france.put("Rennes", Rennes = new Ville("Rennes", 209860, 50.39));

        for (String temp : france.keySet())
            france.get(temp).printDensite();

        System.out.println("------------------------------------");

        for (String temp : france.keySet())
            System.out.println("La ville de " + temp + " a une densité de " + france.get(temp).densite + " habitants/km²");

        System.out.println("-------------------------------------");

        System.out.println("La ville de Paris à une densité de "+france.get("Paris").densite + " habitants/km²");

        System.out.println("-------------------------------------");

        System.out.println("La ville de Paris à une densité de "+Paris.densite+" habitants/km²");

        System.out.println("-------------------------------------");

        Paris.printDensite();
    }
}

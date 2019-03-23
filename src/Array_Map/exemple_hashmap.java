package Array_Map;
import java.util.HashMap;

public class exemple_hashmap {

    public static void main(String[] args) {

        //Creation d'un hashmap HashMap<type clef,type valeur> nomdu hashmap = new HashMap<type clef, type valeur>();
        HashMap<String, String> monuments = new HashMap<String, String>();

        // ajout de donn�e nom.put(clef, donn�e);
        monuments.put("Paris", "Tour Eiffel");
        monuments.put("Londres", "Tour de Londres");
        monuments.put("Rio", "Le mec en croix");
        monuments.put("Pekin", "La cit� interdite");

        System.out.println(monuments);

        // prendre une valeur nom.get(clef);
        String scr = monuments.get("Paris");
        System.out.println(scr);

        //Enlever une valeur nom.remove(clef);
        monuments.remove("Rio");
        System.out.println(monuments);

        //Effacer une HashMap
        monuments.clear();

        monuments.put("Paris", "Tour Eiffel");
        monuments.put("Londres", "Tour de Londres");
        monuments.put("Rio", "Le mec en croix");
        monuments.put("Pekin", "La cit� interdite");

        //Avoir la taille de la map monuments.size();
        System.out.println(monuments.size());

        //boucle pour parcourir une map et donner les clef
        for (String temp : monuments.keySet())
            System.out.print(temp+" ");

        System.out.println("\n");

        //la meme avec les valeurs
        for (String temp : monuments.values())
            System.out.print(temp+" ");

        // le tout
        for(String temp : monuments.keySet())
            System.out.println("clef : "+temp+", valeur : "+monuments.get(temp));

        // les types primaire sont a appeler int --> Integer, boolean-->Boolean ....

        //on peut mixer les type entre clef et valeur
        HashMap<String, Integer> salaire = new HashMap<String, Integer>();
        salaire.put("seb", 4000);
        salaire.put("kathia", 2000);
        salaire.put("sabine", 1500);

        System.out.println();

        for (String temp : salaire.keySet())
            System.out.println("L'employ� : "+temp+" gagne "+salaire.get(temp)+" Euros");








    }

}

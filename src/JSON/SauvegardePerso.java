package JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

public class SauvegardePerso {

    public static void main(String[] args) throws FileNotFoundException {

        JSONObject SauvegardePerso = new JSONObject();


        SauvegardePerso.put("Nom", "Legolas");
        SauvegardePerso.put("Race","Elfe");
        SauvegardePerso.put("Metier", "Archer");



        Map Stat = new LinkedHashMap(3);
        Stat.put("Pv", 100);
        Stat.put("Attaque", 10);
        Stat.put("Defense", 5);

        SauvegardePerso.put("Statistiques", Stat);

        JSONArray Equipement = new JSONArray();

        Map item = new LinkedHashMap(2);
        item.put("Type", "Armure");
        item.put("bonus de defence", 5);
        Equipement.add(item);

        item = new LinkedHashMap(2);
        item.put("Type", "Arme");
        item.put("Bonus d'attaque", 10);
        Equipement.add(item);

        SauvegardePerso.put("Equipement",Equipement);
        PrintWriter sauvegardeUn = new PrintWriter("Sauvegarde_1.json");
        sauvegardeUn.write(SauvegardePerso.toString());

        sauvegardeUn.flush();
        sauvegardeUn.close();

    }



}

package JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Personne {

    String nom;
    int numeroFixe;
    int numeroPortable;

    public Personne(String nom, int numeroFixe, int numeroPortable){

        this.nom = nom;
        this.numeroFixe = numeroFixe;
        this.numeroPortable = numeroPortable;

    }

    public static void serializedPersonne (Personne personne) {

        JSONObject sauvegardePersonne = new JSONObject();

        sauvegardePersonne.put("nom", personne.nom);

        sauvegardePersonne.put("numero de fixe", Integer.toString(personne.numeroFixe));

        sauvegardePersonne.put("numero de portable", Integer.toString(personne.numeroPortable));

        try {
            PrintWriter sauvegarde = new PrintWriter(personne.nom + ".json");

            sauvegarde.write(sauvegardePersonne.toJSONString());

            sauvegarde.close();


        }catch (FileNotFoundException e){
            System.out.println("erreure");
        }
    }


    public static Personne deserializedPersonne(String fichier) {

        try {
            Object obj = new JSONParser().parse(new FileReader(fichier));

            JSONObject jo = (JSONObject) obj;

            String nom = (String) jo.get("nom");

            int nbrFixe = Integer.parseInt((String) jo.get("numero de fixe"));

            int nbrPortable = Integer.parseInt((String) jo.get("numero de portable"));

            return (new Personne(nom, nbrFixe, nbrPortable));
        }catch (FileNotFoundException e){
            System.out.println("Ce fichier n'existe pas");
        }
        catch (ParseException p){
            System.out.println("impossible de lire le fichier");
        }
        catch (IOException p){
            System.out.println("Erreur");
        }

        return null;

     }

    public static void serializedTableau(ArrayList<Personne> tab){

        JSONArray tabJ = new JSONArray();

        for (int i = 0 ; i < tab.size() ; i++){

            Map entree = new LinkedHashMap();

            entree.put("nom", tab.get(i).nom);
            entree.put("numero de fixe", Integer.toString(tab.get(i).numeroFixe));
            entree.put("numero de portable", Integer.toString(tab.get(i).numeroPortable));

            tabJ.add(entree);

        }
        try {
            PrintWriter sauvegarde = new PrintWriter(tab.get(0).nom + tab.size() + ".json");

            sauvegarde.write(tabJ.toJSONString());

            sauvegarde.close();
        }catch (FileNotFoundException e){
            System.out.println("erreur");
        }
    }

    public static ArrayList<Personne> deSerializedTableau(String fichier){

        try {
            Object obj = new JSONParser().parse(new FileReader(fichier));

            JSONArray joListe = (JSONArray) obj;

            ArrayList liste = new ArrayList();

            for (int i = 0; i < joListe.size(); i++) {

                JSONObject gars = (JSONObject) joListe.get(i);

                String nom = (String) gars.get("nom");
                int nbrFixe = Integer.parseInt((String) gars.get("numero de fixe"));
                int nbrPortable = Integer.parseInt((String) gars.get("numero de portable"));

                liste.add(new Personne(nom, nbrFixe, nbrPortable));

            }

            return liste;
        }catch(FileNotFoundException e){
            System.out.println("Ce fichier n'existe pas");
        }
        catch(ParseException p){
            System.out.println("Impossible de lire le fichier");
        }
        catch (IOException i){
            System.out.println("Impossible de lire le fichier");
        }

        return null;

    }

    public String toString(){

        return ("nom : "+this.nom+"\nnumero de fixe : "+this.numeroFixe+"\nnumero de portable : "+this.numeroPortable+"\n");

    }
}

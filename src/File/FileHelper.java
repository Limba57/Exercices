package File;

import java.io.*;
import java.util.ArrayList;

public class FileHelper {

    // Chemin et nom du fichier passé en parametre
    String chemin;

    // Constructeur
    public FileHelper(String chemin){

        this.chemin = chemin;

    }

    // Rangement ds un tableau
    public ArrayList<String> classement() throws IOException {

            ArrayList<String> liste = new ArrayList<>();
            FileReader fichierEnLecture = new FileReader(this.chemin);
            BufferedReader lecteur = new BufferedReader(fichierEnLecture);
            String ligneEnCour;

            while ((ligneEnCour = lecteur.readLine()) != null) {
                liste.add(ligneEnCour);
            }

            lecteur.close();

            return liste;

        }

    // Recupere une ligne selon son indice ds le tableau
    public String recupDeLigne (int indice) throws IOException {

        return (classement().get(indice-1));
    }

    // Donne le nombre de ligne du fichier
    public int nbrDeLigne () throws IOException {

        return classement().size();

    }

    // ajoute le texte passé en parametre en fin de fichier et ecrase le contenu ou pas
    public void ecritureFichier (String texte, boolean bool) throws IOException {

        FileWriter ecrire = new FileWriter(chemin, bool);
        PrintWriter ecrireLigne = new PrintWriter(ecrire);

        ecrireLigne.printf("\rNouveau contenu --> %s <-- voila c'est là", texte);

        ecrireLigne.close();

    }

}


package Exception;

public class Entité {

    String couleur;
    String nom;
    public Entité(){};

    public Entité(String couleur){
        this.couleur = couleur;
    }

    public Entité(String couleur, String nom){

        this.nom = nom;
        this.couleur = couleur;

    }

    public static int random (int mini, int maxi){
        int alea = mini + (int)(Math.random() * ((maxi - mini) + 1));
        return alea;
    }


}

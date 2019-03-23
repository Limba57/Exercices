package Exception;

public class Vivant extends Entité{

    String sexe;

    protected Vivant(String couleur,String nom){

        super (couleur,nom);
        this.sexe = choixSexe();

    }

    private static String choixSexe(){
        switch (random(1,2)){
            case 1 :
                return "masculin";
            case 2 :
                return "feminin";
            default :
                return "erreure";


        }
    }

}

package Exception;

public class Robot extends Entité implements Travailler{

    int identifiant;

    public Robot (){

        super(choixCouleur());
        this.identifiant = choixIdentifiant();
    }

    public Robot (String couleur, int identifiant){
        super(couleur);
        this.identifiant = identifiant;
    }

    public String travailler(){
       return ("bosse comme un robot");
    }

    private static String choixCouleur(){

        switch (Entité.random(1,3)){
            case 1 :
                return "or";

            case 2 :
                return "inox";

            case 3:
                return "rouille";

            default :
                return "blanc";
        }

    }

    private static int choixIdentifiant(){

        switch (random(1,3)){
            case 1 :
                return 110011;

            case 2 :
                return 11010;

            case 3 :
                return 10011;

            default :
                return 111101;
        }
    }

    public String toString(){

        return ("Le "+this.getClass().getSimpleName()+" "+(this.identifiant)+" de couleur "+this.couleur+" "+this.travailler());
    }
}

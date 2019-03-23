package Exception;

public class Humain extends Vivant implements Travailler{

    public Humain (){
        super (choixCheuveux(),choixNom());
    }

    public Humain (String couleur, String nom){
        super(couleur,nom);
    }

    private static String choixNom(){
        switch(random(1,3)){
            case 1 :
                return "Pierre";
            case 2 :
                return "Paul";
            case 3 :
                return "Jacques";
            default :
                return "erreure";
        }
    }

    private static String choixCheuveux(){
        switch(random(1,3)){
            case 1 :
                return "blond";
            case 2 :
                return "brun";
            case 3 :
                return "gris";
            default :
                return "erreure";
        }
    }

    public String travailler(){
        return " bosse quand je veux";
    }

    public String toString(){
        return ("Le "+this.getClass().getSimpleName()+" "+this.nom+" de sexe "+this.sexe+" avec des cheveux "+this.couleur+" "+this.travailler());
    }
}

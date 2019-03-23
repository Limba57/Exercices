package Exception;

public class Animal extends Vivant{

    int patte;
    String cri;

    protected Animal (String cri){

        super(choixPoil(),choixNom());
        patte = random(1,4);
        this.cri = cri;

    }

    private static String choixNom(){
        switch(random(1,2)){
            case 1:
                return"PonPon";
            case 2:
                return"Bibiche";
            default :
                return"erreure";
        }
    }

    private static String choixPoil(){
        switch (random(1,2)){
            case 1 :
                return"blanc";
            case 2 :
                return"noir";
            default :
                return"erreure";
        }
    }

    public String toString(){
        return ("Le "+this.getClass().getSimpleName()+" "+this.nom+" de sexe "+this.sexe+" cri "+this.cri);
    }

}

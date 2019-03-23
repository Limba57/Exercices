package ExoPatternLivre;

public class PrtotypeCanard extends Canard {

    public PrtotypeCanard(){

        comportementVol = new NepasVoler();
        comportementCancan = new Cancan();

    }

    public void afficher(){

        System.out.println("Je suis un prototype de ExoPatternLivre.Canard");

    }
}

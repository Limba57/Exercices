package ExoPatternLivre;

public abstract class Canard {

    ComportementVol comportementVol;
    ComportementCancan comportementCancan;

    public Canard(){

    }

    public void effectuerVol(){

        comportementVol.voler();

    }

    public void effectuerCancan(){

        comportementCancan.cancaner();

    }

    public void setComportementVol(ComportementVol cv){

        comportementVol = cv;

    }

    public void setComportementCancan(ComportementCancan cc){

        comportementCancan = cc;

    }

    public void nager(){

        System.out.println("Tous les canrds volent memes les leurres!");

    }
}

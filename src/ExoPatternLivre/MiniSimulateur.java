package ExoPatternLivre;

public class MiniSimulateur {

    public static void main(String[] args) {
        Canard colvert = new Colvert();
        colvert.effectuerCancan();
        colvert.effectuerVol();

        Canard proto = new PrtotypeCanard();
        proto.effectuerVol();
        proto.setComportementVol(new PropultionAReaction());
        proto.effectuerVol();

    }

}

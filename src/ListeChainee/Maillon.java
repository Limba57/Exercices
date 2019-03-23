package ListeChainee;

public class Maillon {


    private int donneeDuMaillon;
    private Maillon next;

    // maillon complet
    public Maillon (int donneeDuMaillon, Maillon next){

        this.donneeDuMaillon = donneeDuMaillon;
        this.next = next;

    }

    // ListeChainee.Maillon seul ou dernier maillon
    public Maillon (int donneeDuMaillon){

        this.donneeDuMaillon = donneeDuMaillon;
        this.next = null;

    }

    // getter

    public int getDonneeDuMaillon() {
        return donneeDuMaillon;
    }

    public Maillon getNext() {
        return next;
    }

    // setter

    public void setDonneeDuMaillon(int donneeDuMaillon) {
        this.donneeDuMaillon = donneeDuMaillon;
    }

    public void setNext(Maillon next) {
        this.next = next;
    }

}

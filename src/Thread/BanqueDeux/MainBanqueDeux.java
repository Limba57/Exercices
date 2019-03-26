package Thread.BanqueDeux;

public class MainBanqueDeux {

    public static void main(String[] args) {

        Compte compte = new Compte(500, 400);

        Client seb = new Client("seb", "Mecleuves", "Homme", compte);

        Banque banque = new Banque(seb);

    }
}

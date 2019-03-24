package Thread.Banque;

public class MainBanque {

    public static void main(String[] args) {

        CompteBanquaire compteSeb = new CompteBanquaire(1000);

        Depot depot = new Depot(compteSeb,"1");
        Retrait retrait1 = new Retrait(compteSeb,"1");

        //System.out.println("test");
        //Retrait retrait2 = new Retrait(compteSeb,"2");





    }

}

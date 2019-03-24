package Thread.Banque;

public class Retrait implements Runnable{

    private CompteBanquaire compte;
    String nom;
    Thread t ;

    public Retrait(CompteBanquaire compte, String nom) {
        this.compte = compte;
        this.nom = nom;
        t = new Thread(this);
        //System.out.println("top r");
        t.start();
    }



    public void run(){

        System.out.println("--- Debut de la thread retrait "+this.nom+" ---");

        do {

            try {

                if (!this.compte.retrait(CompteBanquaire.aleatoire(200, 300))) {
                    t.wait();
                }

            } catch (InterruptedException e) {
                System.out.println("Erreure");
            }

        } while (compte.question("encore un retrait"));

        System.out.println("--- fin de la thread retrait "+this.nom+" ---");

    }
}

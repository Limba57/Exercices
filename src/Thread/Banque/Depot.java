package Thread.Banque;

public class Depot implements Runnable{

    CompteBanquaire compte;
    String nom;
    Thread t;

    public Depot(CompteBanquaire compte,String nom) {
        this.compte = compte;
        this.nom = nom;
        this.t = new Thread(this);
        //System.out.println("top d");
        t.start();
    }

    private void faireDepot(){

        compte.depot(CompteBanquaire.aleatoire(50,100));
        if (this.compte.getSolde() > this.compte.getPlafond()) {
            notify();
        }

    }

    public void run(){

        System.out.println("--- Debut de la thread Depot "+this.nom+" ---");

        do {
            this.faireDepot();

        } while (compte.question("encore un depot"));

        System.out.println("--- fin de la thread Depot "+this.nom+" ---");

    }

}

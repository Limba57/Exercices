package Thread.BanqueDeux;

public class ThreadRetrait implements Runnable{

    Banque banque;
    int montant;
    Thread tr;


    public ThreadRetrait(Banque banque, int montant) {

        this.banque = banque;
        this.montant = montant;
        tr = new Thread(this);
        tr.start();

    }

    @Override
    public void run() {

        this.banque.client.getCompte().Cretrait(montant);

    }

}

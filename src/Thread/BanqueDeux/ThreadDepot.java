package Thread.BanqueDeux;

public class ThreadDepot implements Runnable{

    Banque banque;
    int montant;
    Thread td;

    public ThreadDepot(Banque banque, int montant) {
        this.banque = banque;
        this.montant = montant;
        td = new Thread(this);
        td.start();
    }

    @Override
    public void run() {

        banque.client.getCompte().Cdepot(montant);

    }
}

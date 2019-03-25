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

    public synchronized void operation() {


        this.banque.guichet();
    }

    @Override
    public void run() {

        operation();

    }
}

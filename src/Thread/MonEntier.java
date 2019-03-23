package Thread;

public class MonEntier {

    private int valeur = 0;
    private boolean flag = false;

    public synchronized int get(){
        while(!flag){
            try{
                wait();// previent le thread qu'il doit attendre qu'une autre thread envoi notify(notifyAll reveille toute les thread par ordre de priorité)
            }catch (InterruptedException e){
                System.out.println("Thread interrupted");
            }
        }
        flag = false;
        notify();
        return this.valeur;
    }

    public synchronized void set (int nuovelleValeur){
        while (flag){
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println("Thread interrupted");
            }
        }
        flag =true;
        this.valeur = nuovelleValeur;
        notify();
    }
}

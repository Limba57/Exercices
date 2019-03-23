package Thread;

public class Consumer implements Runnable {

    private MonEntier monEntier;
    private Thread t;

    public Consumer (MonEntier monEntier){
        this.monEntier = monEntier;
        t = new Thread(this);
        t.start();
    }

    public void run (){
        int i = 0;
        while (i<10){
            i = this.monEntier.get();
            System.out.println("consumer get : "+i);
        }
        System.out.println("---Thread.Consumer run end");
    }
}

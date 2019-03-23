package Thread;

public class Producer implements  Runnable{
    private MonEntier monEntier;
    private Thread t;

    public Producer(MonEntier monEntier){
        this.monEntier= monEntier;
        t = new Thread(this);
        t.setUncaughtExceptionHandler(new CustomTreadExeption());
        t.start();
    }

    public void run(){
        int i= 0;

        while (i < 10) {
            try {
                i++;
                this.monEntier.set(i);
                System.out.println("Thread.Producer set : " + i);
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Tread interrupted");
            }
        }

        System.out.println("---Thread.Producer run end---");
    }
}

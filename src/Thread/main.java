package Thread;

public class main {

    public static void main(String[] args) {

        /*


        Thread.TestThread t1 = new Thread.TestThread("Thread 1");
        Thread.TestThread t2 = new Thread.TestThread("Thread 2");

        t1.start();  // si on utilise t1.run --> les thread se déclanche les unes apres les autres (on perd l'avantage des thread)
        t2.start();

        // methode courante

        /*
        t1.getPriority() // t1.set.Priority();
        t1.isAlive();
        t1.join();
        t1.sleep(500);
        */


        /*

        Runnable r1 = new Thread.TestRunnable("Runnable 1");

        Thread t1 = new Thread(r1, "test runnable 1");
        Thread t2 = new Thread(r1, "test runnable 2");

        // monitors
        t1.start();
        t2.start();

        /*
        tObj1.start();
        tObj2.start();
        */

        MonEntier monEntier =new MonEntier();
        new Producer(monEntier);
        new Consumer(monEntier);
    }

}

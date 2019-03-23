package Thread;

public class TestRunnable implements Runnable{

    private String name;

    public TestRunnable(String name){
        this.name = name;
        System.out.println("Thread Name"+this.name+"created");
    }

    public void run(){

        printNumers();

        System.out.println("---Thread run end---");
    }

    public synchronized void printNumers(){


        for(int i = 0 ; i<10 ; i++){

            System.out.println(this.name+" -i : "+i);

        }

    }

}

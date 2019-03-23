package Thread;

public class TestThread extends Thread {

    String name;

    public TestThread(String name){

        this.setName(name);
        System.out.println("Thread Name"+this.getName()+"created");

    }

    public void run(){
        // running
        for(int i = 0 ; i<10 ; i++){

            System.out.println(this.getName()+" -i : "+i);

        }

        System.out.println("Thread run end");
        // dying
    }

}

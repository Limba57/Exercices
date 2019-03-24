package Thread.Interview;

public class Star implements Runnable{

    private Interview interview;
    private Thread t;

    public Star (Interview interview){
        this.interview = interview;
        t = new Thread(this);
        t.start();
    }

    public void run(){

        int i = 5;

            while (i != 0) {
                i--;

                interview.reponse();

            }


    }
}

package Thread.Interview;

import java.util.Scanner;

public class Interview {

    boolean dispo = false;

    public synchronized void rep(){
        while (!dispo){
            try{
                wait();
                Thread.sleep(2000);
            }catch (InterruptedException e){
                System.out.println("Thread interrupted");
            }
        }
        System.out.println("Reponse :");
        Scanner sc = new Scanner(System.in);
        String question = sc.nextLine();

        dispo =false;
        notify();

    }

    public synchronized void question (){
        while(dispo){
            try{
                wait();
                Thread.sleep(2000);
            }catch (InterruptedException e){
                System.out.println("Thread interrupted");
            }
        }
        System.out.println("Question :");
        Scanner sc = new Scanner(System.in);
        String question = sc.nextLine();
        dispo = true;
        notify();
    }

}

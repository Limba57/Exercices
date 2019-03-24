package Thread.Interview;

import org.json.simple.JSONObject;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Interview {

    boolean dispo = false;
    ArrayList Aquestion = new ArrayList();
    ArrayList Areponse = new ArrayList();
    int compteur = 1;

    public synchronized void reponse(){
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
        String reponse = sc.nextLine();

        Areponse.add("Reponse "+compteur+" : "+reponse);
        compteur ++;

        if (compteur > 5) {
            this.finDInterview();
        }

        dispo =false;;
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

        Aquestion.add("Question "+compteur+" : "+question);

        dispo = true;
        notify();
    }

    private void finDInterview (){

        JSONObject sauvegardeInterview = new JSONObject();

        for (int i = 0 ; i < 5 ; i++) {

            sauvegardeInterview.put(Aquestion.get(i),Areponse.get(i));

        }

        try {
            PrintWriter sauvegarde = new PrintWriter("Interview.json");
            sauvegarde.write(sauvegardeInterview.toString());
            sauvegarde.flush();
            sauvegarde.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}

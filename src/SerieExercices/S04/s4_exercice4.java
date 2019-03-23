package SerieExercices.S04;

import java.util.HashMap;
import java.util.Scanner;

public class s4_exercice4 {


    public static void main(String[] args) {

        /*
        -- Exercice 4 :

            Créez une structure qui permette de répondre à ce format :

            (
                "Rap" => (
                    [0] => "Eminem",
                    [1] => "IAM"
                ),
                "Pop" => (
                    [0] => "Madonna",
                    [1] => "Katy Perry"
                ),
                "Rock" => (
                    [0] => "Pink Floyd",
                    [1] => "AC/DC"
                )
            )
         */

        HashMap<String, String[]> music = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int reponseUne = 0;
        int reponseDeux = 0;

        music.put("Rap", new String[] {"Eminem","IAM"});
        music.put("Pop", new String[] {"Madonna", "Katy Perry"});
        music.put("Rock", new String[] {"Pink Floyd", "AC/DC"});

        do {
            System.out.println("quel genre musical voulez-vous consulter ?");
            System.out.println("-- 1 Rap");
            System.out.println("-- 2 Pop");
            System.out.println("-- 3 Rock");
            reponseUne = sc.nextInt();
        } while (reponseUne !=1 && reponseUne != 2 && reponseUne != 3);

        do {
            System.out.println("Voulez vous consulter la case 1 ou la case 2 :");
            reponseDeux = sc.nextInt();
        }while (reponseDeux != 1 && reponseDeux != 2);

        switch (reponseUne){
            case 1:
                System.out.println(music.get("Rap") [reponseDeux-1]);
            case 2 :
                System.out.println(music.get("Pop") [reponseDeux-1]);
            case 3:
                System.out.println(music.get("Rock") [reponseDeux-1]);
        }


    }
}

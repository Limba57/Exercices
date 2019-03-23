package SerieExercices.S02;

import java.util.ArrayList;
import java.util.Scanner;

/*
            -- Exercice 3 :

            On attend une entrée de la part de l'utilisateur.
            Si il tape un mot, tester si ce mot est un palindrome.
            Un palindrome est un mot qui se lis dans les deux sens :
            'kayak'
            'elle'
            'xanax'
        */

public class s2_exercices {

    public static boolean palindrome (ArrayList <Character> test){

        for (int i = 0; i < test.size()/2 ; i++){
            if(test.get(i) != test.get(test.size()-i-1))
                return false;
        }
        return true;
}
    public static void main(String[] args) {



        ArrayList <Character> mot = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        char lettre ;
        do
        {

            System.out.println("entrez un caractére (un point pour finir la saisi) : ");
            lettre = input.nextLine().charAt(0);
            if(lettre != '.')
            {
               mot.add(lettre);
            }
        }while (lettre != '.');

        for (char temp : mot)
        System.out.print(temp);
        if (palindrome(mot))
            System.out.println("\nvotre mot est un palindrome");
        else
            System.out.println(("\nvotre mot n'est pas un palindrome"));
    }
}

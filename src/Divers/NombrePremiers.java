package Divers;
import java.util.ArrayList;
import java.util.Scanner;
public class NombrePremiers {

    public static boolean test (int nbr) {
        if (nbr==1)
            return(false);
        for (int i = 2 ; i < nbr ; i++) {
            if (nbr%i == 0)
                return (false);
        }
        return true;
    }

    public static void main(String[] args) {
        int input ;
        ArrayList<Integer> nombre = new ArrayList<Integer>();
        ArrayList<Integer> premier = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Entrez un ou plusieurs nombres, nous déterminerons lesquels sont premiers (entrez 0 pour sortir)");
            input = sc.nextInt();
            if ( input !=0)
                nombre.add(input);
        }while (input != 0);

        for (int temp : nombre) {
            if (test(temp))
                premier.add(temp);
        }

        System.out.println(premier);

    }

}

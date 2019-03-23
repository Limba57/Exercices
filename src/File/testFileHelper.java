package File;


import java.io.IOException;
import java.util.ArrayList;

public class testFileHelper {

    public static void main(String[] args) throws IOException{

        FileHelper exemple = new FileHelper("/home/jean/Bureau/exemple.txt");

        ArrayList test;

        test = exemple.classement();

        System.out.println(test);

        System.out.println(exemple.recupDeLigne(3));

        System.out.println(exemple.nbrDeLigne());

        exemple.ecritureFichier("testFileHelper",true);

    }
}

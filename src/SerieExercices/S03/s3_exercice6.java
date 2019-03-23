package SerieExercices.S03;

import java.util.Scanner;

public class s3_exercice6 {

    /*
        -- Exercice 6 :

            Etant donné 2 Strings (s1 et s2).
            Retourner le nombre de fois où les des Strings possédent la même sous-chaine de 2 caractères.
     */

   public static int verification (String strUn, String strDeux){
       int compteur = 0;
       String strTestUn = "" ;
       String strTestDeux = "";

       for (int i = 0 ; i < strUn.length()-1 ; i++){
           strTestUn = strUn.substring(i,i+2);
           //System.out.println("1= "+strTestUn);
           for (int j = 0 ; j < strDeux.length()-1 ; j++){
               strTestDeux = strDeux.substring(j,j+2);
               //System.out.println("2 ="+strTestDeux);
               if (strTestUn.equals(strTestDeux)) {
                   System.out.println(strTestUn);
                   System.out.println(strTestDeux);
                   compteur = compteur + 1;
               }
           }
       }
       return compteur;
   }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String motUn, motDeux ;

        System.out.println("Entrez un premier mot");
        motUn = sc.nextLine();
        System.out.println("Entrez un deuxieme mot");
        motDeux = sc.nextLine();

        System.out.println("Le resultat est :"+verification(motUn,motDeux));

    }
}

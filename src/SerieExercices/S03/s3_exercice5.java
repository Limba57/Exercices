package SerieExercices.S03;

public class s3_exercice5 {

    /*
           -- Exercice 5 :

            Compter le nombre d'occurences d'une String dans une String.
            Exemple :
            Je vérifie si "abc" se trouve dans :
            "lkabcxx" -> 1
            "mabc" -> 1
            "xabckkabca" -> 2
     */

    public static int verification (String str){
        int compteur = 0;
        for (int i = 0  ; i < str.length()-2 ; i++){
            if (str.charAt(i) == 'a' && str.charAt(i+1) == 'b' && str.charAt(i+2) == 'c')
                compteur = compteur +1;
        }
        return compteur;

    }

    public static void main(String[] args) {

        String a = "abcdefghij";
        String b = "abcabcabcabc";
        String c = "";
        String d = "Sebastien";

        System.out.println(verification(a));
        System.out.println(verification(b));
        System.out.println(verification(c));
        System.out.println(verification(d));
    }
}

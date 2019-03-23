package Array_Map;
import java.util.ArrayList; // importe Array.list
import java.util.Collections; // importe les classe collections

public class exemple_arraylist {

    public static void main(String[] args) {
        ArrayList<String> insulte = new ArrayList<String>();
        // nom.add --> ajoute � la suite une valeur � la liste
        insulte.add("Connard");
        insulte.add("Batard");
        insulte.add("Fumier");
        insulte.add("Fils de p..e");
        insulte.add("Boufon");

        // nom.get(indice) --> prend la valeur � l'indice
        System.out.println(insulte.get(2));

        // nom.set(nvlle valeur, indice) --> remplace la valeur � l'indice
        insulte.set(2, "Gros Fumier");

        System.out.println(insulte.get(2));

        // nom.remove(indice --> enleve la valeur � l'indice et reformate la liste avec -1 �l�ment
        insulte.remove(2);

        System.out.println(insulte.get(2));
        System.out.println(insulte.get(3));

        // nom.clear() --> vide la liste
        insulte.clear();
        // System.out.println(insulte.get(0)); --> renvoie une erreur, la liste est compl�tement vide et de longueur null

        //recreation de la liste
        insulte.add("-Connard-");
        insulte.add("-Batard-");
        insulte.add("-Fumier-");
        insulte.add("-Fils de p..e.-");
        insulte.add("-Bouffon-");

        // nom.size() --> donne la taille de la liste
        System.out.println(insulte.size());

        // exemple de boucle
        for (int i = 0; i < insulte.size() ;i++)
            System.out.print(insulte.get(i)+" ");

        System.out.println("\n");

        //boucle for/each
        for (String temp : insulte)
            System.out.print(temp+" ");

        //Pour cree une ArrayList avec des variables primaire il faut
        //les d�clarer Integer-->int Boolean->boolean  Charactere-->char Double-->double ...
        ArrayList<Integer> mesNombres = new ArrayList<Integer>();
        mesNombres.add(20);
        mesNombres.add(40);
        mesNombres.add(60);
        mesNombres.add(10);
        mesNombres.add(60);

        System.out.println("\n");

        for (int temp : mesNombres)
            System.out.print(temp+" ");

        //On peut trier une Alist avec Collection.sort(nom), a condition d'importer Collection
        System.out.println("\n"+insulte.toString());
        Collections.sort(insulte);
        System.out.println("\n"+insulte.toString());
        System.out.println("\n"+mesNombres.toString());
        Collections.sort(mesNombres);
        System.out.println("\n"+mesNombres.toString());

        //equivalent � toString
        System.out.println(insulte);

        //tab.isEmpty() -> V�rif si tab vide

		/*ArrayList<String> tab = new ArrayList<String> ();
		tab.add("testFileHelper");
		tab.add("nope");
		tab.add("oui");
		tab.add("non");
		tab.add("yo");
		sout(tab.contains("nope")); --> True
		sout(tab.contains("toto")); --> False
		// Methode indexOf() -> Retourne indice de la premi�re occurence de notre tableau
		sout(tab.indexOf("testFileHelper"); --> 0 --> Retourn� par indexOf("testFileHelper");
		sout(tab.indexOf("testFileHelper"); --> 1 --> 2�me occurence
		sout(tab.indexOf("non"); --> 3*/


        System.out.println(insulte.contains("nope"));
        System.out.println(insulte.contains("-Bouffon-"));
    }

}

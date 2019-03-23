package SerieExercices.S01;
import java.util.*;
public class s1_exercices {

    public static void main(String[] args) {

        //Exercices Tableau

		/*-- Exercice 1
		   - Créer votre premier tableau de fruits contenant : "Apple, Strawberry, Pineapple, Lemon".
		   - Afficher la valeur de la 2eme position.
		*/

        String fruit[] = {"Apple", "Strawberry", "Pineapple", "Lemon"};
        System.out.println("fruit en 2em position : "+fruit[1]);
        System.out.println("--------------------\n");



		/*
		  -- Exercice 2
		   - Triez votre tableau de fruits par ordre alphabétique.
           - Afficher la valeur de la 2eme position. Que constatez-vous ?
		 */

        Arrays.sort(fruit);
        System.out.println("fruit en 2em position : "+fruit[1]);
        System.out.println("--------------------\n");

		/*
		  -- Exercice 3
		  - Imaginons un tableau de valeur numérique.
		  - Créer un tableau qui contient : 20, 30, 5 .... (vous choisissez les valeurs)
		  - Afficher la valeur du 5eme elements.
		  - Ajouter 5 au 5eme element.
		  - Enlever 2 au 3eme element.
		 */

        int calcul[] = {5,8,36,45,85,32,85,41};
        System.out.println("Valeur en 5em position : "+calcul[4]);
        calcul[4] = calcul[4] + 5;
        System.out.println("La meme plus 5 : "+calcul[4]);
        System.out.println("Valeur en 3em position ("+calcul[2]+") moins 2 : "+(calcul[2]-2));
        System.out.println("--------------------\n");

        // EXERCICES SUR LES BOUCLES

		/*-- Exercice 1 :
		   - Reprenez le tableau de l'exercice 3.
		   - En utilisant une boucle, calculez le résultat total des valeurs du tableaux.
		*/
        int plus = 0;
        for (int temp : calcul)
        {
            plus += temp;
        }
        System.out.println("resultat de la somme du tableau calcul : "+plus);
        System.out.println("--------------------\n");

		/*
		 -- Exercice 2 :

		  - En utilisant une boucle, remplir un tableau avec un nombre sur deux, de 0 à 20.
		  - L'élément 0 va donc contenir 0, l'élément 1 va contenir 2 etc....
		  - Faites le en utilisant une boucle for ET avec une boucle while
		 */

        int tabFor[] = new int [11];
        int paire = 0;
        int tabWhile [] = new int [11];

        for (int i = 0; i < 11; i++)
        {
            tabFor[i] = paire;
            paire += 2;
        }

        paire = 0;
        int count = 0;
        while ( count < 11)
        {
            tabWhile[count] = paire;
            paire += 2;
            count++;
        }

        for (int temp : tabFor)
            System.out.print(temp+" ");
        System.out.println("\n");
        for (int temp : tabWhile)
            System.out.print(temp+" ");
        System.out.println("\n--------------------\n");
        // Tips pour afficher un tableau Arrays.toString(nomTableau)
		/*
		 -- Exercice 3 :

		  - Utiliser une boucle pour créer un tableau.
		  - Ce tableau contiendra la table de multiplication de 2.
		  - Table de multiplication de 1 à 10.
		 */

        int tableDeDeux[] = new int [10];
        count = 1;
        for (int temp : tableDeDeux)
        {
            temp = count * 2;
            tableDeDeux[count-1] = temp;
            count++;
        }

        for (int temp : tabWhile)
            System.out.print(temp+" ");
        System.out.println("\n--------------------\n");

		/*
		 -- Exercice 4 :

		- Reprenez le tableau de l'exercice 3 sur les tableaux.
		- Trouver la plus petite valeur.
		- Trouver la plus grande valeur.
		 */

        int mini = tableDeDeux[0];
        int max = mini;

        for (int temp : tableDeDeux)
        {
            if (temp < mini)
                mini = temp;
            if (temp > max)
                max = temp;
        }

        System.out.println("le plus petit : "+mini);
        System.out.println("le plus grand : "+max);
        System.out.println("--------------------\n");

		/*
		 -- Exercice 5 :

		  - Nous avons un tableau d'entier, non trié, avec tous les nombres de 1 à 50 MAIS il manque un élément (le tableau est donc de taille 49).
		  - L'objectif est de retrouver l’élément qui manque (le nombre manquant).
		  - Cependant, vous avez 3 contraintes:
		  - Vous n'avez le droit de parcourir le tableau qu'une seule fois!
		  - Vous n'avez le droit d'utiliser qu'une seule variable!
		  - Vous ne pouvez pas utiliser de fonctions (tri etc...)
		 */



        // choix d'un nombre a exclure
        int exclu = 1 + (int)(Math.random() * ((50 - 1) + 1));
        System.out.println("le nombre exclu al�atoirement entre 1 et 50 est : "+exclu);
        System.out.println("----");

        // creation du tableau
        int cinquante[] = new int [49];
        for (int i = 0 ; i < (exclu-1) ; i++)
            cinquante[i]=i+1;

        for (int i = (exclu-1) ; i < 49 ; i++)
            cinquante[i] = (i+2);

        // M�lange du tableau
        for (int i = 0 ; i < 49 ; i++)
        {
            int swap = 0 + (int)(Math.random() * ((48 - 0) + 1));
            int temp = cinquante[swap];
            cinquante[swap] = cinquante[i];
            cinquante[i] = temp;
        }
        //for (int temp : cinquante)
        //System.out.println(temp);

        // recherche du nombre
        int total = 0;

        for (int i = 0 ; i < cinquante.length ; i++)
        {
            total = total - cinquante[i] + (i+2);
        }
        System.out.println("il manque le nombre : "+(total+1));


    }

}

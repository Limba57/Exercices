package Array_Map;

import java.util.*;

public class cour_15_02 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();//pas besoin de typer la liste --> elle accepte du coup tout les types

        list.add("first item");
        list.add('c');
        list.add(15);
        list.add("quatrieme element");

        //retourne
        list.get(2);

        //supprime 'c'
        list.remove(1);
        System.out.println(list);
        //recupere la taille
        list.size();

        //affiche sous forme de string
        System.out.println(list);;

        //boucle
        for (int i=0 ; i<list.size(); i++)
            System.out.println(i+" : "+list.get(i));

        Iterator iterator = list.iterator();

        while (iterator.hasNext())// tant que j'ai un element ds la liste
            System.out.println(iterator.next());//iterator.next permet de se deplacer d'un element a l'autre

        LinkedList alist = new LinkedList();

        //meme methode que pour arraylist

        Hashtable maMap = new Hashtable();

        maMap.put(1 , "toto");
        maMap.put(50, "tata");
        maMap.put("salut", "au revoir");

        maMap.get(1);
        maMap.remove((1));
        maMap.size();

        Enumeration e = maMap.elements();

        while(e.hasMoreElements())
            System.out.println(e.nextElement());


        //methode forEach
        maMap.forEach((key,value)->{
            System.out.println(key);
        });


    }
}
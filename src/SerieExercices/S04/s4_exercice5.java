package SerieExercices.S04;

import java.util.HashMap;
import java.util.Scanner;

public class s4_exercice5 {
    /*
    -- Exercice 5 :

    Nous avons un tableau de transactions bancaires, qui indique le solde créditeur et débiteur de chaque personne.
    Pour chaque personne, calculez la valeur réelle de leur compte/transaction et ajoutez la en tant que nouvelle "clé"=>"valeur".


        "Marie" => (
            "debit"=>6,
            "credit"=>9
        ),
        "Julien" => (
            "debit"=>21,
            "credit"=>19
        ),
        "Sophie" => (
            "debit"=>15,
            "credit"=>14
        ),
        "John" => (
            "debit"=>10,
            "credit"=>14
        )
     */
    /*public static HashMap creationClient (int debit, int credit, String nom, HashMap client){
        client.put(nom, creationCompte(debit,credit,client));
        return client;

        CORRECTION

        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        map.get("key"); // returns the value "value" from key "key"

        Now consider:

        Map<String, Map<String, String>> mapParent = new HashMap<>();
        Map<String, String> mapChild               = new HashMap<>();

        mapChild.put("childKey", "childValue");
        mapParent.put("child", mapChild);
        mapParent.get("child");                  // returns the childMap
        mapParent.get("child").get("childKey");  // returns value "childValue"

        La déclaration précise de la hashMap permet d' appeler blalbal.get(blabla).get(blabla)

    }*/
    public static HashMap creationCompte (int debit, int credit, HashMap nom){
        nom.put("debit", debit);
        nom.put("credit", credit);
        calculSolde(nom);
        return nom;
    }

    public static HashMap calculSolde (HashMap nom){
        int credit = (int) nom.get("credit");
        int debit = (int) nom.get("debit");
        nom.put("solde", (credit-debit));
        return nom;
    }

    public static boolean rechercheClient(String nom, HashMap map){
        for (Object temp : map.keySet()) {
            String str;
            str = (String)temp;
            if (str.equals(nom))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

        HashMap banque = new HashMap<>();
        String client ;
        int operation ;
        boolean recherche ;
        char reponse = 'i';
        Scanner sc = new Scanner(System.in);
        Scanner scDeux = new Scanner(System.in);
        HashMap temp = new HashMap();



        HashMap compte = new HashMap();
        banque.put("Marie", creationCompte(6,9, compte));

        banque.put("Julien", creationCompte(21,19, compte));

        banque.put("Sophie", creationCompte(15,14,compte));

        banque.put("John",creationCompte(10,14, compte));


        do {
            do {
                System.out.println(banque.keySet());
                System.out.println("Entrée le nom du client :");
                client = sc.nextLine();
                recherche = rechercheClient(client, banque);
                //System.out.println(recherche);
                if (recherche == false)
                    System.out.println("Le client entrée n'existe pas");

            } while (recherche != true);

            do {
                System.out.println("Quelle opération voulez-vous faire ?");
                System.out.println("1 -> afficher le solde");
                System.out.println("2 -> afficher les credits");
                System.out.println("3 -> afficher les debits");
                operation = sc.nextInt();
            } while (operation != 1 && operation != 2 && operation != 3);

            temp = (HashMap) banque.get(client);

            switch (operation) {
                case 1:
                    //System.out.println("le solde de " + client + " est de " + (temp.get("solde"))+ " €");

                    break;
                case 2:
                    System.out.println("les credits de " + client + " sont de " + (temp.get("credit"))+ " €");
                    break;
                case 3:
                    System.out.println("les debits de " + client + " sont de " + (temp.get("debit"))+ " €");
                    break;
                default:
                    System.out.println("erreure");
            }

            do {
                System.out.println("Voulez vous faire une nouvelle demande ? (o/n)");
                reponse = scDeux.nextLine().charAt(0);
            }while (reponse != 'o' && reponse != 'n');
        sc.nextLine();
        }while (reponse == 'o');

        System.out.println("Au revoir");
    }
}

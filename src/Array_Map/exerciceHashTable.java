package Array_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class exerciceHashTable {

    /*
                -- Exercice 1 :
                - Première partie :

                Etant donné un annuaire de contact.
                Demander à l'utilisateur si il veut ajouter un contact.
                Si oui, on lui demande d'ajouter le numéro de téléphone fixe, celui du mobile, l'adresse et une note.
                Il n'est pas obligé de remplir toutes les informations.
                Contrainte : je doit pouvoir accéder aux informations de mon contact juste en connaissant son nom.
                Vous pouvez construire cette annuaire comme bon vous semble.
                Cependant, voici une version proposée :
                {
                    "Jean Marie" = {
                        "Fixe" = "03776434",
                        "Mobile" = "0623423423",
                        "Adresse" = "30 rue de verdun, 57000 Metz"
                    },
                    "Marc" = {
                        "Mobile" = "064342523",
                        "Note" = "Marc de la compta"
                    }
                }
                - Deuxième partie :

                On reprend l'annuaire de la première partie.
                Vous pouvez remplir cette annuaire avec des valeurs par défaut.
                Demander à l'utilisateur si il souhaite consulter la fiche d'un contact.
                Il peut choisir d'afficher son numero, son adresse etc...
                Il peut également choisir de tout afficher.
                Il peut consuler plusieurs personnes.

                - Troisième partie.
                On reprend l'annuaire de la première partie.
                Vous pouvez remplir cette annuaire avec des valeurs par défaut.
                L'utilisateur peut, si il le souhaite, modifier un contact.
                Modifier un numéro, l'adresse etc...
                Mais aussi rajouter une info si elle n'es pas présente.


     */


    public static void main(String[] args) {


        //Premiere partie

        HashMap<String, HashMap<String, String>> repertoire = new HashMap();
        char reponseContact, reponseNouvelleOperation;
        int reponseAjoutDonnee;
        String nomContact;
        Scanner sc = new Scanner(System.in);

        //do {

            System.out.println("Que voulez vous faire ?");
            System.out.println("1 --> ajouter un contact");

            do {

                do {
                    System.out.println("Voulez-vous entrer un contact o/n :");
                    reponseContact = sc.nextLine().charAt(0);
                } while (reponseContact != 'o' && reponseContact != 'n');//check


                if (reponseContact == 'o') {
                    System.out.println("Entrez le nom du nouveau contact :");
                    nomContact = sc.nextLine();
                    HashMap<String, String> contact = new HashMap();
                    repertoire.put(nomContact, contact);

                    do {

                        do {
                            System.out.println("Quel opération voulez vous faire :");
                            System.out.println("1 --> Ajouter un numero fixe");
                            System.out.println("2 --> Ajouter un numero portable");
                            System.out.println("3 --> Ajouter une adresse");
                            System.out.println("4 --> Ajouter une note");
                            Scanner scAjout = new Scanner(System.in);
                            reponseAjoutDonnee = scAjout.nextInt();
                        } while (reponseAjoutDonnee != 1 && reponseAjoutDonnee != 2 && reponseAjoutDonnee != 3 && reponseAjoutDonnee != 4);// check

                        HashMap<String, String> donnee = new HashMap<>();
                        String ajout;

                        switch (reponseAjoutDonnee) {
                            case 1: {
                                System.out.println("numero de fixe :");
                                ajout = sc.nextLine();
                                donnee.put("fixe", ajout);
                                repertoire.put(nomContact, donnee);
                                break;
                            }
                            case 2: {
                                System.out.println("numero de portable :");
                                ajout = sc.nextLine();
                                donnee.put("portable", ajout);
                                repertoire.put(nomContact, donnee);
                                break;
                            }
                            case 3: {
                                System.out.println("entrez l'adresse :");
                                ajout = sc.nextLine();
                                donnee.put("adresse", ajout);
                                repertoire.put(nomContact, donnee);
                                break;
                            }
                            case 4: {
                                System.out.println("votre note :");
                                ajout = sc.nextLine();
                                donnee.put("note", ajout);
                                repertoire.put(nomContact, donnee);
                                break;
                            }
                        }// fin switch

                        do {
                            System.out.println("Voulez-vous faire une nouvelle opération o/n");
                            reponseNouvelleOperation = sc.nextLine().charAt(0);
                        } while (reponseNouvelleOperation != 'o' && reponseNouvelleOperation != 'n');// check

                    } while (reponseNouvelleOperation == 'o');//fin de boucle entree donnée

                }

            } while (reponseContact == 'o');// fin de boucle entrée contact

        //}
    }//fin de main

}

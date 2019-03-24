package ListeChainee;

public class TestListChainee {

    public static void main(String[] args) {

        ListeChainee liste = new ListeChainee(1);

        liste.insererFinListe(2);

        liste.insererFinListe(3);

        liste.insererFinListe(4);

        liste.insererFinListe(5);

        liste.insererFinListe(6);

        liste.supp(4);

        liste.ajouterAuDebut(8);

        System.out.println("contenue de la liste : "+liste);

        System.out.println("le premier est :"+liste.getPremier().getDonneeDuMaillon());

        System.out.println("dernier :"+liste.dernierMaillon());

        System.out.println("longueur : "+liste.longueurListe());

        System.out.println("9 est dedans ? "+liste.dedans(9));

        System.out.println("3 est dedans ? "+liste.dedans(3));


    }

}

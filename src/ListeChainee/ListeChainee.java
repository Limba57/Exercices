package ListeChainee;

public class ListeChainee {

    Maillon premier;

    public ListeChainee(int v){

        premier = new Maillon(v);

    }

    public ListeChainee(){

        premier = null;

    }

    // retourne le premier maillon
    public Maillon getPremier(){

        return premier;

    }

    // savoir si la liste set vide
    public boolean estVide(){

        return premier == null;

    }

    // inseret en debut de liste
    public void ajouterAuDebut (int valeur){

        Maillon ancienpremier = premier;
        premier = new Maillon(valeur, ancienpremier);

    }

    // retourne la longueure de la liste
    public int longueurListe(){

        int longueur = 0;
        Maillon ref=getPremier();

        while (ref !=null){
            longueur ++;
            ref = ref.getNext();
        }

        return longueur;

    }

    // verifie si un element est ds la liste
    public boolean dedans(int v){

        boolean trouve = false;
        Maillon ref = getPremier();

        while (!trouve && ref !=null){
            if (ref.getDonneeDuMaillon() == v){

                trouve = true;

            }else{

                ref = ref.getNext();

            }
        }

        return  trouve;

    }

    // inserer en fin de liste
    public void insererFinListe(int v){

        Maillon dernier = new Maillon(v);

        Maillon ref = getPremier();

        while (ref.getNext() != null){

            ref = ref.getNext();

        }

        ref.setNext(dernier);

    }

    // donne le dernier element de la liste
    public int dernierMaillon(){

        Maillon ref = getPremier();

        while (ref.getNext() != null){

            ref = ref.getNext();

        }

        return ref.getDonneeDuMaillon();

    }

    // suprime un element de la liste
    public void supp(int v){

        if(estVide())
            return;

        if (premier.getDonneeDuMaillon() == v) {
            premier = premier.getNext();
        }else{

            Maillon avant = premier;
            Maillon ref = premier.getNext();
            while (ref != null && ref.getDonneeDuMaillon() != v){

                avant = ref;
                ref = ref.getNext();

            }
            if (ref != null){
                avant.setNext(ref.getNext());
            }
        }


    }

    // revoit un string qui concatene la liste
    public String toString (){

        String liste = "" ;

        Maillon ref = getPremier();

        if(ref.getNext() == null)
            return ""+ref.getDonneeDuMaillon();

        while(ref.getNext() != null){

            liste = liste+ref.getDonneeDuMaillon()+" ,";
            ref = ref.getNext();

        }

        return liste+ref.getDonneeDuMaillon();

    }

}

package SerieExercices.S12;

public class ConnectDice {

    int nbrDeFaces;

    // constructeur du dés avec en parametre le nombre de faces
    public ConnectDice(int nbrDeFaces) {

        this.nbrDeFaces = nbrDeFaces;
    }

    // lancer du dés avec retour de l'info
    public synchronized int lancer (String nom){

        int nombreAleatoire = 1 + (int)(Math.random() * (nbrDeFaces));
        return nombreAleatoire;
    }


}

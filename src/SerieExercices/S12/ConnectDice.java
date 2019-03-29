package SerieExercices.S12;



public class ConnectDice {

    int nbrDeFaces;

    public ConnectDice(int nbrDeFaces) {

        this.nbrDeFaces = nbrDeFaces;

    }


    public int lancer (){

        int nombreAleatoire = 1 + (int)(Math.random() * (nbrDeFaces));

        return nombreAleatoire;

    }


}

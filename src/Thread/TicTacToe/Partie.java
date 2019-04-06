package Thread.TicTacToe;

public class Partie {

    Joueur joueurX;
    Joueur joueurO;
    Grille grille;

    public Partie() {
        grille = new Grille();

        joueurO = new Joueur(1,"O",this.grille);
        joueurX = new Joueur(2,"X",this.grille);

        Thread t1 = new Thread(joueurO);
        t1.start();
        Thread t2 = new Thread(joueurX);
        t2.start();
    }
}

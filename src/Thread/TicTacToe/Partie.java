package Thread.TicTacToe;

public class Partie {

    Joueur joueurX;
    Joueur joueurO;
    Grille grille;

    public Partie() {

        joueurO = new Joueur("O");
        joueurX = new Joueur("X");
        grille = new Grille();

    }
}

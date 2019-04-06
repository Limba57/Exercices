package Thread.JeuxDeDes;

public class MainDes {

    public static void main(String[] args) {

        Partie partie = new Partie();

        Joueur un = new Joueur("Seb",partie);
        Joueur deux = new Joueur("Jerem",partie);
        Joueur trois = new Joueur("Mika",partie);
        Joueur quatre = new Joueur("Mathias",partie);
        Joueur cinq = new Joueur("Luc", partie);
        Joueur six = new Joueur("Max", partie);
        Joueur sept = new Joueur("Steph", partie);
        Joueur huit = new Joueur("Kat", partie);
        Joueur neuf = new Joueur("Athur", partie);
        Joueur dix = new Joueur("Axel", partie);
        Joueur onze = new Joueur("Ginette", partie);

        /*
        Thread t1 = new Thread(un);
        Thread t2 = new Thread(deux);

        t1.join();   ---> ici permet de joindre les deux thread pour permetre l'execution du code qui suit

        .
        .
        .
        .

        */


    }
}

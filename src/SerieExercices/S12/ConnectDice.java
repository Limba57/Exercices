package SerieExercices.S12;



import java.util.Scanner;

public class ConnectDice {

    int nbrDeFaces;

    public ConnectDice(int nbrDeFaces) {

        this.nbrDeFaces = nbrDeFaces;

    }

    public ConnectDice() {
        nbrDeFaces = 6;
    }

    public int lancer (){

        //Scanner sc = new Scanner(System.in);
        //System.out.println("\n---------------------\n");
        //System.out.println(joueur.getNom()+" Pret à lancer le des ...");
        //sc.nextLine();
        int nombreAleatoire = 1 + (int)(Math.random() * (nbrDeFaces));
        //System.out.println("Et c'est un : "+nombreAleatoire+" !!!!!!");

        return nombreAleatoire;

    }


}

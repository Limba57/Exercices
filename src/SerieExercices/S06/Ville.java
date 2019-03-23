package SerieExercices.S06;

public class Ville {
    String nom;
    public int population;
    public double surface;
    public double densite;

    public Ville (String nom, int population, double surface){
        this.nom = nom;
        this.population = population;
        this.surface = surface;
        densite = Math.round((population/surface)*100);
        densite = densite/100;
    }

    public void printDensite (){
        System.out.println("La ville de "+nom+" a une densité de "+densite+" habitants/km²");
    }


}

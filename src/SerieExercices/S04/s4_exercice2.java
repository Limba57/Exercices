package SerieExercices.S04;

import java.util.HashMap;

public class s4_exercice2 {
    /*
    -- Exercice 2 :

        Jean va faire ses courses. Il a noté le nom et le prix de tous les articles dans son caddie.
        Il possède une liste de course et le prix associé de chaque article :
        "Salade"=>"1.03","Tomate"=>"2.3","Oignon"=>"1.85","Chou rouge"=>"0.85"

        Ecrire un programme qui calcule le prix total de ses courses.
     */
    public static void main(String[] args) {

        HashMap<String, Double> course = new HashMap<>();

        course.put("Salade",1.03);
        course.put("Tomate",2.3);
        course.put("Oignon",1.85);
        course.put("Chou rouge",0.85);

        System.out.println(course);

        double facture = 0;

        for (String temp : course.keySet()){
            facture = facture + course.get(temp);
        }
            System.out.println("total des courses : "+facture);


    }
}

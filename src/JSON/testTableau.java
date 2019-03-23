package JSON;

import java.util.ArrayList;

public class testTableau {

    public static void main(String[] args){

        Personne.serializedPersonne(new Personne("Sebastien",0303030303, 0606060606));

        System.out.println(Personne.deserializedPersonne("Sebastien.json"));

        ArrayList<Personne> annuaire = new ArrayList();

        annuaire.add(new Personne("Seb", 123456, 654321));
        annuaire.add(new Personne("Jerem", 456789, 987654));
        annuaire.add(new Personne("Mathias", 147852, 258741));

        Personne.serializedTableau(annuaire);

        System.out.println(Personne.deSerializedTableau("Seb3.json"));
    }

}

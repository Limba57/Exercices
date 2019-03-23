package JSON;

public class test {

    public static void main(String[] args) throws Exception {

        Personne seb = new Personne("seb", 123456, 654321);

        seb.serializedPersonne(seb);

        Personne newSeb = seb.deserializedPersonne("seb.json");

        System.out.println(seb);

        System.out.println(newSeb);


    }

}

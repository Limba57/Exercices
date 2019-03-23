package Thread;

public class Main {

    public static void main(String[] args) {

        Interview interview = new Interview();
        new Journaliste(interview);
        new Star(interview);

    }
}

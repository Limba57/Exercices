package Thread.Interview;

public class MainInterview {

    public static void main(String[] args) {

        Interview interview = new Interview();
        new Journaliste(interview);
        new Star(interview);

    }
}

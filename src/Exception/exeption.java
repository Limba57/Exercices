package Exception;

public class exeption {

    public static void main(String[] args) {

        int j = 20, i = 2 ;

        try {
            System.out.println(" => "+ (j / i));
        } catch (ArithmeticException e){
            System.out.println("tu veux faire l'impossible !"+e.getMessage());
            //e.printStackTrace();
        }
        finally{
            System.out.println("quoi qu'il arrive");
        }
        // System.out.println("la suite");
    }
}

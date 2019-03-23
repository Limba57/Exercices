package Exception;



public class exercice_algo_4 {

    public static void main(String[] args) throws accidentDuTravailException {

        Entité entité;

        switch(Entité.random(1,4)){
            case 1 :
                entité =new Robot();
                break;
            case 2 :
                entité = new Humain();
                break;
            case 3 :
                entité = new Chat();
                break;
            case 4 :
                entité = new Chien();
                break;
            default:
                entité = new Entité();

        }

        if (entité instanceof Animal){
            System.out.println(entité);
            for (int i = 0 ; i<11 ; i++)
            System.out.println(((Animal) entité).cri);
        }

        if (entité instanceof Travailler){
            System.out.println(entité);
            for(int i = 0 ; i<11 ; i++)
            System.out.println(((Travailler) entité).travailler());
            if (entité instanceof Humain & Entité.random(1,6) == 1){

                throw new accidentDuTravailException();

            }
        }



    }
}

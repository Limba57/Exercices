package Array_Map;

import java.util.Scanner;
import java.util.Arrays;
public class exo_tableau
{

    public static void main(String[] args)
    {
        char demande;
        boolean exit = false;
        char mot[] = new char[1];
        char temp[] = null;
        Scanner input = new Scanner(System.in);
        do
        {

            System.out.println("entrez un caract�re (un point pour finir la saisi) : ");
            demande = input.nextLine().charAt(0);
            if (demande =='.')
            {
                exit = true;
                for (char impression : mot)
                    System.out.print(impression);
            }
            else
            {
                temp = Arrays.copyOf(mot, (mot.length+1));
                temp[mot.length-1] = demande;
                mot = temp; // on peut copier des tableau directement
            }
        }while (exit != true);
    }
}


 	/*char demande;
		char mot[] = new char[1];
		char temp[] = null;
		Scanner input = new Scanner(System.in);
		do
		{

			System.out.println("entrez un caract�re (un point pour finir la saisi) : ");
			demande = input.nextLine().charAt(0);
			if(demande != '.')
			{
				temp = Arrays.copyOf(mot, (mot.length));
				temp[mot.length-1] = demande;
				mot = Arrays.copyOf(temp, (temp.length+1));
			}
		}while (demande != '.');

		 	for (char impression : mot)
		 	System.out.print(impression);

	}
}*/

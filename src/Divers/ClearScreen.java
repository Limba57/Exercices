package Divers;

import java.io.IOException;

public class ClearScreen {
    public static void main(String... arg)  {

        for(int i=1; i<=10; i++)
        {
            try {

                System.out.println(i);
                //System.out.print("\033\143");
                //clearScreen();
                Runtime.getRuntime().exec("le truc pour effacer sous unix/lunix");
            } catch (IOException e) {

            }
        }

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void cls() {

        //Clears Screen in java
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }



}

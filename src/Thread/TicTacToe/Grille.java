package Thread.TicTacToe;

import java.util.ArrayList;

public class Grille {

    String grille[][] = new String[7][7];

    public Grille() {

        String tb[] = {" ----- "};
        String jun[] = {"|1|2|3|"};
        String jdeux[] = {"|4|5|6|"};
        String jtrois[] = {"|7|8|9|"};

        String i[] = {"|-+-+-|"};

        grille[0] = tb;
        grille[1] = jun;
        grille[2] = i;
        grille[3] = jdeux;
        grille[4] = i;
        grille[5] = jtrois;
        grille[6] = tb;

    }

    public boolean ajouter(String ox, int position) {

        switch (position){
            case 1 :
                if (position == Integer.parseInt(grille[1][1])){
                    grille[1][1] = ox;
                    return true;
                }else{
                    return false;
                }
            case 2:
                if (position == Integer.parseInt(grille[1][3])){
                    grille[1][3] = ox;
                    return true;
                }else{
                    return false;
                }
            case 3 :
                if (position == Integer.parseInt(grille[1][5])){
                    grille[1][5] = ox;
                    return true;
                }else{
                    return false;
                }
            case 4:
                if (position == Integer.parseInt(grille[3][1])){
                    grille[3][1] = ox;
                    return true;
                }else{
                    return false;
                }
            case 5:
                if (position == Integer.parseInt(grille[3][3])){
                    grille[3][3] = ox;
                    return true;
                }else{
                    return false;
                }
            case 6:
                if (position == Integer.parseInt(grille[3][5])){
                    grille[3][5] = ox;
                    return true;
                }else{
                    return false;
                }
            case 7:
                if (position == Integer.parseInt(grille[5][1])){
                    grille[5][1] = ox;
                    return true;
                }else{
                    return false;
                }
            case 8:
                if (position == Integer.parseInt(grille[5][3])){
                    grille[5][3] = ox;
                    return true;
                }else{
                    return false;
                }
            case 9:
                if (position == Integer.parseInt(grille[5][5])){
                    grille[5][5] = ox;
                    return true;
                }else{
                    return false;
                }
        }
        return  false;

    }

    public String toString() {
        String vide = "";
        for (String l[] : grille) {
            for (String m : l) {
                vide = vide + m;
            }
            vide = vide + "\n";
        }
        return vide;
    }
/*
    public void verification(String ox) {

        int ok = 0;
        ArrayList<Integer> check = new ArrayList<>();

        for (int i = 1; i <= 5; i += i + 2) {
            for (int j = 1; j <= 5; j = j + 2) {
                if (grille[i][j].equals(ox)) {
                   ok =  i + j;

                }
            }
        }
        if (check.contains(2) && check.contains(4) && check.contains(6)) {
            return true;
        }else if (check.contains(2) && check.contains(6) && check)

    }
*/
}

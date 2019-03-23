package Panel_animation;

import javax.swing.*;

public class essai {

    public static void main(String[] args) {

        String name;
        name = JOptionPane.showInputDialog("name");

        System.out.println(name);

        JOptionPane.showMessageDialog(null , name);

        JOptionPane.showMessageDialog(null, name , "Name", JOptionPane.WARNING_MESSAGE);

        System.exit(0);

    }

}

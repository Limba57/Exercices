package OCR.Net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Inet {

    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            showInformation(address, "Hote local");

            address = InetAddress.getByAddress(new byte[]{(byte) 192, (byte) 168, 2, 44});
            showInformation(address, "192.168.2.44");

            address = InetAddress.getByName("localhost");
            showInformation(address, "localhost");

            address = InetAddress.getByName("127.0.01");
            showInformation(address, "127.0.01");

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public static void showInformation(InetAddress address, String name) {
        System.out.println("--------------------------------------");
        System.out.println("Information de "+name);
        System.out.println("--------------------------------------");
        System.out.println("Nom : " + address.getHostName());
        System.out.println("Adrese : " + address.getHostAddress());
        System.out.println("Nom canonique " + address.getCanonicalHostName());
        // cette methode retourne un tableau de bits
        byte[] bAdress = address.getAddress();
        String ip = "";
        for (byte b : bAdress) {
            ip += (b & 0xFF) + ".";//l'instruction & 0xFF permet d'avoir la valeur non signé

        }
        System.out.println("Adress IP depuis tableau de bytes " + ip);
    }
}

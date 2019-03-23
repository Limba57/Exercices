package OCR.Net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Inet2 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("openclassroom.com");
            System.out.println("Ladress ip de " + address.getHostName() + " est " + address.getHostAddress());

            InetAddress[] adresses = InetAddress.getAllByName("google.fr");
            System.out.println("\nToutes les adresse IP de google.fr");
            for (InetAddress ad : adresses) {
                System.out.println(" - " + ad.getHostAddress());
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}

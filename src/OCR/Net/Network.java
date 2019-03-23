package OCR.Net;

import java.net.InetAddress;
import java.net.SocketException;
import java.util.Enumeration;
import java.net.NetworkInterface;

public class Network {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> list = NetworkInterface.getNetworkInterfaces();

            while (list.hasMoreElements()) {
                NetworkInterface ni = list.nextElement();
                Enumeration<InetAddress> listAdress = ni.getInetAddresses();
                while (listAdress.hasMoreElements()) {
                    InetAddress adress = listAdress.nextElement();
                    showInformation(adress);
                }
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    public static void showInformation(InetAddress address) {
        System.out.println("------------------------");
        System.out.println("Nom : " + address.getHostName());
        System.out.println("Adresse : " + address.getHostAddress());
        System.out.println("Nom canonique : " + address.getCanonicalHostName());
    }

}




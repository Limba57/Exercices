package socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class socket {

    public static void main(String[] args) {

        InetAddress local;
        InetAddress serveur;

        try{

            local = InetAddress.getLocalHost();
            System.out.println("Adresse local : "+local);

            serveur = InetAddress.getByName("www.siteduzero.com");
            System.out.println("Adresse serveur SDZ : "+serveur);
        }catch (UnknownHostException e){
            System.out.println("erreure");
        }


    }

}

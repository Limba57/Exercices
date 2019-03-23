package OCR.Net;

import java.io.IOException;
import java.net.Socket;

public class Clint_multi {

    public static void main(String[] zero) {

        Socket socket;
        try {
            socket = new Socket("localHost", 2009);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

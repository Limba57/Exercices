package socket.ChatComplet;

import java.net.Socket;

public class PartageDeConnexion implements Runnable{

    private Socket socket;
    private Reception reception;

    public PartageDeConnexion(Socket socket) {
        this.socket = socket;
        reception = new Reception(socket);
    }

    @Override
    public void run() {

    }
}

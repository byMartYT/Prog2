import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class Server {

    public static void main(String[] args) {

        final int PORT = 5100;
        while (true) {
            try (ServerSocket ss = new ServerSocket(PORT); Socket connection = ss.accept(); InputStream is = connection.getInputStream(); ObjectInputStream br = new ObjectInputStream(is); OutputStream os = connection.getOutputStream(); ObjectOutputStream bw = new ObjectOutputStream(os)) {
                System.out.println("Client verbunden");
                while (connection.isConnected()) {
                    ServerGame game = new ServerGame();
                    bw.writeObject(input(game, (ClientGuess) br.readObject()));
                    while (game.playing) {
                        ClientGuess res = null;

                        try {
                            res = (ClientGuess) br.readObject();
                        } catch (EOFException e) {
                        }
                        bw.writeObject(input(game, res));
                        bw.flush();
                    }
                }
            } catch (SocketException e) {
                System.out.println("Client getrennt");
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("Verbindung getrennt");
            }
        }
    }

    public static ServerResponse input(ServerGame g, ClientGuess c) {
        ServerResponse s = g.input(c.guess);
        System.out.println(s);
        return s;
    }

}

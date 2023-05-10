import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        final int PORT = 5100;
        final String HOST = "localhost";

        try (Socket connectionToServer = new Socket(HOST, PORT);
             OutputStream os = connectionToServer.getOutputStream();
             ObjectOutputStream bw = new ObjectOutputStream(os);
             InputStream is = connectionToServer.getInputStream();
             ObjectInputStream br = new ObjectInputStream(is)
        ) {
            while (connectionToServer.isConnected()) {
                ClientGame game = new ClientGame();
                game.menu(sc);
                bw.writeObject(new ClientGuess('#'));
                bw.flush();
                handleResponse((ServerResponse) br.readObject(), game);
                while (game.playing) {
                    String input;
                    do {
                        System.out.print("Eingabe: ");
                        input = sc.nextLine();
                    } while (input == null || input.equals(""));
                    bw.writeObject(new ClientGuess(input.charAt(0)));
                    bw.flush();
                    try {
                        handleResponse((ServerResponse) br.readObject(), game);
                    } catch (EOFException ignored) {

                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void handleResponse(ServerResponse response, ClientGame g) {
        g.playing = response.playing;
        if (response.printStats) g.print(response);
        if (!response.playing) {
            g.menu(sc);
        }
    }


}

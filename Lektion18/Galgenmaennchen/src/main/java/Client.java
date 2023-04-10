import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        final int PORT = 5100;
        final String HOST = "localhost";

        try (Socket connectionToServer = new Socket(HOST, PORT);
             OutputStream os = connectionToServer.getOutputStream();
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
             InputStream is = connectionToServer.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is))
        ) {
            while (connectionToServer.isConnected()) {

                String c;

                do {
                    c = br.readLine();
                    if (c.equals("EXIT")) {
                        System.exit(1);
                    }
                    if (!c.equals("END")) System.out.println(c);
                } while (!c.equals("END"));

                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine() + "\n";
                bw.write(s);
                bw.flush();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

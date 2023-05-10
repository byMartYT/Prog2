import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket s = new ServerSocket(5500)) {
            while (true) {
                Socket client = s.accept();

                System.out.println("Neuer Client verbunden! " + client.getInetAddress().getHostAddress());

                ServerConnection sc = new ServerConnection(client);

                new Thread(sc).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    public static class ServerConnection2 extends Thread {

        private final Socket connection;

        public ServerConnection2(Socket client) {
            this.connection = client;
        }

        @Override
        public void run() {
            try (
                    InputStream is = connection.getInputStream();
                    ObjectInputStream ois = new ObjectInputStream(is);
                    OutputStream os = connection.getOutputStream();
                    ObjectOutputStream oos = new ObjectOutputStream(os);
            ) {

                int[] number = (int[]) ois.readObject();
                oos.writeObject(handleList(number));
                oos.flush();
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("IOException Verbindung getrennt");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
        public HashMap<Integer, Boolean> handleList(int[] numbers){
            HashMap<Integer, Boolean> res = new HashMap<>();
            for (int nr : numbers) {
                res.put(nr, testNumber(nr));
            }
            return res;
        }

        public boolean testNumber(int nr) {
            if(nr < 2) return false;
            for(int i = 2; i < nr; i++) {
                if(nr % i == 0) return false;
            }
            return true;
        }


    }

}

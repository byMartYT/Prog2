import java.io.*;
import java.net.Socket;
import java.util.HashMap;

public class ServerConnection extends Thread {

    private Socket connection;

    public ServerConnection(Socket client) {
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

    public boolean testNumber(int nr) {
        if(nr < 2) return false;
        for(int i = 2; i < nr; i++) {
            if(nr % i == 0) return false;
        }
        return true;
    }

    public HashMap<Integer, Boolean> handleList(int[] numbers){
        HashMap<Integer, Boolean> res = new HashMap<>();
        for (int nr : numbers) {
            res.put(nr, testNumber(nr));
        }
        return res;
    }






}

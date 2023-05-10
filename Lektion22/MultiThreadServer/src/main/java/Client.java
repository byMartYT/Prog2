import java.io.*;
import java.net.Socket;
import java.util.HashMap;

public class Client extends Thread{

    private int[] numberslist;
    String name;

    public Client(String name, int[] numberslist) {
        this.numberslist = numberslist;
        this.name = name;
    }

    @Override
    public void run() {
        try (
                Socket connection = new Socket("localhost", 5500);
                OutputStream os = connection.getOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(os);
                InputStream is = connection.getInputStream();
                ObjectInputStream ois = new ObjectInputStream(is);
        ) {

            oos.writeObject(numberslist);
            oos.flush();
            HashMap<Integer, Boolean> result = (HashMap<Integer, Boolean>) ois.readObject();
            print(result);

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("IOException Verbindung getrennt");
            e.printStackTrace();
        }
    }

    public void print(HashMap<Integer, Boolean> a){
        StringBuilder sb = new StringBuilder();
        sb.append(name+":\n");
        a.forEach((v1 ,v2) -> sb.append(v1 + " -> " + v2 + "\n"));
        System.out.println(sb);
    }
}

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Locale;

public class Server {


    static int fails = 0;

    static ArrayList<Character> typedChars = new ArrayList<>();
    static ArrayList<Character> rightChars = new ArrayList<>();
    static ArrayList<Character> wrongChars = new ArrayList<>();
    static ArrayList<Character> leftChars = new ArrayList<>();

    static final String[] words = {"PROGRAMMIERSPRACHEN", "Kirschkern", "Weitspuckwettbewerb", "Lokomotiv", "Metapher", "einpackpapier", "lebenszyklus", "druckventil"};

    static boolean playing;

    static String word;

    public static void main(String[] args) {

        final int PORT = 5100;
        while (true) {
            try (ServerSocket ss = new ServerSocket(PORT); Socket connection = ss.accept(); InputStream is = connection.getInputStream(); BufferedReader br = new BufferedReader(new InputStreamReader(is)); OutputStream os = connection.getOutputStream(); BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os))) {

                System.out.println("Client verbunden");

                while (connection.isConnected()) {

                    if (menu(bw, br)) {
                        generate();
                        while (playing) {
                            print(bw);
                            bw.write("Eingabe: \n");
                            bw.write("END\n");
                            bw.flush();

                            input(br.readLine().charAt(0), bw, br);
                        }
                    } else {
                        bw.write("Bis zum nächsten mal\n");
                        bw.write("EXIT\n");
                        bw.flush();
                        connection.close();
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

    public static boolean menu(BufferedWriter bw, BufferedReader br) throws IOException {
        bw.write("********** MENU **********\n");
        bw.write("Enter: \"start\" to start\n");
        bw.write("Enter: \"exit\" to exit\n");
        bw.write("**************************\n");
        bw.write("END\n");
        bw.flush();
        switch (br.readLine()) {
            case "start" -> {
                return true;
            }
            case "exit" -> {
                return false;
            }
            default -> {
                System.out.println("Wrong Input. Restart Menu");
                bw.write("Wrong Input!\n");
                return menu(bw, br);
            }
        }
    }

    public static void input(char in, BufferedWriter bw, BufferedReader br) throws IOException {
        System.out.println(in);
        if (in == ' ') {
            in = br.readLine().charAt(0);
        }
        in = Character.toUpperCase(in);
        if (typedChars.contains(in)) {
            bw.write("Schon eingegeben!\n");
            System.out.println("Schon eingegeben!");
        } else {
            typedChars.add(in);
            if (leftChars.contains(in)) {
                leftChars.remove(Character.valueOf(in));
                rightChars.add(in);
            } else {
                wrongChars.add(in);
                rip(true, bw);
            }
        }
        if (leftChars.isEmpty()) {
            bw.write("Du hast gewonnen!\n");
            playing = false;
        }
    }

    public static void print(BufferedWriter bw) throws IOException {
        rip(false, bw);
        bw.write("Falsch: ");
        System.out.print("Falsch: ");
        for (int i = 0; i < wrongChars.size(); i++) {
            if (i != 0) {
                bw.write(", ");
                System.out.print(", ");
            }
            bw.write(wrongChars.get(i));
            System.out.print(wrongChars.get(i));
        }
        bw.write("\n");
        System.out.println();
        for (int i = 0; i < word.length(); i++) {
            if (rightChars.contains(word.charAt(i))) {
                bw.write(word.charAt(i));
                System.out.print(word.charAt(i));
            } else {bw.write("_"); System.out.print("_");}
        }
        bw.write("\n");
        System.out.println();
    }

    public static void generate() {
        fails = 0;
        typedChars.clear();
        rightChars.clear();
        leftChars.clear();
        wrongChars.clear();

        word = words[(int) Math.round(Math.random() * (words.length - 1))].toUpperCase(Locale.GERMAN);
        System.out.println(word);
        for (char ch : word.toCharArray()) {
            if (!leftChars.contains(ch)) {
                leftChars.add(ch);
            }
        }
        playing = true;
    }

    public static void rip(boolean inc, BufferedWriter bw) throws IOException {
        if (inc) ++fails;
        switch (fails) {
            case 0 -> {
                bw.write("--------------\n");
                bw.write("\n");
                bw.write("\n");
                bw.write("\n");
                bw.write("\n");
                bw.write("\n");
                bw.write("\n");
                bw.write("--------------\n");
            }
            case 1 -> {
                bw.write("--------------\n");
                bw.write("\n");
                bw.write("\n");
                bw.write("\n");
                bw.write("\n");
                bw.write("\n");
                bw.write(" //\\\\  \n");
                bw.write("--------------\n");
            }
            case 2 -> {
                bw.write("--------------\n");
                bw.write("\n");
                bw.write("\n");
                bw.write("\n");
                bw.write("\n");
                bw.write("  |\n");
                bw.write(" //\\\\  \n");
                bw.write("--------------\n");
            }
            case 3 -> {
                bw.write("--------------\n");
                bw.write("\n");
                bw.write("\n");
                bw.write("\n");
                bw.write("  |\n");
                bw.write("  |\n");
                bw.write(" //\\\\  \n");
                bw.write("--------------\n");
            }
            case 4 -> {
                bw.write("--------------\n");
                bw.write("\n");
                bw.write("\n");
                bw.write("  |\n");
                bw.write("  |\n");
                bw.write("  |\n");
                bw.write(" //\\\\  \n");
                bw.write("--------------\n");
            }
            case 5 -> {
                bw.write("--------------\n");
                bw.write("\n");
                bw.write("  |\n");
                bw.write("  |\n");
                bw.write("  |\n");
                bw.write("  |\n");
                bw.write(" //\\\\  \n");
                bw.write("--------------\n");
            }
            case 6 -> {
                bw.write("--------------\n");
                bw.write("   _\n");
                bw.write("  |\n");
                bw.write("  |\n");
                bw.write("  |\n");
                bw.write("  |\n");
                bw.write(" //\\\\  \n");
                bw.write("--------------\n");
            }
            case 7 -> {
                bw.write("--------------\n");
                bw.write("   __\n");
                bw.write("  |  \n");
                bw.write("  |  \n");
                bw.write("  |  \n");
                bw.write("  |  \n");
                bw.write(" //\\\\  \n");
                bw.write("--------------\n");
            }
            case 8 -> {
                bw.write("--------------\n");
                bw.write("   ___\n");
                bw.write("  |  \n");
                bw.write("  |  \n");
                bw.write("  |  \n");
                bw.write("  |  \n");
                bw.write(" //\\\\  \n");
                bw.write("--------------\n");
            }
            case 9 -> {
                bw.write("--------------\n");
                bw.write("   ____\n");
                bw.write("  |  \n");
                bw.write("  |  \n");
                bw.write("  |  \n");
                bw.write("  |  \n");
                bw.write(" //\\\\  \n");
                bw.write("--------------\n");
            }
            case 10 -> {
                bw.write("--------------\n");
                bw.write("   ____\n");
                bw.write("  |    | \n");
                bw.write("  |  \n");
                bw.write("  |  \n");
                bw.write("  |  \n");
                bw.write(" //\\\\  \n");
                bw.write("--------------\n");
            }
            case 11 -> {
                bw.write("--------------\n");
                bw.write("   ____\n");
                bw.write("  |    | \n");
                bw.write("  |    O \n");
                bw.write("  |  \n");
                bw.write("  |  \n");
                bw.write(" //\\\\  \n");
                bw.write("--------------\n");
            }
            case 12 -> {
                bw.write("--------------\n");
                bw.write("   ____\n");
                bw.write("  |    | \n");
                bw.write("  |    O \n");
                bw.write("  |   /|\\\n");
                bw.write("  |  \n");
                bw.write(" //\\\\  \n");
                bw.write("--------------\n");
            }
            case 13 -> {
                bw.write("--------------\n");
                bw.write("   ____\n");
                bw.write("  |    | \n");
                bw.write("  |    O \n");
                bw.write("  |   /|\\\n");
                bw.write("  |   / \\\n");
                bw.write(" //\\\\  \n");
                bw.write("--------------\n");
                bw.write("GAME OVER!\n");
                playing = false;
            }
        }
    }
}



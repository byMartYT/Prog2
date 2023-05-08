import java.util.Scanner;

public class ClientGame {
    boolean playing;


    public void menu(Scanner sc) {
        System.out.println("********** MENU **********\n");
        System.out.println("Enter: \"start\" to start\n");
        System.out.println("Enter: \"exit\" to exit\n");
        System.out.println("**************************\n");

        switch (sc.nextLine()) {
            case "start" -> {
                playing = true;
                return;
            }
            case "exit" -> {
                System.exit(1);
            }
            default -> {
                System.out.println("Falsche Eingabe");
                menu(sc);
            }
        }

    }

    public void print(ServerResponse response) {
        rip(response.failCount);
        if(response.response != null) System.out.println(response.response);
        if (response.wrongChars.length() > 0) {
            System.out.println("Falsch: " + response.wrongChars);
        }
        System.out.println(response.word);
    }

    public void rip(int fail) {
        switch (fail) {
            case 0 -> {
                System.out.print("--------------\n");
                System.out.print("\n");
                System.out.print("\n");
                System.out.print("\n");
                System.out.print("\n");
                System.out.print("\n");
                System.out.print("\n");
                System.out.print("--------------\n");
            }
            case 1 -> {
                System.out.print("--------------\n");
                System.out.print("\n");
                System.out.print("\n");
                System.out.print("\n");
                System.out.print("\n");
                System.out.print("\n");
                System.out.print(" //\\\\  \n");
                System.out.print("--------------\n");
            }
            case 2 -> {
                System.out.print("--------------\n");
                System.out.print("\n");
                System.out.print("\n");
                System.out.print("\n");
                System.out.print("\n");
                System.out.print("  |\n");
                System.out.print(" //\\\\  \n");
                System.out.print("--------------\n");
            }
            case 3 -> {
                System.out.print("--------------\n");
                System.out.print("\n");
                System.out.print("\n");
                System.out.print("\n");
                System.out.print("  |\n");
                System.out.print("  |\n");
                System.out.print(" //\\\\  \n");
                System.out.print("--------------\n");
            }
            case 4 -> {
                System.out.print("--------------\n");
                System.out.print("\n");
                System.out.print("\n");
                System.out.print("  |\n");
                System.out.print("  |\n");
                System.out.print("  |\n");
                System.out.print(" //\\\\  \n");
                System.out.print("--------------\n");
            }
            case 5 -> {
                System.out.print("--------------\n");
                System.out.print("\n");
                System.out.print("  |\n");
                System.out.print("  |\n");
                System.out.print("  |\n");
                System.out.print("  |\n");
                System.out.print(" //\\\\  \n");
                System.out.print("--------------\n");
            }
            case 6 -> {
                System.out.print("--------------\n");
                System.out.print("   _\n");
                System.out.print("  |\n");
                System.out.print("  |\n");
                System.out.print("  |\n");
                System.out.print("  |\n");
                System.out.print(" //\\\\  \n");
                System.out.print("--------------\n");
            }
            case 7 -> {
                System.out.print("--------------\n");
                System.out.print("   __\n");
                System.out.print("  |  \n");
                System.out.print("  |  \n");
                System.out.print("  |  \n");
                System.out.print("  |  \n");
                System.out.print(" //\\\\  \n");
                System.out.print("--------------\n");
            }
            case 8 -> {
                System.out.print("--------------\n");
                System.out.print("   ___\n");
                System.out.print("  |  \n");
                System.out.print("  |  \n");
                System.out.print("  |  \n");
                System.out.print("  |  \n");
                System.out.print(" //\\\\  \n");
                System.out.print("--------------\n");
            }
            case 9 -> {
                System.out.print("--------------\n");
                System.out.print("   ____\n");
                System.out.print("  |  \n");
                System.out.print("  |  \n");
                System.out.print("  |  \n");
                System.out.print("  |  \n");
                System.out.print(" //\\\\  \n");
                System.out.print("--------------\n");
            }
            case 10 -> {
                System.out.print("--------------\n");
                System.out.print("   ____\n");
                System.out.print("  |    | \n");
                System.out.print("  |  \n");
                System.out.print("  |  \n");
                System.out.print("  |  \n");
                System.out.print(" //\\\\  \n");
                System.out.print("--------------\n");
            }
            case 11 -> {
                System.out.println("--------------\n");
                System.out.println("   ____\n");
                System.out.println("  |    | \n");
                System.out.println("  |    O \n");
                System.out.println("  |  \n");
                System.out.println("  |  \n");
                System.out.println(" //\\\\  \n");
                System.out.println("--------------\n");
            }
            case 12 -> {
                System.out.print("--------------\n");
                System.out.print("   ____\n");
                System.out.print("  |    | \n");
                System.out.print("  |    O \n");
                System.out.print("  |   /|\\\n");
                System.out.print("  |  \n");
                System.out.print(" //\\\\  \n");
                System.out.print("--------------\n");
            }
            case 13 -> {
                System.out.print("--------------\n");
                System.out.print("   ____\n");
                System.out.print("  |    | \n");
                System.out.print("  |    O \n");
                System.out.print("  |   /|\\\n");
                System.out.print("  |   / \\\n");
                System.out.print(" //\\\\  \n");
                System.out.print("--------------\n");
                System.out.print("GAME OVER!\n");
                playing = false;
            }
        }
    }
}

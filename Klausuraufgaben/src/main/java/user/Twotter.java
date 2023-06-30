package user;

import java.util.ArrayList;
import java.util.List;

public class Twotter {

    static List<User> users = new ArrayList<>();
    public static void main(String[] args) {
        TwotterSystem sys = new TwotterSystem();
        User u = new User("Lol", "124125d");
        sys.addMessage(u, new Message("Hello World"));
    }

}


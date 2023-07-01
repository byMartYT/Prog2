package Twotter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserManager um = new UserManager();

        List<User> users = new ArrayList<>();

        users.add(new User("tom", "1245"));
        users.add(new User("max", "1245"));
        users.add(new User("tim", "1245"));
        users.add(new User("anna", "1245"));
        users.add(new User("NoahJungeHoerAufAbzuschreiben", "1245"));

        um.serialize(users);

        List<User> newUsers = um.deserialize();

        for(User u : newUsers) {
            System.out.println(u);
        }
    }
}

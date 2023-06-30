package user;

import java.io.Serializable;

public class User implements Serializable, Comparable<User> {

    final String benutzername;
    final transient String passwort;

    public User(String benutzername, String passwort) {
        this.benutzername = benutzername;
        this.passwort = passwort;
    }

    @Override
    public int compareTo(User o) {
        return this.benutzername.compareTo(o.benutzername);
    }
}

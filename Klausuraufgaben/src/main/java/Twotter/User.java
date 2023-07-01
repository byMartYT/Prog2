package Twotter;

import java.io.Serializable;

public class User implements Comparable<User>, Serializable {

    final String userName;

    final transient String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public int compareTo(User o) {
        return userName.compareTo(o.userName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(userName);
        sb.append(" | ");
        sb.append(password);
        return sb.toString();
    }
}

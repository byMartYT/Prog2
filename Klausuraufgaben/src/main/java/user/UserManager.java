package user;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserManager {
    //Schreiben Sie eine Klasse UserManager zum Serialisieren und Deserialisieren von Objekten des Typs User. Fangen Sie dabei auftreten- de Exceptions innerhalb der Methoden und propagieren Sie diese als RuntimeException. Bei der Implementierung von UserManager halten Sie sich bitte an das folgende Interface: ObjectManager

    static final String file = "./users.dat";

    public static void serialize(List<User> users) {
        try (FileOutputStream fw = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fw))
        {

            oos.writeObject(users);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Benutzer wurden serialisiert");
    }

    public static List<User> deserialize(String filename) {
        try(FileInputStream fi = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fi);
        ) {

            return (List<User>) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}


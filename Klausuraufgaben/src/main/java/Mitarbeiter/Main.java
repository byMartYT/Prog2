package Mitarbeiter;

import java.io.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Main {

    static transient HashSet<Mitarbeiter> employees;

    public static void main(String[] args) {

        HashSet<Mitarbeiter> hm = new HashSet<>();
        hm.add(new Mitarbeiter("Martin", "Kinder", 333, 130954860));
        hm.add(new Mitarbeiter("Martino", "Kindero", 444, 1023530));
        hm.add(new Mitarbeiter("Martini", "Kinderi", 111, 23423423));

        saveEmp(hm);

        employees = readEmp();

        employees.forEach(System.out::println);

        Arrays.stream(sortiere(employees)).forEach(System.out::println);

    }
    static public void saveEmp(HashSet<Mitarbeiter> l) {
        try (
                FileOutputStream fos = new FileOutputStream("mitarbeiter.dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos)
                ) {

            oos.writeObject(l);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static public HashSet<Mitarbeiter> readEmp() {
        HashSet<Mitarbeiter> res = new HashSet<>();
        try (
            FileInputStream fis = new FileInputStream("mitarbeiter.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
                ) {

            return (HashSet<Mitarbeiter>) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static public Mitarbeiter[] sortiere(Collection<Mitarbeiter> team) {

        Mitarbeiter[] emp = team.toArray(new Mitarbeiter[0]);

        Arrays.sort(emp, new VergleichePersonalNummer());

        return emp;
    }
}

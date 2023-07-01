package Twotter;

import java.io.*;
import java.util.List;

public class UserManager implements ObjectManager<User> {

    final File USERS_DAT = new File("users.txt");

    @Override
    public void serialize(List<User> object) {
        try(
                OutputStream os = new FileOutputStream(USERS_DAT);
                ObjectOutputStream oos = new ObjectOutputStream(os);
        ) {

            oos.writeObject(object);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<User> deserialize() {
        try (
                InputStream is = new FileInputStream(USERS_DAT);
                ObjectInputStream ois = new ObjectInputStream(is);
        ) {
            return (List<User>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

package martin;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        FileOutputStream fis1 = null, fis2 = null;
        try {
            fis1 = new FileOutputStream("file1.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            fis2 = new FileOutputStream("file2.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        OutputStreamDoubler osd = new OutputStreamDoubler(fis1, fis2);

        osd.write(420);
        try {
            osd.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

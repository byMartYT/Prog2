package martin;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    //NumberFormatException
    //b) ArrayIndexOutOfBoundsException
    //c) NullPointerException
    //d) OutOfMemoryError
    //e) FileNotFoundException
    //f) ArithmeticException
    public static void main(String[] args) throws FileNotFoundException {
        try {
            int[] array = new int[10];
            array[10] = 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        try {
            int a = 1 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        try {
            int test = Integer.parseInt("1s");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        try {
            String test = null;
            test.length();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        try {

            File file = new File("test.txt");
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            int[] integer = new int[100000 * 100000];
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
    }
}
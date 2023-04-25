package org.example;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String in = scanInput();
        try {
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < 10; i++) {
                new File("copyFis.mp3").delete();
                InputStream input = createInput(in);
                copyWithFIS(input);
            }
            long endTime = System.currentTimeMillis();
            double duration1 = (endTime - startTime) / 10.0;
            System.out.println("FIS + FOS: " + duration1 + "ms");

            startTime = System.currentTimeMillis();
            for (int i = 0; i < 10; i++) {
                new File("copyBis.mp3").delete();
                InputStream input2 = createInput(in);
                copyWithBIS(input2);
            }
            endTime = System.currentTimeMillis();
            double duration2 = (endTime - startTime) / 10.0;
            System.out.println("BIS + BOS: " + duration2 + "ms");

            System.out.println("Unterschied zu FIS: " + duration2 / duration1 + "%");
            startTime = System.currentTimeMillis();
            for (int i = 0; i < 10; i++) {
                new File("copyBuffer.mp3").delete();
                InputStream input3 = createInput(in);
                copyWithBuffer(input3);
            }
            endTime = System.currentTimeMillis();
            double duration3 = (endTime - startTime) / 10.0;
            System.out.println("Buffer: " + duration3 + "ms");
            System.out.println("Unterschied zu FIS: " + duration3 / duration1 + "%");
            System.out.println("Unterschied zu BIS: " + duration3 / duration2 + "%");
        } catch (FileNotFoundException e) {
            System.err.println("Datei nicht gefunden!");
            main(null);
        }

    }

    public static void copyWithFIS(InputStream input) {
        try (InputStream fis = input; OutputStream fos = new FileOutputStream("copyFis.mp3");) {
            copy(fis, fos);
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyWithBuffer(InputStream input) {
        try (InputStream fis = input; OutputStream fos = new FileOutputStream("copyBuffer.mp3");) {
            copyBuffer(fis, fos);
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyWithBIS(InputStream input) {
        try (InputStream fis = input; BufferedInputStream bis = new BufferedInputStream(fis); OutputStream fos = new FileOutputStream("copyBis.mp3"); BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            copyBos(bis, bos);
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String scanInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte Dateinamen eingeben!");
        return sc.nextLine();
    }

    public static FileInputStream createInput(String in) throws FileNotFoundException {
        return new FileInputStream(in);
    }

    public static void copy(InputStream fis, OutputStream fos) throws IOException {
        int b;
        do {
            b = fis.read();
            if (b != -1) fos.write(b);
        } while (b != -1);
    }

    public static void copyBuffer(InputStream fis, OutputStream fos) throws IOException {
        byte[] b = new byte[1024];
        int n;
        do {
            n = fis.read(b);
            if (n != -1) fos.write(b, 0, n);
        } while (n != -1);
    }

    public static void copyBos(BufferedInputStream fis, BufferedOutputStream fos) throws IOException {
        int b;
        do {
            b = fis.read();
            if (b != -1) fos.write(b);
        } while (b != -1);
    }


}
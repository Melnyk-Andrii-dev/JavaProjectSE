package ua.intita.qa.input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class DemoInputStream {
    public static void main(String[] args) throws IOException {
        try(FileInputStream fis = new FileInputStream("data/in.txt")) {
            final int read = fis.read();
            System.out.println((char) read);
            byte[] bytes = new byte[10];
            final int len = fis.read(bytes);
            System.out.println(len);
            System.out.println(Arrays.toString(bytes));
            for (byte aByte : bytes) {
                System.out.print((char) aByte + " ");
            }
        }
    }
}

//    public static void main(String[] args) {
//        FileInputStream fis = null;
//        try {
//            fis = new FileInputStream("data/in.txt");
//            final int read = fis.read();
//            System.out.println((char) read);
//            byte[] bytes = new byte[10];
//            final int len = fis.read(bytes);
//            System.out.println(len);
//            System.out.println(Arrays.toString(bytes));
//            for (byte aByte : bytes) {
//                System.out.print((char) aByte + " ");
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if(fis != null) {
//                    fis.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }

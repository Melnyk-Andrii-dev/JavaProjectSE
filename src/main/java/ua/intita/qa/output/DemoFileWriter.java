package ua.intita.qa.output;

import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriter {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("data/wr_out.txt");) {
              writer.write("Hello World");
              writer.write(new char[]{'h', 'e', 'l', 'l', 'o'});
              writer.write(100);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

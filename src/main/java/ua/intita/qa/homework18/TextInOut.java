package ua.intita.qa.homework18;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TextInOut {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("data/text.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("data/out_text.txt"))
        ) {
            List<String> list = new ArrayList<>();
            String string = null;
            while ((string = br.readLine()) != null){
                bw.write(string);
                bw.newLine();
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

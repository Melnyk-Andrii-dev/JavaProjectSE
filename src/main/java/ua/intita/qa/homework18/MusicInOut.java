package ua.intita.qa.homework18;

import java.io.*;

public class MusicInOut {
    public static void main(String[] args) {
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data/skillet_those_nights-namobilu.com.mp3"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("data/music2.mp3"))) {
              byte[] bytes = new byte[bis.available()];
              int readed;
              while ((readed = bis.read()) != -1){
                  bos.write(readed);
              }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

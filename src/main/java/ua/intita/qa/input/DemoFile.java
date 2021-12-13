package ua.intita.qa.input;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;

public class DemoFile {
    public static void main(String[] args) {
//        File file = new File("data" + File.separator + "in.txt");
//        if(file.exists() && file.isFile()){
//            System.out.println("ok");
//            System.out.println(file.getAbsolutePath());
//            System.out.println(file.length());
//            System.out.println(file.getParentFile());
//            file.delete();
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        File file = new File("data" + File.separator + "in.txt");
        if (file.exists() && file.isFile()) {
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.length());
            System.out.println(file.getParentFile());
            file.delete();
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        File dir = new File("data");
        if(dir.exists() && dir.isDirectory()){
            File[] files = dir.listFiles();
            System.out.println(Arrays.toString(files));
            long time = dir.lastModified();
            LocalDateTime localDateTime = Instant.ofEpochMilli(time).atZone(ZoneId.systemDefault()).toLocalDateTime();
            System.out.println(localDateTime);
            System.out.println();
        }
        Path path = Paths.get("data/in.txt");
        try {
            Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

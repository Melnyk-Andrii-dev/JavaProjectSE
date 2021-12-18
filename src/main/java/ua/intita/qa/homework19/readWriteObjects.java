package ua.intita.qa.homework19;

import ua.intita.qa.homework16.Second.entity.EventOld;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class readWriteObjects {

    public static void main(String[] args) {
        List<String> list = null;
        List<Event> events = new ArrayList<>();
        String line = null;
        List<String> strings;
        String id;
        String title;
        LocalDateTime date;
        String place;

        try {
            list = Files.readAllLines(Paths.get("data/order.csv"));
            for (String line2 : list) {
                strings = Arrays.asList(line2.split(","));
                id = strings.get(0);
                title = strings.get(1);
                date = LocalDateTime.of(Integer.parseInt(strings.get(2)), Integer.parseInt(strings.get(3)),
                        Integer.parseInt(strings.get(3)), Integer.parseInt(strings.get(5)),
                        Integer.parseInt(strings.get(6)), Integer.parseInt(strings.get(7)));
                place = strings.get(8);
                events.add(new Event(id, title, date, place));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data/events.dat"))) {
            oos.writeObject(events);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Event> inputList = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/events.dat"))) {
            inputList = (List<Event>) ois.readObject();
            for (int i = 0; i < inputList.size(); i++) {
                System.out.println(inputList.get(i));
            }
    } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        File file = new File("data/events.dat");

        if(file.exists() && file.isFile()) {
            System.out.println();
            System.out.println("Title: " + file.getName());
            System.out.println("Last modified: " +  Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime());
            System.out.println(file.lastModified());
            System.out.println("Size in bytes: " + file.length());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Parent directory: " + file.getParent());
        }

    }
}

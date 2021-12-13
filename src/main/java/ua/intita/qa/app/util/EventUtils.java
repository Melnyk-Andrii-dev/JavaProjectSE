package ua.intita.qa.app.util;

import ua.intita.qa.app.entity.User;
import ua.intita.qa.homework16.Second.entity.Event;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;

public class EventUtils {
    private EventUtils(){

    }

    public static Map<String, Event> readDataFromFile(String fileName){
        HashMap<String, Event> mapCsv;
        Map<String, Event> map = new HashMap<>();
        String line = null;
        List<String> strings;
        String id;
        String title;
        LocalDateTime date;
        String place;
        mapCsv = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("data/order.csv"))) {
            while ((line = br.readLine()) != null) {
                strings = Arrays.asList(line.split(","));
                id = strings.get(0);
                title = strings.get(1);
                date = LocalDateTime.of(Integer.parseInt(strings.get(2)), Integer.parseInt(strings.get(3)),
                        Integer.parseInt(strings.get(3)), Integer.parseInt(strings.get(5)),
                        Integer.parseInt(strings.get(6)), Integer.parseInt(strings.get(7)));
                place = strings.get(8);
                mapCsv.put(id, new Event(id, title, date, place));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mapCsv;
    }
}

package ua.intita.qa.homework21;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        EventReader eventReader = new EventReader();
        List<Event> eventList = eventReader.readFromCsv("src/main/java/ua/intita/qa/homework21/events.csv");
        System.out.println(eventList);
        System.out.println("-----------------------------------------------------");

        List<String> sortedByTitle = eventList.stream()
                .map(Event::getTitle)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedByTitle);
        System.out.println("-----------------------------------------------------");

        List<Event> vinnitsa = eventList.stream()
                .filter(event -> event.getPlace().equals("Vinnitsa"))
                .collect(Collectors.toList());
        System.out.println(vinnitsa);
        System.out.println("-----------------------------------------------------");

        List<Event> firstTwo = eventList.stream()
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(firstTwo);
        System.out.println("-----------------------------------------------------");

        eventList.stream().filter(event -> event.getDate().getHour() >= 18).forEach(System.out::println);
        System.out.println("-----------------------------------------------------");

        eventList.stream().distinct().count();
        System.out.println(eventList.stream().distinct().count());
    }
}

package ua.intita.qa.homework11;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

// Looks like Time is not a class, but a package
public class TimeDemo {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println(localDateTime.format(formatter));
        Duration duration = Duration.ofDays(7);
        System.out.println(duration.toNanos());
        System.out.println(duration.plusNanos(100).toNanos());
        System.out.println(Duration.ofNanos(1).isZero());
    }
}

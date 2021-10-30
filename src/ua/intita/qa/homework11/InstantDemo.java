package ua.intita.qa.homework11;

import java.time.Instant;

public class InstantDemo {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println(instant.plusSeconds(10).isAfter(instant));
        System.out.println(instant.getEpochSecond());
    }
}

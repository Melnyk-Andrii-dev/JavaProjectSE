package ua.intita.qa.homework16.Second.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class Event {
    private String id;
    private String title;
    private LocalDateTime date;
    private String place;

    public Event() {
        id = UUID.randomUUID().toString();
    }


}

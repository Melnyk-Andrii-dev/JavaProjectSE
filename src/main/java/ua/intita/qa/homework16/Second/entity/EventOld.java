package ua.intita.qa.homework16.Second.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
public class EventOld {
    private String id;
    private String title;
    private LocalDateTime date;
    private String place;

    public EventOld() {
        id = UUID.randomUUID().toString();
    }


}

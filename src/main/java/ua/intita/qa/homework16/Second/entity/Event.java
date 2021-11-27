package ua.intita.qa.homework16.Second.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Calendar;
import java.util.UUID;

@Data
public class Event {
    private String id;
    private String title;
    private Calendar date;
    private String place;

    public Event(){
        id = UUID.randomUUID().toString();
    }



}

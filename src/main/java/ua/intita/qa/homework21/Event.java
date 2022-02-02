package ua.intita.qa.homework21;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class Event {
    private String id;
    private String title;
    private LocalDateTime date;
    private String place;
}

package ua.intita.qa.homework19;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
public class Event implements Serializable {
    private String id;
    private String title;
    private LocalDateTime date;
    private String place;
}

package ua.intita.qa.app.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.UUID;

@Data
@AllArgsConstructor
@ToString
public class User {
    private  String userId;
    private  String name;
    private  String surname;
    private  String email;

    public User() {
        userId = UUID.randomUUID().toString();
    }
}

package ua.intita.qa.homework17.animals;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Parrot extends Pet {
    String name;
    int age;
}

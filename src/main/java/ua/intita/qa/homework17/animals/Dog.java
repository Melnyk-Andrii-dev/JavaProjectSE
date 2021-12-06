package ua.intita.qa.homework17.animals;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dog extends Pet{
    String name;
    String bread;
    int age;
}

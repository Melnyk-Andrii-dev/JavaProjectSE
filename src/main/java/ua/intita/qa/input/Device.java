package ua.intita.qa.input;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Device implements Serializable {
    private static final long serialVersionUID = 2L;
    private int id;
    private String model;
    private double cost;
    private static String owner;
    private transient int age;
}

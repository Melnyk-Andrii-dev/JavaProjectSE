package ua.intita.qa.homework13;

import ua.intita.qa.homework13.parameterized.*;

public class Main {
    public static void main(String[] args) {
        UserCreator userCreator = new UserCreator();
        User user = userCreator.create();
    }
    Param1<String> param1 = new Param1<>("string", "genericString");
    Param2<String, Integer> param2 = new Param2<>("string", "genericString", 5);
    Param3<Integer, Double, User> param3 = new Param3<>();
}

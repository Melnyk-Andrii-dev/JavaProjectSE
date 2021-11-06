package ua.intita.qa.homework13.parameterized;

public class Param1<T> {
    String title;
    T typeT;

    public Param1() {
    }

    public Param1(String title, T typeT) {
        this.title = title;
        this.typeT = typeT;
    }
}

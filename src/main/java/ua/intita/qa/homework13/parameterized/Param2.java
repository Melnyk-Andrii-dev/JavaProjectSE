package ua.intita.qa.homework13.parameterized;

public class Param2<T,E> {
    String title;
    T typeT;
    E typeE;

    public Param2(String title, T typeT, E typeE) {
        this.title = title;
        this.typeT = typeT;
        this.typeE = typeE;
    }

    public Param2() {
    }
}

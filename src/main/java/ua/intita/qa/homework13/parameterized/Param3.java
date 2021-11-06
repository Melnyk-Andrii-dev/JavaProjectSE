package ua.intita.qa.homework13.parameterized;

public class Param3<T,E,K> {
    String title;
    T typeT;

    public Param3() {
    }

    E typeE;
    K typeK;

    public Param3(String title, T typeT, E typeE, K typeK) {
        this.title = title;
        this.typeT = typeT;
        this.typeE = typeE;
        this.typeK = typeK;
    }
}

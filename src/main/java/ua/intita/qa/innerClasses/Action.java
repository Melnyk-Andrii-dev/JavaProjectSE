package ua.intita.qa.innerClasses;

import java.io.Serializable;
import java.util.Comparator;

public interface Action {
    public static final String ACT = "ACT";

    void action1();
    void action2();

    default void defaultAction(){
        System.out.println("Default action");
    }

    static void staticAction(){
        System.out.println("Static Action");
    }

}

abstract class WorkOut implements Action{

}

class MyWorkOut extends WorkOut implements Serializable, Comparable, Comparator {

    @Override
    public void action1() {

    }

    @Override
    public void action2() {

    }

    @Override
    public void defaultAction() {
        System.out.println("Default action");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}

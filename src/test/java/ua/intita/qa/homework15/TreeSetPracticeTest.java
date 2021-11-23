package ua.intita.qa.homework15;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetPracticeTest {
    public static void main(String[] args) {
        TreeSetPractice treeSetPractice = new TreeSetPractice();

        treeSetPractice.createAddPrint();

        treeSetPractice.iterate();

        treeSetPractice.comprise(new TreeSet<>(Arrays.asList("Every", "hunter")));

        treeSetPractice.reverse();

        treeSetPractice.showFirstLast();

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet = treeSetPractice.clone();
        System.out.println(treeSet);

        treeSetPractice.showNumber();

        System.out.println(treeSetPractice.isEquals(new TreeSet<>(Arrays.asList("Every", "hunter")), new TreeSet<>(Arrays.asList("Every1", "hunter"))));

        treeSetPractice.showLessThan7();

        treeSetPractice.showGreaterThan(5);

        treeSetPractice.showLessThan(5);

        treeSetPractice.showStrGreaterThan(6);

        treeSetPractice.showStrLessThan(10);

        treeSetPractice.removeFirst();

        treeSetPractice.removeLast();

        treeSetPractice.removeElement("green");



    }

}

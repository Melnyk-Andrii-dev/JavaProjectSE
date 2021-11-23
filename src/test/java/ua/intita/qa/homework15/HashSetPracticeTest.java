package ua.intita.qa.homework15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetPracticeTest {

    public static void main(String[] args) {
        HashSetPractice hashSetPractice = new HashSetPractice();

        hashSetPractice.appentToTail();

        hashSetPractice.iterate();

        hashSetPractice.size();

        hashSetPractice.empty();

        System.out.println(hashSetPractice.isEmpty());

        HashSet<String> hashSet = hashSetPractice.clone();
        System.out.println(hashSet);

        String[] strings = hashSetPractice.convertToArray(new HashSet<String>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple")));
        System.out.println(Arrays.toString(strings));

        TreeSet<String> treeSet = hashSetPractice.convertToTreeSet(new HashSet<String>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple")));
        System.out.println(treeSet);

        ArrayList<String> arrayList = hashSetPractice.convertToArrayList(new HashSet<String>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple")));
        System.out.println(arrayList);

        System.out.println(hashSetPractice.isEqual(new HashSet<String>
                (Arrays.asList("orange", "yellow", "green", "cyan", "blue", "purple")),
                new HashSet<String>(Arrays.asList("red", "orange", "yellow", "green", "cyan",
                        "blue", "purple"))));

        System.out.println(hashSetPractice.retainEquals(new HashSet<String>
                        (Arrays.asList("orange", "yellow", "green", "cyan", "blue", "purple")),
                new HashSet<String>(Arrays.asList("reddish", "orange", "yellowwer", "green", "cyan",
                        "blue", "purple"))));

        System.out.println(hashSetPractice.removeEquals(new HashSet<String>
                        (Arrays.asList("orange", "yellow", "green", "cyan", "blue", "purple")),
                new HashSet<String>(Arrays.asList("reddish", "orange", "yellowwer", "green", "cyan",
                        "blue", "purple"))));

    }
}

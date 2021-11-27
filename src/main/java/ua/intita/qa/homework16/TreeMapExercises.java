package ua.intita.qa.homework16;

import java.util.*;

public class TreeMapExercises {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        //1
        treeMap.put("Alex", 5);
        treeMap.put("Fred", 4);
        treeMap.put("Jack", 3);
        //2
        TreeMap<String, Integer> treeMap2 = new TreeMap<>(treeMap);
        System.out.println(treeMap2);
        //3
        System.out.println("search key: " + treeMap.containsKey("Alex"));
        //4
        System.out.println("search value: " + treeMap.containsValue(3));
        //5
        System.out.println(treeMap.keySet());
        //6
        treeMap.clear();
        System.out.println("is empty: " + treeMap.isEmpty());
        //7
        TreeMap<String, Integer> sortedKeysTreeMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        sortedKeysTreeMap.putAll(treeMap2);
        System.out.println(sortedKeysTreeMap);
        //8
        Map.Entry<String, Integer> higherEntry = treeMap2.higherEntry("Alex");
        Map.Entry<String, Integer> lowerEntry = treeMap2.lowerEntry("Fred");
        System.out.println(higherEntry);
        System.out.println(lowerEntry);
        //9
        System.out.println("first: " + treeMap2.firstKey());
        System.out.println("last: " + treeMap2.lastKey());
        //10
        System.out.println(treeMap2.descendingKeySet());
        //11
        Map.Entry<String, Integer> lessOrEqual = treeMap2.floorEntry("Bob");
        System.out.println(lessOrEqual);
        //12
        Map.Entry<String, Integer> greaterOrEqual = treeMap2.ceilingEntry("Aaron");
        System.out.println(greaterOrEqual);
    }
}

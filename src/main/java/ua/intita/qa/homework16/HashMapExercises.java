package ua.intita.qa.homework16;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExercises {

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        //1
        hashMap.put("Tom", 4);
        hashMap.put("Mark", 5);
        hashMap.put("Bob", 3);
        //2
        System.out.println(hashMap.size());
        //3
        HashMap<String, Integer> hashMap2 = new HashMap<>(hashMap);
        System.out.println(hashMap2);
        //4
        hashMap2.clear();
        System.out.println(hashMap2);
        //5
        System.out.println("is empty - " + hashMap2.isEmpty());
        //6
        HashMap<String, Integer> hashMapCopy = (HashMap<String, Integer>) hashMap.clone();
        System.out.println(hashMapCopy);
        //7
        System.out.println("contains key: " + hashMap.containsKey("Tom"));
        //8
        System.out.println("contains value: " + hashMap.containsValue(4));
        //9
        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        System.out.println(entrySet);
        //10
        System.out.println("value of a key: " + hashMap.get("Mark"));
        //11
        Set<String> stringSet = hashMap.keySet();
        System.out.println(stringSet);
        //12
        Collection<Integer> integerCollection = hashMap.values();
    }
}

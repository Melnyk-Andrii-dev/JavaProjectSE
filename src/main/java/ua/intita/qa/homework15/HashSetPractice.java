package ua.intita.qa.homework15;

import java.lang.reflect.Array;
import java.util.*;

public class HashSetPractice {


    public void appentToTail() {
        HashSet<String> hashSet = new HashSet<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        hashSet.add("ZZZZZZZZZZZZZZZZZ");
        System.out.println(hashSet);
    }

    public void iterate() {
        HashSet<String> hashSet = new HashSet<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void size() {
        HashSet<String> hashSet = new HashSet<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        System.out.println("Number of elements: " + hashSet.size());
    }

    public void empty() {
        HashSet<String> hashSet = new HashSet<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        hashSet.clear();
        System.out.println("Number of elements: " + hashSet.size());
    }

    public boolean isEmpty() {
        HashSet<String> hashSet = new HashSet<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        return hashSet.isEmpty();
    }

    public HashSet<String> clone (){
        HashSet<String> hashSet = new HashSet<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        return (HashSet<String>) hashSet.clone();
    }

    public String[] convertToArray (HashSet<String> hashSet) {
        String[] strings = new String[hashSet.size()];
        return hashSet.toArray(strings);
    }

    public TreeSet<String> convertToTreeSet (HashSet<String> hashSet) {
        return new TreeSet<String>(hashSet);
    }

    public ArrayList<String> convertToArrayList (HashSet<String> hashSet) {
        return new ArrayList<String>(hashSet);
    }

    public boolean isEqual(HashSet<String> hashSet1, HashSet<String> hashSet2){
        return hashSet1.equals(hashSet2);
    }

    public HashSet<String> retainEquals(HashSet<String> hashSet1, HashSet<String> hashSet2){
        hashSet1.retainAll(hashSet2);
        return hashSet1;
    }

    public HashSet<String> removeEquals(HashSet<String> hashSet1, HashSet<String> hashSet2){
        hashSet1.removeAll(hashSet2);
        return hashSet1;
    }


}

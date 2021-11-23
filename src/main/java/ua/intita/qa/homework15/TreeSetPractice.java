package ua.intita.qa.homework15;

import java.util.*;

public class TreeSetPractice {

    public void createAddPrint() {
        TreeSet<String> treeSet = new TreeSet<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        System.out.println(treeSet);
    }

    public void iterate() {
        TreeSet<String> treeSet = new TreeSet<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        for (String s : treeSet) {
            System.out.println(s);
        }
    }

    public void comprise(TreeSet<String> treeSet) {
        TreeSet<String> treeSetBase = new TreeSet<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        treeSetBase.addAll(treeSet);
        System.out.println(treeSetBase);
    }

    public void reverse(){
        TreeSet<String> treeSetBase = new TreeSet<String>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        System.out.println(treeSetBase.descendingSet());
    }

    public void showFirstLast(){
        TreeSet<String> treeSetBase = new TreeSet<String>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        System.out.println(treeSetBase.first() + " " + treeSetBase.last());
    }

    public TreeSet<String> clone(){
        TreeSet<String> treeSetBase = new TreeSet<String>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        return (TreeSet<String>) treeSetBase.clone();
    }

    public void showNumber(){
        TreeSet<String> treeSetBase = new TreeSet<String>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        System.out.println(treeSetBase.size());
    }

    public boolean isEquals(TreeSet<String> treeSetBase, TreeSet<String> treeSetBase2){
        return treeSetBase.equals(treeSetBase2);
    }

    public void showLessThan7(){
        TreeSet<Integer> treeSetBase = new TreeSet<Integer>(Arrays.asList(1, 2, 3, 4, 8, 10, 7));
        int current;
        for (Integer integer : treeSetBase) {
            current = (int) integer;
            if (current < 7) {
                System.out.println(current);
            }
        }
    }

    public void showGreaterThan(int any){
        TreeSet<Integer> treeSetBase = new TreeSet<Integer>(Arrays.asList(1, 2, 3, 4, 8, 10, 7));
        int current;
        for (Integer integer : treeSetBase) {
            current = (int) integer;
            if (current >= any) {
                System.out.println(current);
            }
        }
    }

    public void showLessThan(int any){
        TreeSet<Integer> treeSetBase = new TreeSet<Integer>(Arrays.asList(1, 2, 3, 4, 8, 10, 7));
        int current;
        for (Integer integer : treeSetBase) {
            current = (int) integer;
            if (current <= any) {
                System.out.println(current);
            }
        }
    }

    public void showStrGreaterThan(int any){
        TreeSet<Integer> treeSetBase = new TreeSet<Integer>(Arrays.asList(1, 2, 3, 4, 8, 10, 7));
        int current;
        for (Integer integer : treeSetBase) {
            current = (int) integer;
            if (current > any) {
                System.out.println(current);
            }
        }
    }

    public void showStrLessThan(int any){
        TreeSet<Integer> treeSetBase = new TreeSet<Integer>(Arrays.asList(1, 2, 3, 4, 8, 10, 7));
        int current;
        for (Integer integer : treeSetBase) {
            current = (int) integer;
            if (current < any) {
                System.out.println(current);
            }
        }
    }

    public void removeFirst(){
        TreeSet<String> treeSetBase = new TreeSet<String>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        treeSetBase.pollFirst();
        System.out.println(treeSetBase);
    }

    public void removeLast(){
        TreeSet<String> treeSetBase = new TreeSet<String>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        treeSetBase.pollLast();
        System.out.println(treeSetBase);
    }

    public void removeElement(String string){
        TreeSet<String> treeSetBase = new TreeSet<String>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        treeSetBase.remove(string);
        System.out.println(treeSetBase);
    }




}

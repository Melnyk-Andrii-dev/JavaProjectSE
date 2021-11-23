package ua.intita.qa.homework15;

import java.util.*;

public class PriorityQueuePractice {
    public void createAddPrint() {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        System.out.println(priorityQueue);
    }

    public void iterate() {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        Iterator iterator = priorityQueue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void comprise(PriorityQueue<String> priorityQueue) {
        PriorityQueue<String> priorityQueue1 = new PriorityQueue<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        priorityQueue1.addAll(priorityQueue);
        System.out.println(priorityQueue1);
    }

    public void insert(String element) {
        PriorityQueue<String> priorityQueue1 = new PriorityQueue<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        priorityQueue1.add(element);
        System.out.println(priorityQueue1);
    }

    public void removeAll() {
        PriorityQueue<String> priorityQueue1 = new PriorityQueue<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        priorityQueue1.clear();
        System.out.println("Is empty: " + priorityQueue1.isEmpty());
    }

    public void size() {
        PriorityQueue<String> priorityQueue1 = new PriorityQueue<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        System.out.println(priorityQueue1.size());
    }

    public boolean isEquals(PriorityQueue<String> priorityQueue1, PriorityQueue<String> priorityQueue2){
        return priorityQueue2.equals(priorityQueue1);
    }

    public void peek() {
        PriorityQueue<String> priorityQueue1 = new PriorityQueue<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        System.out.println(priorityQueue1.peek());
    }

    public void poll() {
        PriorityQueue<String> priorityQueue1 = new PriorityQueue<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        System.out.println(priorityQueue1.poll());
    }

    public String[] gerArray() {
        PriorityQueue<String> priorityQueue1 = new PriorityQueue<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        return priorityQueue1.toArray(new String[3]);
    }

    public void toString2() {
        PriorityQueue<String> priorityQueue1 = new PriorityQueue<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        System.out.println(priorityQueue1.toString());
    }

    public PriorityQueue<String> toMaxPriorityQueue(PriorityQueue<String> priorityQueue2) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(10,Collections.reverseOrder());
        priorityQueue.addAll(priorityQueue2);
        return priorityQueue;
    }




}

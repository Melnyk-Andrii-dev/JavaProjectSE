package ua.intita.qa.homework15;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class PriorityQueuePracticeTest {
    public static void main(String[] args) {
        PriorityQueuePractice priorityQueuePractice = new PriorityQueuePractice();

        priorityQueuePractice.createAddPrint();

        priorityQueuePractice.iterate();

        priorityQueuePractice.comprise(new PriorityQueue<>(Arrays.asList("Every", "hunter")));

        priorityQueuePractice.insert("wants");

        priorityQueuePractice.removeAll();

        priorityQueuePractice.size();

        System.out.println(priorityQueuePractice.isEquals(new PriorityQueue<>(Arrays.asList("Every", "hunter")), new PriorityQueue<>(Arrays.asList("Every", "hunter"))));

        priorityQueuePractice.peek();

        priorityQueuePractice.poll();

        String[] strings = priorityQueuePractice.gerArray();
        System.out.println(Arrays.toString(strings));

        priorityQueuePractice.toString2();

        System.out.println(priorityQueuePractice.toMaxPriorityQueue(new PriorityQueue<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"))));
    }
}

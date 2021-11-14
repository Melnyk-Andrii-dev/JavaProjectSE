package ua.intita.qa.homework14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TryLinkedList {
    public static void main(String[] args) {
        LinkedListPractice linkedListPractice = new LinkedListPractice();

        linkedListPractice.appendToTail("Every");

        linkedListPractice.iterate();

        linkedListPractice.iterateFromPosition(2);

        linkedListPractice.iterateReverse();

        linkedListPractice.insertAtPosition(1, "hunter");

        linkedListPractice.insertToHeadTail("wants", "to");

        linkedListPractice.insertToHead("know");

        linkedListPractice.insertToTail("where");

        linkedListPractice.insertFromPosition(2, "the", "pheasant", "hides");

        linkedListPractice.getFirstAndLast("orange", "blue");

        linkedListPractice.displayElementsWithPositions();

        linkedListPractice.removeElement("cyan");

        linkedListPractice.removeFirstAndLast();

        linkedListPractice.removeAll(new LinkedList<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple")));

        linkedListPractice.swapByIndex(3,5);

        linkedListPractice.shuffle();

        System.out.println(linkedListPractice.joinLists(Arrays.asList("Krot"), Arrays.asList("ovce")));

        LinkedList<String> shallowCopy = linkedListPractice.cloneList(new LinkedList<>(Arrays.asList("zirafu", "zaike")));
        System.out.println(shallowCopy);

        System.out.println(linkedListPractice.removeReturnFirst());

        System.out.println(linkedListPractice.returnFirst());

        System.out.println(linkedListPractice.returnLast());

        linkedListPractice.checkPresence("purple");

       ArrayList<String> arrayList = linkedListPractice.linkedToArrayList(new LinkedList<>(Arrays.asList("golubie", "sshil")));
       System.out.println(arrayList);

        linkedListPractice.compareList(new LinkedList<>(Arrays.asList("fufaiki")));

        linkedListPractice.checkEmptiness(new LinkedList<>(Arrays.asList()));

        linkedListPractice.replaceElement("yellow", 5);
    }

}

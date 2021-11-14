package ua.intita.qa.homework14;

import java.util.*;

public class LinkedListPractice {

    public void appendToTail(String string) {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        linkedList.addLast(string);
        System.out.println(linkedList);
    }

    public void iterate() {
        LinkedList<String> linkedList = new LinkedList<String>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void iterateFromPosition(int position) {
        LinkedList<String> linkedList = new LinkedList<String>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        int current=0;
        if (position<0 || position>=linkedList.size()) throw new RuntimeException("No such position in the list");
        for (String s : linkedList) {
            if(current>=position){
                System.out.println(s);
            }
            current++;
        }
    }

    public void iterateReverse() {
        LinkedList<String> linkedList = new LinkedList<String>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        Collections.reverse(linkedList);
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void insertAtPosition(int position, String string) {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        if (position<0 || position>=linkedList.size()) throw new RuntimeException("No such position in the list");
        linkedList.add(position, string);
        linkedList.remove(position+1);
        System.out.println(linkedList);
    }

    public void insertToHeadTail(String toHead, String toTail) {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        linkedList.addFirst(toHead);
        linkedList.addLast(toTail);
        linkedList.remove(1);
        linkedList.remove(linkedList.size()-2);
        System.out.println(linkedList);
    }

    public void insertToHead(String string) {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        linkedList.addFirst(string);
        linkedList.remove(1);
        System.out.println(linkedList);
    }

    public void insertToTail(String string) {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        linkedList.addLast(string);
        linkedList.remove(linkedList.size()-2);
        System.out.println(linkedList);
    }

    public void insertFromPosition(int position, String...strings) {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        if (position<0 || position>=linkedList.size()) throw new RuntimeException("No such position in the list");
        Iterator iterator = linkedList.iterator();
        int current=0;
        int removed=0;
        while (iterator.hasNext()){
            iterator.next();
            if(current>=position && removed<strings.length){
                iterator.remove();
                removed++;
            }
            current++;
        }
        linkedList.addAll(position, Arrays.asList(strings));
        System.out.println(linkedList);
    }

    public void getFirstAndLast(String first, String last) {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        System.out.println("First index: " + linkedList.indexOf(first));
        System.out.println("Last index: " + linkedList.lastIndexOf(last));
    }

    public void displayElementsWithPositions() {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        Iterator iterator = linkedList.iterator();
        int current=0;
        while (iterator.hasNext()){
            System.out.println("Element '" + iterator.next() + "' has position " + current);
            current++;
        }
    }

    public void removeElement(String element) {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        linkedList.remove(element);
        System.out.println(linkedList);

    }

    public void removeFirstAndLast() {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        linkedList.pollFirst();
        linkedList.pollLast();
        System.out.println(linkedList);
    }

    public void removeAll(LinkedList<String> linkedList) {
        linkedList.clear();
        System.out.println("Cleared - " + linkedList.isEmpty());
    }

    public void swapByIndex(int index1, int index2) {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        if(index1<0 || index2<0 || index1>=linkedList.size() || index2>=linkedList.size())
        {
            throw new RuntimeException("Enter correct 'index1' and 'index1' to swap! MAX index= " + (linkedList.size()-1));
        }

        String temp = linkedList.remove(index1);
        linkedList.add(index1, linkedList.get(index2-1));
        linkedList.add(index2, temp);
        linkedList.remove(index2+1);
        System.out.println(linkedList);
    }

    public void shuffle() {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        Collections.shuffle(linkedList);
        System.out.println(linkedList);
    }

    public LinkedList<String> joinLists(List<String> list1, List<String> list2) {

        LinkedList<String> unitedList = new LinkedList<>();
        unitedList.addAll(list1);
        unitedList.addAll(list1.size(), list2);
        return unitedList;
    }

    public LinkedList<String> cloneList(LinkedList<String> toBeCloned) {
        return (LinkedList<String>) toBeCloned.clone();
    }

    public String removeReturnFirst() {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        String result = linkedList.pollFirst();
        System.out.println(linkedList);
        return result;
    }

    public String returnFirst() {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        String result = linkedList.peekFirst();
        System.out.println(linkedList);
        return result;
    }

    public String returnLast() {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        String result = linkedList.peekLast();
        System.out.println(linkedList);
        return result;
    }

    public void checkPresence(String  element) {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        System.out.println("Is '" + element + "' present - " + linkedList.contains(element));
    }

    public void compareList(LinkedList<String> compareTo) {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        if(linkedList.equals(compareTo)){
            System.out.println("Equals");
        }else {
            System.out.println("Not equals");
        }
    }


    public ArrayList<String> linkedToArrayList(LinkedList<String> linkedList) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(linkedList);
        return arrayList;
    }

    public void checkEmptiness(LinkedList<String> toBeChecked) {
        if(toBeChecked.isEmpty()) {
            System.out.println("It is empty");
        }else {
            System.out.println("It is not empty");
        }
    }

    public void replaceElement(String element, int newPosition) {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("red", "orange", "yellow", "green", "cyan", "blue", "purple"));
        int oldPosition = linkedList.indexOf(element);
        linkedList.add(newPosition+1, element);
        linkedList.remove(oldPosition);
        System.out.println(linkedList);
    }
}


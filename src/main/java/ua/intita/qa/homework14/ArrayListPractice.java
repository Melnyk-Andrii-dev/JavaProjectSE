package ua.intita.qa.homework14;

import java.util.*;


public class
ArrayListPractice {

    public void createAndPrint() {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("orange");
        list.add("yellow");
        list.add("green");
        list.add("cyan");
        list.add("blue");
        list.add("purple");
        System.out.println(list.toString());
    }

    public void iterate() {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("orange");
        list.add("yellow");
        list.add("green");
        list.add("cyan");
        list.add("blue");
        list.add("purple");
        Iterator <String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void insertToHead(String string) {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("orange");
        list.add("yellow");
        list.add("green");
        list.add("cyan");
        list.add("blue");
        list.add("purple");
        list.add(0, string);
        System.out.println(list);
    }

    public String retrieveFromIndex(int index) {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("orange");
        list.add("yellow");
        list.add("green");
        list.add("cyan");
        list.add("blue");
        list.add("purple");
        return list.remove(index);
    }

    public void updateAtIndex(int index, String string) {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("orange");
        list.add("yellow");
        list.add("green");
        list.add("cyan");
        list.add("blue");
        list.add("purple");
        list.set(index, string);
        System.out.println(list);
    }

    public void removeThird() {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("orange");
        list.add("yellow");
        list.add("green");
        list.add("cyan");
        list.add("blue");
        list.add("purple");
        list.remove(3);
        System.out.println(list);
    }

    public void searchByElement(String string) {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("orange");
        list.add("yellow");
        list.add("green");
        list.add("cyan");
        list.add("blue");
        list.add("purple");
        if(list.indexOf(string) != -1) {
            System.out.println("Found at index " + list.indexOf(string));
        }else {
            System.out.println("Element '" + string + "' not found" );
        }
    }

    public void defaultSort() {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("orange");
        list.add("yellow");
        list.add("green");
        list.add("cyan");
        list.add("blue");
        list.add("purple");
        list.sort(null);
        System.out.println(list);
    }

    public List<String> copyIntoAnother(List<String> copyInto) {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("orange");
        list.add("yellow");
        list.add("green");
        list.add("cyan");
        list.add("blue");
        list.add("purple");
        copyInto.addAll(list);
        return copyInto;
    }

    public void shuffleElements() {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("orange");
        list.add("yellow");
        list.add("green");
        list.add("cyan");
        list.add("blue");
        list.add("purple");
        Collections.shuffle(list);
        System.out.println(list);
    }

    public void reverseElements() {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("orange");
        list.add("yellow");
        list.add("green");
        list.add("cyan");
        list.add("blue");
        list.add("purple");
        Collections.reverse(list);
        System.out.println(list);
    }

    public List<String> extractPortion(List<String> extractInto, int from, int to) {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("orange");
        list.add("yellow");
        list.add("green");
        list.add("cyan");
        list.add("blue");
        list.add("purple");

        if(from<0 || from>to || to>=list.size())
        {
            throw new RuntimeException("Enter correct 'to' and 'from' indexes to extract! MAX index= " + (list.size()-1));
        }

        Iterator <String> iterator = list.iterator();
        int current = 0;
        String searchElement;
        while(iterator.hasNext()) {
            searchElement = iterator.next();
            if(current>=from && current<to)
            {
                extractInto.add(searchElement);
            }
            current++;

        }
        return extractInto;
    }

    public void compareList(List<String> compareTo) {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("orange");
        list.add("yellow");
        list.add("green");
        list.add("cyan");
        list.add("blue");
        list.add("purple");
        if(list.equals(compareTo)){
            System.out.println("Equals");
        }else {
            System.out.println("Not equals");
        }
    }

    public void swapByIndex(int index1, int index2) {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("orange");
        list.add("yellow");
        list.add("green");
        list.add("cyan");
        list.add("blue");
        list.add("purple");
        if(index1<0 || index2<0 || index1>=list.size() || index2>=list.size())
        {
            throw new RuntimeException("Enter correct 'index1' and 'index1' to swap! MAX index= " + (list.size()-1));
        }

        String temp = list.remove(index1);
        list.add(index1, list.get(index2-1));
        list.add(index2, temp);
        list.remove(index2+1);
        System.out.println(list);
    }

    public List<String> joinLists(List<String> list1, List<String> list2) {

        List<String> unitedList = new ArrayList<>();
        unitedList.addAll(list1);
        unitedList.addAll(list1.size(), list2);
        return unitedList;
    }

    public ArrayList<String> cloneList(ArrayList<String> toBeCloned) {
        return (ArrayList)toBeCloned.clone();
    }

    public void emptyList(ArrayList<String> toBeCleared) {
        toBeCleared.clear();
    }

    public void isEmpty(ArrayList<String> checkEmptiness) {
        if(checkEmptiness.isEmpty()) {
            System.out.println("It is empty");
        }else {
            System.out.println("It is not empty");
        }
    }

    public void trimToActualSize(ArrayList<String> toBeTrimmed) {
        toBeTrimmed.trimToSize();
    }

    public void increaseCapacity(ArrayList<String> toBeIncreased, int increaser) {
        toBeIncreased.ensureCapacity(increaser);
    }

    public void swapWithSecondByElement(String element) {
        ArrayList<String> list = new ArrayList<>();
        list.add("red");
        list.add("orange");
        list.add("yellow");
        list.add("green");
        list.add("cyan");
        list.add("blue");
        list.add("purple");
        int indexOfElement = list.indexOf(element);
        String temp = list.get(1);
        list.set(1, element);
        list.set(indexOfElement, temp);
        System.out.println(list);
    }

    public void printByPositions(int...positions) {
        ArrayList<String> list = new ArrayList<>();
        list.add("red");
        list.add("orange");
        list.add("yellow");
        list.add("green");
        list.add("cyan");
        list.add("blue");
        list.add("purple");
        Iterator iterator = list.iterator();
        int counter=0;
        String currentElement;
        while (iterator.hasNext()){
            currentElement = (String) iterator.next();
            for (int i = 0; i < positions.length; i++) {
                if (counter==positions[i]){
                    System.out.print(currentElement + " ");
                }
            }
            counter++;
        }
    }
}

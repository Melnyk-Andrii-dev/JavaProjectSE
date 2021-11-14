package ua.intita.qa.homework14;

import java.util.*;

public class TryArrayList {

    public static void main(String[] args) {
        ArrayListPractice arrayListPractice = new ArrayListPractice();

        arrayListPractice.createAndPrint();

        arrayListPractice.iterate();

        arrayListPractice.insertToHead("Every");

        System.out.println(arrayListPractice.retrieveFromIndex(2));

        arrayListPractice.updateAtIndex(2, "hunter");

        arrayListPractice.removeThird();

        arrayListPractice.searchByElement("wants");

        arrayListPractice.defaultSort();

        List<String> theCopy = arrayListPractice.copyIntoAnother(new ArrayList<String>());
        System.out.println(theCopy);

        arrayListPractice.shuffleElements();

        arrayListPractice.reverseElements();

        List<String> theExtract = arrayListPractice.extractPortion(new ArrayList<String>(), 3, 5);
        System.out.println(theExtract);

        arrayListPractice.compareList(new ArrayList<>(Arrays.asList("to", "know")));

        arrayListPractice.swapByIndex(2, 4);

        System.out.println(arrayListPractice.joinLists(Arrays.asList("where"), Arrays.asList("the")));

        List<String> shallowCopy = arrayListPractice.cloneList(new ArrayList<String> (Arrays.asList("pheasant", "hides")));
        System.out.println(shallowCopy);

        ArrayList<String> listToBeEmpty = new ArrayList<String>(Arrays.asList("Moreover,", "krot"));
        arrayListPractice.emptyList(listToBeEmpty);

        arrayListPractice.isEmpty(listToBeEmpty);

        ArrayList<String> listToBeTrimmed = new ArrayList<String>(Arrays.asList("ovce", "zyrafu", "zaike"));
        arrayListPractice.trimToActualSize(listToBeTrimmed);

        ArrayList<String> listToBeIncreased = new ArrayList<String>(Arrays.asList("golubyie", "sshil", "fyfaiki"));
        arrayListPractice.increaseCapacity(listToBeIncreased, 100);

        arrayListPractice.swapWithSecondByElement("TYPE ANY RAINBOW COLOR");

        arrayListPractice.printByPositions(1, 2, 5);
    }
}

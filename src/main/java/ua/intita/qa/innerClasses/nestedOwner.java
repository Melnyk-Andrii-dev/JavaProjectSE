package ua.intita.qa.innerClasses;

import lombok.AllArgsConstructor;

import java.util.Comparator;

@AllArgsConstructor
public class nestedOwner {
    private int value = 1;

    public static class OwnerComparator implements Comparator<nestedOwner>{


        @Override
        public int compare(nestedOwner o1, nestedOwner o2) {
            return o1.value - o2.value;
        }
    }
}

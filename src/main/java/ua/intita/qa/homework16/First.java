package ua.intita.qa.homework16;

import java.util.*;

public class First {
    public static void main(String[] args) {
        First first = new First();
        List<String> list = first.stringToList("Lorem ipsum dolor sit amet/n");
        System.out.println(list);
        System.out.println();
        Set<Map.Entry<String, Integer>> set = first.countDuplicates(new ArrayList<String>(Arrays.asList("one", "two", "one", "three", "two", "one"))).entrySet();
        System.out.println(set);
    }

        public List <String> stringToList(String string){
            return new ArrayList<String>(Arrays.asList(string.split(" ")));
        }

        public Map<String, Integer> countDuplicates(ArrayList<String> list){
            HashMap<String, Integer> hashMap = new HashMap<>();
            int counter;
            for (String string: list) {
                counter = 1;
                if(hashMap.containsKey(string)){
                    counter = hashMap.get(string);
                    counter++;
                }
                hashMap.put(string, counter);
            }
            return hashMap;
        }

        //Написать метод который принимает ArrayList и определяет повторяемость каждого слова. (использовать Map)

}

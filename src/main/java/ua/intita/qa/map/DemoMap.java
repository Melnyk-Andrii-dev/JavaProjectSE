//package ua.intita.qa.map;
//
//import java.util.*;
//
//public class DemoMap {
//    public static void main(String[] args) {
////        Map<String, Integer> map = new LinkedHashMap<>();
////        Map<String, Integer> map = new HashMap<>();
//        Map<String, Integer> map = new TreeMap<>(Comparator.reverseOrder());
//        map.put("Mers", 5);
//        map.put("BMW", 8);
//        map.put("VOLVO", 4);
//        System.out.println(map);
//        final Integer volvo = map.put("VOLVO", 4);
//        System.out.println(volvo);
//        System.out.println(map);
//        System.out.println(map.get("Mers"));
//        System.out.println(map.get("Chevrolet"));
//        System.out.println(map.size());
//
//        Set<String> keys = map.keySet();
//        Collection<Integer> values = map.values();
//        System.out.println(keys);
//        System.out.println(values);
//
//        final Set<Map.Entry<String, Integer>> entries = map.entrySet();
//        System.out.println(entries);
//        for (Map.Entry<String, Integer> entry :
//                entries) {
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }
//        Map<DayOfWeek, Character> days = new EnumMap<>(DayOfWeek.class);
//        days.put(DayOfWeek.MONDAY, 'F');
//        days.put(DayOfWeek.TUESDAY, 'M');
//        Character ch = days.get(DayOfWeek.MONDAY);
//        System.out.println(ch);
//
//        PropertyLoader loader = new PropertyLoader();
//        Properties props =  loader.loadFile("application.properties");
//        System.out.println(props.getProperty("name"));
//        String url = props.getProperty("spring.database.url");
//        System.out.println(url);
//        props.list(System.out);
//
//    }
//
//}

package ua.intita.qa.homework17.animals;

import java.util.*;

public class Shelter {
    Map<String, Pet> petMap = new HashMap<>();

    public Map<String, Pet> inputPetsFromConsole() {
        Scanner scanner = new Scanner(System.in);
        int amount = 0;
        System.out.println("Specify amount of pets you want to add");
        while (true) {
            if (scanner.hasNextInt()) {
                amount = scanner.nextInt();
                if (amount >= 0) {
                    break;
                }
            }
        }
        String name;
        String bread;
        int age;
        int option;
        for (int i = 0; i < amount; i++) {
            System.out.println("Specify what pet you want to add next");
            System.out.println("1 - dog");
            System.out.println("2 - cat");
            System.out.println("3 - parrot");
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                scanner.nextLine();
                switch (option) {
                    case 1:
                        System.out.println("Enter name");
                        while (true) {
                            if (scanner.hasNextLine()) {
                                name = scanner.nextLine();
                                break;
                            }
                        }
                        System.out.println("Enter bread");
//                        scanner.next();
                        while (true) {
                            if (scanner.hasNextLine()) {
                                bread = scanner.nextLine();
                                break;
                            }
                        }
                        System.out.println("Enter age");
//                        scanner.next();
                        while (true) {
                            if (scanner.hasNextInt()) {
                                age = scanner.nextInt();
                                break;
                            }
                        }
                        petMap.put(name, new Dog(name, bread, age));
                        System.out.println(petMap);
                        break;

                    case 2:
                        System.out.println("Enter name");
                        while (true) {
                            if (scanner.hasNextLine()) {
                                name = scanner.nextLine();
                                break;
                            }
                        }
                        System.out.println("Enter bread");
//                        scanner.next();
                        while (true) {
                            if (scanner.hasNextLine()) {
                                bread = scanner.nextLine();
                                break;
                            }
                        }
                        System.out.println("Enter age");
//                        scanner.next();
                        while (true) {
                            if (scanner.hasNextInt()) {
                                age = scanner.nextInt();
                                break;
                            }
                        }
                        petMap.put(name, new Cat(name, bread, age));
                        System.out.println(petMap);
                        break;

                    case 3:
                        System.out.println("Enter name");
                        while (true) {
                            if (scanner.hasNextLine()) {
                                name = scanner.nextLine();
                                break;
                            }
                        }
                        System.out.println("Enter age");
//                        scanner.next();
                        while (true) {
                            if (scanner.hasNextInt()) {
                                age = scanner.nextInt();
                                break;
                            }
                        }
                        petMap.put(name, new Parrot(name, age));
                        System.out.println(petMap);
                        break;

                }
            }

        }
        return petMap;
    }

    public void printAllPetsKeys(Map<String, ? extends Pet> petMap) {
        System.out.println(petMap.keySet());
    }

    public void sortByName(Map<String, ? extends Pet> petMap) {

        TreeMap<String, ? extends Pet> treeMap = new TreeMap<>(petMap);
        System.out.println(treeMap);
    }
}

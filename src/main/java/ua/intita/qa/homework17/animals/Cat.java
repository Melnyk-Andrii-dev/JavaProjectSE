package ua.intita.qa.homework17.animals;

import ua.intita.qa.homework17.animals.Pet;

public class Cat extends Pet {
    String name;
    String bread;
    int age;

    public Cat(String name, String bread, int age) {
        this.name = name;
        this.bread = bread;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }
}

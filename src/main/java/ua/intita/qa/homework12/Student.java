package ua.intita.qa.homework12;

import java.util.Arrays;

public class Student {
    private static int counter = 0;

    private final int ID;
    private String name;
    private StudentSubject[] studentSubjects;

    public Student(String name, StudentSubject[] studentSubjects) {
        counter++;
        this.ID=counter;
        this.name = name;
        this.studentSubjects = studentSubjects;
    }

    public int getId() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentSubject[] getStudentSubjects() {
        return studentSubjects;
    }

    public void setSubjects(StudentSubject[] studentSubjects) {
        this.studentSubjects = studentSubjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", subjects=" + Arrays.toString(studentSubjects) +
                '}';
    }
}

package ua.intita.qa.homework17.studying;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private String group;
    private int course;
    private Map<String, Integer> assessments;

    public Student(String name, String group, int course, Map<String, Integer> assessments) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.assessments = assessments;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Map<String, Integer> getAssessments() {
        return assessments;
    }

    public void setAssessments(Map<String, Integer> assessments) {
        this.assessments = assessments;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", assessments=" + assessments +
                '}';
    }
}

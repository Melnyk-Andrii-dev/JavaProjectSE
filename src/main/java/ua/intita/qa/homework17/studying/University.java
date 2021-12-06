package ua.intita.qa.homework17.studying;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class University {
    Student student;
    Map<String, Integer> assessments;

    public void shiftToNextYear(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        double avarageMark;
        while (iterator.hasNext()) {
            student = (Student) iterator.next();
            assessments = student.getAssessments();
            avarageMark = 0;
            for (Map.Entry<String, Integer> entry : assessments.entrySet()) {
                avarageMark = avarageMark + entry.getValue();
            }
            avarageMark = avarageMark / assessments.size();
            if (avarageMark >= 3) {
                student.setCourse(student.getCourse() + 1);
            } else {
                iterator.remove();
            }
        }
    }

    public void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        Student student;
        while (iterator.hasNext()) {
            student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }
}

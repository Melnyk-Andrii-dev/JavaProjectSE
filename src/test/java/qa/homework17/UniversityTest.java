package qa.homework17;

import org.junit.Assert;
import org.junit.Test;
import ua.intita.qa.homework17.studying.Student;
import ua.intita.qa.homework17.studying.University;

import java.util.*;

public class UniversityTest {
        University university = new University();
    @Test
    public void shiftToNextYearTest(){
        Map<String, Integer> assessment1 = new HashMap<String, Integer>();
        Map<String, Integer> assessment2 = new HashMap<String, Integer>();
        Map<String, Integer> assessment3 = new HashMap<String, Integer>();
        List<Student> students = new ArrayList<Student>();

        assessment1.put("Math", 2);
        assessment1.put("Biology", 3);
        assessment1.put("Art", 2);

        assessment2.put("Math", 5);
        assessment2.put("Biology", 5);
        assessment2.put("Art", 5);

        assessment3.put("Math", 4);
        assessment3.put("Biology", 4);
        assessment3.put("Art", 4);


        Student student1 = new Student("Tom", "a2", 2, assessment1);
        Student student2 = new Student("Mark", "a2", 2, assessment2);
        Student student3 = new Student("Bill", "a2", 2, assessment3);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        university.shiftToNextYear(students);
        System.out.println(students);
        Assert.assertEquals("[Student{name='Mark', group='a2', course=3, assessments={Art=5, Biology=5, Math=5}}, Student{name='Bill', group='a2', course=3, assessments={Art=4, Biology=4, Math=4}}]", Arrays.toString(students.toArray()));
    }

    @Test
    public void printStudentsTest() {
        Map<String, Integer> assessment1 = new HashMap<String, Integer>();
        Map<String, Integer> assessment2 = new HashMap<String, Integer>();
        Map<String, Integer> assessment3 = new HashMap<String, Integer>();
        List<Student> students = new ArrayList<Student>();

        assessment1.put("Math", 2);
        assessment1.put("Biology", 3);
        assessment1.put("Art", 2);

        assessment2.put("Math", 5);
        assessment2.put("Biology", 5);
        assessment2.put("Art", 5);

        assessment3.put("Math", 4);
        assessment3.put("Biology", 4);
        assessment3.put("Art", 4);


        Student student1 = new Student("Tom", "a2", 3, assessment1);
        Student student2 = new Student("Mark", "a2", 2, assessment2);
        Student student3 = new Student("Bill", "a2", 3, assessment3);

        students.add(student1);
        students.add(student2);
        students.add(student3);

        university.printStudents(students, 3);
    }
}

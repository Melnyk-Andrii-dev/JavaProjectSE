package ua.intita.qa.homework12;

public class Group {
    private String title;
    private Student[] students;


    public Group(String title, Student[] students) {
        this.title = title;
        this.students = students;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}

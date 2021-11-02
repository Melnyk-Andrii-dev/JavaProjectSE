package ua.intita.qa.homework12;

import javax.security.auth.Subject;

public class Comission {
    int score;

    public double getStudentAverage(Student student) {
        score = 0;
        int subjectNumber = 0;
        if (student.getStudentSubjects() == null) {
            throw new NoSubjectException("ALARM");
        }

        for (StudentSubject studentSubjectSearch :
                student.getStudentSubjects()) {
            if (studentSubjectSearch.getScore() < 0 || studentSubjectSearch.getScore() > 10) {
                throw new ScoreInvalidException("Incorrect score for " + studentSubjectSearch.getSubject());
            }
            subjectNumber++;
            score += studentSubjectSearch.getScore();
        }
        return score / subjectNumber;
    }

    public double getSubjectAverageInGroupOfFaculty(StudentSubject studentSubject, Group group, Faculty faculty) {
        score = 0;
        int studentsNumber = 0;
        for (Group groupSearch : faculty.getGroups()) {
            if (groupSearch.getStudents() == null) {
                throw new NoSubjectException("ALARM");
            }
            if (groupSearch.getTitle().equals(group.getTitle())) {
                for (Student student : group.getStudents()) {
                    if (student.getStudentSubjects() == null) {
                        throw new NoSubjectException("ALARM");
                    }
                    for (StudentSubject studentSubjectSearch : student.getStudentSubjects()) {
                        if (studentSubjectSearch.getSubject().equals(studentSubject.getSubject())) {
                            if (studentSubjectSearch.getScore() < 0 || studentSubjectSearch.getScore() > 10) {
                                throw new ScoreInvalidException("Incorrect score for " + studentSubjectSearch.getSubject());
                            }
                            studentsNumber++;
                            score += studentSubjectSearch.getScore();
                        }
                    }
                }
            }
        }
        return score / studentsNumber;
    }

    public double getSubjectAverageInUniversity(Subject subject, University university) {
        score = 0;
        int studentsNumber = 0;
        if (university.getFaculties() == null) {
            throw new EmptyUniversityException("ERROR");
        }
        for (Faculty facultySearch : university.getFaculties()) {
            for (Group groupSearch : facultySearch.getGroups()) {
                if (groupSearch.getStudents() == null) {
                    throw new NoSubjectException("ALARM");
                }
                for (Student student : groupSearch.getStudents()) {
                    if (student.getStudentSubjects() == null) {
                        throw new NoSubjectException("ALARM");
                    }
                    for (StudentSubject studentSubjectSearch : student.getStudentSubjects()) {
                        if (studentSubjectSearch.getScore() < 0 || studentSubjectSearch.getScore() > 10) {
                            throw new ScoreInvalidException("Incorrect score for " + studentSubjectSearch.getSubject());
                        }
                        studentsNumber++;
                        score += studentSubjectSearch.getScore();
                    }
                }
            }
        }
        return score/studentsNumber;
    }

}

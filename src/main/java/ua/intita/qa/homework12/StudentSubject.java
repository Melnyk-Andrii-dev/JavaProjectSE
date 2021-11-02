package ua.intita.qa.homework12;

public class StudentSubject {
    private String subject;
    private int score;

    @Override
    public String toString() {
        return "StudentSubject{" +
                "sujgect='" + subject + '\'' +
                ", score=" + score +
                '}';
    }

    public StudentSubject(String subject, int score) {
        this.subject = subject;
        this.score = score;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subgect) {
        this.subject = subject;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

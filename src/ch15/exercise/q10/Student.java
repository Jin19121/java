package ch15.exercise.q10;

public class Student implements Comparable<Student> {
    public String id;
    public int scores;

    public Student(String id, int scores) {
        this.id = id;
        this.scores = scores;
    }

    @Override
    public int compareTo(Student o) {
        return this.scores - o.scores;
    }
}

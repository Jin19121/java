package ch17.lecture.p04terminal;

import java.util.List;

public class C01ForEach {
    public static void main(String[] args) {
        //forEach: stream의 각 요소에 주어진 액션을 실행
        List<Integer> list = List.of(5, 10, 21, 1);
        list.stream()
                //intermediate operation...
                .forEach(e -> System.out.println(e));
        System.out.println();

        List<Student1> s = List.of(
                new Student1("son", 98),
                new Student1("hong", 80),
                new Student1("lee", 70)
        );

        s.stream()
                .forEach(t -> t.setScore(t.getScore() + 5));
        s.forEach(System.out::println);
    }
}//751

class Student1 {
    private String name;
    private int score;

    public Student1(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

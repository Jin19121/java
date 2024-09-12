package ch17.sec06.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class MapExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("이도겸", 85));
        studentList.add(new Student("이도겸", 90));
        studentList.add(new Student("이도겸", 87));

        studentList.stream()
                .mapToInt(s -> s.getScore())
                .forEach(System.out::println);
    }
}

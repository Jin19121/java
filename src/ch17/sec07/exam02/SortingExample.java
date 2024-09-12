package ch17.sec07.exam02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class SortingExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("이도겸", 30));
        studentList.add(new Student("김민규", 10));
        studentList.add(new Student("이중찬", 20));

        //name natural numbering
        studentList.stream()
                .sorted((b1, b2) -> b1.getName().compareTo(b2.getName()))
                .forEach(System.out::println);
        System.out.println();

        //score reverse
        studentList.stream()
                .sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()))
                .forEach(System.out::println);
        System.out.println();

        //score natural numbering
        studentList.stream()
                .sorted(comparing(Student::getScore))
                .forEach(System.out::println);
    }
}

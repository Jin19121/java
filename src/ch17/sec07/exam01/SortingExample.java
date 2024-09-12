package ch17.sec07.exam01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("이도겸", 27));
        students.add(new Student("권순영", 28));
        students.add(new Student("최승철", 29));
        students.stream()
                .sorted()
                .forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
        System.out.println();

        students.stream()
                .sorted(Comparator.reverseOrder())//parameter 있음
                .forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
    }
}

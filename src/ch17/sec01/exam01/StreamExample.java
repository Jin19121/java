package ch17.sec01.exam01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("이도겸");
        set1.add("김민규");
        set1.add("서명호");

        Stream<String> stream1 = set1.stream();
        stream1.forEach(name -> System.out.println(name));

        Set<String> set2 = Set.of("권순영", "이지훈");
        Stream<String> stream2 = set2.stream();
        stream2.forEach(name -> System.out.println(name));
    }
}

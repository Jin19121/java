package ch17.sec01.exam01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("이도겸");
        set.add("김민규");
        set.add("서명호");

        Stream<String> stream = set.stream();
        stream.forEach(name -> System.out.println(name));
    }
}

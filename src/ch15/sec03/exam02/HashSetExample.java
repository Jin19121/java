package ch15.sec03.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();

        set.add(new Member("hong", 30));
        set.add(new Member("hong", 30));

        System.out.println("총 객체 수: " + set.size());
    }
}

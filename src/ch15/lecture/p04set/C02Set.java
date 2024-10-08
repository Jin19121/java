package ch15.lecture.p04set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C02Set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("vue");
        set.add("react");
        set.add("jsp");
        set.add("sql");

        //전체탐색
        //.get x
        //1. 향상된 for
        System.out.println("-----enhanced for-----");
        for (String item : set) {//hashset는 순서 보장 안 됨
            System.out.println(item);
        }

        //2. forEach method
        System.out.println("-----forEach-----");
        set.forEach(System.out::println);

        //3. iterator
        System.out.println("-----iterator-----");
        Iterator<String> iterator = set.iterator();
        //hasNext() method
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}

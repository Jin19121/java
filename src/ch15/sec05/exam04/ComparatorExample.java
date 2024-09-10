package ch15.sec05.exam04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
        TreeSet<Fruit> treeSet = new TreeSet<>((f1, f2) -> f1.price - f2.price);

        treeSet.add(new Fruit("grape", 3000));
        treeSet.add(new Fruit("watermelon", 10000));
        treeSet.add(new Fruit("strawberry", 6000));

        treeSet.forEach(System.out::println);

    }
}

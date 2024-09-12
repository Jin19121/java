package ch17.lecture.p04terminal;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toMap;

public class C05Collect {
    public static void main(String[] args) {
        //collect: 하나의 객체로 담아냄

        List<Integer> list = List.of(3, 1, 4, 1, 5, 7, 2);
        List<Integer> list2 = list.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println("list2 = " + list2);

        List<Integer> list3 = list.stream()
                .map(n -> n * 3)
                .toList();
        System.out.println("list3 = " + list3);

        Set<Integer> set4 = list.stream()
                .map(n -> n * 4)
                .collect(Collectors.toSet());
        System.out.println("set4 = " + set4);

        //collectors에 있는 toMap은 두개의 parameter를 받는다.
        Map<Double, Integer> map5 = list.stream()
                .map(n -> n * 5)
                .collect(toMap(e -> e * Math.random(), e -> e));
        System.out.println("map5 = " + map5);
    }
}
//763
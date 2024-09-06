package ch15.lecture.p01list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02List {
    public static void main(String[] args) {
        //전체 탐색의 여러가지 방법
        //list 전체
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("git");
        list.add("sql");
        list.add("mybatis");

        //고전적 for(책에선 이 방식으로 주로 함)
        System.out.println("---고전적 for---");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //enhanced for
        System.out.println("---enhanced for---");
        for (String elem : list) {
            System.out.println(elem);
        }

        //iterator
        System.out.println("---iterator---");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //forEach method
        System.out.println("---forEach method---");
//        list.forEach(e -> System.out.println(e));
        list.forEach(System.out::println);
    }
}//690 ㅂ7
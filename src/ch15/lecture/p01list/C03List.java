package ch15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class C03List {
    public static void main(String[] args) {
        //list : 순서가 있다.
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("css");
        list.add("html");
        System.out.println(list);

        list.add("java");
        list.add("html");
        System.out.println(list);

        list.add(null);
        list.add(null);
        System.out.println(list);

        //remove
        list.remove("css");
        System.out.println(list);
        list.remove("html");//앞 인덱스만 지워짐
        System.out.println(list);
        list.remove(3);
        System.out.println(list);

    }
}

package ch15.lecture.p04set;

import java.util.HashSet;
import java.util.Set;

public class C01HashSet {
    public static void main(String[] args) {
        //Set: 중복된 요소(element) 허용하지 않음
        Set<String> set = new HashSet<>();

        //추가 add
        set.add("java");
        set.add("spring");
        set.add("html");

        //있는지 확인 contains
        boolean b1 = set.contains("react");
        System.out.println("b1 = " + b1);//false
        boolean b2 = set.contains("html");
        System.out.println("b2 = " + b2);

        // 원소 수 size
        System.out.println(set.size());

        //삭제
        boolean b3 = set.remove("html");
        System.out.println(set);
        System.out.println("b3 = " + b3);
        boolean b4 = set.remove("react");
        System.out.println(set);
        System.out.println("b4 = " + b4);


        //전체 탐색

    }
}

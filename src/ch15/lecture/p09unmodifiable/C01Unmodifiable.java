package ch15.lecture.p09unmodifiable;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class C01Unmodifiable {
    public static void main(String[] args) {
        List<String> list1 = List.of("lee", "kim", "yoon");
        System.out.println(list1);
//        list1.add("seung");

        Set<String> set1 = Set.of("a", "b", "c");
        System.out.println(set1);
//        set1.add("d");

        Map<String, String> map1 = Map.of("lee", "DK", "kim", "gyu", "boo", "SK");
        System.out.println(map1);
//        map1.replace("lee", "Woozi");

        System.out.println("다음 코드");
    }
}

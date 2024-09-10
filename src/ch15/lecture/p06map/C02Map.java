package ch15.lecture.p06map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C02Map {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("spring", 1000);
        map.put("react", 3000);
        map.put("java", 2000);
        map.put("vue", 1500);

        //전체 탐색
        //keySet
        System.out.println("-keySet_");
        Set<String> keys = map.keySet();
        for (String key : keys) {
            Integer val = map.get(key);
            System.out.println(key + ": " + val);
        }

        //entrySet (내부인터페이스)
        System.out.println("\n-entrySet-");
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer val = entry.getValue();
            System.out.println(key + ": " + val);
        }

        //forEach method
        System.out.println("\n-forEach-");
        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}//660 661

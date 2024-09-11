package ch15.codetest.leetcodes.q1748;

import java.util.HashMap;
import java.util.Map;

public class A1748 {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        //배열 전체 탐색 후 (어떤 수, 몇개)의 map 생성
        for (int n : nums) {
            // map에 이미 있으면 (n, map.get(n)+1);
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            }
            // map에 없으면 (n+1) 추가
            else {
                map.put(n, 1);
            }
        }

        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer val = entry.getValue();

            if (val == 1) {
                sum += key;
            }
        }
        return sum;
    }
}

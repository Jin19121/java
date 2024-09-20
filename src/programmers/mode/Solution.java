package programmers.mode;

import java.util.HashMap;

public class Solution {
    public int solution(int[] array) {
        // 빈도를 저장할 HashMap
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // 각 숫자의 빈도를 계산
        for (int num : array) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;  // 최빈값의 빈도
        int mode = -1;    // 최빈값 (기본값은 -1로 설정)
        boolean isDuplicate = false;  // 최빈값이 여러 개 있는지 여부 확인

        // HashMap을 순회하여 최빈값을 찾음
        for (int key : freqMap.keySet()) {
            int freq = freqMap.get(key);
            if (freq > maxFreq) {
                maxFreq = freq;
                mode = key;
                isDuplicate = false;  // 새로운 최빈값이 나왔으므로 중복 아님
            } else if (freq == maxFreq) {
                isDuplicate = true;  // 동일한 빈도를 가진 값이 또 나오면 중복됨
            }
        }

        // 최빈값이 여러 개일 경우 -1을 반환
        return isDuplicate ? -1 : mode;
    }
}

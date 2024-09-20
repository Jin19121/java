package programmers.mode;

import java.util.HashMap;

class retry {
    public int solution(int[] array) {

        HashMap<Integer, Integer> eleFreq = new HashMap<>();

        for (int num : array) {
            eleFreq.put(num, eleFreq.getOrDefault(num, 0) + 1);
        }

        int max = 0;
        int mode = -1;

        for (int key : eleFreq.keySet()) {
            int freq = eleFreq.get(key);
            if (freq > max) {
                max = freq;
                mode = key;
            } else if (freq == max) {
                mode = -1;
            }
        }

        return mode;
    }
}

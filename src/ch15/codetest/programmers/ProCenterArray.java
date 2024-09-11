package ch15.codetest.programmers;

import java.util.Arrays;

public class ProCenterArray {
    public int solution(int[] array) {
        Arrays.sort(array);
        int l = array.length;
        int answer = 0;
        answer = array[(l - 1) / 2];
        return answer;
    }
}

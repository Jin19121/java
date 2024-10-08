package programmers.odds;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> odds = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                odds.add(i);
            }
        }

        int[] answer = new int[odds.size()];
        for (int i = 0; i < odds.size(); i++) {
            answer[i] = odds.get(i);
        }
        return answer;
    }
}
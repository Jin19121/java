package ch15.codetest.leetcodes.q1046;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P1046 {
    public List<Integer> lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for (int s : stones) {
            list.add(s);
        }

        boolean run = true;
        while (run) {
            Collections.sort(list);
            int size = list.size();
            int max = Collections.max(list);
            int sml = list.get(size - 1);
            if (size > 0) {
                if (max - sml > 0) {
                    list.add(max - sml);
                }
            }
        }
        //가장 큰 돌 두개 찾아 부딪혀 깨고 남은 거 다시 리스트에 넣기

        //list에 하나의 돌이 남을 때까지
        //가장 큰 돌 두개 찾기
        //1. sort
        //2 오른쪽 두개

        //큰 돌 두개 꺼내기(지우기)
        //두 돌의 무게가 0이 아니면 차이(무게 돌 다시 넣기)

        return list;

    }
}

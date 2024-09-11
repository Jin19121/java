package ch15.codetest.leetcodes.q119;

import java.util.*;

public class Pascal {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = new ArrayList<>();
        prev.add(1); //세로 첫번째

        int loop = 0;

        while (loop < rowIndex) {

            List<Integer> next = new ArrayList<>();
            //가로 첫번째
            next.add(1);

            //prev에 있는 것들 2개씩 더해서 next에 넣기
            for (int i = 0; i < prev.size() - 1; i++) {
                next.add(prev.get(i) + prev.get(i + 1));
            }

            //마지막
            next.add(1);
            prev = next;
            loop++;
        }

        return prev;

//        List<Integer> pascal = new ArrayList<>();

//        for (int i = 0; i < pascal.size(); i++) {
//            for (int b = 0; b < pascal[i].size(); b++)
//                pascal[i][b] = pascal[i - 1][b] + pascal[i - 1][b + 1];
//        }

//        return pascal;
    }
}

package ch15.codetest.leetcodes.q771;

import java.util.ArrayList;
import java.util.List;

public class JewelsNStones {
    public int numJewelsInStones(String jewels, String stones) {
        char[] jew = jewels.toCharArray();
        char[] sto = stones.toCharArray();

        List<Character> jewList = new ArrayList<>();
        for (char j : jew) {
            jewList.add(j);  // jewels의 문자를 리스트에 추가
        }

        int result = 0;

        for (char s : sto) {
            if (jewList.contains(s)) {
                result++;
            }
        }

        return result;
    }
}

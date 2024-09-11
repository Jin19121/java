package ch15.codetest.leetcodes.q844;

import java.util.ArrayList;
import java.util.List;

public class BackspaceString {
    public boolean backspaceCompare(String s, String t) {
        //실패: ##해결 못함


        //각각 배열로 만들어서
        char[] charS = s.toCharArray();
        List<Character> listS = new ArrayList<>();
        for (char c : charS) {
            listS.add(c);
        }
        int lengthS = charS.length;

        // #있으면 그 앞 인덱스 삭제
        for (int i = 0; i < lengthS; i++) {
            if (listS.get(i) == '#') {
                listS.remove(i);
                listS.remove(i - 1);
                lengthS--;
            }
        }

        char[] charT = t.toCharArray();
        List<Character> listT = new ArrayList<>();
        for (char d : charT) {
            listT.add(d);
        }
        int lengthT = charT.length;
        for (int i = 0; i < lengthT; i++) {
            if (listT.get(i) == '#') {
                listT.remove(i);
                listT.remove(i - 1);
                lengthT--;
            }
        }

        boolean result = listT.equals(listS);

        return result;
    }
}

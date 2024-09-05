package ch12.lecture.p04regex;

import java.util.regex.Pattern;

import static java.util.regex.Pattern.matches;

public class C05Quantifier {
    public static void main(String[] args) {
        // {n}: n개
        String p1 = "[0-9]{3}";

        System.out.println(matches(p1, "010"));
        System.out.println(matches(p1, "999"));
        System.out.println(matches(p1, "23"));

        //예제ㅣ 010-1234-1234
        String p2 = "\\d{3}-\\d{4}-\\d{4}";
        System.out.println(matches(p2, "010-1242-0849"));

        //{n,m}: n~m개
        String p3 = "\\p{IsHangul}{3,4}";
        System.out.println(matches(p3, "이도겸"));
        System.out.println(matches(p3, "팀세븐틴"));
        System.out.println(matches(p3, "석민"));

        //{n,}: n개 이상

        // ? : {0,1}
        // * : {0,}
        // + : {1,}
    }
}


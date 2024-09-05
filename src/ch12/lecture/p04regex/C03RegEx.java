package ch12.lecture.p04regex;

import static java.util.regex.Pattern.matches;

public class C03RegEx {
    public static void main(String[] args) {
        // 이미 정의된 클래스
        // \d: [0-9]
        // \w: [a-zA-Z_0-9]
        // \s: 공백문자

        // 주의: String에서 역슬래시는 \\로 표현

        String p1 = "\\d\\d\\d";
        System.out.println(matches(p1, "123"));
        System.out.println(matches(p1, "22"));
        System.out.println(matches(p1, "6789"));
        System.out.println(matches(p1, "679"));

        String p2 = "\\d\\s\\d";
        System.out.println(matches(p2, "9 1"));
        System.out.println(matches(p2, "999"));

        String p3 = "\\w\\w\\w";
        System.out.println(matches(p3, "_9a"));
        System.out.println(matches(p3, "wh1"));
        System.out.println(matches(p3, "123"));

        //한글
        String p4 = "[가-힣][가-힣]";
        System.out.println(matches(p4, "도겸"));
        System.out.println(matches(p4, "DK"));
        System.out.println(matches(p4, "김민규"));

        String p5 = "\\p{IsHangul}";
        System.out.println(matches(p5, "이"));
        System.out.println(matches(p5, "겸"));
    }
}

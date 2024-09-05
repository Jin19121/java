package ch12.lecture.p04regex;

import static java.util.regex.Pattern.matches;

public class C04Regex {
    public static void main(String[] args) {
        // \\:\
        String p1 = "\\\\";
        System.out.println(matches(p1, "\\"));

        // . :모든 문자
        String p2 = ".";
        System.out.println(matches(p2, "a"));
        System.out.println(matches(p2, "가"));
        System.out.println(matches(p2, "0"));

        String p3 = "..";
        System.out.println(matches(p3, "ab"));
        System.out.println(matches(p3, "가나"));
        System.out.println(matches(p3, "a나"));

        // \.: .
        String p4 = "\\.";
        System.out.println(matches(p4, "."));
        System.out.println(matches(p4, "3"));
    }
}

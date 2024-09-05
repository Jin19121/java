package ch12.lecture.p04regex;

import java.util.regex.Pattern;

import static java.util.regex.Pattern.matches;

public class C01RegularExpression {
    public static void main(String[] args) {
        //regular expression (정규 표현식)
        // 문자열의 패턴을 나타내는 코드

        //관련 클래스: java.util.regex.Pattern

        //matches: 패턴과 일치하는 지 확인하는 메소드
        // 문자 하나
        String p1 = "a";
        String s1 = "a";
        System.out.println(matches(p1, s1));//true
        System.out.println(matches(p1, "aa")); //false
        System.out.println(matches("aa", "aa")); //true
        System.out.println(matches("aa", "bb")); //false

        System.out.println("-----");
        // 문자 묶음
        String p2 = "[abc]";//a or b or c
        System.out.println(matches(p2, "a"));
        System.out.println(matches(p2, "b"));
        System.out.println(matches(p2, "c"));//true
        System.out.println(matches(p2, "abc")); //false

        String p3 = "[abc][abc][abc]";
        System.out.println(matches(p3, "abc"));
        System.out.println(matches(p3, "bbb"));
        System.out.println(matches(p3, "bca"));//true
        System.out.println(matches(p3, "a"));
        System.out.println(matches(p3, "ab"));
        System.out.println(matches(p3, ""));

        String p4 = "[abcdefghijklmnopqrstuvwxyz][abcdefghijklmnopqrstuvwxyz]";
        System.out.println(matches(p4, "ad"));
        System.out.println(matches(p4, "ko"));

        String p5 = "[a-z]";
        System.out.println(matches(p5, "a"));
        System.out.println(matches(p5, "k"));

        String p6 = "[a-z][0-9][0-9]";
        System.out.println(matches(p6, "a01"));
        System.out.println(matches(p6, "z98"));

        String p7 = "[a-z0-9][0-9][0-9]";
        System.out.println(matches(p7, "007"));
        System.out.println(matches(p7, "a89"));//true
        System.out.println(matches(p7, "zz9"));//false

        System.out.println("-----");
        //문자 제회
        String p8 = "[^0-9][0-9]";
        System.out.println(matches(p8, "99")); //false
        System.out.println(matches(p8, "a8")); //true
        System.out.println(matches(p8, "*7")); //true

        
    }
}

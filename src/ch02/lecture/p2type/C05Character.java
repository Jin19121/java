package ch02.lecture.p2type;

import java.sql.SQLOutput;

public class C05Character {
    public static void main(String[] args) {
        // char (2byte) , 문자 하나 '작은 따옴표 사용' => 비문자가 문자열 불가
        // unicode
        char a = 'a';
        char b = '가';
        char c = '한';
        char d = '8';
        char e = 3743;

        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("e= " + e);
    }
}

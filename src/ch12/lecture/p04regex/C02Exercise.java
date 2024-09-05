package ch12.lecture.p04regex;

import java.util.Scanner;

import static java.util.regex.Pattern.matches;

public class C02Exercise {
    public static void main(String[] args) {
        //사용자 입력 받아 6개 숫자로 이루어진 문자열인지 확인하기
        Scanner scanner = new Scanner(System.in);

        String con = "[0-9][0-9][0-9][0-9][0-9][0-9]";


        System.out.print("insert 6 digits> ");
        String no = scanner.next();

        System.out.println(matches(con, no));
    }
}

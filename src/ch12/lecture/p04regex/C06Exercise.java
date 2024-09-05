package ch12.lecture.p04regex;

import java.util.Scanner;

import static java.util.regex.Pattern.matches;

public class C06Exercise {
    public static void main(String[] args) {
        //010-999-111 / 02-2345-7890 / 031-890-2343
        Scanner scanner = new Scanner(System.in);

        String con = "0\\d{1,2}-\\d{3,4}-\\d{4}";

        while (true) {
            System.out.print("phone number> ");
            String no = scanner.nextLine();

            boolean tf = matches(con, no);
            if (tf) {
                System.out.println("확인되었습니다.");
                return;
            } else {
                System.out.println("전화번호가 아닙니다.");
            }
        }
    }
}

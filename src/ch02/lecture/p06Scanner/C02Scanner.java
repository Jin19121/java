package ch02.lecture.p06Scanner;

import java.util.Scanner;

public class C02Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("name>");
        String name = scanner.nextLine();

        System.out.print("age>");
        String age = scanner.nextLine();

        String desc = STR."\{name}님의 나이는 \{age}입니다.";
        System.out.println(desc);
    }
}

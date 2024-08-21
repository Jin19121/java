package ch04.lecture.p01if;

import java.util.Scanner;

public class C04IfElseEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("나이> ");
        int age = scanner.nextInt();

        if (age >= 20 && age < 200) {
            System.out.println("성인");
        } else if (age >= 13 && age < 20) {
            System.out.println("청소년");
        } else if (age >= 6 && age < 13) {
            System.out.println("어린이");
        } else if (age >= 1 && age < 6) {
            System.out.println("유아");
        } else {
            System.out.println("나이를 입력하신 것이 맞으신가요?");
        }
    }
}

package ch03.lecture.p07ternary;

import java.util.Scanner;

public class C02Ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("age> ");
        int age = scanner.nextInt();
//        int age = 15;

        String message = (age >= 13 && age <= 19) ? "청소년이다." : "청소년이 아니다.";

        System.out.println(message);

    }
}

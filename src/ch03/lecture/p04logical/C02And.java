package ch03.lecture.p04logical;

import java.util.Scanner;

public class C02And {
    public static void main(String[] args) {
        //13~19: 청소년

//        int age = 15;
        Scanner scanner = new Scanner(System.in);
        System.out.println("나이> ");
        int age = scanner.nextInt();

        boolean teenage = age >= 13 && age <= 19;
        if (teenage) {
            System.out.println("삐빅! 청소년");
        } else {
            System.out.println("다시 입력하십시오.");
        }
    }
}

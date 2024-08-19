package ch02.lecture.p06Scanner;

import java.util.Scanner;

public class C03Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("수1>");
        String num1 = scanner.nextLine();

        System.out.print("수2>");
        String num2 = scanner.nextLine();

        int n1 = Integer.parseInt(num1); //실수의 경우: double
        int n2 = Integer.parseInt(num2);

        System.out.print("더한 결과 = " + (n1 + n2));

    }
}

package ch04.lecture.p04for;

import java.util.Scanner;

public class C02Multiple {
    public static void main(String[] args) {
        //for, while로 구구단 2단 출력
        System.out.println("for");
        for (int i = 1; i < 10; i++) {
            System.out.println("2x" + i + "=" + 2 * i);
        }
        System.out.println("-----");
        System.out.println("while");
        int x = 1;
        while (x < 10) {
            System.out.println(2 * x);
            x++;
        }
        System.out.println("-----");

        Scanner scanner = new Scanner(System.in);
        System.out.print("구구단> ");
        int dan = scanner.nextInt();

        if (2 <= dan && dan <= 9) {
            for (int y = 1; y <= 9; y++) {
                System.out.println(STR."\{dan}X\{y}=\{dan * y}");
            }
        } else {
            System.out.println("잘못된 입력");
        }

    }
}

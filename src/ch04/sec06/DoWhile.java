package ch04.sec06;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("메세지 입력");
        System.out.println("프로그램 종료: q");

        Scanner scanner = new Scanner(System.in);
        String text;

        do {
            System.out.print("> ");
            text = scanner.nextLine();
            System.out.println(text);
        } while (!text.equals("q"));
        System.out.println();
        System.out.println("종료");
    }
}


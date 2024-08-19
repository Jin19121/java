package ch02.lecture.p06Scanner;

import java.util.Scanner;

public class C06Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 수를 한 줄 띄워서 입력> ");
        String n1 = scanner.next();
        String n2 = scanner.next();

        int v1 = Integer.parseInt(n1);
        int v2 = Integer.parseInt(n2);

        System.out.println("all in all = " + (v1 + v2));

        System.out.print("next 사용하여 입력> ");
        int v3 = scanner.nextInt();//nextDouble
        int v4 = scanner.nextInt();

        System.out.println("next > " + (v3 + v4));
    }
}

package ch03.sec11;

import java.util.Scanner;

public class ConditionalOperationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("your score> ");
        int score = scanner.nextInt();
//        int score = 85;
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');

//        System.out.println(score + "점은 " + grade + "등급입니다.");

        System.out.println(STR."\{score}점은 \{grade}등급입니다.");
    }
}

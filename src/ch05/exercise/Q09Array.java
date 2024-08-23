package ch05.exercise;

import java.util.Scanner;

public class Q09Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int n = 0;
        int[] scores = new int[n];
        while (run) {
            System.out.println("""
                    ----------------------------------------------------
                    1. 학생수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료
                    ----------------------------------------------------
                    """);
            System.out.print("선택> ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1 -> {
                    System.out.print("학생 수> ");
                    n = scanner.nextInt();
                }
                case 2 -> {
                    for (int i = 0; i < n; i++) {
                        System.out.print(STR."scores[\{i}]> ");
                        scores[i] = scanner.nextInt();
                    }
                }
                case 3 -> {
                    for (int i = 0; i < n; i++) {
                        System.out.print(STR."scores[\{i}]> \{scores[i]}");
                    }
                }
                case 4 -> {
                    int sum = 0;
                    int avg = 0;
                    for (int i = 0; i < n; i++) {
                        sum += scores[i];
                        avg = sum / n;
                        System.out.println("평균> " + avg);
                    }
                }

                case 5 -> run = false;
            }

        }
        System.out.println();
        System.out.println("프로그램 종료");
    }
}

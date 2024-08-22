package ch04.lecture.exercise;

public class Q06andMore {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("-----");

        for (int a = 0; a < 5; a++) {
            for (int n = 0; n < a + 1; n++) {
                System.out.print(n);
            }
            System.out.println();
        }
        System.out.println("-----");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----");

    }
}




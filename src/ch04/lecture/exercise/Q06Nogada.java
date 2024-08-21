package ch04.lecture.exercise;

public class Q06Nogada {
    public static void main(String[] args) {
        for (int a = 6; a > 0; a--) {
            for (int n = 1; n < 6; n++) {
                if (a <= n) {
                    System.out.print("*");
                    continue;
                }
            }
            System.out.println();
        }
    }
}

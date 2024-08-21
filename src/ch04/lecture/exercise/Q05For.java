package ch04.lecture.exercise;

public class Q05For {
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                if (4 * x + 5 * y != 60) {
                    continue;
                }
                System.out.println(STR."(\{x}, \{y})");
            }
        }
    }
}

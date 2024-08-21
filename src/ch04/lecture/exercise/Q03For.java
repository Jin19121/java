package ch04.lecture.exercise;

public class Q03For {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if ((i % 3) == 0)
                sum += i;
        }
        System.out.println(sum);

        int add = 0;
        for (int x = 0; x <= 100; x += 3) {
            add += x;
        }
        System.out.println(add);
    }
}

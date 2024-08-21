package ch04.lecture.exercise;

public class Q03 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i < 100) {
            if ((i % 3) == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(i + "&" + sum);

        int all = 0;
        int a = 0;
        while (a <= 100) {
            all += a;
            a += 3;
        }
        System.out.println("all" + all);
    }
}

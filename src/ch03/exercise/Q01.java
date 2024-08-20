package ch03.exercise;

public class Q01 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = ++x + y--;//11+20 => 지양
        System.out.println(z);
        System.out.println(x);
        System.out.println(y);

        System.out.println("-----");

        int a = 10;
        int b = 20;
        ++a;
        int c = a + b;
        b--;
        System.out.println(c);

    }
}

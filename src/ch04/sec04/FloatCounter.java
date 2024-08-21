package ch04.sec04;

public class FloatCounter {
    public static void main(String[] args) {
        for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
            System.out.println(x);
        }

        System.out.println("-----");

        float a = 0.1F;
        while (a <= 1.0F) {
            System.out.println(a);
            a += 0.1F;
        }
    }
}

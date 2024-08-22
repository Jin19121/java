package ch05.lecture.p01array;

public class C01Array {
    public static void main(String[] args) {
        int a;
        a = 3;
        System.out.println("a1 = " + a);
        a = 4;
        System.out.println("a2 = " + a);

        int[] b;
        b = new int[5];
        b[0] = 1;
        b[1] = 2;
        b[3] = 5;

        System.out.println("b[0] = " + b[0]);
        System.out.println("b[1] = " + b[1]);
        System.out.println("b[2] = " + b[2]);
        System.out.println("b[3] = " + b[3]);

        b[0] = 11;
        System.out.println("b[0] = " + b[0]);

    }
}

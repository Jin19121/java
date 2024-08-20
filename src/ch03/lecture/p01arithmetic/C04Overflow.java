package ch03.lecture.p01arithmetic;

public class C04Overflow {
    public static void main(String[] args) {
        //86p
        byte a = 127; //byte: -128~127
        a = (byte) (a + 1);

        System.out.println("a = " + a);//-128

        //underflow
        byte b = -128;
        b = (byte) (b - 1);
        System.out.println("b = " + b);

    }
}

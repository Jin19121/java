package ch02.lecture.p04Conversion;

public class C04TypeConversion {
    public static void main(String[] args) {
        //자동형변환 : char -> int, long
        //강제형변환 : int, long -> char

        char a = '한';
        int b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        long c = a;
        System.out.println("c = " + c);

        a = (char) b;
        System.out.println("a = " + a);
    }
}

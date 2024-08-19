package ch02.lecture.p04Conversion;

public class C01TypeConversion {
    public static void main(String[] args) {
        //type conversion (형변환)

        //자동 : 작은 공간의 값 --> 큰 공간의 값

        //자동 ex)정수형 사이
        int a = 30000;
        long b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //short c = a; 자동 형변환 불가
        short c = (short) a; //강제 형변환
        System.out.println("c = " + c);
        int d = 2100000000;
        short e = (short) d; //작은 공간으로 강제 형변환 시, 값을 잃을 수 있다 => 주의!!
        System.out.println("e = " + e);
    }
}

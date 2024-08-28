package ch06.lecture.p06final;

public class C01Final {
    //final: 변수의 값을 바꾸지 못하게 하는 키워드
    public static void main(String[] args) {
        int a = 3;
        System.out.println(a);
        a = 4;
        System.out.println(a);//일반적인 경우 변경 가능

        final int b;
        b = 30;
        System.out.println(b);
//        b = 40; 변경 불가
        System.out.println(b);
    }


}

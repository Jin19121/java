package ch05.lecture.p04strings;

public class C01Strings {
    public static void main(String[] args) {
        String a = new String("jaba"); //new 연산자 생략 버전
        String b = new String("jaba"); //인스턴스 생성

        System.out.println("a = " + a);
        System.out.println(a == b); //a와 b는 참조값만 지니고 있다.

        int c = 4;
        int d = 4;
        System.out.println(c == d);

    }
}

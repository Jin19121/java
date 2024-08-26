package ch05.lecture.p06null;

public class C01Null {
    public static void main(String[] args) {
        String[] a = new String[3];

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);

        a[0].length(); //NullPointerException. 객체가 없는 배열

        System.out.println("프로그램 종료");
    }
}

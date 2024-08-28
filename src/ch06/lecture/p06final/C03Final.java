package ch06.lecture.p06final;

public class C03Final {
    public static void main(String[] args) {
        final int[] a = {3, 4};
//        a = new int[]{4, 6}; a의 참조값 변경 불가
        a[0] = 33; //참조값은 두고 인스턴스 안의 내용을 바꾸는 것은 가능

    }

    static void method1(final int[] a) {
//        a = new int[]{99,88}; -> 이미 final로 할당됨. 변경 불가
        a[1] = 99;
    }
}

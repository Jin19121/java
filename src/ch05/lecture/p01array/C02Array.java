package ch05.lecture.p01array;

public class C02Array {
    public static void main(String[] args) {
        int[] a;//a라는 변수 선언
        a = new int[3]; //3개의 값 저장 가능한 공간 생성. 배열의 길이: 3

        a[0] = 33;
        a[1] = 44;
        a[2] = 55;
//        a[3] = 66 가능한 공간이 아님
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);

    }
}

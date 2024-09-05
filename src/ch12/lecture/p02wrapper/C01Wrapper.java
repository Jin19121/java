package ch12.lecture.p02wrapper;

public class C01Wrapper {
    public static void main(String[] args) {
        int a = 1;

        //먼 옛날...
        Integer b = new Integer(3);

        //기본 타입 a가 가진 값을 참조타입 c로 변환 (직접 boxing)
        Integer c = Integer.valueOf(a);

        //기본타입 a를 참조타입 d로 변환(자동 auto boxing)
        Integer d = a;

        Long e = 5L; //auto boxing
        //Long e = 5; x 5는 Integer => Long에 속하지 않음
        long f = 5;

        Double g = 3.14; //auto boxing
        Boolean h = true; //auto boxing

        Object i = 9.1234; //auto boxing
    }
}

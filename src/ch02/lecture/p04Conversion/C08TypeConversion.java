package ch02.lecture.p04Conversion;

public class C08TypeConversion {
    public static void main(String[] args) {

        int a = 3;
        long b = 3L;

        //대입되는 값으로 변수의 타입 유추가 가능할 때. 타입명 대신 var 사용 가능
        var c = 3;
        var d = 3L;

        byte e = 1;
        byte f = 2;
        var g = e + f;

        //참조 타입
        var h = "hello";

    }
}

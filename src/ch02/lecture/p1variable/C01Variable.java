package ch02.lecture.p1variable;

public class C01Variable {
    public static void main(String[] args) {
        // 한 줄 주석 //
        /*
        여러 줄 주석
         */
        // ctrl + /
        System.out.println("hello");
        System.out.println("world");

//      변수 variable: 값을 저장하는 이름 있는 공간
//      타입 변수명
        int  a    = 10;

        System.out.println(a);
        a=20;
//        타입에 맞는 값만 넣을 수 있음 a=3.15 는 불가
        System.out.println(a);

//       정수를 저장할 수 있는 b라는 이름의 저장공간 생성
        int b;
//        System.out,println(b); 초기화되지 않은 변수를 사용할 수 없음
        b=3;
        System.out.println(b);

//       mission) 정수를 담을 수 있는 c변수를 선언하고 c에 100 넣고 출력
        int c=100;
        System.out.println(c);
    }
}

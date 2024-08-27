package ch06.lecture.p04constructor;

public class C01Constructor {
    public static void main(String[] args) {
        MyClass01 o = new MyClass01();
        System.out.println("어떤 main method codes");
        MyClass01 p = new MyClass01();
    }
}

class MyClass01 {
    // 필드

    //생성자 Constructor
    // : 객체가 처음 만들어질 때 해야하는 일들 작성
    //      -> 주로 필드 초기화

    // 생성자명 : 클래스명과 같다
    // () : 파라미터 목록
    // {} : 실행 코드 (주로 필드 초기화 코드)
    MyClass01() {
        System.out.println("to-do codes");
    }

    //메소드

}

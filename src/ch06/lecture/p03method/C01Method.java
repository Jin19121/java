package ch06.lecture.p03method;

public class C01Method {
    public static void main(String[] args) {
        MyClass01 a = new MyClass01();
        //메소드 실행
        //객체명.메소드명()
        a.on();
        a.off();
    }
}

class MyClass01 {
    // 필드

    // 기능에 대한 코드 작성
    // methods 작성
    public void on() {
        System.out.println("켜다");
    }

    public void off() {
        System.out.println("끄다");
    }
}
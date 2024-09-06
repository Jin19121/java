package ch13.lecture.p02method;

public class C01GenericMethod {
    public static void main(String[] args) {
        MyClass1 o = new MyClass1();
        o.<String>action1();
        o.<String>action2();
        String s = o.action2();
        Integer r1 = o.<Integer>action2();
        Integer r2 = o.action2();

        o.<String>action3("java");
        o.action3("java");

        o.<Double, Long>action4(3.14, 5L); //대입값을 통해 데이터형 유추 가능 -> 명시 하지 않아도 됨
        o.action4(3.14, 5L);
    }
}

class MyClass1 {

    //generic method: 타입 파라미터가 있는 메소드
    public <T> void action1() {
    }

    public <T> T action2() {//T 리턴 타입 결정
        return null;
    }

    public <T> void action(T param) {//T 파라미터 타입 결정
    }

    public <T, U> void action(T p1, U p2) {//T 파라미터 타입 결정
    }

    public <T> void action3(T param) {//T 리턴 타입, 파라미터 타입 결정
    }

    public <T, U> void action4(T p1, U p2) {
    }

    public <T> T action5(T p1) {
        return null;
    }
}
package ch09.lecture.p02nested;

public class C05FinalLocalVariable {
}

class MyClass5 {
    void some() {
        //local class에서 사용되는 local variable(지역 변수)는 final 이어야함
        //final 키워드 붙이지 않으면 effectively final
        final int a = 5;
        class Nested5 {
            void action() {
                System.out.println("a = " + a);
                //final 안 하면 코드가 끝나면 a가 사라짐
            }
        }
        Nested5 o = new Nested5();
        o.action();
    }
}
package ch16.lecture.p02method_reference;

public class C03InstanceMethod {
    MyClass3 o = new MyClass3();

    //instance method 호출
    // 객체명:: 메소드
    MyInterface31 a = x -> o.action(x);
    MyInterface31 b = o::action;

    MyInterface32 c = (s, t) -> o.action2(s, t);
    MyInterface32 d = o::action2;
}

class MyClass3 {
    void action(int x) {
        System.out.println(x);
    }

    void action2(String s, String t) {
        System.out.println(s + t);
    }
}

interface MyInterface31 {
    void method1(int x);
}

interface MyInterface32 {
    void some(String s, String t);
}

//709 710
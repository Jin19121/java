package ch06.lecture.p08access;

public class C01Access {
    public static void main(String[] args) {
        MyClass01 o = new MyClass01();
        o.method1();
//    o.method2(); private이 되면 외부 접근 불가
    }
}

class MyClass01 {
    //field
    //constructor
    //method
    void method1() {
        method2();
    }

    private void method2() {//접근 제한자
        System.out.println("something happens");
    }
}
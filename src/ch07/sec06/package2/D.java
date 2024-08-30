package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A {
//    private A;?? 갑자기 오류나서 없앴어
//    private D;

    public D() {
        super();
    }

    public void method1() {
        this.field = "value";
        this.method();
    }

    public void method2() {
//        A a = new A(); x
//        a.field = "value"; x
//        a.method(); x
        // 직접 객체를 생성해서 사용하는 것은 안된다. ???
    }
}


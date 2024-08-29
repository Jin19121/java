package ch07.lecture.p03polymorphism;

public class C04Polymorphism {
    public static void main(String[] args) {
        Child041 c41 = new Child041();
        c41.method1();
        c41.method041();

        Child042 c42 = new Child042();
        c42.method1();
        c42.method042();

        Parent04 p4 = c41;
        Parent04 p5 = c42;

        p4.method1();
//        p4.method41();
// 컴파일러 입장에서 p4를 Parent 타입으로 알고 있기 때문에 parent에 없는 메소드를 불러올 수 없다..

        p5.method1();
//        p5.method042(); x
    }
}


class Parent04 {
    public void method1() {
        System.out.println("Parent04.method1");
    }
}

class Child041 extends Parent04 {
    public void method041() {
        System.out.println("Child041.method041");
    }
}

class Child042 extends Parent04 {
    public void method042() {
        System.out.println("Child042.method042");
    }
}//310 311
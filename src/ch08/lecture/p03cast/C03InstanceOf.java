package ch08.lecture.p03cast;

public class C03InstanceOf {
    public static void main(String[] args) {
        MyInterface3 o = new Child3();
        System.out.println(o instanceof Child3);
        System.out.println(o instanceof Parent3);
        System.out.println(o instanceof MyInterface3);

        System.out.println();
        MyInterface3 p = new Parent3();
        System.out.println(p instanceof Child3);
        System.out.println(p instanceof Parent3);
        System.out.println(p instanceof MyInterface3);
    }
}


//@formatter:off
interface MyInterface3 {}
class Parent3 implements MyInterface3{}
class Child3 extends Parent3{}
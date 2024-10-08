package ch08.lecture.p01interface;

public class C02Interface {
    public static void main(String[] args) {
        MyClass11 o1 = new MyClass11();
        MyClass12 o2 = new MyClass12();

        MyInterface1 o3 = o1; //ok!
        MyInterface1 o4 = o2; //ok! (하위->상위 자동형변화와 동일)
    }
}

//interface: 여러 클래스의 객체를 하나의 타입으로 묶음

//@formatter:off
interface MyInterface1{}

//MyClass11이 MyInterface1을 구현(implement)
//구현 클래스(concrete class, 구상 클래스 ,구체 클래스)
class MyClass11 implements MyInterface1{}
class MyClass12 implements MyInterface1{}
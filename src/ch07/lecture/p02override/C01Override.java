package ch07.lecture.p02override;

public class C01Override {
    public static void main(String[] args) {
        Sub01 o = new Sub01();
        o.method1();
        o.method2();
    }
}

class Super01 {
    public void method1() {
        System.out.println("Super01.method1");
    }
}

class Sub01 extends Super01 {
    //상속받은 method1() 존재 -> 덮어쓰기(재정의) 가능
    public void method1() {
        System.out.println("Sub01.method1");
    }


    public void method2() {
        System.out.println("Sub01.method2");
    }
}
//296p
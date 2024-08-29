package ch07.lecture.p02override;

public class C02Override {
}

class Parent02 {
    public void method1() {
        System.out.println("Parent02.method1");
    }

    public void method2() {
        System.out.println("Parent02.method2");
    }
}

class Child02 extends Parent02 {
    @Override //Override annotation (재정의 표시): 했는지 안했는지 알려줌
    public void method1() {
        System.out.println("Child02.method");
    }

    //단축키: 상위 클래스 메소드명 일부 작성 || alt + insert
    @Override
    public void method2() {
        super.method2();
    }
}
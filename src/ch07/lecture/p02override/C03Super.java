package ch07.lecture.p02override;

public class C03Super {
    public static void main(String[] args) {
        Child03 c = new Child03();
        c.method1();
    }
}

class Parent03 {
    public void method1() {
        System.out.println("extremely long set of codes");
    }
}

class Child03 extends Parent03 {
    @Override
    public void method1() {
        //상위 클래스 멤버 접근할 수 있는 키워드
        super.method1(); // 부모클래스 지우고 수정x -> 보존 + 추가
        System.out.println("add another set of complex codes");
    }
}
//298, 299
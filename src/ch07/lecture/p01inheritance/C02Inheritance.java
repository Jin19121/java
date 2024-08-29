package ch07.lecture.p01inheritance;

public class C02Inheritance {
    public static void main(String[] args) {

    }
}

class ParentClass02 {
    private String name; //private: 같은 클래스 내에서만 사용 => 자식 클래스도 사용 불가
    private int age;

    ParentClass02(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class ChildClass02 extends ParentClass02 {
    ChildClass02(String name, int age) {
//        this.name = name; 부모 클래스 필드에 private이라 접근 불가
        //자식클래스 생성자에서는 꼭 부모클래스 생성자를 호출해서 필드 초기화를 해야한다.
        super(name, age);
    }

}
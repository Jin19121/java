package ch06.lecture.p04constructor;

public class C02Constructor {
    public static void main(String[] args) {
        MyClass02 o1 = new MyClass02();
        System.out.println(o1.age);
        System.out.println(o1.name);
    }
}

class MyClass02 {
    //필드
    int age;
    String name;

    MyClass02() {
        // 인스턴스 생성지 처음 해야 하는 일
        // 주로 필드 초기화 코드
        age = 1;
        name = "guest";
    }
}
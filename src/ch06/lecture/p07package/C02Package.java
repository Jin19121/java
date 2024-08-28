package ch06.lecture.p07package;

import ch06.lecture.p07package.package1.MyClass01;

public class C02Package {
    public static void main(String[] args) {
        //다른 패키지에 있는 클래스 사용 시 패키지명까지 명시
        ch06.lecture.p07package.package1.MyClass01 o1 = new MyClass01();
    }
}

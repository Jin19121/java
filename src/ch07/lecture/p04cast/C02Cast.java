package ch07.lecture.p04cast;

public class C02Cast {
    public static void main(String[] args) {
        Parent2 p = new Child21();
        Child21 c = (Child21) p; //강제 형변환 문제 없이 성공

        Parent2 q = new Child22();
        Child21 d = (Child21) q;
        //Child22 <-> Child21 강제 형변환 시킴.
        // 프로그램 종료될 수 있음. -> 안 종료시키는 방법 11장에서.

        System.out.println("프로그램 종료");
    }
}

//@formatter:off
class Parent2 {}
class Child21 extends Parent2{}
class Child22 extends Parent2{}
//313
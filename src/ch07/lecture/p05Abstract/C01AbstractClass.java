package ch07.lecture.p05Abstract;

public class C01AbstractClass {
    public static void main(String[] args) {
        Horse1 horse1 = new Horse1();
        horse1.walk();

        Bear1 bear1 = new Bear1();
        bear1.walk();

//        Mammal1 m1 = new Mammal1() -> 존재하지 않는 동물
    }
}

//abstract class: 인스턴스 생성하지 못하는 클래스
abstract class Mammal1 {
    public void walk() {
        System.out.println("걷다");
    }
}

class Horse1 extends Mammal1 {
    @Override
    public void walk() {
        System.out.println("말이 걷다.");
    }
}

class Bear1 extends Mammal1 {
    @Override
    public void walk() {
        System.out.println("곰이 걷다.");
    }
}
//327 328
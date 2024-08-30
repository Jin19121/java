package ch07.lecture.p06final;

public class C01FinalMethod {
}

class Fish1 {
    //final method: 자식 클래스에서 재정의 못함
    final public void breathe() {
        System.out.println("아가미 호흡");
    }

    public void swim() {
        System.out.println("헤엄");
    }
}

class Domi1 extends Fish1 {
//    @Override
//    public void breathe(){}

    @Override
    public void swim() {
        System.out.println("swim like a Domi");
    }
}

class tuna extends Fish1 {
    @Override
    public void swim() {
        System.out.println("swim like a Tuna");
    }
}

//302
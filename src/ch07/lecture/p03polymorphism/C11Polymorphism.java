package ch07.lecture.p03polymorphism;

public class C11Polymorphism {
    public static void main(String[] args) {
        Bear11 bear = getBear();
        bear.hunt();

        if (bear instanceof WhiteBear11 b) {
            b.swim(); //자식에만 있는 걸 작성하는 방법!
        }
    }

    public static Bear11 getBear() {
        double r = Math.random();
        if (r < 0.5) {
            return new BrownBear11();
        }
        return new WhiteBear11();
    }
}

class Bear11 {
    public void hunt() {
        System.out.println("사냥 중입니다.");
    }
}

//불곰
class BrownBear11 extends Bear11 {
    @Override
    public void hunt() {
        System.out.println("연어를 사냥합니다.");
    }
}

//북극백곰
class WhiteBear11 extends Bear11 {
    @Override
    public void hunt() {
        System.out.println("펭귄을 사냥합니다.");
    }

    public void swim() {
        System.out.println("바다를 헤엄칩니다.");
    }
}


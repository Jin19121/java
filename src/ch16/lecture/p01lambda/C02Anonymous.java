package ch16.lecture.p01lambda;

public class C02Anonymous {
    public static void main(String[] args) {
        //익명 클래스 객체 생성
        MyInterface2 o = new MyInterface2() {
            @Override
            public void someAction() {
                System.out.println("추상메소드 재정의");
            }
        };
        o.someAction();

        //람다식
        MyInterface2 p = //불피요 요소 생락
                () -> {
                    System.out.println("오버라이드 추상 메소드");
                };
        p.someAction();
    }
}

interface MyInterface2 {
    void someAction();
}
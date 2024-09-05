package ch09.lecture.p02nested;

public class C06Lambda {
    public static void main(String[] args) {
        int a = 5;
        MyInterface6 o = new MyInterface6() {
            @Override
            public void someAction() {
                System.out.println("a = " + a);
                //a = 7; x
                // local class에서 감싸고 있는 메소드의 지역변수(parameter)의 값을 변경할 수 없다.
            }
        };
        //effectively final 이어서 변경 불가
//        a = 8; x
        o.someAction();
    }
}

@FunctionalInterface
interface MyInterface6 {
    void someAction();
}

//407
package ch09.lecture.p01Anonymous;

public class C03Anonymous {
    public static void main(String[] args) {
        MyInterface3 o = new MyInterface3() {
            @Override
            public void someMethod() {
                System.out.println("재정의 메소드 blah");
            }
        };
        o.someMethod();
    }
}

interface MyInterface3 {
    //public abstract method
    void someMethod();
}
//419~421
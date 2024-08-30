package ch08.lecture.p01interface;

public class C03AbstractMethod {
    public static void main(String[] args) {
        MyInterface3 o = new MyClass3();
        o.someMethod();
        o.otherMethod();
        o.otherMethod2();
        o.otherMethod3();
    }
}


interface MyInterface3 {
    //인터페이스의 메소드는  public abstract method
    public abstract void someMethod();//아래와 같이 여러가지로 생략 가능

    abstract void otherMethod();

    public void otherMethod2();

    void otherMethod3();
}

class MyClass3 implements MyInterface3 {
    @Override
    public void someMethod() {

    }

    @Override
    public void otherMethod() {

    }

    @Override
    public void otherMethod2() {

    }

    @Override
    public void otherMethod3() {

    }
}

//378 379
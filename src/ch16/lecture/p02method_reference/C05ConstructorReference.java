package ch16.lecture.p02method_reference;

public class C05ConstructorReference {
    //생성자 참조
    MyInterface51 o = () -> new MyClass51();
    MyInterface51 p = MyClass51::new;

    MyInterface51 q = new MyInterface51() {
        @Override
        public void some() {
            new String();
        }
    };
    MyInterface51 r = String::new;

    MyInterface52 s = a -> new MyClass51(a);
    MyInterface52 t = MyClass51::new;

    MyInterface52 u = a -> new String(a);
    MyInterface52 v = String::new;
}

class MyClass51 {
    public MyClass51() {
    }

    public MyClass51(String a) {
    }
}

interface MyInterface51 {
    void some();
}

interface MyInterface52 {
    void some(String a);
}

//714 716
package ch13.lecture.p01generic;

public class C06TypeParameter {
    public static void main(String[] args) {
        MyClass6<String, Integer> box1 = new MyClass6<>();
        var box2 = new MyClass6<Double, Long>();

        box1.setItem1("java");
        box1.setItem3(500);

        box2.setItem1(3.14);
        box2.setItem3(999L);

        var item1 = box1.getItem1();
        Integer item3 = box1.getItem3();

        Double item5 = box2.getItem1();
        Long item7 = box2.getItem3();
    }
}

class MyClass6<T, U> { //T, U 사용할 때 결정
    private T item1;
    private T item2;
    private U item3;

    public T getItem1() {
        return item1;
    }

    public void setItem1(T item1) {
        this.item1 = item1;
    }

    public T getItem2() {
        return item2;
    }

    public void setItem2(T item2) {
        this.item2 = item2;
    }

    public U getItem3() {
        return item3;
    }

    public void setItem3(U item3) {
        this.item3 = item3;
    }
}

//575-576
package ch13.lecture.p03polymorphism;

public class C05Wildcard {
    public static void main(String[] args) {
        Box5<String> b1 = new Box5<String>();

        //만약 다음 코드가 되면
//        Box5<Object> b2 = new Box5<String>();

        //다음 코드도 되야 한다.
//        b2.setItem(new Object());

        //<?> : wildcard
        Box5<?> b2 = new Box5<String>();
        Box5<?> b4 = new Box5<Long>();
    }
}

class Box5<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
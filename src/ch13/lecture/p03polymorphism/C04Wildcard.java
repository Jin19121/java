package ch13.lecture.p03polymorphism;

public class C04Wildcard {
    public static void main(String[] args) {
        var b1 = new Box4<String>();
        var b2 = new Box4<Long>();
        var b3 = new Box4<Object>();

//        pirntItem(b1);
//        pirntItem(b2); //Box4<Long>은 Box4<Object>에 포함되지 않는다. 상속 관계 아님
        pirntItem(b3);
    }

    static void pirntItem(Box4<Object> p) {
        Object item = p.getItem();
        System.out.println("item = " + item);
    }
}

// wildcard: parameter, return에 사용됨
class Box4<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
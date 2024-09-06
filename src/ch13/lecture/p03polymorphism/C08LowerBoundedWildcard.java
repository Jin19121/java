package ch13.lecture.p03polymorphism;

public class C08LowerBoundedWildcard {
    public static void main(String[] args) {
        var b1 = new Box8<Number>();
        var b2 = new Box8<Object>();
        var b3 = new Box8<Long>();
        addItems(b1);
        addItems(b2);
//        addItems(b3); x 오히려 상위 타입만 가능
    }

    static void addItems(Box8<? super Number> box) {
        //값을 넣을 때(out)는 Lower Bounded Wildcard 사용
//        Object i1 = box.getItem();
//        Number i2 = box.getItem();//꺼낼 때 안됨. 넣는 건 안전하게 됨
        box.setItem(3);
        box.setItem(333L);
        box.setItem(3.14);
    }
}

class Box8<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
//책 내용 별로 도움 안됨

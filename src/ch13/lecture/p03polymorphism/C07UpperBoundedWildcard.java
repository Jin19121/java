package ch13.lecture.p03polymorphism;

public class C07UpperBoundedWildcard {
    public static void main(String[] args) {
        var b1 = new Box7<String>();
        var b2 = new Box7<Integer>();
        var b3 = new Box7<Long>();
        var b4 = new Box7<Double>();

//        printItem(b1);
        printItem(b2);
        printItem(b3);
        printItem(b4);
    }


    static void printItem(Box7<? extends Number> box7) { //?는 Number 혹은 그 상위타입
        //upper bounded wildcard: 꺼낸 값(in)을 특정 타입으로 결정하고 싶은 경우 사용
        Number item = box7.getItem();//Object -> Number. 안전하게 꺼낼 수 있음
        //하지만 넣는 건 안됨->lower : 다음 파일

        //상위 경계 타입의 메소드 안전하게 실행 가능
        item.doubleValue();
        item.longValue();
    }

}

class Box7<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

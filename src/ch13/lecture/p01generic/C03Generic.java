package ch13.lecture.p01generic;

public class C03Generic {
    public static void main(String[] args) {
        Container3<String> box1 = new Container3<String>();
        box1.setItem("java");
        String item1 = box1.getItem();

        Container3<Integer> box2 = new Container3<Integer>();
        box2.setItem(999);
        Integer item2 = box2.getItem();

        System.out.println("다음 실행 코드");
    }

}

// <>: 타입파라미터 generic type: 타입파라미터가 있는 타입(클래스, 인터ㅠㅔ이스
class Container3<T> { //임시로 T 설정. 나중에 정하기
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

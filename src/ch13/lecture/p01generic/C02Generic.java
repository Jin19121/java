package ch13.lecture.p01generic;

public class C02Generic {
    public static void main(String[] args) {
        Container2 box1 = new Container2();
        Container2 box2 = new Container2();
        box1.setItem("spring");
        box2.setItem(500); //넣는 건 ok

        //꺼내는 게 데이터형을 알 수 없음
        Object item1 = box1.getItem();
        Object item2 = box2.getItem();

        String s1 = (String) item1; //ok
        Integer se = (Integer) item2; //ok

        //mistake
        String s3 = (String) item2; //not ok
        // 강제 형변환. 프로그램 종료 위험

        System.out.println("다음 실행 코드들");

    }
}

class Container2 {
    private Object item;

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }
}
///ㅇ아ㅏ아ㅏㅏㄱ
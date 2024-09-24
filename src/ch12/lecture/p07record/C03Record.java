package ch12.lecture.p07record;

public class C03Record {
    public static void main(String[] args) {
        Book3 b1 = new Book3("java", 2000);
        b1.method1();

        System.out.println(b1);
    }
}

//equals, hashCode, toString 메소드는 이미 재정의되어있다.
record Book3(//이름만 레코드고 보통의 클래스와 거의 같다
             String title,
             int price
) {
    public void method1() {
        System.out.println("Book3.method1");
    }
}//508
package ch12.lecture.p07record;

public class C02Record {
    public static void main(String[] args) {
        Book2 b1 = new Book2("java", "shine", 3000);
        Book2 b2 = new Book2("git", "linus", 5000);
        Book2 b3 = new Book2("git", "linus", 5000);

        //getter에 get
        System.out.println(b1.title());
        System.out.println(b2.title());
        System.out.println(b3.title());

        //재정의 되어있음
        System.out.println(b1.toString());
        System.out.println(b2.hashCode());
        System.out.println(b3.hashCode());
        System.out.println(b2.equals(b3));
    }
}

record Book2(
        String title, //field처럼
        String author,
        int price
) {
}//메소드를 만들기 않아도 필드명과 동일한 메소드를 사용 가능 (단, 읽기 전용)

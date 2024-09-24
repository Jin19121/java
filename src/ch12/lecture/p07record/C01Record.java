package ch12.lecture.p07record;

//record 없을 적
public class C01Record {
    public static void main(String[] args) {
        Book1 b1 = new Book1("java", "shin", 3000);
        Book1 b2 = new Book1("git", "linus", 5000);
        Book1 b3 = new Book1("git", "linus", 5000);

        System.out.println(b1.getTitle());
        System.out.println(b2.getTitle());
        System.out.println(b3.getTitle());

        System.out.println(b1.toString());
        //toString 재정의 하지 않아서 원래값으로 나옴

        System.out.println(b2.hashCode());
        System.out.println(b3.hashCode());
        System.out.println(b2.equals(b3));
    }
}

class Book1 {
    private String title;
    private String author;
    private int price;

    //읽기 전용으로 만들 땐 - getter만 만들기. setter x
    //읽기 전용이 많아서 -> record 개발
    public Book1(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }
}

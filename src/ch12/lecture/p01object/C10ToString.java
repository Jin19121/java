package ch12.lecture.p01object;

public class C10ToString {
    public static void main(String[] args) {
        Book10 b1 = new Book10("this is java", 300, "shin");
        Book10 b2 = new Book10("git", 500, "linus");

        String r1 = b1.toString();
        String r2 = b1.toString();
        System.out.println("r1 : ");
        System.out.println(r1);
        System.out.println("r2 : ");
        System.out.println(r2);
    }
}

class Book10 {
    private String title;
    private int price;
    private String author;

    public Book10(String title, int price, String author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Bookex{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}


//506
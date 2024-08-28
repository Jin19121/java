package ch06.sec11;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("1234556-123456", "김석민");

        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        k1.name = "도겸";
        System.out.println(k1.name);

    }
}

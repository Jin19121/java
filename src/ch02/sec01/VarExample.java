package ch02.sec01;

public class VarExample {
    public static void main(String[] args) {
        String name = getData();
        var username = getData(); //981p
    }

    public static String getData() {
        return "홍길동";
    }

}

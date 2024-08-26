package ch05.sec05;

public class Replace {
    public static void main(String[] args) {
        String old = "자바 문자열은 불변입니다.";
        String newStr = old.replace("자바", "Java");

        System.out.println(old);
        System.out.println(newStr);
    }
}

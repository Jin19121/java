package ch02.lecture.p03string;

public class C03Print {
    public static void main(String[] args) {
        System.out.printf("형식 문자열 %s%n", "이름 등등");
        System.out.printf("형식 문자열 여러개 %s, %s%n", "첫", "둘");
        System.out.printf("형식 %10s%10s%n", "abc", "def"); //그 숫자만큼 띄어서
        System.out.printf("형식 %-10s%-10s%n", "abc", "def"); //좌측 정렬
    }
}

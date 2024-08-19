package ch02.lecture.p03string;

public class C03Print {
    public static void main(String[] args) {
        System.out.printf("형식 문자열 %s%n", "이름 등등");
        System.out.printf("형식 문자열 여러개 %s, %s%n", "첫", "둘");
        System.out.printf("형식 %10s%10s%n", "abc", "def"); //그 숫자만큼 띄어서
        System.out.printf("형식 %-10s%-10s%n%n", "abc", "def"); //좌측 정렬

        //%d 정수 (byte, short, int, long)
        System.out.printf("정수%d, %d%n", 345, 678);
        System.out.printf("정수%10d, %10d%n", 345, 678);
        System.out.printf("정수%-10d, %-10d%n", 345, 678);
        System.out.printf("정수%010d, %010d%n%n", 345, 678);

        //%f 실수 (float, double)
        System.out.printf("실수%f, %f%n", 3.45, 6.7812);
        System.out.printf("실수%10f, %10f%n", 3.45, 6.7812);
        System.out.printf("실수%-10f, %-10f%n", 3.45, 6.7812);
        System.out.printf("실수%010f, %010f%n", 3.45, 6.7812);
        System.out.printf("실수%010.1f, %010.3f%n", 3.45, 6.7812);
    }
}

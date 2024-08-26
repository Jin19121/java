package ch05.sec05;

public class IndexOfContains {
    public static void main(String[] args) {
        //165p
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로");
        System.out.println(location);
        String substring = subject.substring(location);
        System.out.println(substring);

        location = subject.indexOf("자바");
        if (location != -1) {
            System.out.println("자바와 관련");
        } else {
            System.out.println("자바 외");
        }

        boolean result = subject.contains("자바");
        if (result) {
            System.out.println("자바 관련");
        } else {
            System.out.println("자바 외");
        }
    }
}

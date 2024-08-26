package ch05.sec05;

public class Length {
    public static void main(String[] args) {
        //161p
        String ssn = "9806241230123";
        int length = ssn.length();
        if (length == 13) {
            System.out.println("주민등록 번호 일치");
        } else {
            System.out.println("주민등록 번호 불일치" +
                    "");
        }

    }
}

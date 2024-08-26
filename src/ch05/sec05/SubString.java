package ch05.sec05;

public class SubString {
    public static void main(String[] args) {
        //163p
        String ssn = "880815-1234567";

        String first = ssn.substring(0, 6);
        System.out.println(first);

        String last = ssn.substring(7);
        System.out.println(last);
    }
}

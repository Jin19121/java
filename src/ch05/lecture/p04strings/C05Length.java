package ch05.lecture.p04strings;

public class C05Length {
    public static void main(String[] args) {
        //length: 문자열 길이 리턴
        String a = "";//0
        String b = " ";//1
        String c = "a";
        String d = "abc";
        String e = " ab ";
        String f = "a b c";

        System.out.println(a.length());
        System.out.println(b.length());
        System.out.println(c.length());
        System.out.println(d.length());
        System.out.println(e.length());
        System.out.println(f.length());
    }
}

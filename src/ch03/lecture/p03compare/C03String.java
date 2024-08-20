package ch03.lecture.p03compare;

public class C03String {
    public static void main(String[] args) {
        String a = "abc";
        String b = "def";

        //크다, 작다 등의 비교 연산은 불가
        //System.out.println(a>b);

        //같다, 같지 않다는 가능, ※하지만 하면 안 됨.
        System.out.println(a == b);

        String c = "html";
        String d = "ht";
        String e = "ml";
        String f = d + e;

        System.out.println("c = " + c);
        System.out.println("f = " + f);
        System.out.println(c == f);
        System.out.println(c.equals(f));//5장에서 배울 예정
    }
}

package ch12.lecture.p01object;

public class C07Hashcode {
    public static void main(String[] args) {
        String a = "java";
        String b = "ja";
        String c = "va";
        String d = b + c;

        System.out.println(a.equals(d));
        System.out.println(a.hashCode());
        System.out.println(d.hashCode());//재정의(기본규칙)으로 인해 같은 해시코드가 나온다.

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(d));//재정의 없이 원래 기본 해시코드
    }
}
//502 503
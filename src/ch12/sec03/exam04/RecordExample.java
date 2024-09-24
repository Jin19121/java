package ch12.sec03.exam04;

public class RecordExample {
    public static void main(String[] args) {
        Member m = new Member("winter", "snowFlakes", 25);
        System.out.println(m.id());
        System.out.println(m.name());
        System.out.println(m.age());
        System.out.println(m.toString());
        System.out.println();

        Member m1 = new Member("winter", "snowFlakes", 25);
        System.out.println("m.hashCode() = " + m.hashCode());
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m.equals(m1) = " + m.equals(m1));
    }
}

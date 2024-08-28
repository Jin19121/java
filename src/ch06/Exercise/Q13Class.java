package ch06.Exercise;

public class Q13Class {
    public static void main(String[] args) {
        Member2 m1 = new Member2();
        Member2 m2 = new Member2();
        Member2 user1 = new Member2("홍길동", "hong");
        m1.name = "Lee";
        m2.name = "Kim";
        m1.age = 34;
        m2.age = 30;

        System.out.println(m1.name);
        System.out.println(m2.name);
        System.out.println(m1.age);
        System.out.println(m2.age);
        System.out.println(STR."이름은 \{user1.name}이고, 호는 \{user1.id}이올시다.");
    }

}



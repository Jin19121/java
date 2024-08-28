package ch06.Exercise;

public class Q13Access {
    public static void main(String[] args) {
        Member m1 = new Member();
        Member m2 = new Member();

        m1.setName("Happy");
        System.out.println(m1.getName());
        m2.getName();
    }

}



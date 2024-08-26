package ch05.lecture.p04strings;

public class C11Contains {
    public static void main(String[] args) {
        //contains: 특정 문자열이 있으면 true
        String s = "java programming language";
        boolean a = s.contains("java");
        System.out.println("a = " + a);

        boolean b = s.contains("pro");
        System.out.println("b = " + b);

        boolean c = s.contains("a");
        System.out.println("c = " + c);

        boolean d = s.contains("python");
        System.out.println("d = " + d);


    }
}
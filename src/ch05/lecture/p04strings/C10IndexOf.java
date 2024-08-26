package ch05.lecture.p04strings;

public class C10IndexOf {
    public static void main(String[] args) {
        //indexOf : 특정 문자열이 있는 위치(index) 리턴
        String s = "java programming language";
        int n1 = s.indexOf("java");
        System.out.println("n1 = " + n1);

        int n2 = s.indexOf("pro");
        System.out.println("n2 = " + n2);

        int n3 = s.indexOf("a");
        System.out.println("n3 = " + n3);

        int n4 = s.indexOf("python");
        System.out.println("n4 = " + n4);

        int n5 = s.indexOf("css");
        if (n5 == -1) {
            System.out.println("css 없음");
        } else {
            System.out.println("존재함");
        }
    }
}

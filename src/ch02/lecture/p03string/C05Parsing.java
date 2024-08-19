package ch02.lecture.p03string;

public class C05Parsing {
    public static void main(String[] args) {
        String a = "33"; //67p

        //문자열을 int로 변환 (파싱)
        int a1 = Integer.parseInt(a);

        int b = 2 * a1;
        System.out.println("b = " + b);


        String c = "3.14";
        double c1 = Double.parseDouble(c); //문자열을 double로 parsing
        double d = 5 + c1;
        System.out.println("d = " + d);
    }
}

package ch03.lecture.p02unary;

public class C04IncreaAndDecrease {
    public static void main(String[] args) {
        int a = 10;
        a++; //헷갈림 주의. 그냥 사용하지 말 것.
        System.out.println("a = " + a);//11

        int c = a++; // 사용 후 더함
        System.out.println("c = " + c);
        System.out.println("a = " + a);

        int d = ++a; //더한 후 사용
        System.out.println("d = " + d);
        System.out.println("a = " + a);


        System.out.println("-----------");
        //조금 덜 헷갈리는 사용법: 대입과 ++을 별개로 사용
        int e = 11;
        int f = e;
        e++;
        System.out.println("f = " + f);
        System.out.println("e = " + e);

        e++;
        int g = e;
        System.out.println("g = " + g);
        System.out.println("e = " + e);
    }
}

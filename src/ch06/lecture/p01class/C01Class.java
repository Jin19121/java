package ch06.lecture.p01class;

public class C01Class {
    public static void main(String[] args) {
        String a = new String("java");
        MyClass01 b = new MyClass01();//설계도 사용
        MyClass01 c = new MyClass01();//데이터 타입으로 설계도 이름 사용

        int codeA = System.identityHashCode(a);
        System.out.println("codeA = " + codeA);

        int codeB = System.identityHashCode(b);
        System.out.println("codeB = " + codeB);

        int codeC = System.identityHashCode(c);
        System.out.println("codeC = " + codeC);


    }
}

//class(설계도) 만들기
class MyClass01 {
//보통 하나의 파일에 하나의 클래스
}

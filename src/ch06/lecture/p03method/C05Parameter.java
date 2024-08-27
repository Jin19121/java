package ch06.lecture.p03method;

public class C05Parameter {
    public static void main(String[] args) {
        MyClass05 a = new MyClass05();
        a.method2(5); //아래에서 int로 선언. 선언되었던 타입의 데이터를 넣어야 함.
        a.method2(10);
        a.method2(99); //99 argument(인수), parameter

        int b = 999;
        a.method2(b);

        System.out.println();
        a.method3(28, "DK");
        a.method3(29, "Hoshi");
//        a.method3("강인", 22) ; 순서가 바뀌어도 안됨
    }
}

class MyClass05 {
    // () 파라미터(parameter, 인자, 매개변수) / argument (인수) 목록
    // 타입 파라미터명, 타입 파라미터명,.... : 쉼표를 통해 여러 파라미터 나열 가능
    public void method1(int age, String myName, int[] scores, String[] studentNames) {
        //변수 선언, 값 대입, 제어문, 연산식
    }

    public void method2(int age) {
        System.out.println("go-to code"); //age(파라미터) 초기화하지 않아도 사용 가능: 사용할 때 값을 넣는 게 필수
        System.out.println("age = " + age);
    }

    public void method3(int age, String name) {
        System.out.println(STR."\{age}세 \{name}님");
    }
}
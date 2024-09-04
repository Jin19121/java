package ch09.sec04.exam03;

public class AAA {
    //method
    public void method1(int arg) {//final int와 다름없다. 메소드 호출할 때 arg 값 꼭 명시해야
        //local variable
        int var = 1;

        //local class
        class B {
            //method
            void method2() {
                System.out.println("arg = " + arg);
                System.out.println("var = " + var);

                //local variable 수정 불가
//                arg = 2;
//                var = 2;
            }
        }

        //로컬 객체 생성
        B b = new B();
        //로컬 객체 메소드 호출
        b.method2();

        //로컬 변수 수정 불가
//         arg = 2;
//         var = 2;
    }
}

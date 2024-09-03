package ch16.lecture.p01lambda;

public class C06MethodBody {
    public static void main(String[] args) {
        MyInterface6 o = () -> {
            return 9;
        };
        int a = o.Method();
        System.out.println("a = " + a);

        //한 줄의 명령문이 리턴문이면 중괄호 생략 시 return 키워드도 생략
        MyInterface6 p = () -> 10;
        int b = p.Method();
        System.out.println("b = " + b);
    }
}

//추상 메소드에 리턴타입이 있을 때: 꼭 return문을 만나야
@FunctionalInterface
interface MyInterface6 {
    int Method();
}
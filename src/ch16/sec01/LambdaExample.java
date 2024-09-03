package ch16.sec01;

public class LambdaExample {
    public static void main(String[] args) {
        //익명 클래스 객체
        Calculable c = new Calculable() {
            @Override
            public void calculate(int x, int y) {
                System.out.println(x * y);
            }
        };
        //객체 참조값 전달
        action(c);

        //익명클래스 객체의 참조값 전달
        action((new Calculable() {
            @Override
            public void calculate(int x, int y) {
                System.out.println(x / y);
            }
        }));

        //람다 전달
        action((int x, int y) -> {
            System.out.println(x + y);
        });

        //지역변수와 함께 씀 (내용은 비슷한 듯?)
        action((x, y) -> {
            int result = x + y;
            System.out.println("result = " + result);
        });

        action((x, y) -> {
            int result = x - y;
            System.out.println("result = " + result);
        });
    }

    public static void action(Calculable calculable) {
        int x = 10;
        int y = 4;
        calculable.calculate(x, y);
    }


}
//쌤이 익명 클래스 버전으로 적은 것도 확인
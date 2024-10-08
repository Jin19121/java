package ch16.sec04;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        //실행문 두 개 이상
        person.action((x, y) -> {
            double result = x + y;
            return result;
        });

        //리턴문 1개 (연산식)
        person.action((x, y) -> {
            return (x + y);
        });

        //위 리턴문 생략하기
        person.action((x, y) -> (x + y));

        //리턴문 1개(메소드 호출)
        person.action((x, y) -> {
            return sum(x, y);
        });

        //생략
        person.action((x, y) -> sum(x, y));
    }

    public static double sum(double x, double y) {
        return (x + y);
    }
}

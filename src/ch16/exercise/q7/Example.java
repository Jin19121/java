package ch16.exercise.q7;

public class Example {
    private static int[] scores = {10, 50, 3};

    public static int maxOrMin(Operator operator) {
        int result = scores[0];
        for (int score : scores) {//scores의 요소 score
            result = operator.apply(result, score); //요소값 비교 (비교 기준 정해지지 않음)
        }
        return result;
    }

    public static void main(String[] args) {
        //비교기준 정하기
        int max = maxOrMin(Math::max);
        System.out.println("max = " + max);

        int min = maxOrMin((x, y) -> x > y ? y : x);
//int min = maxOrMin(Math::min);
        System.out.println("min = " + min);
    }
}

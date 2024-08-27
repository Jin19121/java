package ch06.sec08;

public class CalculatorExamExample {
    public static void main(String[] args) {
        CalculatorExam myCalc = new CalculatorExam();

        double result1 = myCalc.areaRectangle(10);

        double result2 = myCalc.areaRectangle(10, 20);

        System.out.println("정사각형 넓이: " + result1);
        System.out.println("직사각형 넓이: " + result2);
    }
}

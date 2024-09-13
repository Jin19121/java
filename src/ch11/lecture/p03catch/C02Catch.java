package ch11.lecture.p03catch;

public class C02Catch {
    public static void main(String[] args) {
        try {
            //...
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }


        try {
            //...
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        //상위타입
        try {
            //ArithmeticException
            //IndexOutOfBoundsException
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
//여러가지 상위 타입 더 있음
    }
}
//473 474
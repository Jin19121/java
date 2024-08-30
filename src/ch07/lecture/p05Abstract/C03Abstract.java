package ch07.lecture.p05Abstract;

import java.math.BigDecimal;

public class C03Abstract {
    public static void main(String[] args) {
        //Number n = new Number(); -> Number는 abstract class에 속해 있다

        Number n = new Integer(3);
        Number d = new Double(3.14);
        Number a = new BigDecimal("3.141592");

        double v = n.doubleValue();
        double v1 = d.doubleValue();
        double v2 = a.doubleValue();
    }
}
//330 331
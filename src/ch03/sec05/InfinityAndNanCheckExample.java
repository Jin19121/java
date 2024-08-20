package ch03.sec05;

public class InfinityAndNanCheckExample {
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;
        double z = x % y;
        System.out.println(z + 2);

        if (Double.isInfinite(z) || Double.isNaN(z)) {
            System.out.println("NA");
        } else {
            System.out.println(z + 2);
        }

        //-0.0
        double c = 0.0;
        double d = -0.0;
        System.out.println(c);
        System.out.println(d);
        System.out.println(3 / c);
        System.out.println(3 / d);
    }
}

package ch12.lecture.p02wrapper;

public class C07Wrapper {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 33;
        a[1] = 44;
        a[2] = 55;

        double[] b = new double[3];
        b[0] = 3.14;
        b[1] = 1;//ok

        Integer[] c = new Integer[3];
        c[0] = Integer.valueOf(300);
        c[1] = 500;

        Double[] d = new Double[3];
        d[0] = 3.14;
//        d[1] = 1; x 1이 Integer로 자동박싱 -> Integer가 Double에 속하지 않음

        Number[] e = new Number[3];
        e[0] = 3.14;
        e[1] = 1; // 상위타입 Number => Interger와 Double 둘 다 됨
    }
}

package ch04.lecture.p04for;

public class C06DecreaseGugudan {
    public static void main(String[] args) {
        for (int i = 9; i > 0; i--) {
            System.out.println();
            System.out.println(i + "단");
            for (int j = 1; j < 10; j++)
                System.out.println(i + "x" + j + "=" + i * j);
        }
    }
}

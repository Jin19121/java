package ch04.lecture.p04for;

public class C06OddGugudan {
    public static void main(String[] args) {
        //홀수단만 출력
        for (int i = 1; i < 10; i += 2) {
            System.out.println("--|" + i + "단|--");
            for (int j = 1; j < 10; j++)
                System.out.println(i + "x" + j + "=" + i * j);
        }
    }
}

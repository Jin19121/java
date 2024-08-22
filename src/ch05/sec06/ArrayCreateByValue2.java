package ch05.sec06;

public class ArrayCreateByValue2 {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[]{82, 90, 86};
        int sum1 = 0;
        for (int i = 0; i < 3; i++) {
            sum1 += scores[i];
        }
        System.out.println("all: " + sum1);

        printItem(new int[]{83, 90, 86});

    }

    public static void printItem(int[] scores) {//6장에서 다룰 예정
        for (int i = 0; i < 3; i++) {
            System.out.println(STR."score[\{i}]: \{scores[i]}");
        }

    }
}

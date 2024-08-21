package ch04.lecture.exercise;

public class Q04Break {
    public static void main(String[] args) {
        while (true) {
            int i = (int) (Math.random() * 6) + 1;
            int j = (int) (Math.random() * 6) + 1;
            System.out.println(STR."(\{i},\{j})");
            if (i + j == 5) {
                break;
            }
        }


    }
}

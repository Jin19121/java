package ch05.exercise;

public class Q07Array {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 9, 2};

        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("max = " + max);
    }
}

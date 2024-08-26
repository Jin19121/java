package ch05.exercise;

public class Q8 {
    public static void main(String[] args) {
        int sum = 0;
        int total = 0;
        double avg = 0.0;
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                total++;
            }
        }
        System.out.println(sum);

        avg = (double) sum / total;
        System.out.println((int) avg);
    }
}

package ch05.sec06;

public class ArrayCreateByValueList1 {
    public static void main(String[] args) {
        String[] season = {"Spring", "Summer", "Fall", "Winter"};

        System.out.println("seasons[0]: " + season[0]);
        System.out.println("seasons[1]: " + season[1]);
        System.out.println("seasons[2]: " + season[2]);
        System.out.println("seasons[3]: " + season[3]);

        season[1] = "여름";
        System.out.println("season[1]: " + season[1]);
        System.out.println();

        int[] scores = {92, 12, 23};

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += scores[i];
        }
        System.out.println("총합: " + sum);
        double avg = (double) sum / 3;
        System.out.println("평균: " + avg);
    }
}

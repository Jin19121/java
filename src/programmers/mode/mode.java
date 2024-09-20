package programmers.mode;

public class mode {
    public int solution(int[] array) {
        int no = 0;
        int max = 0;
        int maxMode = 0;
        if (array.length == 0) return -1;
        if (array.length == 1) return array[0];


        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                no++;

                if (max < no) {
                    max = no;
                    maxMode = array[i];
                } else if (max == no) {
                    return -1;
                }
            }
        }

        return maxMode;
    }
}

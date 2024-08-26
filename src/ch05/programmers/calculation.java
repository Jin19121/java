package ch05.programmers;

public class calculation {
    public int solution(String my_string) {
        String[] s = my_string.split(" ");

        int prev = Integer.parseInt(s[0]);
        for (int i = 1; i < s.length; i += 2) {
            String operator = s[i];

            switch (operator) {
                case "+" -> {
                    prev = prev + Integer.parseInt(s[i + 1]);
                }
                case "-" -> {
                    prev = prev - Integer.parseInt(s[i + 1]);
                }
            }
        }
        int answer = prev;
        return answer;
    }
}

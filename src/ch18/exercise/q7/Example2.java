package ch18.exercise.q7;

import java.io.BufferedReader;
import java.io.FileReader;

public class Example2 {
    private static int lineNo = 0;

    public static void main(String[] args) {
        String path = "src/ch18/exercise/q7/Example2.java";
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            try (fr; br) {
                br.lines()
                        .map(s -> "%4d : %s".formatted((++lineNo), s))
                        .forEach(System.out::println);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

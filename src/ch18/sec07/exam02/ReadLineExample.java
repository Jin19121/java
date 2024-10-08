package ch18.sec07.exam02;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLineExample {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
                new FileReader("src/ch18/sec07/exam02/ReadLineExample.java")
        );

        int lineNo = 1;
        while (true) {
            String str = br.readLine();//1행 읽음
            if (str == null) break;//읽을 String 없을 때 종료
            System.out.println(lineNo + "\t" + str);
            lineNo++;
        }
        br.close();
    }
}

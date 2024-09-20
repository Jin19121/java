package ch18.lecture.p5filter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class C03PrintWriter {
    public static void main(String[] args) throws IOException {
        String name = "C:/Temp/output53.txt";
        Writer writer = new FileWriter(name);
        writer.write("추석 연휴가 너무 짧아요.");
        writer.write("\n"); //write에는 줄바꿈 기능이 없어 기입해야 함
        writer.write("내년이 기대됩니다.\n");

        PrintWriter pw = new PrintWriter(writer);
        pw.println("설날 연휴가 기다려집니다.");//줄바꿈을 포함한 println 메소드
        pw.println("올해는 쉬는 날이 없어요.");

        writer.close();

    }
}
//809
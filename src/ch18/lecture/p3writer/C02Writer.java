package ch18.lecture.p3writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C02Writer {
    public static void main(String[] args) {
        String name = "C:/Temp/output32.txt";

        try {
            Writer writer = new FileWriter(name);
            try (writer) {
                writer.write('안');
                writer.write('녕');
                writer.write('A');
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
//795
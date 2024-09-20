package ch18.lecture.p3writer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C01Writer {
    public static void main(String[] args) {
        String name = "C:/Temp/output31.txt";
        try {
            OutputStream os = new FileOutputStream(name);
            try (os) {
                //unicode
                os.write(65); //A 1byte 쓰기
                os.write(66); //B
                os.write('C'); //1byte

                //utf-8
                os.write(236);
                os.write(149);
                os.write(136);
                //안

                os.write('안'); //2byte -> 1byte만 들어가면서 다른 문자로 변형됨
                //-> 문자를 쓰는 스트림 개발
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

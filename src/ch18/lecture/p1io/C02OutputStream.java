package ch18.lecture.p1io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C02OutputStream {
    public static void main(String[] args) throws IOException {
        String name = "C:/Temp/output2.txt";
        OutputStream os = new FileOutputStream(name);

        //int : 4byte -21억~21억
        //byte = 1byte -128~127억
        os.write(-128);
        os.write(201234567); //항상 int로 씌울 수 있는 것이 아니다.

    }
}

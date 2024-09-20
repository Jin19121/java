package ch18.lecture.p5filter;

import java.io.*;

public class C04Chain {
    public static void main(String[] args) throws IOException {
        String name = "C:/Temp/output54.txt";

        OutputStream os = new FileOutputStream(name);
        OutputStreamWriter osw = new OutputStreamWriter(os);
        PrintWriter pw = new PrintWriter(osw);

        pw.println("이제 os에 문자도 되고 프린트도 쓸 수 있당");

        // 참고로 try-with-resources 쓰면 close 신경 안 써도 됨
        pw.close();
        osw.close();
        os.close();
    }
}

package ch18.lecture.p2input;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class C05Copy {
    public static void main(String[] args) {
        String original = "C:/Temp/first.jpg";
        String target = "C:/Temp/first2.jpg";

        try {
            InputStream is = new FileInputStream(original);
            OutputStream os = new FileOutputStream(target);
            try (is; os;) {
                byte[] data = new byte[100]; //읽은 바이트 (데이터) 저장
                int len = 0; //읽은 바이트 수 저장
                while ((len = is.read(data)) != -1) { //읽고
                    os.write(data, 0, len); //쓰고 (복사) + 범위 지정을 통해 자투리 사용 x
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
//793
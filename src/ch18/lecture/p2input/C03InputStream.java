package ch18.lecture.p2input;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class C03InputStream { //다시 보기. 파일명도 이상해
    public static void main(String[] args) {
        String name = "C:/Temp/output6.txt"; //13byte

        try (InputStream is = new FileInputStream(name)) {
            byte[] data = new byte[5]; //길이가 5byte인 배열
            System.out.println(Arrays.toString(data)); ///0, 0, 0, 0, 0

            int r1 = is.read(data); //5
            System.out.println(Arrays.toString(data));

            int r2 = is.read(data); //5
            System.out.println(Arrays.toString(data));

            int r3 = is.read(data); //3 + 자투리
            System.out.println(Arrays.toString(data));

            int r4 = is.read(data); //-1

            System.out.println("r1 = " + r1);
            System.out.println("r2 = " + r2);
            System.out.println("r3 = " + r3);
            System.out.println("r4 = " + r4);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

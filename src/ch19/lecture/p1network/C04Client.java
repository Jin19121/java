package ch19.lecture.p1network;

import java.io.*;
import java.net.Socket;

//
public class C04Client {
    public static void main(String[] args) throws IOException {
        //server로 파일 보내기
        Socket socket = new Socket("172.30.1.20", 9999);

        try {
            OutputStream os = socket.getOutputStream();
            BufferedOutputStream bos = new BufferedOutputStream(os);

            String path = "C:/Temp/watch.jpg";
            FileInputStream fis = new FileInputStream(path);
            BufferedInputStream bis = new BufferedInputStream(fis);

            try (bis; fis; bos; os; socket;) {
                byte[] data = new byte[1000];
                int length = 0;

                while ((length = bis.read(data)) != -1) {
                    bos.write(data, 0, length);
                }
                bos.flush();
                System.out.println("파일 보내기 완료");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

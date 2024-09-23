package ch19.lecture.p1network;

import java.io.InputStream;
import java.net.Socket;

//1과 다른 컴퓨터로 가정
public class C01Computer2 {
    public static void main(String[] args) throws Exception {
        //client 서버에 연락하는 컴퓨터

        //Socket
        Socket socket = new Socket("172.30.1.83", 9999);

        InputStream is = socket.getInputStream(); //소켓에서 읽기
        try (is; socket) {
            int data = is.read();

            System.out.println((char) data);
        }
    }
}

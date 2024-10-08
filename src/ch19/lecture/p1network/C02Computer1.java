package ch19.lecture.p1network;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class C02Computer1 {
    public static void main(String[] args) throws Exception {
        //server
        ServerSocket serverSocket = new ServerSocket(9999);

        Socket socket = serverSocket.accept();//클라이언트 연결 기다림...

        OutputStream os = socket.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        try (bw; osw; os; socket; serverSocket) {
            bw.write("나 오늘 콘서트 티켓 온당!!");
            bw.flush();
        }
    }
}

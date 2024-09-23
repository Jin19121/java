package ch19.lecture.p1network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class C02Computer2 {
    public static void main(String[] args) throws Exception {
        //client
        Socket socket = new Socket("172.30.1.34", 9999);

        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        try (is; isr; br; socket) {
            String li = br.readLine();
            System.out.println("li = " + li);
        }
    }
}

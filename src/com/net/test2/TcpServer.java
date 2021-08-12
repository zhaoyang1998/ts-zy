package com.net.test2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

    public static void main(String[] args) throws IOException {

        //1 要有一个地址
        ServerSocket serverSocket = new ServerSocket(9999);

        while (true){
            //2 等待客户端连接
            Socket socket=serverSocket.accept();

            //3读取客户端消息
            InputStream is = socket.getInputStream();

            //管道流
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer))!=-1){
                baos.write(buffer,0,len);
            }
            System.out.println(baos.toString());
        }
    }
}

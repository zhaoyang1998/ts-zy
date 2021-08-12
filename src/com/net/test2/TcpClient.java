package com.net.test2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {
    public static void main(String[] args) throws IOException {
        //1。 知道服务器地址
        InetAddress localHost = InetAddress.getLocalHost();

        int port = 9999;

        //2创建一个socket连接
        Socket socket = new Socket(localHost,port);

        //3发送消息
        OutputStream os = socket.getOutputStream();

        os.write("你好".getBytes());

    }
}

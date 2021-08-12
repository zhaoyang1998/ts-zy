package com.net.testudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpServer01 {
    public static void main(String[] args) throws IOException {

        //开放端口
        DatagramSocket socket = new DatagramSocket(9090);

        //接受数据包
        byte[] bytes = new byte[10240];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, 0, bytes.length);

        socket.receive(datagramPacket);

        System.out.println(datagramPacket.getAddress().getHostAddress());
        System.out.println(new String(datagramPacket.getData()));
        socket.close();
    }
}

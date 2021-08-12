package com.net.testudp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpCilentDemo1 {
    public static void main(String[] args) throws Exception {

        //1 建立一个包
        DatagramSocket socke = new DatagramSocket();

        //2 建个包
        String msg = "你好呀服务器";

        //发送给谁
        InetAddress localHost = InetAddress.getLocalHost();
        int port = 9090;
        DatagramPacket datagramPacket = new DatagramPacket(msg.getBytes(), 0, msg.getBytes().length,localHost,port);

        //3 发送包
        socke.send(datagramPacket);


        socke.close();

    }
}

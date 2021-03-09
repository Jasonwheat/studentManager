package com.net;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class udpSend {
    public static void main(String[] args) throws IOException {
        //创建发送端的Socket对象
        DatagramSocket ds = new DatagramSocket();
        //创建数据，并把数据打包
        byte[] bys = "hello,udp!".getBytes();
        int length = bys.length;
        InetAddress address = InetAddress.getByName("DESKTOP-WYB");
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bys,length,address,port);
        //调用DatagramSocket对象的方法发送数据
        ds.send(dp);
        //关闭发送端
        ds.close();

    }
}

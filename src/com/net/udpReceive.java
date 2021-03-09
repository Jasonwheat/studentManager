package com.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class udpReceive {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);

        byte[] bys= new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys, bys.length);

        ds.receive(dp);

//        //返回数据缓冲区
//        byte[] datas = dp.getData();
//        //返回实际数据长度
//        int len = dp.getLength();
//        String dataString = new String(datas,0,len);
//        System.out.println(dataString);
        System.out.println(new String(dp.getData(),0,dp.getLength()));

        ds.close();

    }
}

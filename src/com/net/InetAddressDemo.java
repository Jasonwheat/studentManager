package com.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("DESKTOP-WYB");

        String hostName = address.getHostName();

        String ip = address.getHostAddress();

        System.out.println(hostName);
        System.out.println(ip);
    }
}

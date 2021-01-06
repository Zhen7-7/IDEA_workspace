package com.sunzhen.inet;

import java.net.InetAddress;
import java.net.InetSocketAddress;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/17 - 11 - 17 - 13:57
 * @Description: com.sunzhen.inet
 * @version: 1.0
 */
public class Test_InetSocketAddress {
    public static void main(String[] args) {
        //InetSocketAddress -->对IP和端口号(port)进行封装
        InetSocketAddress isa = new InetSocketAddress("10.4.156.182", 8080);
        System.out.println(isa);
        System.out.println(isa.getHostName());
        System.out.println(isa.getPort());

        InetAddress ia = isa.getAddress();
        System.out.println(ia.getHostName());
        System.out.println(ia.getHostAddress());
    }
}

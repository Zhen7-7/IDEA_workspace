package com.sunzhen.UDP;

import java.io.IOException;
import java.net.*;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/18 - 11 - 18 - 9:13
 * @Description: com.sunzhen.UDP
 * @version: 1.0
 */
public class Send {
    public static void main(String[] args) throws IOException {
        System.out.println("学生上线了!");
        //准备套接字,指定发送方的端口号:
        DatagramSocket ds = new DatagramSocket(8888);
        //准备数据包:
        String str = "老师,你好";
        byte[] bytes = str.getBytes();
        DatagramPacket  dp = new DatagramPacket(bytes,bytes.length, InetAddress.getByName("localhost"),9999);
        ds.send(dp);

        byte[] b= new byte[1024];
        DatagramPacket dp1 = new DatagramPacket(b,b.length);

        ds.receive(dp1);
        byte[] data = dp1.getData();
        String s = new String (data,0,data.length);
        System.out.println("老师说:"+s);




        //关闭资源
        ds.close();
    }
}

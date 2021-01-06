package com.sunzhen.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/18 - 11 - 18 - 9:21
 * @Description: com.sunzhen.UDP
 * @version: 1.0
 */
public class Receive {
    public static void main(String[] args) throws IOException {
        System.out.println("老师上线了!");
        //准备套接字:定义接收方的端口号:
        DatagramSocket ds = new DatagramSocket(9999);
        //接收数据
        byte[] b =new  byte[1024];
        DatagramPacket dp = new DatagramPacket(b,b.length);

        //接收对方的包,放在我们准备的数据包进行填充:
        ds.receive(dp);
        //取出数据:
        byte[] data = dp.getData();
        String s = new String (data,0,data.length);
        System.out.println("学生说:"+s);

        String str  = "你好";
        byte[] bytes = str.getBytes();
        DatagramPacket dp1 = new DatagramPacket(bytes,bytes.length, InetAddress.getByName("localhost"),8888);
        ds.send(dp1);

        //关闭网络资源
        ds.close();

    }
}

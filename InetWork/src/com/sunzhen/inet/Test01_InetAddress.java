package com.sunzhen.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/17 - 11 - 17 - 13:38
 * @Description: com.sunzhen.inet
 * @version: 1.0
 */
public class Test01_InetAddress {
    public static void main(String[] args) throws UnknownHostException {
        //InetAddress 的类没有修饰符默认是default 所以在不同包内不能直接创建对象
        //InetAddress ia = new InetAddress("10.4.156.182");错误

        //那么如何去创建?
        InetAddress ia = InetAddress.getByName("10.4.156.182");
        System.out.println(ia);
        //localhost 表示本机ip
        InetAddress ia2 = InetAddress.getByName("localhost");
        System.out.println(ia2);
        // 127.0.0.1 就是表示本机IP地址
        InetAddress ia3 = InetAddress.getByName("127.0.0.1");
        System.out.println(ia3);
        //对计算机名称进行封装:
        InetAddress ia5 = InetAddress.getByName("DESKTOP-OBL6ILN");
        System.out.println(ia5);
        //对域名进行封装
        InetAddress ia6 = InetAddress.getByName("www.baidu.com");
        System.out.println(ia6);
        //InetAddress ia7 = InetAddress.getByName("www.sunzhen.com");
        //System.out.println(ia7);
        System.out.println(ia6.getHostName());
        System.out.println(ia6.getHostAddress());

    }
}

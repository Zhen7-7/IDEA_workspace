package com.sunzhen.log;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/17 - 11 - 17 - 15:42
 * @Description: com.sunzhen.log
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) throws IOException {
        // 创建套接字:指定服务器ip,端口号
        Socket s = new Socket("10.4.156.182", 8888);
        //从键盘键入用户名和密码封装成对象
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String pwd = sc.next();
        User user = new User(name,pwd);
        //发送数据:
        ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
        oos.writeObject(user);
        //接收反馈:
        DataInputStream dis = new DataInputStream(s.getInputStream());
        System.out.println(dis.readUTF());
        //关闭流+网络资源
        oos.close();
        dis.close();
        s.close();
    }
}

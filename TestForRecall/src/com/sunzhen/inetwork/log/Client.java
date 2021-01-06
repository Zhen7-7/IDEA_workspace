package com.sunzhen.inetwork.log;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/19 - 11 - 19 - 18:47
 * @Description: com.sunzhen.inetwork
 * @version: 1.0
 */
public class Client  {
    public static void main(String[] args) throws IOException {
        //使用套接字:
        Socket s = new Socket("localhost",8888);
        ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());

        //用户输入用户名和密码:
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String name = sc.next();
        System.out.println("请输入密码:");
        String pwd = sc.next();
        User user = new User(name, pwd);
        oos.writeObject(user);

        //接收反馈:
        String str = dis.readUTF();
        System.out.println(str);



        //关闭流+网络资源
        dis.close();
        oos.close();
        s.close();

    }
}

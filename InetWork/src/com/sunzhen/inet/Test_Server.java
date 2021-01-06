package com.sunzhen.inet;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/17 - 11 - 17 - 14:39
 * @Description: com.sunzhen.inet
 * @version: 1.0
 */
public class Test_Server {
    public static void main(String[] args) throws IOException {
        //1.创建套接字:指定服务器端口号:
        ServerSocket ss = new ServerSocket(8888);
        //2.等待客户端发来信息
        Socket s = ss.accept();//阻塞方法:等待接受客户端数据,什么时候接收到数据,什么时候向下进行:
        //accept的方法返回值的是一个Socket,这个socket其实就是客户端的Socket
        //接收到这个Socket,客户端和服务器才真正产生连接,才可以正常的通信
        //3.收到的流操作:
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);

        String str = dis.readUTF();
        System.out.println(str);

        //增加功能:服务器回话:-->操作流程-->输出流
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("哈喽,我收到了你消息");


        //4.关闭流,关闭网络资源
        dis.close();
        //is.close();
        dos.close();
        s.close();
        ss.close();


    }
}

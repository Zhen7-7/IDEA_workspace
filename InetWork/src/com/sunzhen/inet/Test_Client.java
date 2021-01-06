package com.sunzhen.inet;

import java.io.*;
import java.net.Socket;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/17 - 11 - 17 - 14:31
 * @Description: com.sunzhen.inet
 * @version: 1.0
 */
public class Test_Client {
    public static void main(String[] args) throws IOException {
        //获取 套接字(服务器地址,端口号)
        Socket s = new Socket("10.4.156.182", 8888);
        //用 Socket的对象去创造输出流:
        OutputStream os = s.getOutputStream();
        //OutputStream 的对象 os 的write方法中没有可以输出字符串
        //所以我们需要一个强化流去套在os上
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("沃日你大坝");

        //增加功能: 接收服务器的回话-->流操作-->输入流

        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        System.out.println("服务器说:"+dis.readUTF());

        //关闭流
        dos.close();
        os.close();//可以不写,只需关闭高级流即可
        dis.close();
        s.close();



    }
}

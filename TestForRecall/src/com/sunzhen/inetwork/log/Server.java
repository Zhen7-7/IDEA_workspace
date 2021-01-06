package com.sunzhen.inetwork.log;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/19 - 11 - 19 - 19:07
 * @Description: com.sunzhen.inetwork.log
 * @version: 1.0
 */
public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket ss = new ServerSocket(8888);
        Socket s = ss.accept();//阻塞方法
        ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        Object obj = ois.readObject();
        User user = (User)obj;
        if("root".equals( user.getName()) && "root".equals(user.getPwd())){
            dos.writeUTF("登陆成功!");
        }else{
            dos.writeUTF("用户名或者密码不正确!");
        }


        //关闭流+网络资源:
        ois.close();
        dos.close();
        s.close();
        ss.close();
    }
}

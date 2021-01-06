package com.sunzhen.log;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/17 - 11 - 17 - 15:54
 * @Description: com.sunzhen.log
 * @version: 1.0
 */
public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1.创建套接字,指定端口:
        ServerSocket ss = new ServerSocket(8888);
        //2.接收客户端信息:
        Socket s = ss.accept();

        //3.接收操作流程:
        ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
        //Object o = ois.readObject();
        User user = (User)ois.readObject();

        //服务器给予回复:
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        if("孙朕".equals(user.getName())&&"161600".equals(user.getPwd())){
            dos.writeUTF("LAND SUCCESSFULLY!");
        }else{
            dos.writeUTF("THE NAME OR PASSWORD IS INCORRECT");
        }

        //4.关闭流+网络资源
        ois.close();
        dos.close();
        s.close();
        ss.close();


    }
}

package com.sunzhen.IOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/15 - 11 - 15 - 19:50
 * @Description: com.sunzhen.IOStream
 * @version: 1.0
 */
public class Test4 {
    public static void main(String[] args) throws IOException {
        //1.创建File对象
        File f = new File("E:"+File.separator+"表白.png");
        //2.插管
        FileInputStream fi = new FileInputStream(f);

        //3.操作
        //一个一个字节得读
        /*int n = fi.read();
        int count=0;//设置计数器
        while (n!=-1){
            count++;
            System.out.print(n);
            n = fi.read();
        }
        System.out.println();
        System.out.println("一共占"+count+"字节");*/
        //二.利用缓冲区
        byte[] bytes = new byte[1024];
        int len = fi.read(bytes);
        int count =0;
        while (len!=-1){
            count++;
            for (int i =0;i<len;i++){
                System.out.print(bytes[i]);
            }
            len = fi.read(bytes);
        }
        System.out.println("\n"+count);

        //4.关闭
        fi.close();
    }
}

package com.sunzhen.IOStream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/15 - 11 - 15 - 14:07
 * @Description: com.sunzhen.IOStream
 * @version: 1.0
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        //文件-->程序
        //1.有一个文件-->创建File对象
        File f = new File("E:\\Test.txt");

        //2.利用FileReader这个(字符)流,将这个管子怼到源文件上去:
        FileReader fr = new FileReader(f);
        //3.进行"吸"的动作-->读取动作
        int n1 = fr.read();
        int n2 = fr.read();
        int n3 = fr.read();
        int n4 = fr.read();
        int n5 = fr.read();
        int n6 = fr.read();
        int n7 = fr.read();
        int n8 = fr.read();
        int n9 = fr.read();
        System.out.print(n1);
        System.out.print(n2);
        System.out.print(n3);
        System.out.print(n4);

        System.out.print((char)n1);
        System.out.print((char)n2);
        System.out.print((char)n3);
        System.out.print((char)n4);
        System.out.println();
        //方式1.
        /*int n=fr.read();
        while(n!=-1){
            System.out.print((char)n);
            n=fr.read();
        }*/
        //方式2:
        int m = -1;
        while((m=fr.read())!=-1){
            System.out.print((char)m);
        }
        //4.拔管-->关闭流
        fr.close();
    }
}

package com.sunzhen.IOStream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/15 - 11 - 15 - 14:32
 * @Description: com.sunzhen.IOStream
 * @version: 1.0
 */
public class Test3 {
    public static void main(String[] args) {
        //通过字符流进行文件的复制
        //1.创建源和目标文件
        File sf = new File("E:\\Test.txt");
        File af = new File("E:\\Test1.txt");
        //2.使用流:
        FileReader fr = null;//必须提前进行初始化,
        FileWriter fw = null;
        try {
            fr = new FileReader(sf);
            fw = new FileWriter(af,true);
            //1.一个字符一个字符去写入:
            /*int n = -1;
            while((n=fr.read())!=-1){
                fw.write((char)n);
            }*/
            //2.定义缓冲字符数组
            /*char[] ch = new char[5];
            int len = fr.read(ch);
            while (len!=-1){
                fw.write(ch,0,len);将数组的有效长度取出
                len = fr.read(ch);
            }*/
            char[] ch = new char[5];
            int len = fr.read(ch);
            while(len!=-1){
                String str = new String(ch,0,len);
                fw.write(str);
                len = fr.read(ch);
            }

            //3.定义缓冲区转换成String类型写入





        //进行操作:
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            //4.关闭流:
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }




    }
}

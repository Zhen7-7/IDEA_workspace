package com.sunzhen.IOStream;

import java.io.*;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/16 - 11 - 16 - 13:23
 * @Description: com.sunzhen.IOStream
 * @version: 1.0
 */
public class Test_InputStreamReader_Writer {
    public static void main(String[] args) throws IOException {
        File sf = new File("E:\\Test.txt");
        File af = new File ("E:\\Demo.txt");
        //输入方向:
        FileInputStream fis = new FileInputStream(sf);
        InputStreamReader isr = new InputStreamReader(fis,"utf-8");
        //输出方向:
        FileOutputStream fos = new FileOutputStream(af);
        OutputStreamWriter osw = new OutputStreamWriter(fos,"gbk");

        char[] ch =new char[10];
        int len = isr.read(ch);
        while (len!=-1){
            osw.write(ch,0,len);
            len = isr.read(ch);
        }


        osw.close();
        isr.close();
    }
}

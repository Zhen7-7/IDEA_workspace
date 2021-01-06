package com.sunzhen.IOStream;

import java.io.*;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/16 - 11 - 16 - 11:00
 * @Description: com.sunzhen.IOStream
 * @version: 1.0
 */
public class Test_BufferRW {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader(new File("E:\\Test.txt"));
        FileWriter fw = new FileWriter(new File("E:\\copy.txt"));
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);

        //1.一个一个复制;
        /*int n = br.read();
        while(n!=-1){
            bw.write(n);
            n = br.read();
        }*/
        //2.利用缓冲数组
        char[] chars = new char[5];
        int len = br.read(chars);
        while (len!=-1){
            bw.write(chars,0,len);
            len = br.read(chars);
        }
        //3.String
        /*String str = br.readLine();
        while (str!=null){
            bw.write(str);
            bw.newLine();
            str = br.readLine();
        }*/


        //逆流关闭,关闭高级流即可

        bw.close();
        br.close();

    }
}


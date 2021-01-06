package com.sunzhen.IOStream;

import java.io.*;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/15 - 11 - 15 - 20:15
 * @Description: com.sunzhen.IOStream
 * @version: 1.0
 */
public class Test_CopyPicture {
    public static void main(String[] args) {
        //选择FileInputStream和FileOutputStream    因为传输的内容义字节为单位
        File sf = new File("E:\\biaobai.png");
        File af = new File("E:\\sunzhen.png");
        FileInputStream fi = null;
        FileOutputStream fo = null;
        try {
            fi = new FileInputStream(sf);
            fo = new FileOutputStream(af);
            //1.使用单个字节去存储:
            /*int  n = fi.read();
            while (n!=-1) {
                fo.write(n);
                n = fi.read();
            }*/
            //2.利用缓冲数组
            byte[] bytes = new byte[1024*10];
            int len=fi.read(bytes);
            while(len!=-1) {
                fo.write(bytes,0,len);
                len = fi.read(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fi!=null)
                    fi.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fo!=null)
                    fo.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

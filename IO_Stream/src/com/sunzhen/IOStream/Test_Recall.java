package com.sunzhen.IOStream;

import java.io.*;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/16 - 11 - 16 - 10:19
 * @Description: com.sunzhen.IOStream
 * @version: 1.0
 */
public class Test_Recall {
    public static void main(String[] args) {
        /*File sf = new File("E:\\Test.txt");
        File af = new File("E:\\copy.txt");
        CopyByChars(sf,af);*/
        File f1 = new File ("E:\\biaobai.png");
        File f2 = new File ("E:\\copy.png");
        CopyByByte(f1,f2);
    }
    static void CopyByChars(File sf, File af){
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(sf);
            fw = new FileWriter(af);
            //进行对文本文件的复制操作:
            //1.一个字符一个字符地复制
            int n = fr.read();
            long st1 = System.currentTimeMillis();
            while(n!=-1){
                fw.write(n);
                n=fr.read();
            }
            long et1 = System.currentTimeMillis();
            System.out.println(et1-st1);
            /*//2.利用缓存数组:
            char[] chars = new char[10];
            int len = fr.read(chars);
            long st2 = System.currentTimeMillis();
            while(len!=-1){
                String str = new String (chars,0,len);
                fw.write(str);
                len = fr.read(chars);
            }
            long et2 = System.currentTimeMillis();
            System.out.println(et2-st2);*/
        } catch (IOException e) {
            e.printStackTrace();
        }finally {//逆流关闭
            try {
                if (fw!=null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fr!=null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
    static void CopyByByte(File sf,File af){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(sf);
            fos = new FileOutputStream(af);
            //为文件提供复制功能:
            //1.单个字节进行复制
          /*  int n =fis.read();
            long st1 = System.currentTimeMillis();
            while (n!=-1){
                fos.write(n);
                n=fis.read();
            }
            long et1 = System.currentTimeMillis();
            System.out.println(et1-st1);*/
            //2.提供缓冲数组:
            byte[] bytes = new byte[5];
            int len = fis.read(bytes);
            long st2 = System.currentTimeMillis();
            while(len!=-1){
                fos.write(bytes,0,len);
                len = fis.read(bytes);
            }
            long et2 = System.currentTimeMillis();
            System.out.println(et2-st2);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

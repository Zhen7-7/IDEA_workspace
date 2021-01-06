package com.sunzhen.IOStream;

import java.io.*;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/16 - 11 - 16 - 12:18
 * @Description: com.sunzhen.IOStream
 * @version: 1.0
 */
public class Test_Bufferedin_out {
    public static void main(String[] args) {
        File sf = new File("E:\\biaobai.png");
        File af = new File("e:\\copy.png");
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis=null;
        BufferedOutputStream bos = null;

        try {
            fis=new FileInputStream(sf);
            fos=new FileOutputStream(af);
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            //1.一个一个复制
            /*int n = bis.read();
            while (n!=-1){
                bos.write(n);
                n= bis.read();
            }*/
            //2.利用缓存数组:
            byte[] b = new byte[1024];
            int len = bis.read(b);
            while (len!=-1){
                bos.write(b,0,len);
                len = bis.read(b);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                if (bos!=null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(bis!=null)
                    bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}

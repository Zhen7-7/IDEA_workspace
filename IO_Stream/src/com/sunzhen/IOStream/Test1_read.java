package com.sunzhen.IOStream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/15 - 11 - 15 - 16:06
 * @Description: com.sunzhen.IOStream
 * @version: 1.0
 */
public class Test1_read {
    public static void main(String[] args) {
        File f = new File("E:\\test.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(f);
            //创造一个小车:小车一次拉五个
            //1.输出这个实数组
            char[]ch = new char[5];
            int len = fr.read(ch);

            while (len!=-1){
//                for (int i=0;i<len;i++){
//                    System.out.print(ch[i]);
                String str =  new String(ch,0,len);
                System.out.print(str);
                len = fr.read(ch);
                }
                len=fr.read(ch);





        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

package com.sunzhen.IOStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/15 - 11 - 15 - 14:19
 * @Description: com.sunzhen.IOStream
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        //一个字符一个字符往外输出
        //1.创建File对象
        File file = new File("E:\\Test.txt");



        //2.打开流
        //FileWriter fw = new FileWriter(file);//默认对文件进行覆盖,而且不可逆
        FileWriter fw = new FileWriter(file,true);
        //将构造方法的boolean append 置为true,就不会覆盖

        //3.操作  逐个字符写入
        /*String str = "Hello World";
        for (int i=0;i<str.length();i++){
            fw.write(str.charAt(i));
        }*/
        //利用缓冲数组:
        String str = "我爱你中国";
        char[] chars = str.toCharArray();
        fw.write(chars);
        //4.关闭流
        fw.close();
    }
}

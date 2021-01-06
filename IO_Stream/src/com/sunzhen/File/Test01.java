package com.sunzhen.File;

import java.io.File;
import java.io.IOException;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/15 - 11 - 15 - 13:14
 * @Description: com.sunzhen.File
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        File f = new File("e:"+File.separator+"Test.txt");
        File f1 = new File("E:\\Test.txt");
        File f2 = new File("e:/Test.txt");
        //File.separator会帮助我们获取当前操作系统的分隔符
        //windows,dos中的默认"\"作为路径分隔符,在unix,url中,使用"/"用作分隔符
        File f3 = new File("E:"+File.separator+"Test.txt");//建议使用这个

        //常用方法:
        System.out.println("文件是否可读:"+f.canWrite());
        System.out.println("文件是否可写:"+f.canRead());
        System.out.println("文件的名子"+f.getName());
        System.out.println("上级目录:"+f.getParent());
        System.out.println("是否是一个目录"+f.isDirectory());
        System.out.println("是否为一个文件"+f.isFile());
        System.out.println("是否隐藏"+f.isHidden());
        System.out.println("文件的大小"+f.length());
        System.out.println("是否存在"+f.exists());
        if(f.exists()){
            System.out.println("删除文件:"+f.delete());

        }else{
            try {
                System.out.println("创建文件"+f.createNewFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("___________________________");
        //与路径相关:
        System.out.println("绝对路径"+f.getAbsolutePath());
        System.out.println("相对路径"+f.getPath());
        System.out.println("toString"+f.toString());
        System.out.println("---------------------------");
        File f4 = new File("demo.txt");
        try {
            f4.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("绝对路径"+f4.getAbsolutePath());
        System.out.println("相对路径"+f4.getPath());
        System.out.println("toString"+f4.toString());
        //toString 永远=相对路径;




    }
}

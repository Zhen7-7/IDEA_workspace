package com.sunzhen.File;

import java.io.File;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/15 - 11 - 15 - 13:37
 * @Description: com.sunzhen.File
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        File d = new File ("e:"+File.separator+"dir"+File.separator+"d");
        System.out.println("文件是否可读:"+d.canWrite());
        System.out.println("文件是否可写:"+d.canRead());
        System.out.println("文件的名子"+d.getName());
        System.out.println("上级目录:"+d.getParent());
        System.out.println("是否是一个目录"+d.isDirectory());
        System.out.println("是否为一个文件"+d.isFile());
        System.out.println("是否隐藏"+d.isHidden());
        System.out.println("文件的大小"+d.length());
        System.out.println("是否存在"+d.exists());
        if (d.exists()){
            System.out.println(d.getAbsolutePath());
        }else{
            System.out.println(d.mkdirs());
        }
        System.out.println("-----------------------------");
        File f = new File("E:\\import");
        //目录的遍历
        //紧紧对名字遍历:
        String[] str =  f.list();//文件夹下面的目录/文件的名字名字名字的数组
        for (String str1 :  str){
            System.out.println(str1);
        }
        System.out.println("----------------------");
        File[] file = f.listFiles();
        for (File file1:file){
            System.out.println(file1.getName()+"---"+file1.getAbsolutePath());
        }


    }
}

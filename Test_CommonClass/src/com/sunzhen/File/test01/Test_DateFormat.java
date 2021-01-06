package com.sunzhen.File.test01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/3 - 11 - 03 - 10:01
 * @Description: com.sunzhen
 * @version: 1.0
 */
public class Test_DateFormat {
    public static void main(String[] args) {
        /*DateFormat 是一个抽象类,无法创建对象
        SimpleDateFormat (子类) extends DateFormat(父类是一个抽象类)
        DateFormat df = new SimpleDateFormat();//父类引用指向子类对象*/
        //格式化的标准已经定义好了
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//可以自定义格式
        //String-->Date
        try {
            Date d = df.parse("2020/11/3 10:10:10");
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //Date -->String
        String format = df.format(new Date());//format()会严格按照自定义的格式去转化
        System.out.println(format);

    }
}

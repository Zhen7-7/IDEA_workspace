package com.sunzhen.File.test01;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/3 - 11 - 03 - 10:37
 * @Description: com.sunzhen
 * @version: 1.0
 */
public class Test_Calendar {
    public static void main(String[] args) {
        //Calendar为抽象方法
        //GregorianCalendar (子类) extends Calendar(父类是一个抽象类)
        Calendar cal = new GregorianCalendar();
        Calendar cal1 = Calendar.getInstance();//创建对象的方法
        System.out.println(cal);
        System.out.println(cal1);

        //常用方法
        //get方法:传入参数:Calendar中定义的常量
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));
        System.out.println(cal.getActualMaximum(Calendar.DATE));
        System.out.println(cal.getActualMinimum((Calendar.DATE)));

        //set方法: 可以改变Calendar中的内容
        cal.set(Calendar.YEAR,1990);
        cal.set(Calendar.MONTH,02);
        cal.set(Calendar.DATE,10);
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.DATE));

        //String-->Calendar
        //分解:
        //String-->java.sql.Date
        java.sql.Date date = java.sql.Date.valueOf("1999-05-19");
        //java.sql.Date --> Calendar
        cal.setTime(date);
        System.out.println(cal.get(Calendar.YEAR)+
                "-"+
                (cal.get(Calendar.MONTH)+1)+
                "-"+
                cal.get(Calendar.DATE));




    }
}

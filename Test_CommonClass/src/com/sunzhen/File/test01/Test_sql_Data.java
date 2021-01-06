package com.sunzhen.File.test01;


import java.sql.Date;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/2 - 11 - 02 - 22:27
 * @Description: com.sunzhen
 * @version: 1.0
 */
public class Test_sql_Data {
    public static void main(String[] args) {
        //java.sql.Date;
        Date d = new Date(1604327168339L);
        /*(1)java.util.Date和java.sql.Data的区别
        * java.util.Date 年月日 时分秒;
        * java.sql.Date  年月日
        * (2)java.util.Date和java.sql.Data的联系
        * java.sql.Date(子类)extends java.util.Date(父类);
        * \*/
        //java.util.Date和java.sql.Data的相互转换:
        java.util.Date date = d;
        //[1] util-->sql
        // 方法一:向下转型
        /*注意:这里我们在此类中引入的包是java.sql.Date*/
        Date date1 = (Date) date;
        //方法二:利用构造器:
        Date date2 = new Date(date.getTime());
        //[2]sql-->util
        java.util.Date date3 = d;//父类指向子类对象
        //[3]String -->sql
        Date date4 = Date.valueOf("2020-11-02");
        System.out.println(date);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date4);


    }
}

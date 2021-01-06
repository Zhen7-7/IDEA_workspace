package com.sunzhen.File.test01;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/3 - 11 - 03 - 9:54
 * @Description: com.sunzhen
 * @version: 1.0
 */
public class Test_ReceiveDate {
    public static void main(String[] args) {
        //我们想要将String-->java.util.Date
        //1.String-->java.sql.Date
        java.sql.Date date = java.sql.Date.valueOf("2015-10-9");
        //2.java.sql.Date-->java.util.Date
        java.util.Date date1 = date;
        System.out.println(date1);//虽然输出的依旧是字符串,可见我们已经将日期转换完毕
        /*
        *是目前我们发现了一个很大的局限性对于这用方法:只能严格按照XXXX-XX-XX
        * 而大多是我们传入的字符串为XXXX/XX/XX
        * 就会出现输入参数异常
        * 所以接下来我们引入一个新的类----日期转换类
         */


    }
}

package com.sunzhen.File.test01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/3 - 11 - 03 - 10:16
 * @Description: com.sunzhen
 * @version: 1.0
 *这个测试类想要去复习学过的DateFormat类
 *
 */
public class Test01 {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        try {
            Date date = df.parse("2020.11.03 10:10:10");
            System.out.println(date);
            String format = df.format(date);
            System.out.println(format);

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}

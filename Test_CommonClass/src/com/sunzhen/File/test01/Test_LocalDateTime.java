package com.sunzhen.File.test01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/3 - 11 - 03 - 20:44
 * @Description: com.sunzhen
 * @version: 1.0\
 * 新技能 :Ctrl+点击进入类
 */
public class Test_LocalDateTime {
    public static void main(String[] args) {
        //1.完成实例化.通过静态now方法
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        //2.利用静态of方法去设置指定的时间,日期:
        LocalDate localDate1 = LocalDate.of(1999, 05, 19);
        LocalTime localTime1 = localTime.of(10, 12, 43);
        System.out.println(localDate1);
        System.out.println(localTime1);
        LocalDateTime localDateTime1 = LocalDateTime.of(1999, 05, 7, 17, 46);
        System.out.println(localDateTime1);
        //LocalDate和LocalTime平时用的没有LocalDateTime多
        //下面讲解以LocalDateTime为例
        //get**方法
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("1999-05-19")));
        System.out.println(localDateTime.getHour());

        //不是set方法叫with
        //体会这种不可变性,我们设置的时间设置完后只能用新的去接收
        LocalDateTime localDateTime2 = localDateTime.withYear(1995);
        System.out.println(localDateTime);
        System.out.println(localDateTime2);

        //提供了加减的操作:
        LocalDateTime localDateTime3 = localDateTime.plusMonths(5);
        System.out.println(localDateTime);
        System.out.println(localDateTime3);
        LocalDateTime localDateTime4 = localDateTime.minusMonths(5);
        System.out.println(localDateTime);
        System.out.println(localDateTime4);


    }
}

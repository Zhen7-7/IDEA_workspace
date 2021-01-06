package com.sunzhen.File.test01;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/3 - 11 - 03 - 12:13
 * @Description: com.sunzhen
 * @version: 1.0
 * 完成这个月日历的打印:
 * 需求：
 */
public class Test_Practice_Calendar {
    public static void main(String[] args) {
        //接收字符串:
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您要查新的日期:  (提示: 请按照1999-5-19的格式进行书写!)" );
        String strDate = sc.next();
        //String-->Calendar
        //1.String-->java.sql.Date
        java.sql.Date date = java.sql.Date.valueOf(strDate);
        //2.java.sql.Date-->Calendar
        Calendar cal = new GregorianCalendar();
        cal.setTime(date);
        //System.out.println(cal);
        //输出大写的星期:
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        //在当前日期后面+"*"
        //通过get方法
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        //输入当前月份的每一天:
        int maxDate = cal.getActualMaximum(Calendar.DATE);
        //最重要的一点,如何让1号前面空格就是要知道本月一号是星期几
        //将日期置于本月一号,看是本周的第几天

        cal.set(Calendar.DATE,0);
        int count = 0;
        int day = (cal.get(Calendar.DAY_OF_WEEK)-1);//从星期日开始查
        for (int i=1;i<day;i++){
            System.out.print("\t");
        }
        count +=day;
        for (int i = 1; i <(maxDate+1) ; i++) {
            if(i==dayOfMonth) {
                System.out.print(i + "*" + "\t");
            }else{System.out.print(i + "\t");}
            if(count%7==0){
                System.out.println();
            }
            count++;
        }

    }
}

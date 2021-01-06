package com.sunzhen.File.test01;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/3 - 11 - 03 - 13:51
 * @Description: com.sunzhen
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        Calendar cal = new GregorianCalendar();
        System.out.println(cal);
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.MONTH));

    }
}

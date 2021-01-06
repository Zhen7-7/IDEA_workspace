package com.sunzhen.File.test01;

import java.util.Date;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/2 - 11 - 02 - 21:59
 * @Description: com.sunzhen
 * @version: 1.0
 */
public class Test_Util_Data {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.toString());//当前时间;
        System.out.println(d.toGMTString());//本初子午线时间
        System.out.println(d.toLocaleString());//当地时间
        //距离1970年1月1日00:00:00以来一句一直到现在过了多少毫秒
        System.out.println(d.getTime());
        System.out.println(System.currentTimeMillis());
        /*
        (1)疑问:以后获取时差是用 Date类下的getTime.还是System.currentTimeMillis();
        答案:肯定是currentTimeMillis()因为它是静态方法;可以类名.方法直接调用;
        (2) public static native long currentTimeMillis();
        本地方法:
        为什么没有方法体?因为不适用java写的;
        (3)有什么作用:
        一般去衡量一些算法的时间:
        */
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println("pig");
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);

    }
}

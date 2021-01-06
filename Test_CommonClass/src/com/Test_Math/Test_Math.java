package com.Test_Math;
//静态导入

import static java.lang.Math.*;
//  ss
/* @Auther: sunzhen

import com.sun.org.glassfish.gmbal.Description;* @Date: 2020/11/4 - 11 - 04 - 10:31
 * @Description: com.TestMath
 * @version: 1.0
 * "接下来进行Math类的学习:
 */
public class Test_Math {
    public static void main(String[] args) {
        //属性:
        System.out.println(Math.PI);
        System.out.println(Math.E);
        //方法:
        System.out.println("生成随机数 "+Math.random());
        System.out.println("向上取整"+Math.ceil(4.23));
        System.out.println("向下取整"+Math.floor(4.56));
        System.out.println("取绝对值"+Math.abs(-3));
        System.out.println("取大的值"+Math.max(9,110));
        System.out.println("取小的值"+ Math.min(4,5));

        System.out.println(random());//优先调用禁近的方法;

        System.out.println(ceil(53.6));

    }
    public static int random(){
        return 100;
    }
}

package com.Test_Math;

import java.util.Random;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/4 - 11 - 04 - 11:10
 * @Description: com.TestMath
 * @version: 1.0
 */
public class Test_Random {
    public static void main(String[] args) {
        //生成[0,1)之间随机的double数
        System.out.println(Math.random());

        //接下来学习Random类:
        //(1)利用带参构造器创建对象:
        Random r1 = new Random(System.currentTimeMillis());
        int i = r1.nextInt();
        System.out.println(i);
        //(2)利用无参构造器创建对象:
        Random r2 = new Random();
        System.out.println(r2.nextInt());
        System.out.println(r2.nextInt(10));
        System.out.println(r2.nextDouble());//和Math下的一样
        //换句话说Math下的random方法的底层就是创建对象后调用了nextDouble方法


    }

}

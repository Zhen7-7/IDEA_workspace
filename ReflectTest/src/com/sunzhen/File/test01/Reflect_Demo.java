package com.sunzhen.File.test01;

import java.lang.reflect.Method;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/7 - 11 - 07 - 13:18
 * @Description: com.sunzhen
 * @version: 1.0
 */
public class Reflect_Demo {
    public static void main(String[] args) throws Exception {
        //定义一个字符串,用来模拟前台的支付方式:
        String str = "com.sunzhen.BankCard";//事实上就是微信类的全限定路径:

        //下面的代码就是利用反射:
        Class cls = Class.forName(str);
        Object o = cls.newInstance();
        Method method = cls.getMethod("payOnline");
        method.invoke(o);


    }
}

package com.sunzhen.File.test02;

import com.sunzhen.File.test01.Test;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/7 - 11 - 07 - 14:06
 * @Description: com.sunzhen.test02
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //案例:以后去Person的字节码信息为案例
        //方式1:通过getClass()方法获取:
        Person p = new Person();
        Class c1 = p.getClass();
        System.out.println(c1);//class com.sunzhen.test02.Person

        //方式2:通过内置class属性:
        Class c2 = Person.class;
        System.out.println(c2);
        System.out.println(c1==c2);//true
        //注意:方式1 方式2 不常用  因为需要Person类

        //方式3:用的最多,调用Class类的静态方法forName();
        Class c3 = Class.forName("com.sunzhen.File.test02.Person");//c3就直接能够得到Person的字节码信息
        System.out.println(c3);
        //方式4:利用类的加载器(了解技能点);
        ClassLoader loader = Test.class.getClassLoader();
        Class c4 = loader.loadClass("com.sunzhen.File.test02.Person");
        System.out.println(c4);

    }
}

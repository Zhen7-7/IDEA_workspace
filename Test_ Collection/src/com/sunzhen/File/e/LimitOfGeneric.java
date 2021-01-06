package com.sunzhen.File.e;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/9 - 11 - 09 - 19:23
 * @Description: com.sunzhen.e
 * @version: 1.0
 */
public class LimitOfGeneric {
    public static void main(String[] args) {
        //a,b,c 三个集合是并列关系:

        List<Object> a = new ArrayList<>();
        List<Person> b = new ArrayList<>();
        List<Student> c = new ArrayList<>();
        /*开始使用泛型受限:泛型的上限:
        List<? extend Person>:
        就相当于
        List<? extends Person>是List<Person>的父类,是List<Person的子类>的父类
         */
        List<? extends Person> list1 = null;
//      list1 = a;//不可以
        list1 = b;
        list1 = c;
        /*开始使用泛型受限:泛型下限:
        List<?super Person>
        相当于:
        List<?super Person> 是 List<Person>的父类,是List<Person的父类>的父类;
        */
        List<? super Person> list2 = new ArrayList<>();
        list2 = a;
        list2 = b;
//      list2 = c;//不可以
    }
}

package com.sunzhen.File.e;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/9 - 11 - 09 - 18:31
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class GenericExtendsTest {
    public static void main(String[] args) {
        Object o = new Object();
        String str = new String();
        o = str;//多态的一种

        Object[] oArr = new Object[10];
        Integer[] iArr = new Integer[10];
        oArr = iArr;//多态的一种

        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        //list1 = list2; 并不正确
        //说明了:对于这个类有继承关系,而对于类的泛型,并没有继承关系;同一个类只有并列的关系


    }
}

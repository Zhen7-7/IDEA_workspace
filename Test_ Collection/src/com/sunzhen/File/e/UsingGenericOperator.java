package com.sunzhen.File.e;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/9 - 11 - 09 - 19:10
 * @Description: com.sunzhen.e
 * @version: 1.0
 */
public class UsingGenericOperator {
    public void a(List<?> list){
        //数据的遍历
        for (Object o : list){
            System.out.println(o);
        }
        //数据的写入:
//        list.add(12);不可以
        list.add(null);
        //数据的读取
        Object o = list.get(0);
        System.out.println(o);
    }
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        int count = 0;
        while (count<=10){
            list.add(count++);

        }
        new UsingGenericOperator().a(list);
    }
}

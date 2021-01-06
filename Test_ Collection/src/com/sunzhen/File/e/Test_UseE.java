package com.sunzhen.File.e;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/8 - 11 - 08 - 20:46
 * @Description: com.sunzhen.e
 * @version: 1.0
 */
public class Test_UseE {
    public static void main(String[] args) {
        //我们是用泛型去创建一个ArrayList来存储学生的成绩:
        Collection<Integer> list = new ArrayList<>();
        list.add(79);
        list.add(99);
        list.add(98);
        list.add(Integer.MIN_VALUE);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for(Integer i : list){
            System.out.println(i);
        }

    }
}

package com.sunzhen.File.list_set;

import java.util.TreeSet;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/13 - 11 - 13 - 10:32
 * @Description: com.sunzhen.list_set
 * @version: 1.0
 */
public class Test_TreeSet01 {
    public static void main(String[] args) {
        /*
        TreeSet特点:  唯一
        无序:没有按输入顺序进行输出
        有序:按照升序进行遍历
         */
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(12);
        ts.add(3);
        ts.add(7);
        ts.add(9);
        ts.add(3);
        ts.add(16);
        System.out.println(ts.size());
        System.out.println(ts);
    }
}

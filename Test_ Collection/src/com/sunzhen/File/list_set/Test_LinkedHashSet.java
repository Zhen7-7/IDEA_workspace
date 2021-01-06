package com.sunzhen.File.list_set;

import java.util.LinkedHashSet;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/13 - 11 - 13 - 9:36
 * @Description: com.sunzhen.set
 * @version: 1.0
 */
public class Test_LinkedHashSet {
    public static void main(String[] args) {
        //唯一,无序
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        System.out.println(hs.add(19));//true
        hs.add(5);
        hs.add(20);
        System.out.println(hs.add(19));//false 这个19没有放入到集合中
        hs.add(41);
        hs.add(0);
        System.out.println(hs.size());
        System.out.println(hs.toString());
    }
}

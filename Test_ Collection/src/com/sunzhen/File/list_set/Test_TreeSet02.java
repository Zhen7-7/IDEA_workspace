package com.sunzhen.File.list_set;

import java.util.TreeSet;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/13 - 11 - 13 - 10:35
 * @Description: com.sunzhen.list_set
 * @version: 1.0
 */
public class Test_TreeSet02 {
    public static void main(String[] args) {
        /*特点:依旧是唯一,无序,有序*/
        TreeSet<String> ts = new TreeSet<>();
        ts.add("elili");
        ts.add("blili");
        ts.add("alili");
        ts.add("glili");
        ts.add("elili");
        ts.add("clili");
        ts.add("flili");

        System.out.println(ts.size());
        System.out.println(ts);
    }
}

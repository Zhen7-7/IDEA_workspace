package com.sunzhen.File.list_set;

import java.util.TreeSet;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/13 - 11 - 13 - 10:43
 * @Description: com.sunzhen.list_set
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        //内部比较器:以年龄为排序的依据:
        /*
        TreeSet<Student> ts = new TreeSet<>();

        ts.add(new Student(10,"elili"));
        ts.add(new Student(8,"blili"));
        ts.add(new Student(4,"alili"));
        ts.add(new Student(9,"elili"));
        ts.add(new Student(10,"flili"));
        ts.add(new Student(1,"dlili"));
        System.out.println(ts.size());
        System.out.println(ts);
        */
        //尾部比较器:讲名字的首字母作为比较的依据
        //注意,一旦使用外部比较器,就会按照外部比较器进行比较
        BiJiao bj = new BiJiao();
        TreeSet<Student> ts = new TreeSet<>(bj);
        ts.add(new Student(10,"elili"));
        ts.add(new Student(8,"blili"));
        ts.add(new Student(4,"alili"));
        ts.add(new Student(9,"elili"));
        ts.add(new Student(10,"flili"));
        ts.add(new Student(1,"dlili"));
        System.out.println(ts.size());
        System.out.println(ts);


    }
}

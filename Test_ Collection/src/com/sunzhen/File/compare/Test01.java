package com.sunzhen.File.compare;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/13 - 11 - 13 - 9:50
 * @Description: com.sunzhen.compare
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        Student s1 = new Student(15,16.0,"lili");
        Student s2 = new Student(19,10.0,"maomao");
        //内部比较器:
        //System.out.println(s1.compareTo(s2));
        Teacher t1 = new Teacher(20,180.0,"momo");
        Teacher t2 = new Teacher(20,190.0,"sunzhen");
        BiJiao01 b1 = new BiJiao01();
        BiJiao02 b2 = new BiJiao02();
        BiJiao03 b3 = new BiJiao03();
        BiJiao04 b4 = new BiJiao04();
        System.out.println(b1.compare(t1, t2));
        System.out.println(b2.compare(t1, t2));
        System.out.println(b3.compare(t1, t2));
        System.out.println(b4.compare(t1,t2));



    }
}

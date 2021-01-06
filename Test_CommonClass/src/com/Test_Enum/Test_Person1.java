package com.Test_Enum;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/5 - 11 - 05 - 22:32
 * @Description: com.Test_Enum
 * @version: 1.0
 */
public class Test_Person1 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setSex(Sex.男);
        System.out.println(p);
    }
}

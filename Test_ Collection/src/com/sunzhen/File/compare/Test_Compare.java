package com.sunzhen.File.compare;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/13 - 11 - 13 - 9:40
 * @Description: com.sunzhen.compare
 * @version: 1.0
 */
public class Test_Compare {
    public static void main(String[] args) {
        //比较器:
        //int类型:
        int a = 10;
        int b = 20;
        System.out.println(b-a);//10
        //String类型:
        String str1 = "A";
        String str2 = "AB";
        System.out.println(str1.compareTo(str2));//-1
        double c = 9.6;
        double d = 9.3;
        System.out.println(((Double)c).compareTo((Double)d));//1




    }
}

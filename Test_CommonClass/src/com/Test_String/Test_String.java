package com.Test_String;

import java.util.Arrays;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/4 - 11 - 04 - 13:52
 * @Description: com.Test_String
 * @version: 1.0
 */
public class Test_String {
    public static void main(String[] args) {
        //进行String构造方法的断点测试:
        String str = new String();
        String str1 = "abcdef";
        System.out.println(str1);
        //通过参数是字符数组的构造器创建对象
        String str2 = new String(new char[]{'a','b','c'});
        System.out.println(str2);

        //String 的常用方法:
        String s1 = "abcdefghijk";
        System.out.println("输出字符串的长度:"+s1.length());//11
        System.out.println("判断字符串是否为空:"+s1.isEmpty());//false
        System.out.println("获取字符串下标对应的字符"+s1.charAt(0));//a

        //equals()方法:
        String s2 = "1234";
        String s3 = "1234";
        System.out.println(s2.equals(s3));//true
        System.out.println(s1 instanceof String);//true
        //compareTo()
        String s4 = "abcdef";
        String s5 = "abcde";
        System.out.println(s4.compareTo(s5));
        /*compareTo()方法底层的逻辑是:如果两个字符串str1和str2
        令 min = str1和str2的length最小的;
        去遍历两者前min个字符;
        if(两者字符有所不同){return第一个不同字符的ASCL码的差}
            else{返回两者length的差值}
         */
        //常用方法:
        //1.字符串的截取:
        String s6 = "0123456789";
        System.out.println(s6.substring(3));// 3456789 下标为3索引之后
        System.out.println(s6.substring(3,5));//34  有左无右
        //2.字符串的合并拼接操作:
        System.out.println(s6.concat("sunzhen"));
        String s = "zhenzhen";
        System.out.println(s6.concat(s));
        //3.字符串中字符的替换:
        String s7 = s.replace('z','c');
        System.out.println(s7);
        //4.按照指定的字符串进行分裂为数组的形式;
        String s8 = "a-B-c-D-e-f-g";
        String[] strArray = s8.split("-");
        System.out.println(Arrays.toString(strArray));
        //依照举例:
        String birth = "1999/05/19";
        String[] birthStrArr = birth.split("/");
        System.out.println(Arrays.toString(birthStrArr));
        //5.转大小写的方法:toUpperCase  toLowerCase
        System.out.println(s8.toUpperCase());
        System.out.println(s8.toUpperCase().toLowerCase());

        //*6.去除首尾空格:  常用于处理用户名的定义上;
        String s9 = "     m y name is Ba Ba      ";
        System.out.println(s9.trim());
        //7.toString(); 就是返回字符串本身
        System.out.println(s9.toString());
        //8.转换为String类型  : String.valueOf() 大法
        String s10  = String.valueOf(false);
        System.out.println(s10);
        String s11 = String .valueOf(46600000000000L);
        System.out.println(s11);




    }
}

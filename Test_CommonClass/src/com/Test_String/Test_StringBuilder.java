package com.Test_String;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/5 - 11 - 05 - 10:21
 * @Description: com.Test_String
 * @version: 1.0
 */
public class Test_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("你好妹妹");
        //增
        sb.append("我想上你");
        System.out.println(sb);
        //删
        sb.delete(4,8);  //[4,8)
        System.out.println(sb);
        //改-->插入
        StringBuilder sb1 = sb.insert(2,"小");
        System.out.println(sb);
        System.out.println(sb1);
        //改-->替换
        System.out.println(sb.replace(0, 1, "您"));
        System.out.println(sb1.replace(2, 4, "猪"));
        //查
        StringBuilder sb2 = new StringBuilder("platform");
        for (int i = 0; i < sb2.length() ; i++) {
            System.out.print(sb2.charAt(i)+"\t");
        }
        System.out.println();
        //截取:
        StringBuilder sb3 = new StringBuilder("0123456789");
        String str = sb3.substring(0,8);
        System.out.println(sb3);
        System.out.println(str);//截取之后得到的是字符串;对StringBuilder没有任何影响;
    }
}

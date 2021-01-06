package com.Test_Enum;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/5 - 11 - 05 - 20:13
 * @Description: com.Test_Enum
 * @version: 1.0
 */
public class Test_Season {
    public static void main(String[] args) {
        //Enum中的方法:
        //toString:获取对象的名字
        Season autumn = Season.AUTUMN;
        System.out.println(autumn/*.toString()*/);
        //values:返回枚举对象的数组;
        Season[] value = Season.values();
        for (Season s : value){
            System.out.println(s);
        }
        //valueOf:通过名字获取这个枚举类的对象:
        //注意:名字一定要输入正确否则会抛出异常
        Season season = Season.valueOf("AUTUMN");
        System.out.println(season);

        season.show();
    }
}

package com.Test_Enum;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/5 - 11 - 05 - 19:47
 * @Description: com.Test_Enum
 * @version: 1.0
 */
public class Test_Season1 {
    public static void main(String[] args) {
        //enum关键字对应的枚举类上层父类是"java.lang.Enum
        Season1 winter = Season1.WINTER;
        System.out.println(winter);
        //但是  我们自定义的枚举类的上层父类是Object
        System.out.println(MySeason.class.getSuperclass().getName());//java.lang.Object

    }
}

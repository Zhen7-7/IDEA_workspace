package com.sunzhen.File.test01;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/2 - 11 - 02 - 15:20
 * @Description: com.sunzhen
 * @version: 1.0
 */
public class Test_IntegerClass {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        //物极必反原理：
        System.out.println(Integer.MAX_VALUE+1);

        // 构造器:
        Integer i1 = new Integer(12);
        System.out.println(i1.toString());//12

        //自动装箱:int-->Integer
        Integer i2=10;
        System.out.println(i2);

        //自动拆箱:Integer-->int
        int i3 = new Integer(15);
        System.out.println(i3);

        //接下来距离一些方法:
        //1.equals()和==
        Integer i4 = new Integer(12);
        Integer i5 = new Integer(12);
        //可以看出==两侧比较的仍然是地址,而equals在比较Object类型时比较的是值
        System.out.println(i4==i5);//false
        System.out.println(i4.equals(i5));//true

        //通过自动装箱去调用equals
        Integer i6 = 12;
        Integer i7 = 12;

        //可以看出自动装箱后可以通过==来判断两个对象的值是否相同;,真的是这样的么?
        //而且可以看到equals可以去判断两个数的值相等
        Integer i8 = 200;
        Integer i9 = 200;
        System.out.println(i8==i9);//false
        //我们通过了解知道在-127~127之间可以通过valueOf去得到里面的数值,而在这个范围之外仍然得到的是对象
        System.out.println(i8.equals(i9));//true
        //Integer.compare(x,y)
        Integer i10 = new Integer(2);
        Integer i11 = new Integer(3);
        System.out.println(Integer.compare(i10,i11));//return (x<y)? : -1 :((x==y)?:0 : 1)
        //
        System.out.println(Integer.valueOf(i10));//2
        int i12 = Integer.valueOf(i10);
        int i13 = 5;
        //valueOf 在-127~127内返回的是值,之外返回的是Integer对象
        System.out.println(Integer.compare(i10,i12));//0
        System.out.println(Integer.compare(i12,i13));//-1
        System.out.println(i10.equals(i12));//true

        int a = i10.intValue();
        System.out.println(a);
        int b = Integer.parseInt("15");

        System.out.println(i10.toString());//2 :说明在此方法中将toString方法进行了重写;









    }
}

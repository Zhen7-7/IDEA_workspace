package com.sunzhen.File.e;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/8 - 11 - 08 - 21:20
 * @Description: com.sunzhen.e
 * @version: 1.0
 */
//继承:父类指定泛型

public class SubGenericTest01 extends GenericTest<Integer> {

}
class Demo1{
    public static void main(String[] args) {
        //父类指定泛型了,那么子类可以不指定泛型:可以直接使用
        SubGenericTest01 gt = new SubGenericTest01();
        gt.a(19);
        gt.b(new Integer[]{13,45,46});
        //gt.a(6.9);报错
    }
}

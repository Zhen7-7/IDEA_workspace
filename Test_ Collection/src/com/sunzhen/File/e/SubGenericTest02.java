package com.sunzhen.File.e;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/8 - 11 - 08 - 21:25
 * @Description: com.sunzhen.e
 * @version: 1.0
 */
public class SubGenericTest02<E> extends GenericTest<E> {

}
class Demo2{
    public static void main(String[] args) {
        SubGenericTest02 gt = new SubGenericTest02();
        gt.a("abc");
        gt.a('a');
        gt.a(89);
        gt.b(new String[12]);
        gt.b(new Integer[]{1,3,4});

    }
}

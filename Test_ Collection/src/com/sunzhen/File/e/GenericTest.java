package com.sunzhen.File.e;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/8 - 11 - 08 - 21:01
 * @Description: com.sunzhen.e
 * @version: 1.0
 */
public class GenericTest<E> {
    int age;
    String name ;
    E sex;

    public void a(E n){

    }
    public void b(E[] m){

    }

}


class Test{
    public static void main(String[] args) {
        //惊醒GenericTest的实例化:
        //1.实例化不指定泛型: 如果实例化的时候不指定泛型,那么认为此泛型默认为Object
        GenericTest gt1 = new GenericTest<>();
        gt1.a("abc");
        gt1.a(13);
        gt1.b(new String[]{"a","2"});
        //2.实例化时候指定泛型-->推荐
        GenericTest<Double> gt2 = new GenericTest<>();
        gt2.a(5.65);
        gt2.a(-6.9);
        gt2.b(new Double[]{1.3,56.0,.96});


    }

}

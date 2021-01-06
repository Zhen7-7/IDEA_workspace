package com.sunzhen.File.e;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/9 - 11 - 09 - 17:49
 * @Description: com.sunzhen.e
 * @version: 1.0
 */
/*
什么是泛型方法:
并不是带泛型的方法就是泛型方法
 */
public class GenericMethodTest<E> {
    //属性:
    String name;
    int age;
    E sex;
    //并不是泛型方法:
    public void a(E e){}

    /*public <E> void a(E e){
        System.out.println("这是a方法"+e);
    }
    这样就没什么意义:*/
    //泛型方法:
    public <T> void b(T t){
        System.out.println("这是b方法:");
    }
    public <Integer> void c(Integer i){
        System.out.println("这是c方法"+i);
    }
    public static <StringBuilder> void d(StringBuilder str){
        System.out.println("这是方法d"+str);
    }

}
class Test01{
    public static void main(String[] args) {
        GenericMethodTest<String> gm = new GenericMethodTest();
        gm.a("abc");
        gm.b(new Integer[]{1,2,3});
        gm.c(99);
        gm.d("莫玉丹是猪");

    }
}

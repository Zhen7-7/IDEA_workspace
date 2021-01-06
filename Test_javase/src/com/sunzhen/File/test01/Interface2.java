package com.sunzhen.File.test01;

/**
 * @Auther: sunzhen
 * @Date: 2020/10/29 - 10 - 29 - 18:20
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
/*我们在此之前了解了接口在jdk—1.8之前只能定义常量+抽象方法
而在jdk-1.8之后又加入了
1.被public default修饰的非抽象方法
注意:a.default修饰符必须加上,否则出错;
    b. 实现类中想重写接口中的抽象方法,一定不能加default,否则会出错;
2.静态方法
注意a:静态方法不能省略static
    b:静态方法不能被重写;

**/
public interface Interface2 {
    public static final int NUM = 9;
    //抽象方法
    public abstract  void a ();
    //非抽象方法
    public default void b (){
        System.out.println("Interface2中的非抽象方法");
    }
    public static void c(){
        System.out.println("这是Interface2的静态方法");
    }
}
class Demo implements Interface2{
    @Override
    public void a() {
        System.out.println("这是重写的a方法");
        //可以直接调用接口里的非抽象方法
        b();
    }

   public static void c(){
       System.out.println("这是Demo类的静态方法");
   }
}
class A{
    public static void main(String[] args) {
        //创建Demo对象:
        Demo demo = new Demo();
        demo.a();
        System.out.println(Interface2.NUM);
        demo.c();
    }
}
/*为什么要在接口中去加入非抽象方法?
如果在接口中只能定义抽象方法,一旦修改接口的内容, 那么对实现类的影响太大,所有的实现类都会受到影响;
而现在在接口中加入非抽象方法,对实现类没有影响,想调用就调用;

 */

package com.sunzhen.File.test01;

/**
 * @Auther: sunzhen
 * @Date: 2020/10/29 - 10 - 29 - 8:41
 * @Description: com.sunzhen
 * @version: 1.0
 */

/*接下来学习接口,我会将笔记穿插进代码中,去分享自己的笔记和代码.
1.首先我们应该明确:类是类,接口是接口,他们是同一层次的概念;
2.既然他不是类,自然而然他就没有构造器;
3.接口如何去声明? interface
4.在jdk_1.8之前 接口只有两部分组成:常量+抽象方法
    常量 :固定修饰符 public static final
    抽象方法 : 固定修饰符 public abstract
接下来我们试着用代码去构建一个接口
 */
public interface Interface1 {
    //常量:
    int NUM1 = 0;  //常量必须初始化;
    /*public static final */ int NUM = 5; //可以看出我的集成工具Idea会自己给我补充修饰符,初学建议补全

    //抽象方法:
    void a();  //无需方法体因为我们定义的是抽象方法

    /*public abstract */ void b();  //同样也可以;
}

interface Interface01 {
    int C = 2;

    void c();
}

/*
5. 类和接口有什么关系? 实现关系: 类去实现接口;
6.一旦实现一个接口,那么实现类就要重写这个接口的所有的抽象方法;
7.如果没有重写所有的抽象方法,那么这个类可以定义为抽象类;
8.**我们java中只有单继承,但有多实现
    一个类继承其他类,只能继承一个父类
    一个类去实现接口时,可以实现多个接口;
9.写法:先继承在实现:extends Animal implements Interface1,Interface01;
*/
class Monkey extends Animal implements Interface1, Interface01 {
    @Override
    public void a() {
        System.out.println("_______1");
    }

    @Override
    public void b() {
        System.out.println("_______2");
    }

    @Override
    public void c() {
        System.out.println("_______3");
    }
}

class Test {
    public static void main(String[] args) {
        //Interface i1 = new Interface();  报错:10.接口不能直接创建对象;
        Interface1 t = new Monkey();//接口指向实现类-->多态

        //11.接口中的常量 如何去访问?
        System.out.println(Interface1.NUM);
        System.out.println(Monkey.NUM);
        System.out.println(t.NUM);

        Monkey m = new Monkey();
        System.out.println(Interface01.C);
        System.out.println(Monkey.C);
        System.out.println(m.C);
    }
}

/*[1]接口的作用是什么:

定义规则 ,那么和抽象类的区别是什么?--> 接口不是类,而抽象类是;
接口负责定义规则,实现类负责实现即可;

[2]
继承:子类对父类的继承
实现:实现类对接口的实现;

手机 是不是 照相机
继承: 手机 extends 照相机   "is - a " 的关系   手机是一个照相机    貌似很奇怪对吧;
实现: 手机 implements 拍照功能  " has - a " 的关系  手机具有拍照的功能  ;

[3]
多态的应用场合:
(1)父类当做方法的形参,传入具体的子类的对象;
(2)父类当做方法的返回值,返回的是具体的子类的对象
(3)接口当做方法的形参,传入具体的实现类的对象;
(4)接口当做方法的返回值,返回的是具体的实现类的对象

[4]面试题:抽象类和接口的区别:
抽象类:
1.抽象类使用abstract修饰;
2.抽象类不能实例化,即不能使用new关键字来实例化对象;
3.含有抽象方法(使用abstract关键字来修饰的方法)的类是抽象类,必须用abstract来修饰这个类;
4.抽象类可以含有抽象方法,也可以不含抽象方法,还可以包含具体的方法;
5.如果一个类继承了抽象方法如果不能实现全部的抽象方法,那么这个类也是抽象类,也需要abstract修饰,否则就不是抽象类;
6.抽象类中的抽象方法有方法体,但没有具体实现;

接口:
1.接口使用interface修饰;
2.同样不能实例化;
3.一个类只可以继承一个类,但可以实现多个接口;
4.接口中的方法只能是抽象方法;
5.接口中不能包含实例域或静态方法(静态方法必须被实现,而接口中的方法是抽象方法,无法被实现)

 */
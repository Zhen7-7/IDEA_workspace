package com.sunzhen.File.test01;

/**
 * @Auther: sunzhen
 * @Date: 2020/10/28 - 10 - 28 - 12:13
 * @Description: com.sunzhen
 * @version: 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
//        cat.shout();
        Girl girl = new Girl();
//        girl.play(cat);
//        Dog dog = new Dog();
//        dog.guard();
        Animal an = cat;
        girl.play(cat);
    }
}

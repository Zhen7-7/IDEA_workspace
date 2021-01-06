package com.sunzhen.File.test01;

import java.util.Scanner;

/**
 * @Auther: sunzhen
 * @Date: 2020/10/28 - 10 - 28 - 14:44
 * @Description: com.sunzhen
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) {
//        Animal an = new Cat();
        Girl girl = new Girl();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想购买的宠物" );
        String name1 = sc.next();
        Animal an =  PetStore.getAnimal("猪");

        girl.play(an);

    }
}

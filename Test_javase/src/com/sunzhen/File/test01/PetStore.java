package com.sunzhen.File.test01;

/**
 * @Auther: sunzhen
 * @Date: 2020/10/28 - 10 - 28 - 15:11
 * @Description: com.sunzhen
 * @version: 1.0
 */
public class PetStore {
    public static Animal getAnimal(String name){
        Animal an = null;
        if("猫".equals(name)) {an = new Cat();}
        if("狗".equals(name)) {an = new Dog();}
        if("猪".equals(name)) {an = new Pig();}

        return an;
    }

}

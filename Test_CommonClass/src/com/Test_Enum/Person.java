package com.Test_Enum;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/5 - 11 - 05 - 22:33
 * @Description: com.Test_Enum
 * @version: 1.0
 */
public class Person {
    private String name;
    private Sex sex ;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Sex getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}

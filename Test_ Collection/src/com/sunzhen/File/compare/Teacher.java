package com.sunzhen.File.compare;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/13 - 11 - 13 - 10:03
 * @Description: com.sunzhen.compare
 * @version: 1.0
 */
public class Teacher {
    //属性:
    private int age;
    private double height;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher() {
    }

    public Teacher(int age, double height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }
}

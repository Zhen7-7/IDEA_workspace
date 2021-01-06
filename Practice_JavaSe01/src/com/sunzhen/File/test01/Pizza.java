package com.sunzhen.File.test01;

/**
 * @Auther: sunzhen
 * @Date: 2020/10/30 - 10 - 30 - 9:38
 * @Description: com.sunzhen
 * @version: 1.0
 */
public class Pizza {
    //属性 : 名称 , 价格 , 尺寸
    private String name;
    private double price;
    private int size;

    //构造方法
    public Pizza() {
    }

    public Pizza(String name, double price, int size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String show() {
        return "名称:\t" + name + "\n价格\t:" + getPrice() + "元" + "\n尺寸\t:" + getSize() + "寸";
    }
}

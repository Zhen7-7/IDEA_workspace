package com.sunzhen.File.test01;

/**
 * @Auther: sunzhen
 * @Date: 2020/10/28 - 10 - 28 - 12:12
 * @Description: com.sunzhen
 * @version: 1.0
 */
public class Phone {
    private String brand;//品牌型号
    private double price;//价格
    private int year ;//出产年份

    public Phone() {
    }

    public Phone(String brand, double price, int year) {
        this.brand = brand;
        this.price = price;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}

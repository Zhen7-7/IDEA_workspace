package com.sunzhen.File.test01;

/**
 * @Auther: sunzhen
 * @Date: 2020/10/30 - 10 - 30 - 10:05
 * @Description: com.sunzhen
 * @version: 1.0
 */
public class FruitPizza extends Pizza {
    private String fruit ;

    public FruitPizza(){}

    public FruitPizza(String name, double price, int size, String fruit) {
        super(name, price, size);
        this.fruit = fruit;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    @Override
    public String show() {
        return super.show()+"\n水果配料\t:"+fruit;
    }
}

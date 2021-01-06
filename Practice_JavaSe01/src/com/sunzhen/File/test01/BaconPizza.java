package com.sunzhen.File.test01;

/**
 * @Auther: sunzhen
 * @Date: 2020/10/30 - 10 - 30 - 9:55
 * @Description: com.sunzhen
 * @version: 1.0
 */
public class BaconPizza extends Pizza {
    private int weightOfBacon ;

    public BaconPizza() {
    }

    public BaconPizza(String name, double price, int size, int weightOfBacon) {
        super(name, price, size);
        this.weightOfBacon = weightOfBacon;
    }

    public int getWeightOfBacon() {
        return weightOfBacon;
    }

    public void setWeightOfBacon(int weightOfBacon) {
        this.weightOfBacon = weightOfBacon;
    }


    @Override
    public String show() {
        return super.show()+"\n培根数量:\t"+weightOfBacon;
    }
}
